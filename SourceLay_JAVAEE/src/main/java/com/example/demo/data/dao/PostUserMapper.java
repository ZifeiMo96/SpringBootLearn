package com.example.demo.data.dao;

import com.example.demo.data.model.PostUser;
import com.example.demo.data.model.PostUserExample;
import com.example.demo.data.model.PostUserKey;
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

public interface PostUserMapper {
    @SelectProvider(type=PostUserSqlProvider.class, method="countByExample")
    long countByExample(PostUserExample example);

    @DeleteProvider(type=PostUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(PostUserExample example);

    @Delete({
        "delete from post_user",
        "where post_id = #{postId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(PostUserKey key);

    @Insert({
        "insert into post_user (post_id, user_id, ",
        "created_at)",
        "values (#{postId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(PostUser record);

    @InsertProvider(type=PostUserSqlProvider.class, method="insertSelective")
    int insertSelective(PostUser record);

    @SelectProvider(type=PostUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PostUser> selectByExampleWithRowbounds(PostUserExample example, RowBounds rowBounds);

    @SelectProvider(type=PostUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PostUser> selectByExample(PostUserExample example);

    @Select({
        "select",
        "post_id, user_id, created_at",
        "from post_user",
        "where post_id = #{postId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    PostUser selectByPrimaryKey(PostUserKey key);

    @UpdateProvider(type=PostUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PostUser record, @Param("example") PostUserExample example);

    @UpdateProvider(type=PostUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PostUser record, @Param("example") PostUserExample example);

    @UpdateProvider(type=PostUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PostUser record);

    @Update({
        "update post_user",
        "set created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where post_id = #{postId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PostUser record);
}