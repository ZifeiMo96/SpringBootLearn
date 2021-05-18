package com.example.demo.data.dao;

import com.example.demo.data.model.Notifications;
import com.example.demo.data.model.NotificationsExample;
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

public interface NotificationsMapper {
    @SelectProvider(type=NotificationsSqlProvider.class, method="countByExample")
    long countByExample(NotificationsExample example);

    @DeleteProvider(type=NotificationsSqlProvider.class, method="deleteByExample")
    int deleteByExample(NotificationsExample example);

    @Delete({
        "delete from notifications",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into notifications (id, type, ",
        "notifiable_type, notifiable_id, ",
        "read_at, created_at, ",
        "updated_at, data)",
        "values (#{id,jdbcType=BIGINT}, #{type,jdbcType=VARCHAR}, ",
        "#{notifiableType,jdbcType=VARCHAR}, #{notifiableId,jdbcType=BIGINT}, ",
        "#{readAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{data,jdbcType=LONGVARCHAR})"
    })
    int insert(Notifications record);

    @InsertProvider(type=NotificationsSqlProvider.class, method="insertSelective")
    int insertSelective(Notifications record);

    @SelectProvider(type=NotificationsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_type", property="notifiableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_id", property="notifiableId", jdbcType=JdbcType.BIGINT),
        @Result(column="read_at", property="readAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="data", property="data", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Notifications> selectByExampleWithBLOBsWithRowbounds(NotificationsExample example, RowBounds rowBounds);

    @SelectProvider(type=NotificationsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_type", property="notifiableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_id", property="notifiableId", jdbcType=JdbcType.BIGINT),
        @Result(column="read_at", property="readAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="data", property="data", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Notifications> selectByExampleWithBLOBs(NotificationsExample example);

    @SelectProvider(type=NotificationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_type", property="notifiableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_id", property="notifiableId", jdbcType=JdbcType.BIGINT),
        @Result(column="read_at", property="readAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Notifications> selectByExampleWithRowbounds(NotificationsExample example, RowBounds rowBounds);

    @SelectProvider(type=NotificationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_type", property="notifiableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_id", property="notifiableId", jdbcType=JdbcType.BIGINT),
        @Result(column="read_at", property="readAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Notifications> selectByExample(NotificationsExample example);

    @Select({
        "select",
        "id, type, notifiable_type, notifiable_id, read_at, created_at, updated_at, data",
        "from notifications",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_type", property="notifiableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="notifiable_id", property="notifiableId", jdbcType=JdbcType.BIGINT),
        @Result(column="read_at", property="readAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="data", property="data", jdbcType=JdbcType.LONGVARCHAR)
    })
    Notifications selectByPrimaryKey(Long id);

    @UpdateProvider(type=NotificationsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    @UpdateProvider(type=NotificationsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    @UpdateProvider(type=NotificationsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    @UpdateProvider(type=NotificationsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Notifications record);

    @Update({
        "update notifications",
        "set type = #{type,jdbcType=VARCHAR},",
          "notifiable_type = #{notifiableType,jdbcType=VARCHAR},",
          "notifiable_id = #{notifiableId,jdbcType=BIGINT},",
          "read_at = #{readAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "data = #{data,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Notifications record);

    @Update({
        "update notifications",
        "set type = #{type,jdbcType=VARCHAR},",
          "notifiable_type = #{notifiableType,jdbcType=VARCHAR},",
          "notifiable_id = #{notifiableId,jdbcType=BIGINT},",
          "read_at = #{readAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Notifications record);
}