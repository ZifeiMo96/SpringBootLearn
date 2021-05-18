package com.example.demo.data.dao;

import com.example.demo.data.model.Topics;
import com.example.demo.data.model.TopicsExample;
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

public interface TopicsMapper {
    @SelectProvider(type=TopicsSqlProvider.class, method="countByExample")
    long countByExample(TopicsExample example);

    @DeleteProvider(type=TopicsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TopicsExample example);

    @Delete({
        "delete from topics",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into topics (id, user_id, ",
        "thread_count, view_count, ",
        "updated_at, created_at, ",
        "recommended, recommended_at, ",
        "content)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{threadCount,jdbcType=INTEGER}, #{viewCount,jdbcType=INTEGER}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{recommended,jdbcType=TINYINT}, #{recommendedAt,jdbcType=TIMESTAMP}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Topics record);

    @InsertProvider(type=TopicsSqlProvider.class, method="insertSelective")
    int insertSelective(Topics record);

    @SelectProvider(type=TopicsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recommended", property="recommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Topics> selectByExampleWithBLOBsWithRowbounds(TopicsExample example, RowBounds rowBounds);

    @SelectProvider(type=TopicsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recommended", property="recommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Topics> selectByExampleWithBLOBs(TopicsExample example);

    @SelectProvider(type=TopicsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recommended", property="recommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Topics> selectByExampleWithRowbounds(TopicsExample example, RowBounds rowBounds);

    @SelectProvider(type=TopicsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recommended", property="recommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Topics> selectByExample(TopicsExample example);

    @Select({
        "select",
        "id, user_id, thread_count, view_count, updated_at, created_at, recommended, ",
        "recommended_at, content",
        "from topics",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recommended", property="recommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    Topics selectByPrimaryKey(Long id);

    @UpdateProvider(type=TopicsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Topics record, @Param("example") TopicsExample example);

    @UpdateProvider(type=TopicsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Topics record, @Param("example") TopicsExample example);

    @UpdateProvider(type=TopicsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Topics record, @Param("example") TopicsExample example);

    @UpdateProvider(type=TopicsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Topics record);

    @Update({
        "update topics",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_count = #{threadCount,jdbcType=INTEGER},",
          "view_count = #{viewCount,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "recommended = #{recommended,jdbcType=TINYINT},",
          "recommended_at = #{recommendedAt,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Topics record);

    @Update({
        "update topics",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_count = #{threadCount,jdbcType=INTEGER},",
          "view_count = #{viewCount,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "recommended = #{recommended,jdbcType=TINYINT},",
          "recommended_at = #{recommendedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Topics record);
}