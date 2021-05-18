package com.example.demo.data.dao;

import com.example.demo.data.model.GroupPaidUsers;
import com.example.demo.data.model.GroupPaidUsersExample;
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

public interface GroupPaidUsersMapper {
    @SelectProvider(type=GroupPaidUsersSqlProvider.class, method="countByExample")
    long countByExample(GroupPaidUsersExample example);

    @DeleteProvider(type=GroupPaidUsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(GroupPaidUsersExample example);

    @Delete({
        "delete from group_paid_users",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into group_paid_users (id, user_id, ",
        "group_id, order_id, ",
        "operator_id, delete_type, ",
        "expiration_time, created_at, ",
        "updated_at, deleted_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{groupId,jdbcType=BIGINT}, #{orderId,jdbcType=BIGINT}, ",
        "#{operatorId,jdbcType=BIGINT}, #{deleteType,jdbcType=TINYINT}, ",
        "#{expirationTime,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{deletedAt,jdbcType=TIMESTAMP})"
    })
    int insert(GroupPaidUsers record);

    @InsertProvider(type=GroupPaidUsersSqlProvider.class, method="insertSelective")
    int insertSelective(GroupPaidUsers record);

    @SelectProvider(type=GroupPaidUsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="delete_type", property="deleteType", jdbcType=JdbcType.TINYINT),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GroupPaidUsers> selectByExampleWithRowbounds(GroupPaidUsersExample example, RowBounds rowBounds);

    @SelectProvider(type=GroupPaidUsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="delete_type", property="deleteType", jdbcType=JdbcType.TINYINT),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GroupPaidUsers> selectByExample(GroupPaidUsersExample example);

    @Select({
        "select",
        "id, user_id, group_id, order_id, operator_id, delete_type, expiration_time, ",
        "created_at, updated_at, deleted_at",
        "from group_paid_users",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="delete_type", property="deleteType", jdbcType=JdbcType.TINYINT),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    GroupPaidUsers selectByPrimaryKey(Long id);

    @UpdateProvider(type=GroupPaidUsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GroupPaidUsers record, @Param("example") GroupPaidUsersExample example);

    @UpdateProvider(type=GroupPaidUsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GroupPaidUsers record, @Param("example") GroupPaidUsersExample example);

    @UpdateProvider(type=GroupPaidUsersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GroupPaidUsers record);

    @Update({
        "update group_paid_users",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "group_id = #{groupId,jdbcType=BIGINT},",
          "order_id = #{orderId,jdbcType=BIGINT},",
          "operator_id = #{operatorId,jdbcType=BIGINT},",
          "delete_type = #{deleteType,jdbcType=TINYINT},",
          "expiration_time = #{expirationTime,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GroupPaidUsers record);
}