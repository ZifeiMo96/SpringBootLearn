package com.example.demo.data.dao;

import com.example.demo.data.model.Reports;
import com.example.demo.data.model.ReportsExample;
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

public interface ReportsMapper {
    @SelectProvider(type=ReportsSqlProvider.class, method="countByExample")
    long countByExample(ReportsExample example);

    @DeleteProvider(type=ReportsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ReportsExample example);

    @Delete({
        "delete from reports",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into reports (id, user_id, ",
        "thread_id, post_id, ",
        "type, status, created_at, ",
        "updated_at, reason)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{threadId,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT}, ",
        "#{type,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{reason,jdbcType=LONGVARCHAR})"
    })
    int insert(Reports record);

    @InsertProvider(type=ReportsSqlProvider.class, method="insertSelective")
    int insertSelective(Reports record);

    @SelectProvider(type=ReportsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="reason", property="reason", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Reports> selectByExampleWithBLOBsWithRowbounds(ReportsExample example, RowBounds rowBounds);

    @SelectProvider(type=ReportsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="reason", property="reason", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Reports> selectByExampleWithBLOBs(ReportsExample example);

    @SelectProvider(type=ReportsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Reports> selectByExampleWithRowbounds(ReportsExample example, RowBounds rowBounds);

    @SelectProvider(type=ReportsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Reports> selectByExample(ReportsExample example);

    @Select({
        "select",
        "id, user_id, thread_id, post_id, type, status, created_at, updated_at, reason",
        "from reports",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="reason", property="reason", jdbcType=JdbcType.LONGVARCHAR)
    })
    Reports selectByPrimaryKey(Long id);

    @UpdateProvider(type=ReportsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Reports record, @Param("example") ReportsExample example);

    @UpdateProvider(type=ReportsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Reports record, @Param("example") ReportsExample example);

    @UpdateProvider(type=ReportsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Reports record, @Param("example") ReportsExample example);

    @UpdateProvider(type=ReportsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Reports record);

    @Update({
        "update reports",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "reason = #{reason,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Reports record);

    @Update({
        "update reports",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Reports record);
}