package com.example.demo.data.dao;

import com.example.demo.data.model.EnabledRoles;
import com.example.demo.data.model.EnabledRolesExample;
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

public interface EnabledRolesMapper {
    @SelectProvider(type=EnabledRolesSqlProvider.class, method="countByExample")
    long countByExample(EnabledRolesExample example);

    @DeleteProvider(type=EnabledRolesSqlProvider.class, method="deleteByExample")
    int deleteByExample(EnabledRolesExample example);

    @Insert({
        "insert into ENABLED_ROLES (ROLE_NAME)",
        "values (#{roleName,jdbcType=VARCHAR})"
    })
    int insert(EnabledRoles record);

    @InsertProvider(type=EnabledRolesSqlProvider.class, method="insertSelective")
    int insertSelective(EnabledRoles record);

    @SelectProvider(type=EnabledRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR)
    })
    List<EnabledRoles> selectByExampleWithRowbounds(EnabledRolesExample example, RowBounds rowBounds);

    @SelectProvider(type=EnabledRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR)
    })
    List<EnabledRoles> selectByExample(EnabledRolesExample example);

    @UpdateProvider(type=EnabledRolesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") EnabledRoles record, @Param("example") EnabledRolesExample example);

    @UpdateProvider(type=EnabledRolesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") EnabledRoles record, @Param("example") EnabledRolesExample example);
}