package com.example.demo.data.dao;

import com.example.demo.data.model.GroupUser;
import com.example.demo.data.model.GroupUserExample;
import com.example.demo.data.model.GroupUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface GroupUserMapper {
    @SelectProvider(type=GroupUserSqlProvider.class, method="countByExample")
    long countByExample(GroupUserExample example);

    @DeleteProvider(type=GroupUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(GroupUserExample example);

    @Delete({
        "delete from group_user",
        "where group_id = #{groupId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(GroupUserKey key);

    @Insert({
        "insert into group_user (group_id, user_id, ",
        "expiration_time)",
        "values (#{groupId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{expirationTime,jdbcType=TIMESTAMP})"
    })
    int insert(GroupUser record);

    @InsertProvider(type=GroupUserSqlProvider.class, method="insertSelective")
    int insertSelective(GroupUser record);

    @SelectProvider(type=GroupUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GroupUser> selectByExampleWithRowbounds(GroupUserExample example, RowBounds rowBounds);

    @SelectProvider(type=GroupUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GroupUser> selectByExample(GroupUserExample example);

    @Select({
        "select",
        "group_id, user_id, expiration_time",
        "from group_user",
        "where group_id = #{groupId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="expiration_time", property="expirationTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GroupUser selectByPrimaryKey(GroupUserKey key);

    @UpdateProvider(type=GroupUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    @UpdateProvider(type=GroupUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GroupUser record, @Param("example") GroupUserExample example);

    @UpdateProvider(type=GroupUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GroupUser record);

    @Update({
        "update group_user",
        "set expiration_time = #{expirationTime,jdbcType=TIMESTAMP}",
        "where group_id = #{groupId,jdbcType=BIGINT}",
          "and user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GroupUser record);
}