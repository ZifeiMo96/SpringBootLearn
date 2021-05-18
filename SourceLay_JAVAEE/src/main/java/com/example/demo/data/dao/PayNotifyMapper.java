package com.example.demo.data.dao;

import com.example.demo.data.model.PayNotify;
import com.example.demo.data.model.PayNotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PayNotifyMapper {
    @SelectProvider(type=PayNotifySqlProvider.class, method="countByExample")
    long countByExample(PayNotifyExample example);

    @DeleteProvider(type=PayNotifySqlProvider.class, method="deleteByExample")
    int deleteByExample(PayNotifyExample example);

    @Delete({
        "delete from pay_notify",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into pay_notify (id, payment_sn, ",
        "user_id, trade_no, ",
        "status, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{paymentSn,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=BIGINT}, #{tradeNo,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(PayNotify record);

    @InsertProvider(type=PayNotifySqlProvider.class, method="insertSelective")
    int insertSelective(PayNotify record);

    @SelectProvider(type=PayNotifySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PayNotify> selectByExampleWithRowbounds(PayNotifyExample example, RowBounds rowBounds);

    @SelectProvider(type=PayNotifySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PayNotify> selectByExample(PayNotifyExample example);

    @Select({
        "select",
        "id, payment_sn, user_id, trade_no, status, created_at, updated_at",
        "from pay_notify",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    PayNotify selectByPrimaryKey(Long id);

    @UpdateProvider(type=PayNotifySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PayNotify record, @Param("example") PayNotifyExample example);

    @UpdateProvider(type=PayNotifySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PayNotify record, @Param("example") PayNotifyExample example);

    @UpdateProvider(type=PayNotifySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PayNotify record);

    @Update({
        "update pay_notify",
        "set payment_sn = #{paymentSn,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "trade_no = #{tradeNo,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PayNotify record);
}