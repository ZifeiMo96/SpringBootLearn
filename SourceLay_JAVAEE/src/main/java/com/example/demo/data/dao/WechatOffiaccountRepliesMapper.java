package com.example.demo.data.dao;

import com.example.demo.data.model.WechatOffiaccountReplies;
import com.example.demo.data.model.WechatOffiaccountRepliesExample;
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

public interface WechatOffiaccountRepliesMapper {
    @SelectProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="countByExample")
    long countByExample(WechatOffiaccountRepliesExample example);

    @DeleteProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="deleteByExample")
    int deleteByExample(WechatOffiaccountRepliesExample example);

    @Delete({
        "delete from wechat_offiaccount_replies",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into wechat_offiaccount_replies (id, name, ",
        "keyword, match_type, ",
        "reply_type, content, ",
        "media_id, media_type, ",
        "type, status, created_at, ",
        "updated_at, deleted_at)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{keyword,jdbcType=VARCHAR}, #{matchType,jdbcType=TINYINT}, ",
        "#{replyType,jdbcType=TINYINT}, #{content,jdbcType=VARCHAR}, ",
        "#{mediaId,jdbcType=VARCHAR}, #{mediaType,jdbcType=TINYINT}, ",
        "#{type,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{deletedAt,jdbcType=TIMESTAMP})"
    })
    int insert(WechatOffiaccountReplies record);

    @InsertProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="insertSelective")
    int insertSelective(WechatOffiaccountReplies record);

    @SelectProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="match_type", property="matchType", jdbcType=JdbcType.TINYINT),
        @Result(column="reply_type", property="replyType", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_id", property="mediaId", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_type", property="mediaType", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<WechatOffiaccountReplies> selectByExampleWithRowbounds(WechatOffiaccountRepliesExample example, RowBounds rowBounds);

    @SelectProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="match_type", property="matchType", jdbcType=JdbcType.TINYINT),
        @Result(column="reply_type", property="replyType", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_id", property="mediaId", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_type", property="mediaType", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<WechatOffiaccountReplies> selectByExample(WechatOffiaccountRepliesExample example);

    @Select({
        "select",
        "id, name, keyword, match_type, reply_type, content, media_id, media_type, type, ",
        "status, created_at, updated_at, deleted_at",
        "from wechat_offiaccount_replies",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="keyword", property="keyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="match_type", property="matchType", jdbcType=JdbcType.TINYINT),
        @Result(column="reply_type", property="replyType", jdbcType=JdbcType.TINYINT),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_id", property="mediaId", jdbcType=JdbcType.VARCHAR),
        @Result(column="media_type", property="mediaType", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    WechatOffiaccountReplies selectByPrimaryKey(Long id);

    @UpdateProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WechatOffiaccountReplies record, @Param("example") WechatOffiaccountRepliesExample example);

    @UpdateProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WechatOffiaccountReplies record, @Param("example") WechatOffiaccountRepliesExample example);

    @UpdateProvider(type=WechatOffiaccountRepliesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WechatOffiaccountReplies record);

    @Update({
        "update wechat_offiaccount_replies",
        "set name = #{name,jdbcType=VARCHAR},",
          "keyword = #{keyword,jdbcType=VARCHAR},",
          "match_type = #{matchType,jdbcType=TINYINT},",
          "reply_type = #{replyType,jdbcType=TINYINT},",
          "content = #{content,jdbcType=VARCHAR},",
          "media_id = #{mediaId,jdbcType=VARCHAR},",
          "media_type = #{mediaType,jdbcType=TINYINT},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(WechatOffiaccountReplies record);
}