package com.example.demo.data.dao;

import com.example.demo.data.model.PostMentionsUserExample;
import com.example.demo.data.model.PostMentionsUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
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

public interface PostMentionsUserMapper {
    @SelectProvider(type=PostMentionsUserSqlProvider.class, method="countByExample")
    long countByExample(PostMentionsUserExample example);

    @DeleteProvider(type=PostMentionsUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(PostMentionsUserExample example);

    @Delete({
        "delete from post_mentions_user",
        "where post_id = #{postId,jdbcType=BIGINT}",
          "and mentions_user_id = #{mentionsUserId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(PostMentionsUserKey key);

    @Insert({
        "insert into post_mentions_user (post_id, mentions_user_id)",
        "values (#{postId,jdbcType=BIGINT}, #{mentionsUserId,jdbcType=BIGINT})"
    })
    int insert(PostMentionsUserKey record);

    @InsertProvider(type=PostMentionsUserSqlProvider.class, method="insertSelective")
    int insertSelective(PostMentionsUserKey record);

    @SelectProvider(type=PostMentionsUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mentions_user_id", property="mentionsUserId", jdbcType=JdbcType.BIGINT, id=true)
    })
    List<PostMentionsUserKey> selectByExampleWithRowbounds(PostMentionsUserExample example, RowBounds rowBounds);

    @SelectProvider(type=PostMentionsUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mentions_user_id", property="mentionsUserId", jdbcType=JdbcType.BIGINT, id=true)
    })
    List<PostMentionsUserKey> selectByExample(PostMentionsUserExample example);

    @UpdateProvider(type=PostMentionsUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PostMentionsUserKey record, @Param("example") PostMentionsUserExample example);

    @UpdateProvider(type=PostMentionsUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PostMentionsUserKey record, @Param("example") PostMentionsUserExample example);
}