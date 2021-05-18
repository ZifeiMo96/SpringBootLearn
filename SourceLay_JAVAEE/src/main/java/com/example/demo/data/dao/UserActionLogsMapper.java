package com.example.demo.data.dao;

import com.example.demo.data.model.UserActionLogs;
import com.example.demo.data.model.UserActionLogsExample;
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

public interface UserActionLogsMapper {
    @SelectProvider(type=UserActionLogsSqlProvider.class, method="countByExample")
    long countByExample(UserActionLogsExample example);

    @DeleteProvider(type=UserActionLogsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserActionLogsExample example);

    @Delete({
        "delete from user_action_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_action_logs (id, user_id, ",
        "action, message, log_able_id, ",
        "log_able_type, created_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{action,jdbcType=CHAR}, #{message,jdbcType=VARCHAR}, #{logAbleId,jdbcType=INTEGER}, ",
        "#{logAbleType,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserActionLogs record);

    @InsertProvider(type=UserActionLogsSqlProvider.class, method="insertSelective")
    int insertSelective(UserActionLogs record);

    @SelectProvider(type=UserActionLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="action", property="action", jdbcType=JdbcType.CHAR),
        @Result(column="message", property="message", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_able_id", property="logAbleId", jdbcType=JdbcType.INTEGER),
        @Result(column="log_able_type", property="logAbleType", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserActionLogs> selectByExampleWithRowbounds(UserActionLogsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserActionLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="action", property="action", jdbcType=JdbcType.CHAR),
        @Result(column="message", property="message", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_able_id", property="logAbleId", jdbcType=JdbcType.INTEGER),
        @Result(column="log_able_type", property="logAbleType", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserActionLogs> selectByExample(UserActionLogsExample example);

    @Select({
        "select",
        "id, user_id, action, message, log_able_id, log_able_type, created_at",
        "from user_action_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="action", property="action", jdbcType=JdbcType.CHAR),
        @Result(column="message", property="message", jdbcType=JdbcType.VARCHAR),
        @Result(column="log_able_id", property="logAbleId", jdbcType=JdbcType.INTEGER),
        @Result(column="log_able_type", property="logAbleType", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserActionLogs selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserActionLogsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserActionLogs record, @Param("example") UserActionLogsExample example);

    @UpdateProvider(type=UserActionLogsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserActionLogs record, @Param("example") UserActionLogsExample example);

    @UpdateProvider(type=UserActionLogsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserActionLogs record);

    @Update({
        "update user_action_logs",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "action = #{action,jdbcType=CHAR},",
          "message = #{message,jdbcType=VARCHAR},",
          "log_able_id = #{logAbleId,jdbcType=INTEGER},",
          "log_able_type = #{logAbleType,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserActionLogs record);
}