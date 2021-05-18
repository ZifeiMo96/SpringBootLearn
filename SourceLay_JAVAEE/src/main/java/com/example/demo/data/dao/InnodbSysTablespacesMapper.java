package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysTablespaces;
import com.example.demo.data.model.InnodbSysTablespacesExample;
import java.util.List;
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

public interface InnodbSysTablespacesMapper {
    @SelectProvider(type=InnodbSysTablespacesSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysTablespacesExample example);

    @DeleteProvider(type=InnodbSysTablespacesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysTablespacesExample example);

    @Insert({
        "insert into INNODB_SYS_TABLESPACES (SPACE, NAME, ",
        "FLAG, ROW_FORMAT, ",
        "PAGE_SIZE, ZIP_PAGE_SIZE, ",
        "SPACE_TYPE, FS_BLOCK_SIZE, ",
        "FILE_SIZE, ALLOCATED_SIZE)",
        "values (#{space,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=INTEGER}, #{rowFormat,jdbcType=VARCHAR}, ",
        "#{pageSize,jdbcType=INTEGER}, #{zipPageSize,jdbcType=INTEGER}, ",
        "#{spaceType,jdbcType=VARCHAR}, #{fsBlockSize,jdbcType=INTEGER}, ",
        "#{fileSize,jdbcType=BIGINT}, #{allocatedSize,jdbcType=BIGINT})"
    })
    int insert(InnodbSysTablespaces record);

    @InsertProvider(type=InnodbSysTablespacesSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysTablespaces record);

    @SelectProvider(type=InnodbSysTablespacesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAGE_SIZE", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FS_BLOCK_SIZE", property="fsBlockSize", jdbcType=JdbcType.INTEGER),
        @Result(column="FILE_SIZE", property="fileSize", jdbcType=JdbcType.BIGINT),
        @Result(column="ALLOCATED_SIZE", property="allocatedSize", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbSysTablespaces> selectByExampleWithRowbounds(InnodbSysTablespacesExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysTablespacesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="PAGE_SIZE", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="FS_BLOCK_SIZE", property="fsBlockSize", jdbcType=JdbcType.INTEGER),
        @Result(column="FILE_SIZE", property="fileSize", jdbcType=JdbcType.BIGINT),
        @Result(column="ALLOCATED_SIZE", property="allocatedSize", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbSysTablespaces> selectByExample(InnodbSysTablespacesExample example);

    @UpdateProvider(type=InnodbSysTablespacesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysTablespaces record, @Param("example") InnodbSysTablespacesExample example);

    @UpdateProvider(type=InnodbSysTablespacesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysTablespaces record, @Param("example") InnodbSysTablespacesExample example);
}