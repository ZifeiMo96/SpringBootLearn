package com.example.demo.data.dao;

import com.example.demo.data.model.UserWalletLogs;
import com.example.demo.data.model.UserWalletLogsExample;
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

public interface UserWalletLogsMapper {
    @SelectProvider(type=UserWalletLogsSqlProvider.class, method="countByExample")
    long countByExample(UserWalletLogsExample example);

    @DeleteProvider(type=UserWalletLogsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserWalletLogsExample example);

    @Delete({
        "delete from user_wallet_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_wallet_logs (id, user_id, ",
        "source_user_id, change_available_amount, ",
        "change_freeze_amount, change_type, ",
        "change_desc, order_id, ",
        "user_wallet_cash_id, question_id, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{sourceUserId,jdbcType=BIGINT}, #{changeAvailableAmount,jdbcType=DECIMAL}, ",
        "#{changeFreezeAmount,jdbcType=DECIMAL}, #{changeType,jdbcType=SMALLINT}, ",
        "#{changeDesc,jdbcType=VARCHAR}, #{orderId,jdbcType=BIGINT}, ",
        "#{userWalletCashId,jdbcType=BIGINT}, #{questionId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserWalletLogs record);

    @InsertProvider(type=UserWalletLogsSqlProvider.class, method="insertSelective")
    int insertSelective(UserWalletLogs record);

    @SelectProvider(type=UserWalletLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="source_user_id", property="sourceUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="change_available_amount", property="changeAvailableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_freeze_amount", property="changeFreezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_type", property="changeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="change_desc", property="changeDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_wallet_cash_id", property="userWalletCashId", jdbcType=JdbcType.BIGINT),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletLogs> selectByExampleWithRowbounds(UserWalletLogsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserWalletLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="source_user_id", property="sourceUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="change_available_amount", property="changeAvailableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_freeze_amount", property="changeFreezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_type", property="changeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="change_desc", property="changeDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_wallet_cash_id", property="userWalletCashId", jdbcType=JdbcType.BIGINT),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletLogs> selectByExample(UserWalletLogsExample example);

    @Select({
        "select",
        "id, user_id, source_user_id, change_available_amount, change_freeze_amount, ",
        "change_type, change_desc, order_id, user_wallet_cash_id, question_id, created_at, ",
        "updated_at",
        "from user_wallet_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="source_user_id", property="sourceUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="change_available_amount", property="changeAvailableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_freeze_amount", property="changeFreezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="change_type", property="changeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="change_desc", property="changeDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_wallet_cash_id", property="userWalletCashId", jdbcType=JdbcType.BIGINT),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserWalletLogs selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserWalletLogsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserWalletLogs record, @Param("example") UserWalletLogsExample example);

    @UpdateProvider(type=UserWalletLogsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserWalletLogs record, @Param("example") UserWalletLogsExample example);

    @UpdateProvider(type=UserWalletLogsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserWalletLogs record);

    @Update({
        "update user_wallet_logs",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "source_user_id = #{sourceUserId,jdbcType=BIGINT},",
          "change_available_amount = #{changeAvailableAmount,jdbcType=DECIMAL},",
          "change_freeze_amount = #{changeFreezeAmount,jdbcType=DECIMAL},",
          "change_type = #{changeType,jdbcType=SMALLINT},",
          "change_desc = #{changeDesc,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=BIGINT},",
          "user_wallet_cash_id = #{userWalletCashId,jdbcType=BIGINT},",
          "question_id = #{questionId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserWalletLogs record);
}