package com.example.demo.data.dao;

import com.example.demo.data.model.ApplicableRoles;
import com.example.demo.data.model.ApplicableRolesExample;
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

public interface ApplicableRolesMapper {
    @SelectProvider(type=ApplicableRolesSqlProvider.class, method="countByExample")
    long countByExample(ApplicableRolesExample example);

    @DeleteProvider(type=ApplicableRolesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ApplicableRolesExample example);

    @Insert({
        "insert into APPLICABLE_ROLES (GRANTEE, ROLE_NAME, ",
        "IS_GRANTABLE, IS_DEFAULT)",
        "values (#{grantee,jdbcType=VARCHAR}, #{roleName,jdbcType=VARCHAR}, ",
        "#{isGrantable,jdbcType=VARCHAR}, #{isDefault,jdbcType=VARCHAR})"
    })
    int insert(ApplicableRoles record);

    @InsertProvider(type=ApplicableRolesSqlProvider.class, method="insertSelective")
    int insertSelective(ApplicableRoles record);

    @SelectProvider(type=ApplicableRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR)
    })
    List<ApplicableRoles> selectByExampleWithRowbounds(ApplicableRolesExample example, RowBounds rowBounds);

    @SelectProvider(type=ApplicableRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GRANTEE", property="grantee", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROLE_NAME", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GRANTABLE", property="isGrantable", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR)
    })
    List<ApplicableRoles> selectByExample(ApplicableRolesExample example);

    @UpdateProvider(type=ApplicableRolesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ApplicableRoles record, @Param("example") ApplicableRolesExample example);

    @UpdateProvider(type=ApplicableRolesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ApplicableRoles record, @Param("example") ApplicableRolesExample example);
}