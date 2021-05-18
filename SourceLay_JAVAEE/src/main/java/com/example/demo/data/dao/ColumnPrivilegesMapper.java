package com.example.demo.data.dao;

import com.example.demo.data.model.ColumnPrivileges;
import com.example.demo.data.model.ColumnPrivilegesExample;
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

public interface ColumnPrivilegesMapper {
    @SelectProvider(type=ColumnPrivilegesSqlProvider.class, method="countByExample")
    long countByExample(ColumnPrivilegesExample example);

    @DeleteProvider(type=ColumnPrivilegesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ColumnPrivilegesExample example);

    @Insert({
        "insert into COLUMN_PRIVILEGES (GRANTEE, TABLE_CATALOG, ",
        "TABLE_SCHEMA, TABLE_NAME, ",
        "COLUMN_NAME, PRIVILEGE_TYPE, ",
        "IS_GRANTABLE)",
        "values (#{grantee,jdbcType=VARCHAR}, #{tableCatalog,jdbcType=VARCHAR}, ",
        "#{tableSchema,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{columnName,jdbcType=VARCHAR}, #{privilegeType,jdbcType=VARCHAR}, ",
        "#{isGrantable,jdbcType=VARCHAR})"
    })
    int insert(ColumnPrivileges record);

    @InsertProvider(type=ColumnPrivilegesSqlProvider.class, method="insertSelective")
    int insertSelective(ColumnPrivileges record);

    @SelectProvider(type=ColumnPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<ColumnPrivileges> selectByExampleWithRowbounds(ColumnPrivilegesExample example, RowBounds rowBounds);

    @SelectProvider(type=ColumnPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<ColumnPrivileges> selectByExample(ColumnPrivilegesExample example);

    @UpdateProvider(type=ColumnPrivilegesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ColumnPrivileges record, @Param("example") ColumnPrivilegesExample example);

    @UpdateProvider(type=ColumnPrivilegesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ColumnPrivileges record, @Param("example") ColumnPrivilegesExample example);
}