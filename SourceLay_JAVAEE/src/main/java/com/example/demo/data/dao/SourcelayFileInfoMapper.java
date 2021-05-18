package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileInfo;
import com.example.demo.data.model.SourcelayFileInfoExample;
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

public interface SourcelayFileInfoMapper {
    @SelectProvider(type=SourcelayFileInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileInfoExample example);

    @DeleteProvider(type=SourcelayFileInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileInfoExample example);

    @Delete({
        "delete from sourcelay_file_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_file_info (id, user_id, ",
        "name, type, folder, ",
        "size, md5, status, ",
        "download_count, like_count, ",
        "created_at, updated_at, ",
        "is_shared, is_essence, ",
        "deleted_at, deleted_id, ",
        "random_id, storage_name)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{name,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{folder,jdbcType=VARCHAR}, ",
        "#{size,jdbcType=BIGINT}, #{md5,jdbcType=VARCHAR}, #{status,jdbcType=SMALLINT}, ",
        "#{downloadCount,jdbcType=INTEGER}, #{likeCount,jdbcType=INTEGER}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{isShared,jdbcType=TINYINT}, #{isEssence,jdbcType=TINYINT}, ",
        "#{deletedAt,jdbcType=TIMESTAMP}, #{deletedId,jdbcType=BIGINT}, ",
        "#{randomId,jdbcType=VARCHAR}, #{storageName,jdbcType=VARCHAR})"
    })
    int insert(SourcelayFileInfo record);

    @InsertProvider(type=SourcelayFileInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileInfo record);

    @SelectProvider(type=SourcelayFileInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="folder", property="folder", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.BIGINT),
        @Result(column="md5", property="md5", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_shared", property="isShared", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT),
        @Result(column="random_id", property="randomId", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_name", property="storageName", jdbcType=JdbcType.VARCHAR)
    })
    List<SourcelayFileInfo> selectByExampleWithRowbounds(SourcelayFileInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="folder", property="folder", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.BIGINT),
        @Result(column="md5", property="md5", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_shared", property="isShared", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT),
        @Result(column="random_id", property="randomId", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_name", property="storageName", jdbcType=JdbcType.VARCHAR)
    })
    List<SourcelayFileInfo> selectByExample(SourcelayFileInfoExample example);

    @Select({
        "select",
        "id, user_id, name, type, folder, size, md5, status, download_count, like_count, ",
        "created_at, updated_at, is_shared, is_essence, deleted_at, deleted_id, random_id, ",
        "storage_name",
        "from sourcelay_file_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="folder", property="folder", jdbcType=JdbcType.VARCHAR),
        @Result(column="size", property="size", jdbcType=JdbcType.BIGINT),
        @Result(column="md5", property="md5", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="like_count", property="likeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_shared", property="isShared", jdbcType=JdbcType.TINYINT),
        @Result(column="is_essence", property="isEssence", jdbcType=JdbcType.TINYINT),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_id", property="deletedId", jdbcType=JdbcType.BIGINT),
        @Result(column="random_id", property="randomId", jdbcType=JdbcType.VARCHAR),
        @Result(column="storage_name", property="storageName", jdbcType=JdbcType.VARCHAR)
    })
    SourcelayFileInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayFileInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileInfo record, @Param("example") SourcelayFileInfoExample example);

    @UpdateProvider(type=SourcelayFileInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileInfo record, @Param("example") SourcelayFileInfoExample example);

    @UpdateProvider(type=SourcelayFileInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileInfo record);

    @Update({
        "update sourcelay_file_info",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "folder = #{folder,jdbcType=VARCHAR},",
          "size = #{size,jdbcType=BIGINT},",
          "md5 = #{md5,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=SMALLINT},",
          "download_count = #{downloadCount,jdbcType=INTEGER},",
          "like_count = #{likeCount,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "is_shared = #{isShared,jdbcType=TINYINT},",
          "is_essence = #{isEssence,jdbcType=TINYINT},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "deleted_id = #{deletedId,jdbcType=BIGINT},",
          "random_id = #{randomId,jdbcType=VARCHAR},",
          "storage_name = #{storageName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileInfo record);
}