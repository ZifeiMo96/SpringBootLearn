package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayTagInfo;
import com.example.demo.data.model.SourcelayTagInfoExample;
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

public interface SourcelayTagInfoMapper {
    @SelectProvider(type=SourcelayTagInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayTagInfoExample example);

    @DeleteProvider(type=SourcelayTagInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayTagInfoExample example);

    @Delete({
        "delete from sourcelay_tag_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_tag_info (id, name, ",
        "user_id, file_count, ",
        "download_count, view_count, ",
        "is_recommended, recommended_at)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=BIGINT}, #{fileCount,jdbcType=INTEGER}, ",
        "#{downloadCount,jdbcType=INTEGER}, #{viewCount,jdbcType=INTEGER}, ",
        "#{isRecommended,jdbcType=TINYINT}, #{recommendedAt,jdbcType=TIMESTAMP})"
    })
    int insert(SourcelayTagInfo record);

    @InsertProvider(type=SourcelayTagInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayTagInfo record);

    @SelectProvider(type=SourcelayTagInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="file_count", property="fileCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayTagInfo> selectByExampleWithRowbounds(SourcelayTagInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayTagInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="file_count", property="fileCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayTagInfo> selectByExample(SourcelayTagInfoExample example);

    @Select({
        "select",
        "id, name, user_id, file_count, download_count, view_count, is_recommended, recommended_at",
        "from sourcelay_tag_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="file_count", property="fileCount", jdbcType=JdbcType.INTEGER),
        @Result(column="download_count", property="downloadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="view_count", property="viewCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_recommended", property="isRecommended", jdbcType=JdbcType.TINYINT),
        @Result(column="recommended_at", property="recommendedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    SourcelayTagInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayTagInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayTagInfo record, @Param("example") SourcelayTagInfoExample example);

    @UpdateProvider(type=SourcelayTagInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayTagInfo record, @Param("example") SourcelayTagInfoExample example);

    @UpdateProvider(type=SourcelayTagInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayTagInfo record);

    @Update({
        "update sourcelay_tag_info",
        "set name = #{name,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "file_count = #{fileCount,jdbcType=INTEGER},",
          "download_count = #{downloadCount,jdbcType=INTEGER},",
          "view_count = #{viewCount,jdbcType=INTEGER},",
          "is_recommended = #{isRecommended,jdbcType=TINYINT},",
          "recommended_at = #{recommendedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayTagInfo record);
}