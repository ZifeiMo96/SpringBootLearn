package com.example.demo.data.dao;

import com.example.demo.data.model.ThreadUser;
import com.example.demo.data.model.ThreadUserExample;
import com.example.demo.data.model.ThreadUserKey;
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

public interface ThreadUserMapper {
    @SelectProvider(type=ThreadUserSqlProvider.class, method="countByExample")
    long countByExample(ThreadUserExample example);

    @DeleteProvider(type=ThreadUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(ThreadUserExample example);

    @Delete({
        "delete from thread_user",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(ThreadUserKey key);

    @Insert({
        "insert into thread_user (thread_id, user_id, ",
        "created_at)",
        "values (#{threadId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(ThreadUser record);

    @InsertProvider(type=ThreadUserSqlProvider.class, method="insertSelective")
    int insertSelective(ThreadUser record);

    @SelectProvider(type=ThreadUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadUser> selectByExampleWithRowbounds(ThreadUserExample example, RowBounds rowBounds);

    @SelectProvider(type=ThreadUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadUser> selectByExample(ThreadUserExample example);

    @Select({
        "select",
        "thread_id, user_id, created_at",
        "from thread_user",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    ThreadUser selectByPrimaryKey(ThreadUserKey key);

    @UpdateProvider(type=ThreadUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ThreadUser record, @Param("example") ThreadUserExample example);

    @UpdateProvider(type=ThreadUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ThreadUser record, @Param("example") ThreadUserExample example);

    @UpdateProvider(type=ThreadUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ThreadUser record);

    @Update({
        "update thread_user",
        "set created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ThreadUser record);
}