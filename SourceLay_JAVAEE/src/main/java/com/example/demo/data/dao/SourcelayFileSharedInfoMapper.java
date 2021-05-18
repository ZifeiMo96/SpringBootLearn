package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileSharedInfo;
import com.example.demo.data.model.SourcelayFileSharedInfoExample;
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

public interface SourcelayFileSharedInfoMapper {
    @SelectProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileSharedInfoExample example);

    @DeleteProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileSharedInfoExample example);

    @Delete({
        "delete from sourcelay_file_shared_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_file_shared_info (id, file_id, ",
        "user_id, shared_desc, ",
        "shared_type, password, ",
        "is_anonymous, cost, ",
        "view_count, download_count, ",
        "is_recommended, recommended_at, ",
        "created_at, deleted_at, ",
        "deleted_id)",
        "values (#{id,jdbcType=BIGINT}, #{fileId,jdbcType=BIGINT}, ",
        "#{userId,jdbcType=BIGINT}, #{sharedDesc,jdbcType=VARCHAR}, ",
        "#{sharedType,jdbcType=SMALLINT}, #{password,jdbcType=VARCHAR}, ",
        "#{isAnonymous,jdbcType=TINYINT}, #{cost,jdbcType=INTEGER}, ",
        "#{viewCount,jdbcType=INTEGER}, #{downloadCount,jdbcType=INTEGER}, ",
        "#{isRecommended,jdbcType=TINYINT}, #{recommendedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{deletedAt,jdbcType=TIMESTAMP}, ",
        "#{deletedId,jdbcType=BIGINT})"
    })
    int insert(SourcelayFileSharedInfo record);

    @InsertProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileSharedInfo record);

    @SelectProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="shared_desc", property="sharedDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="shared_type", property="sharedType", jdbcType=JdbcType.SMALLINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="cost", property="cost", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT)
    })
    List<SourcelayFileSharedInfo> selectByExampleWithRowbounds(SourcelayFileSharedInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="shared_desc", property="sharedDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="shared_type", property="sharedType", jdbcType=JdbcType.SMALLINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="cost", property="cost", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT)
    })
    List<SourcelayFileSharedInfo> selectByExample(SourcelayFileSharedInfoExample example);

    @Select({
        "select",
        "id, file_id, user_id, shared_desc, shared_type, password, is_anonymous, cost, ",
        "view_count, download_count, is_recommended, recommended_at, created_at, deleted_at, ",
        "deleted_id",
        "from sourcelay_file_shared_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="shared_desc", property="sharedDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="shared_type", property="sharedType", jdbcType=JdbcType.SMALLINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_anonymous", property="isAnonymous", jdbcType=JdbcType.TINYINT),
        @Result(column="cost", property="cost", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT)
    })
    SourcelayFileSharedInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileSharedInfo record, @Param("example") SourcelayFileSharedInfoExample example);

    @UpdateProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileSharedInfo record, @Param("example") SourcelayFileSharedInfoExample example);

    @UpdateProvider(type=SourcelayFileSharedInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileSharedInfo record);

    @Update({
        "update sourcelay_file_shared_info",
        "set file_id = #{fileId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "shared_desc = #{sharedDesc,jdbcType=VARCHAR},",
          "shared_type = #{sharedType,jdbcType=SMALLINT},",
          "password = #{password,jdbcType=VARCHAR},",
          "is_anonymous = #{isAnonymous,jdbcType=TINYINT},",
          "cost = #{cost,jdbcType=INTEGER},",
          "view_count = #{viewCount,jdbcType=INTEGER},",
          "download_count = #{downloadCount,jdbcType=INTEGER},",
          "is_recommended = #{isRecommended,jdbcType=TINYINT},",
          "recommended_at = #{recommendedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "deleted_id = #{deletedId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileSharedInfo record);
}