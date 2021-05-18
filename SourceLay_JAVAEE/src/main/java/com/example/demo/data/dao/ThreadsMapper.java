package com.example.demo.data.dao;

import com.example.demo.data.model.Threads;
import com.example.demo.data.model.ThreadsExample;
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

public interface ThreadsMapper {
    @SelectProvider(type=ThreadsSqlProvider.class, method="countByExample")
    long countByExample(ThreadsExample example);

    @DeleteProvider(type=ThreadsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ThreadsExample example);

    @Delete({
        "delete from threads",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into threads (id, user_id, ",
        "last_posted_user_id, category_id, ",
        "type, title, price, ",
        "attachment_price, free_words, ",
        "post_count, view_count, ",
        "rewarded_count, paid_count, ",
        "longitude, latitude, ",
        "address, location, ",
        "created_at, updated_at, ",
        "deleted_at, deleted_user_id, ",
        "is_approved, is_sticky, ",
        "is_essence, is_site, ",
        "is_anonymous, is_display)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{lastPostedUserId,jdbcType=BIGINT}, #{categoryId,jdbcType=INTEGER}, ",
        "#{type,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{attachmentPrice,jdbcType=DECIMAL}, #{freeWords,jdbcType=DOUBLE}, ",
        "#{postCount,jdbcType=INTEGER}, #{viewCount,jdbcType=INTEGER}, ",
        "#{rewardedCount,jdbcType=INTEGER}, #{paidCount,jdbcType=INTEGER}, ",
        "#{longitude,jdbcType=DECIMAL}, #{latitude,jdbcType=DECIMAL}, ",
        "#{address,jdbcType=VARCHAR}, #{location,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{deletedAt,jdbcType=TIMESTAMP}, #{deletedUserId,jdbcType=BIGINT}, ",
        "#{isApproved,jdbcType=TINYINT}, #{isSticky,jdbcType=TINYINT}, ",
        "#{isEssence,jdbcType=TINYINT}, #{isSite,jdbcType=TINYINT}, ",
        "#{isAnonymous,jdbcType=TINYINT}, #{isDisplay,jdbcType=TINYINT})"
    })
    int insert(Threads record);

    @InsertProvider(type=ThreadsSqlProvider.class, method="insertSelective")
    int insertSelective(Threads record);

    @SelectProvider(type=ThreadsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="last_posted_user_id", property="lastPostedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="attachment_price", property="attachmentPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="free_words", property="freeWords", jdbcType=JdbcType.DOUBLE),
        @Result(column="post_count", property="postCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="rewarded_count", property="rewardedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="paid_count", property="paidCount", jdbcType=JdbcType.INTEGER),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="is_sticky", property="isSticky", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="is_site", property="isSite", jdbcType=JdbcType.TINYINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT)
    })
    List<Threads> selectByExampleWithRowbounds(ThreadsExample example, RowBounds rowBounds);

    @SelectProvider(type=ThreadsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="last_posted_user_id", property="lastPostedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="attachment_price", property="attachmentPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="free_words", property="freeWords", jdbcType=JdbcType.DOUBLE),
        @Result(column="post_count", property="postCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="rewarded_count", property="rewardedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="paid_count", property="paidCount", jdbcType=JdbcType.INTEGER),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="is_sticky", property="isSticky", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="is_site", property="isSite", jdbcType=JdbcType.TINYINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT)
    })
    List<Threads> selectByExample(ThreadsExample example);

    @Select({
        "select",
        "id, user_id, last_posted_user_id, category_id, type, title, price, attachment_price, ",
        "free_words, post_count, view_count, rewarded_count, paid_count, longitude, latitude, ",
        "address, location, created_at, updated_at, deleted_at, deleted_user_id, is_approved, ",
        "is_sticky, is_essence, is_site, is_anonymous, is_display",
        "from threads",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="last_posted_user_id", property="lastPostedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="attachment_price", property="attachmentPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="free_words", property="freeWords", jdbcType=JdbcType.DOUBLE),
        @Result(column="post_count", property="postCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="rewarded_count", property="rewardedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="paid_count", property="paidCount", jdbcType=JdbcType.INTEGER),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_user_id", property="deletedUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="is_sticky", property="isSticky", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="is_site", property="isSite", jdbcType=JdbcType.TINYINT),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT)
    })
    Threads selectByPrimaryKey(Long id);

    @UpdateProvider(type=ThreadsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Threads record, @Param("example") ThreadsExample example);

    @UpdateProvider(type=ThreadsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Threads record, @Param("example") ThreadsExample example);

    @UpdateProvider(type=ThreadsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Threads record);

    @Update({
        "update threads",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "last_posted_user_id = #{lastPostedUserId,jdbcType=BIGINT},",
          "category_id = #{categoryId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=TINYINT},",
          "title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=DECIMAL},",
          "attachment_price = #{attachmentPrice,jdbcType=DECIMAL},",
          "free_words = #{freeWords,jdbcType=DOUBLE},",
          "post_count = #{postCount,jdbcType=INTEGER},",
          "view_count = #{viewCount,jdbcType=INTEGER},",
          "rewarded_count = #{rewardedCount,jdbcType=INTEGER},",
          "paid_count = #{paidCount,jdbcType=INTEGER},",
          "longitude = #{longitude,jdbcType=DECIMAL},",
          "latitude = #{latitude,jdbcType=DECIMAL},",
          "address = #{address,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "deleted_user_id = #{deletedUserId,jdbcType=BIGINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT},",
          "is_sticky = #{isSticky,jdbcType=TINYINT},",
          "is_essence = #{isEssence,jdbcType=TINYINT},",
          "is_site = #{isSite,jdbcType=TINYINT},",
          "is_anonymous = #{isAnonymous,jdbcType=TINYINT},",
          "is_display = #{isDisplay,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Threads record);
}