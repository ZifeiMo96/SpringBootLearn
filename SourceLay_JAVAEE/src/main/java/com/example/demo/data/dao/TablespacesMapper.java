package com.example.demo.data.dao;

import com.example.demo.data.model.Tablespaces;
import com.example.demo.data.model.TablespacesExample;
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

public interface TablespacesMapper {
    @SelectProvider(type=TablespacesSqlProvider.class, method="countByExample")
    long countByExample(TablespacesExample example);

    @DeleteProvider(type=TablespacesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TablespacesExample example);

    @Insert({
        "insert into TABLESPACES (TABLESPACE_NAME, ENGINE, ",
        "TABLESPACE_TYPE, LOGFILE_GROUP_NAME, ",
        "EXTENT_SIZE, AUTOEXTEND_SIZE, ",
        "MAXIMUM_SIZE, NODEGROUP_ID, ",
        "TABLESPACE_COMMENT)",
        "values (#{tablespaceName,jdbcType=VARCHAR}, #{engine,jdbcType=VARCHAR}, ",
        "#{tablespaceType,jdbcType=VARCHAR}, #{logfileGroupName,jdbcType=VARCHAR}, ",
        "#{extentSize,jdbcType=BIGINT}, #{autoextendSize,jdbcType=BIGINT}, ",
        "#{maximumSize,jdbcType=BIGINT}, #{nodegroupId,jdbcType=BIGINT}, ",
        "#{tablespaceComment,jdbcType=VARCHAR})"
    })
    int insert(Tablespaces record);

    @InsertProvider(type=TablespacesSqlProvider.class, method="insertSelective")
    int insertSelective(Tablespaces record);

    @SelectProvider(type=TablespacesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_TYPE", property="tablespaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGFILE_GROUP_NAME", property="logfileGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTENT_SIZE", property="extentSize", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOEXTEND_SIZE", property="autoextendSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MAXIMUM_SIZE", property="maximumSize", jdbcType=JdbcType.BIGINT),
        @Result(column="NODEGROUP_ID", property="nodegroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="TABLESPACE_COMMENT", property="tablespaceComment", jdbcType=JdbcType.VARCHAR)
    })
    List<Tablespaces> selectByExampleWithRowbounds(TablespacesExample example, RowBounds rowBounds);

    @SelectProvider(type=TablespacesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_TYPE", property="tablespaceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGFILE_GROUP_NAME", property="logfileGroupName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTENT_SIZE", property="extentSize", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOEXTEND_SIZE", property="autoextendSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MAXIMUM_SIZE", property="maximumSize", jdbcType=JdbcType.BIGINT),
        @Result(column="NODEGROUP_ID", property="nodegroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="TABLESPACE_COMMENT", property="tablespaceComment", jdbcType=JdbcType.VARCHAR)
    })
    List<Tablespaces> selectByExample(TablespacesExample example);

    @UpdateProvider(type=TablespacesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);

    @UpdateProvider(type=TablespacesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tablespaces record, @Param("example") TablespacesExample example);
}