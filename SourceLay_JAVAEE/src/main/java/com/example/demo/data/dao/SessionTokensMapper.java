package com.example.demo.data.dao;

import com.example.demo.data.model.SessionTokens;
import com.example.demo.data.model.SessionTokensExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface SessionTokensMapper {
    @SelectProvider(type=SessionTokensSqlProvider.class, method="countByExample")
    long countByExample(SessionTokensExample example);

    @DeleteProvider(type=SessionTokensSqlProvider.class, method="deleteByExample")
    int deleteByExample(SessionTokensExample example);

    @Insert({
        "insert into session_tokens (token, scope, ",
        "user_id, created_at, ",
        "expired_at, payload)",
        "values (#{token,jdbcType=VARCHAR}, #{scope,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{expiredAt,jdbcType=TIMESTAMP}, #{payload,jdbcType=LONGVARCHAR})"
    })
    int insert(SessionTokens record);

    @InsertProvider(type=SessionTokensSqlProvider.class, method="insertSelective")
    int insertSelective(SessionTokens record);

    @SelectProvider(type=SessionTokensSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="payload", property="payload", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SessionTokens> selectByExampleWithBLOBsWithRowbounds(SessionTokensExample example, RowBounds rowBounds);

    @SelectProvider(type=SessionTokensSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="payload", property="payload", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SessionTokens> selectByExampleWithBLOBs(SessionTokensExample example);

    @SelectProvider(type=SessionTokensSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SessionTokens> selectByExampleWithRowbounds(SessionTokensExample example, RowBounds rowBounds);

    @SelectProvider(type=SessionTokensSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SessionTokens> selectByExample(SessionTokensExample example);

    @UpdateProvider(type=SessionTokensSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SessionTokens record, @Param("example") SessionTokensExample example);

    @UpdateProvider(type=SessionTokensSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") SessionTokens record, @Param("example") SessionTokensExample example);

    @UpdateProvider(type=SessionTokensSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SessionTokens record, @Param("example") SessionTokensExample example);
}