package com.example.demo.data.dao;

import com.example.demo.data.model.UserWalletFailLogs;
import com.example.demo.data.model.UserWalletFailLogsExample;
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

public interface UserWalletFailLogsMapper {
    @SelectProvider(type=UserWalletFailLogsSqlProvider.class, method="countByExample")
    long countByExample(UserWalletFailLogsExample example);

    @DeleteProvider(type=UserWalletFailLogsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserWalletFailLogsExample example);

    @Delete({
        "delete from user_wallet_fail_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_wallet_fail_logs (id, ip, user_id, ",
        "created_at)",
        "values (#{id,jdbcType=BIGINT}, #{ip,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserWalletFailLogs record);

    @InsertProvider(type=UserWalletFailLogsSqlProvider.class, method="insertSelective")
    int insertSelective(UserWalletFailLogs record);

    @SelectProvider(type=UserWalletFailLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletFailLogs> selectByExampleWithRowbounds(UserWalletFailLogsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserWalletFailLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletFailLogs> selectByExample(UserWalletFailLogsExample example);

    @Select({
        "select",
        "id, ip, user_id, created_at",
        "from user_wallet_fail_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserWalletFailLogs selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserWalletFailLogsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserWalletFailLogs record, @Param("example") UserWalletFailLogsExample example);

    @UpdateProvider(type=UserWalletFailLogsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserWalletFailLogs record, @Param("example") UserWalletFailLogsExample example);

    @UpdateProvider(type=UserWalletFailLogsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserWalletFailLogs record);

    @Update({
        "update user_wallet_fail_logs",
        "set ip = #{ip,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserWalletFailLogs record);
}