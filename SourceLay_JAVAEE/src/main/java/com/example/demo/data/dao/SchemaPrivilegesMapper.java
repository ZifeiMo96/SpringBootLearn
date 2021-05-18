package com.example.demo.data.dao;

import com.example.demo.data.model.SchemaPrivileges;
import com.example.demo.data.model.SchemaPrivilegesExample;
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

public interface SchemaPrivilegesMapper {
    @SelectProvider(type=SchemaPrivilegesSqlProvider.class, method="countByExample")
    long countByExample(SchemaPrivilegesExample example);

    @DeleteProvider(type=SchemaPrivilegesSqlProvider.class, method="deleteByExample")
    int deleteByExample(SchemaPrivilegesExample example);

    @Insert({
        "insert into SCHEMA_PRIVILEGES (GRANTEE, TABLE_CATALOG, ",
        "TABLE_SCHEMA, PRIVILEGE_TYPE, ",
        "IS_GRANTABLE)",
        "values (#{grantee,jdbcType=VARCHAR}, #{tableCatalog,jdbcType=VARCHAR}, ",
        "#{tableSchema,jdbcType=VARCHAR}, #{privilegeType,jdbcType=VARCHAR}, ",
        "#{isGrantable,jdbcType=VARCHAR})"
    })
    int insert(SchemaPrivileges record);

    @InsertProvider(type=SchemaPrivilegesSqlProvider.class, method="insertSelective")
    int insertSelective(SchemaPrivileges record);

    @SelectProvider(type=SchemaPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<SchemaPrivileges> selectByExampleWithRowbounds(SchemaPrivilegesExample example, RowBounds rowBounds);

    @SelectProvider(type=SchemaPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<SchemaPrivileges> selectByExample(SchemaPrivilegesExample example);

    @UpdateProvider(type=SchemaPrivilegesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);

    @UpdateProvider(type=SchemaPrivilegesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);
}