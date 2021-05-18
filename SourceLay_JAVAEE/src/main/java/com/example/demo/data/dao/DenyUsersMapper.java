package com.example.demo.data.dao;

import com.example.demo.data.model.DenyUsers;
import com.example.demo.data.model.DenyUsersExample;
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

public interface DenyUsersMapper {
    @SelectProvider(type=DenyUsersSqlProvider.class, method="countByExample")
    long countByExample(DenyUsersExample example);

    @DeleteProvider(type=DenyUsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(DenyUsersExample example);

    @Insert({
        "insert into deny_users (user_id, deny_user_id, ",
        "created_at)",
        "values (#{userId,jdbcType=BIGINT}, #{denyUserId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(DenyUsers record);

    @InsertProvider(type=DenyUsersSqlProvider.class, method="insertSelective")
    int insertSelective(DenyUsers record);

    @SelectProvider(type=DenyUsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="deny_user_id", property="denyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DenyUsers> selectByExampleWithRowbounds(DenyUsersExample example, RowBounds rowBounds);

    @SelectProvider(type=DenyUsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="deny_user_id", property="denyUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DenyUsers> selectByExample(DenyUsersExample example);

    @UpdateProvider(type=DenyUsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DenyUsers record, @Param("example") DenyUsersExample example);

    @UpdateProvider(type=DenyUsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DenyUsers record, @Param("example") DenyUsersExample example);
}