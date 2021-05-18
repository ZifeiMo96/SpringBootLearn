package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileTagRelationInfo;
import com.example.demo.data.model.SourcelayFileTagRelationInfoExample;
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

public interface SourcelayFileTagRelationInfoMapper {
    @SelectProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileTagRelationInfoExample example);

    @DeleteProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileTagRelationInfoExample example);

    @Delete({
        "delete from sourcelay_file_tag_relation_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_file_tag_relation_info (id, file_id, ",
        "tag_id, created_at)",
        "values (#{id,jdbcType=BIGINT}, #{fileId,jdbcType=BIGINT}, ",
        "#{tagId,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(SourcelayFileTagRelationInfo record);

    @InsertProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileTagRelationInfo record);

    @SelectProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileTagRelationInfo> selectByExampleWithRowbounds(SourcelayFileTagRelationInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileTagRelationInfo> selectByExample(SourcelayFileTagRelationInfoExample example);

    @Select({
        "select",
        "id, file_id, tag_id, created_at",
        "from sourcelay_file_tag_relation_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    SourcelayFileTagRelationInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileTagRelationInfo record, @Param("example") SourcelayFileTagRelationInfoExample example);

    @UpdateProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileTagRelationInfo record, @Param("example") SourcelayFileTagRelationInfoExample example);

    @UpdateProvider(type=SourcelayFileTagRelationInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileTagRelationInfo record);

    @Update({
        "update sourcelay_file_tag_relation_info",
        "set file_id = #{fileId,jdbcType=BIGINT},",
          "tag_id = #{tagId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileTagRelationInfo record);
}