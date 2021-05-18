package com.example.demo.data.dao;

import com.example.demo.data.model.ThreadVideo;
import com.example.demo.data.model.ThreadVideoExample;
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

public interface ThreadVideoMapper {
    @SelectProvider(type=ThreadVideoSqlProvider.class, method="countByExample")
    long countByExample(ThreadVideoExample example);

    @DeleteProvider(type=ThreadVideoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ThreadVideoExample example);

    @Delete({
        "delete from thread_video",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into thread_video (id, thread_id, ",
        "post_id, user_id, type, ",
        "status, reason, ",
        "file_name, file_id, ",
        "height, width, duration, ",
        "media_url, cover_url, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{threadId,jdbcType=BIGINT}, ",
        "#{postId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, #{type,jdbcType=TINYINT}, ",
        "#{status,jdbcType=TINYINT}, #{reason,jdbcType=VARCHAR}, ",
        "#{fileName,jdbcType=VARCHAR}, #{fileId,jdbcType=VARCHAR}, ",
        "#{height,jdbcType=INTEGER}, #{width,jdbcType=INTEGER}, #{duration,jdbcType=DECIMAL}, ",
        "#{mediaUrl,jdbcType=VARCHAR}, #{coverUrl,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(ThreadVideo record);

    @InsertProvider(type=ThreadVideoSqlProvider.class, method="insertSelective")
    int insertSelective(ThreadVideo record);

    @SelectProvider(type=ThreadVideoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="width", property="width", jdbcType=JdbcType.INTEGER),
        @Result(column="duration", property="duration", jdbcType=JdbcType.DECIMAL),
        @Result(column="media_url", property="mediaUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cover_url", property="coverUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadVideo> selectByExampleWithRowbounds(ThreadVideoExample example, RowBounds rowBounds);

    @SelectProvider(type=ThreadVideoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="width", property="width", jdbcType=JdbcType.INTEGER),
        @Result(column="duration", property="duration", jdbcType=JdbcType.DECIMAL),
        @Result(column="media_url", property="mediaUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cover_url", property="coverUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadVideo> selectByExample(ThreadVideoExample example);

    @Select({
        "select",
        "id, thread_id, post_id, user_id, type, status, reason, file_name, file_id, height, ",
        "width, duration, media_url, cover_url, created_at, updated_at",
        "from thread_video",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.VARCHAR),
        @Result(column="height", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="width", property="width", jdbcType=JdbcType.INTEGER),
        @Result(column="duration", property="duration", jdbcType=JdbcType.DECIMAL),
        @Result(column="media_url", property="mediaUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="cover_url", property="coverUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    ThreadVideo selectByPrimaryKey(Long id);

    @UpdateProvider(type=ThreadVideoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ThreadVideo record, @Param("example") ThreadVideoExample example);

    @UpdateProvider(type=ThreadVideoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ThreadVideo record, @Param("example") ThreadVideoExample example);

    @UpdateProvider(type=ThreadVideoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ThreadVideo record);

    @Update({
        "update thread_video",
        "set thread_id = #{threadId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "file_id = #{fileId,jdbcType=VARCHAR},",
          "height = #{height,jdbcType=INTEGER},",
          "width = #{width,jdbcType=INTEGER},",
          "duration = #{duration,jdbcType=DECIMAL},",
          "media_url = #{mediaUrl,jdbcType=VARCHAR},",
          "cover_url = #{coverUrl,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ThreadVideo record);
}