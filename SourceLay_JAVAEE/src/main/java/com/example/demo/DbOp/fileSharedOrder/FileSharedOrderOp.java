package com.example.demo.DbOp.fileSharedOrder;

import com.example.demo.data.dao.OrdersMapper;
import com.example.demo.data.dao.SourcelayFileSharedorderMapper;
import com.example.demo.data.model.Orders;
import com.example.demo.data.model.OrdersExample;
import com.example.demo.data.model.SourcelayFileSharedorderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author dzy
 * @title: FileSharedOrderOp
 * @projectName demo
 * @description:
 * @date 2020/12/113:17
 */
@Service("fileSharedOrderOp")
public class FileSharedOrderOp {
    @Autowired
    SourcelayFileSharedorderMapper sourcelayFileSharedorderMapper;
    @Autowired
    OrdersMapper ordersMapper;
    static byte PurchaseType = 17;

    /**
     * 判断用户是否购买某分享
     * @param userId
     * @param shareId
     * @return
     */
    public boolean IsPurchase(long userId, long shareId) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria ordersCriteria = ordersExample.createCriteria();
        //先在orders表中搜索该用户成功支付的订单
        ordersCriteria.andUserIdEqualTo(userId);
        ordersCriteria.andTypeEqualTo(PurchaseType);
        ordersCriteria.andStatusEqualTo((byte) 1);
        ordersExample.or(ordersCriteria);
        List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
        if (ordersList == null) return false;
        //再在成功支付的订单中搜索是否购买该文件
        AtomicBoolean result = new AtomicBoolean(false);
        ordersList.forEach(order -> {
            SourcelayFileSharedorderExample sourcelayFileSharedorderExample =
                    new SourcelayFileSharedorderExample();
            SourcelayFileSharedorderExample.Criteria fileShareOrderCriteria =
                    sourcelayFileSharedorderExample.createCriteria();
            fileShareOrderCriteria.andOrderIdEqualTo(order.getId());
            fileShareOrderCriteria.andFilesharedIdEqualTo(shareId);
            sourcelayFileSharedorderExample.or(fileShareOrderCriteria);
            if (sourcelayFileSharedorderMapper.selectByExample(sourcelayFileSharedorderExample).size() != 0)
                result.set(true);
        });
        return result.get();
    }


}
