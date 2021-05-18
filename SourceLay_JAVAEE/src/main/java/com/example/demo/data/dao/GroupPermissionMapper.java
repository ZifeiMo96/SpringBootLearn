package com.example.demo.data.dao;

import com.example.demo.data.model.GroupPermissionExample;
import com.example.demo.data.model.GroupPermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
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

public interface GroupPermissionMapper {
    @SelectProvider(type=GroupPermissionSqlProvider.class, method="countByExample")
    long countByExample(GroupPermissionExample example);

    @DeleteProvider(type=GroupPermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(GroupPermissionExample example);

    @Delete({
        "delete from group_permission",
        "where group_id = #{groupId,jdbcType=BIGINT}",
          "and permission = #{permission,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(GroupPermissionKey key);

    @Insert({
        "insert into group_permission (group_id, permission)",
        "values (#{groupId,jdbcType=BIGINT}, #{permission,jdbcType=VARCHAR})"
    })
    int insert(GroupPermissionKey record);

    @InsertProvider(type=GroupPermissionSqlProvider.class, method="insertSelective")
    int insertSelective(GroupPermissionKey record);

    @SelectProvider(type=GroupPermissionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="permission", property="permission", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<GroupPermissionKey> selectByExampleWithRowbounds(GroupPermissionExample example, RowBounds rowBounds);

    @SelectProvider(type=GroupPermissionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="permission", property="permission", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<GroupPermissionKey> selectByExample(GroupPermissionExample example);

    @UpdateProvider(type=GroupPermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GroupPermissionKey record, @Param("example") GroupPermissionExample example);

    @UpdateProvider(type=GroupPermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GroupPermissionKey record, @Param("example") GroupPermissionExample example);
}