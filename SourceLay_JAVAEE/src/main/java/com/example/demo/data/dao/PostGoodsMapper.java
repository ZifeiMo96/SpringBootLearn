package com.example.demo.data.dao;

import com.example.demo.data.model.PostGoods;
import com.example.demo.data.model.PostGoodsExample;
import com.example.demo.data.model.PostGoodsWithBLOBs;
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

public interface PostGoodsMapper {
    @SelectProvider(type=PostGoodsSqlProvider.class, method="countByExample")
    long countByExample(PostGoodsExample example);

    @DeleteProvider(type=PostGoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PostGoodsExample example);

    @Delete({
        "delete from post_goods",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into post_goods (id, user_id, ",
        "post_id, platform_id, ",
        "title, price, image_path, ",
        "type, status, created_at, ",
        "updated_at, deleted_at, ",
        "ready_content, detail_content)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{postId,jdbcType=BIGINT}, #{platformId,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{price,jdbcType=VARCHAR}, #{imagePath,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{deletedAt,jdbcType=TIMESTAMP}, ",
        "#{readyContent,jdbcType=LONGVARCHAR}, #{detailContent,jdbcType=LONGVARCHAR})"
    })
    int insert(PostGoodsWithBLOBs record);

    @InsertProvider(type=PostGoodsSqlProvider.class, method="insertSelective")
    int insertSelective(PostGoodsWithBLOBs record);

    @SelectProvider(type=PostGoodsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_path", property="imagePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ready_content", property="readyContent", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_content", property="detailContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PostGoodsWithBLOBs> selectByExampleWithBLOBsWithRowbounds(PostGoodsExample example, RowBounds rowBounds);

    @SelectProvider(type=PostGoodsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_path", property="imagePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ready_content", property="readyContent", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_content", property="detailContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PostGoodsWithBLOBs> selectByExampleWithBLOBs(PostGoodsExample example);

    @SelectProvider(type=PostGoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_path", property="imagePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PostGoods> selectByExampleWithRowbounds(PostGoodsExample example, RowBounds rowBounds);

    @SelectProvider(type=PostGoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_path", property="imagePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PostGoods> selectByExample(PostGoodsExample example);

    @Select({
        "select",
        "id, user_id, post_id, platform_id, title, price, image_path, type, status, created_at, ",
        "updated_at, deleted_at, ready_content, detail_content",
        "from post_goods",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="platform_id", property="platformId", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_path", property="imagePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ready_content", property="readyContent", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_content", property="detailContent", jdbcType=JdbcType.LONGVARCHAR)
    })
    PostGoodsWithBLOBs selectByPrimaryKey(Long id);

    @UpdateProvider(type=PostGoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PostGoodsWithBLOBs record, @Param("example") PostGoodsExample example);

    @UpdateProvider(type=PostGoodsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PostGoodsWithBLOBs record, @Param("example") PostGoodsExample example);

    @UpdateProvider(type=PostGoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PostGoods record, @Param("example") PostGoodsExample example);

    @UpdateProvider(type=PostGoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PostGoodsWithBLOBs record);

    @Update({
        "update post_goods",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "platform_id = #{platformId,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=VARCHAR},",
          "image_path = #{imagePath,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "ready_content = #{readyContent,jdbcType=LONGVARCHAR},",
          "detail_content = #{detailContent,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(PostGoodsWithBLOBs record);

    @Update({
        "update post_goods",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "platform_id = #{platformId,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=VARCHAR},",
          "image_path = #{imagePath,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PostGoods record);
}