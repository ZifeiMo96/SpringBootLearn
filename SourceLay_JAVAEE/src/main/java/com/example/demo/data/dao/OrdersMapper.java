package com.example.demo.data.dao;

import com.example.demo.data.model.Orders;
import com.example.demo.data.model.OrdersExample;
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

public interface OrdersMapper {
    @SelectProvider(type=OrdersSqlProvider.class, method="countByExample")
    long countByExample(OrdersExample example);

    @DeleteProvider(type=OrdersSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdersExample example);

    @Delete({
        "delete from orders",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into orders (id, order_sn, ",
        "payment_sn, amount, ",
        "master_amount, author_amount, ",
        "third_party_amount, be_scale, ",
        "user_id, payee_id, third_party_id, ",
        "type, group_id, thread_id, ",
        "status, payment_type, ",
        "is_anonymous, expired_at, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{orderSn,jdbcType=CHAR}, ",
        "#{paymentSn,jdbcType=VARCHAR}, #{amount,jdbcType=DECIMAL}, ",
        "#{masterAmount,jdbcType=DECIMAL}, #{authorAmount,jdbcType=DECIMAL}, ",
        "#{thirdPartyAmount,jdbcType=DECIMAL}, #{beScale,jdbcType=DOUBLE}, ",
        "#{userId,jdbcType=BIGINT}, #{payeeId,jdbcType=BIGINT}, #{thirdPartyId,jdbcType=BIGINT}, ",
        "#{type,jdbcType=TINYINT}, #{groupId,jdbcType=BIGINT}, #{threadId,jdbcType=BIGINT}, ",
        "#{status,jdbcType=TINYINT}, #{paymentType,jdbcType=SMALLINT}, ",
        "#{isAnonymous,jdbcType=TINYINT}, #{expiredAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Orders record);

    @InsertProvider(type=OrdersSqlProvider.class, method="insertSelective")
    int insertSelective(Orders record);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.CHAR),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_amount", property="masterAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="author_amount", property="authorAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="third_party_amount", property="thirdPartyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="payee_id", property="payeeId", jdbcType=JdbcType.BIGINT),
        @Result(column="third_party_id", property="thirdPartyId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="payment_type", property="paymentType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Orders> selectByExampleWithRowbounds(OrdersExample example, RowBounds rowBounds);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.CHAR),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_amount", property="masterAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="author_amount", property="authorAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="third_party_amount", property="thirdPartyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="payee_id", property="payeeId", jdbcType=JdbcType.BIGINT),
        @Result(column="third_party_id", property="thirdPartyId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="payment_type", property="paymentType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Orders> selectByExample(OrdersExample example);

    @Select({
        "select",
        "id, order_sn, payment_sn, amount, master_amount, author_amount, third_party_amount, ",
        "be_scale, user_id, payee_id, third_party_id, type, group_id, thread_id, status, ",
        "payment_type, is_anonymous, expired_at, created_at, updated_at",
        "from orders",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.CHAR),
        @Result(column="payment_sn", property="paymentSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_amount", property="masterAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="author_amount", property="authorAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="third_party_amount", property="thirdPartyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="payee_id", property="payeeId", jdbcType=JdbcType.BIGINT),
        @Result(column="third_party_id", property="thirdPartyId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="payment_type", property="paymentType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Orders selectByPrimaryKey(Long id);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Orders record);

    @Update({
        "update orders",
        "set order_sn = #{orderSn,jdbcType=CHAR},",
          "payment_sn = #{paymentSn,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "master_amount = #{masterAmount,jdbcType=DECIMAL},",
          "author_amount = #{authorAmount,jdbcType=DECIMAL},",
          "third_party_amount = #{thirdPartyAmount,jdbcType=DECIMAL},",
          "be_scale = #{beScale,jdbcType=DOUBLE},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "payee_id = #{payeeId,jdbcType=BIGINT},",
          "third_party_id = #{thirdPartyId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "group_id = #{groupId,jdbcType=BIGINT},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "payment_type = #{paymentType,jdbcType=SMALLINT},",
          "is_anonymous = #{isAnonymous,jdbcType=TINYINT},",
          "expired_at = #{expiredAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Orders record);
}