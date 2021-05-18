package com.example.demo.data.dao;

import com.example.demo.data.model.Posts;
import com.example.demo.data.model.PostsExample;
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

public interface PostsMapper {
    @SelectProvider(type=PostsSqlProvider.class, method="countByExample")
    long countByExample(PostsExample example);

    @DeleteProvider(type=PostsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PostsExample example);

    @Delete({
        "delete from posts",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into posts (id, user_id, ",
        "thread_id, reply_post_id, ",
        "reply_user_id, ip, ",
        "port, reply_count, ",
        "like_count, created_at, ",
        "updated_at, deleted_at, ",
        "deleted_user_id, is_first, ",
        "is_comment, is_approved, ",
        "content)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{threadId,jdbcType=BIGINT}, #{replyPostId,jdbcType=BIGINT}, ",
        "#{replyUserId,jdbcType=BIGINT}, #{ip,jdbcType=VARCHAR}, ",
        "#{port,jdbcType=INTEGER}, #{replyCount,jdbcType=INTEGER}, ",
        "#{likeCount,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{deletedAt,jdbcType=TIMESTAMP}, ",
        "#{deletedUserId,jdbcType=BIGINT}, #{isFirst,jdbcType=TINYINT}, ",
        "#{isComment,jdbcType=TINYINT}, #{isApproved,jdbcType=TINYINT}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Posts record);

    @InsertProvider(type=PostsSqlProvider.class, method="insertSelective")
    int insertSelective(Posts record);

    @SelectProvider(type=PostsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_post_id", property="replyPostId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_user_id", property="replyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="reply_count", property="replyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="is_comment", property="isComment", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Posts> selectByExampleWithBLOBsWithRowbounds(PostsExample example, RowBounds rowBounds);

    @SelectProvider(type=PostsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_post_id", property="replyPostId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_user_id", property="replyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="reply_count", property="replyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="is_comment", property="isComment", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Posts> selectByExampleWithBLOBs(PostsExample example);

    @SelectProvider(type=PostsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_post_id", property="replyPostId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_user_id", property="replyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="reply_count", property="replyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="is_comment", property="isComment", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT)
    })
    List<Posts> selectByExampleWithRowbounds(PostsExample example, RowBounds rowBounds);

    @SelectProvider(type=PostsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_post_id", property="replyPostId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_user_id", property="replyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="reply_count", property="replyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="is_comment", property="isComment", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT)
    })
    List<Posts> selectByExample(PostsExample example);

    @Select({
        "select",
        "id, user_id, thread_id, reply_post_id, reply_user_id, ip, port, reply_count, ",
        "like_count, created_at, updated_at, deleted_at, deleted_user_id, is_first, is_comment, ",
        "is_approved, content",
        "from posts",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_post_id", property="replyPostId", jdbcType=JdbcType.BIGINT),
        @Result(column="reply_user_id", property="replyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="reply_count", property="replyCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="is_comment", property="isComment", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    Posts selectByPrimaryKey(Long id);

    @UpdateProvider(type=PostsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);

    @UpdateProvider(type=PostsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Posts record, @Param("example") PostsExample example);

    @UpdateProvider(type=PostsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    @UpdateProvider(type=PostsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Posts record);

    @Update({
        "update posts",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "reply_post_id = #{replyPostId,jdbcType=BIGINT},",
          "reply_user_id = #{replyUserId,jdbcType=BIGINT},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "port = #{port,jdbcType=INTEGER},",
          "reply_count = #{replyCount,jdbcType=INTEGER},",
          "like_count = #{likeCount,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "deleted_user_id = #{deletedUserId,jdbcType=BIGINT},",
          "is_first = #{isFirst,jdbcType=TINYINT},",
          "is_comment = #{isComment,jdbcType=TINYINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Posts record);

    @Update({
        "update posts",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "reply_post_id = #{replyPostId,jdbcType=BIGINT},",
          "reply_user_id = #{replyUserId,jdbcType=BIGINT},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "port = #{port,jdbcType=INTEGER},",
          "reply_count = #{replyCount,jdbcType=INTEGER},",
          "like_count = #{likeCount,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "deleted_user_id = #{deletedUserId,jdbcType=BIGINT},",
          "is_first = #{isFirst,jdbcType=TINYINT},",
          "is_comment = #{isComment,jdbcType=TINYINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Posts record);
}