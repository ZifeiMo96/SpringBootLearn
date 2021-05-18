package com.example.demo.data.dao;

import com.example.demo.data.model.TablePrivileges;
import com.example.demo.data.model.TablePrivilegesExample;
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

public interface TablePrivilegesMapper {
    @SelectProvider(type=TablePrivilegesSqlProvider.class, method="countByExample")
    long countByExample(TablePrivilegesExample example);

    @DeleteProvider(type=TablePrivilegesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TablePrivilegesExample example);

    @Insert({
        "insert into TABLE_PRIVILEGES (GRANTEE, TABLE_CATALOG, ",
        "TABLE_SCHEMA, TABLE_NAME, ",
        "PRIVILEGE_TYPE, IS_GRANTABLE)",
        "values (#{grantee,jdbcType=VARCHAR}, #{tableCatalog,jdbcType=VARCHAR}, ",
        "#{tableSchema,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{privilegeType,jdbcType=VARCHAR}, #{isGrantable,jdbcType=VARCHAR})"
    })
    int insert(TablePrivileges record);

    @InsertProvider(type=TablePrivilegesSqlProvider.class, method="insertSelective")
    int insertSelective(TablePrivileges record);

    @SelectProvider(type=TablePrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<TablePrivileges> selectByExampleWithRowbounds(TablePrivilegesExample example, RowBounds rowBounds);

    @SelectProvider(type=TablePrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<TablePrivileges> selectByExample(TablePrivilegesExample example);

    @UpdateProvider(type=TablePrivilegesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);

    @UpdateProvider(type=TablePrivilegesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TablePrivileges record, @Param("example") TablePrivilegesExample example);
}