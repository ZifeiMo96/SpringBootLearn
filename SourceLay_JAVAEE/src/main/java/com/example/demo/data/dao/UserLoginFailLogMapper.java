package com.example.demo.data.dao;

import com.example.demo.data.model.UserLoginFailLog;
import com.example.demo.data.model.UserLoginFailLogExample;
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

public interface UserLoginFailLogMapper {
    @SelectProvider(type=UserLoginFailLogSqlProvider.class, method="countByExample")
    long countByExample(UserLoginFailLogExample example);

    @DeleteProvider(type=UserLoginFailLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserLoginFailLogExample example);

    @Delete({
        "delete from user_login_fail_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_login_fail_log (id, ip, user_id, ",
        "username, count, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{ip,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{username,jdbcType=VARCHAR}, #{count,jdbcType=TINYINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserLoginFailLog record);

    @InsertProvider(type=UserLoginFailLogSqlProvider.class, method="insertSelective")
    int insertSelective(UserLoginFailLog record);

    @SelectProvider(type=UserLoginFailLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="count", property="count", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserLoginFailLog> selectByExampleWithRowbounds(UserLoginFailLogExample example, RowBounds rowBounds);

    @SelectProvider(type=UserLoginFailLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="count", property="count", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserLoginFailLog> selectByExample(UserLoginFailLogExample example);

    @Select({
        "select",
        "id, ip, user_id, username, count, created_at, updated_at",
        "from user_login_fail_log",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="count", property="count", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserLoginFailLog selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserLoginFailLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserLoginFailLog record, @Param("example") UserLoginFailLogExample example);

    @UpdateProvider(type=UserLoginFailLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserLoginFailLog record, @Param("example") UserLoginFailLogExample example);

    @UpdateProvider(type=UserLoginFailLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserLoginFailLog record);

    @Update({
        "update user_login_fail_log",
        "set ip = #{ip,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "username = #{username,jdbcType=VARCHAR},",
          "count = #{count,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserLoginFailLog record);
}