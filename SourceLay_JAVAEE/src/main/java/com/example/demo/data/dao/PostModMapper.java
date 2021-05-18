package com.example.demo.data.dao;

import com.example.demo.data.model.PostMod;
import com.example.demo.data.model.PostModExample;
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

public interface PostModMapper {
    @SelectProvider(type=PostModSqlProvider.class, method="countByExample")
    long countByExample(PostModExample example);

    @DeleteProvider(type=PostModSqlProvider.class, method="deleteByExample")
    int deleteByExample(PostModExample example);

    @Delete({
        "delete from post_mod",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long postId);

    @Insert({
        "insert into post_mod (post_id, stop_word)",
        "values (#{postId,jdbcType=BIGINT}, #{stopWord,jdbcType=VARCHAR})"
    })
    int insert(PostMod record);

    @InsertProvider(type=PostModSqlProvider.class, method="insertSelective")
    int insertSelective(PostMod record);

    @SelectProvider(type=PostModSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="stop_word", property="stopWord", jdbcType=JdbcType.VARCHAR)
    })
    List<PostMod> selectByExampleWithRowbounds(PostModExample example, RowBounds rowBounds);

    @SelectProvider(type=PostModSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="stop_word", property="stopWord", jdbcType=JdbcType.VARCHAR)
    })
    List<PostMod> selectByExample(PostModExample example);

    @Select({
        "select",
        "post_id, stop_word",
        "from post_mod",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="stop_word", property="stopWord", jdbcType=JdbcType.VARCHAR)
    })
    PostMod selectByPrimaryKey(Long postId);

    @UpdateProvider(type=PostModSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PostMod record, @Param("example") PostModExample example);

    @UpdateProvider(type=PostModSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PostMod record, @Param("example") PostModExample example);

    @UpdateProvider(type=PostModSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PostMod record);

    @Update({
        "update post_mod",
        "set stop_word = #{stopWord,jdbcType=VARCHAR}",
        "where post_id = #{postId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PostMod record);
}