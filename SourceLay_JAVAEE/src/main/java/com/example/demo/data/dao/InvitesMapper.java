package com.example.demo.data.dao;

import com.example.demo.data.model.Invites;
import com.example.demo.data.model.InvitesExample;
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

public interface InvitesMapper {
    @SelectProvider(type=InvitesSqlProvider.class, method="countByExample")
    long countByExample(InvitesExample example);

    @DeleteProvider(type=InvitesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InvitesExample example);

    @Delete({
        "delete from invites",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into invites (id, group_id, ",
        "type, code, dateline, ",
        "endtime, user_id, ",
        "to_user_id, status, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{groupId,jdbcType=BIGINT}, ",
        "#{type,jdbcType=TINYINT}, #{code,jdbcType=CHAR}, #{dateline,jdbcType=INTEGER}, ",
        "#{endtime,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, ",
        "#{toUserId,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Invites record);

    @InsertProvider(type=InvitesSqlProvider.class, method="insertSelective")
    int insertSelective(Invites record);

    @SelectProvider(type=InvitesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="code", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="dateline", property="dateline", jdbcType=JdbcType.INTEGER),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Invites> selectByExampleWithRowbounds(InvitesExample example, RowBounds rowBounds);

    @SelectProvider(type=InvitesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="code", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="dateline", property="dateline", jdbcType=JdbcType.INTEGER),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Invites> selectByExample(InvitesExample example);

    @Select({
        "select",
        "id, group_id, type, code, dateline, endtime, user_id, to_user_id, status, created_at, ",
        "updated_at",
        "from invites",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="code", property="code", jdbcType=JdbcType.CHAR),
        @Result(column="dateline", property="dateline", jdbcType=JdbcType.INTEGER),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Invites selectByPrimaryKey(Long id);

    @UpdateProvider(type=InvitesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Invites record, @Param("example") InvitesExample example);

    @UpdateProvider(type=InvitesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Invites record, @Param("example") InvitesExample example);

    @UpdateProvider(type=InvitesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Invites record);

    @Update({
        "update invites",
        "set group_id = #{groupId,jdbcType=BIGINT},",
          "type = #{type,jdbcType=TINYINT},",
          "code = #{code,jdbcType=CHAR},",
          "dateline = #{dateline,jdbcType=INTEGER},",
          "endtime = #{endtime,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "to_user_id = #{toUserId,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Invites record);
}