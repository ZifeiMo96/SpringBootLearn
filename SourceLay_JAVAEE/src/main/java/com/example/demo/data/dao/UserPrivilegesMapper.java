package com.example.demo.data.dao;

import com.example.demo.data.model.UserPrivileges;
import com.example.demo.data.model.UserPrivilegesExample;
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

public interface UserPrivilegesMapper {
    @SelectProvider(type=UserPrivilegesSqlProvider.class, method="countByExample")
    long countByExample(UserPrivilegesExample example);

    @DeleteProvider(type=UserPrivilegesSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserPrivilegesExample example);

    @Insert({
        "insert into USER_PRIVILEGES (GRANTEE, TABLE_CATALOG, ",
        "PRIVILEGE_TYPE, IS_GRANTABLE)",
        "values (#{grantee,jdbcType=VARCHAR}, #{tableCatalog,jdbcType=VARCHAR}, ",
        "#{privilegeType,jdbcType=VARCHAR}, #{isGrantable,jdbcType=VARCHAR})"
    })
    int insert(UserPrivileges record);

    @InsertProvider(type=UserPrivilegesSqlProvider.class, method="insertSelective")
    int insertSelective(UserPrivileges record);

    @SelectProvider(type=UserPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<UserPrivileges> selectByExampleWithRowbounds(UserPrivilegesExample example, RowBounds rowBounds);

    @SelectProvider(type=UserPrivilegesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGE_TYPE", property="privilegeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR)
    })
    List<UserPrivileges> selectByExample(UserPrivilegesExample example);

    @UpdateProvider(type=UserPrivilegesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);

    @UpdateProvider(type=UserPrivilegesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserPrivileges record, @Param("example") UserPrivilegesExample example);
}