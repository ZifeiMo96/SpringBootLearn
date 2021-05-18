package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileLikeInfo;
import com.example.demo.data.model.SourcelayFileLikeInfoExample;
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

public interface SourcelayFileLikeInfoMapper {
    @SelectProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileLikeInfoExample example);

    @DeleteProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileLikeInfoExample example);

    @Delete({
        "delete from sourcelay_file_like_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_file_like_info (id, user_id, ",
        "created_at, file_id)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{fileId,jdbcType=BIGINT})"
    })
    int insert(SourcelayFileLikeInfo record);

    @InsertProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileLikeInfo record);

    @SelectProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT)
    })
    List<SourcelayFileLikeInfo> selectByExampleWithRowbounds(SourcelayFileLikeInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT)
    })
    List<SourcelayFileLikeInfo> selectByExample(SourcelayFileLikeInfoExample example);

    @Select({
        "select",
        "id, user_id, created_at, file_id",
        "from sourcelay_file_like_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT)
    })
    SourcelayFileLikeInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileLikeInfo record, @Param("example") SourcelayFileLikeInfoExample example);

    @UpdateProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileLikeInfo record, @Param("example") SourcelayFileLikeInfoExample example);

    @UpdateProvider(type=SourcelayFileLikeInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileLikeInfo record);

    @Update({
        "update sourcelay_file_like_info",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "file_id = #{fileId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileLikeInfo record);
}