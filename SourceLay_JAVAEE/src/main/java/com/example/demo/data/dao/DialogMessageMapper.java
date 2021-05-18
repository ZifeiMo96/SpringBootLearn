package com.example.demo.data.dao;

import com.example.demo.data.model.DialogMessage;
import com.example.demo.data.model.DialogMessageExample;
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

public interface DialogMessageMapper {
    @SelectProvider(type=DialogMessageSqlProvider.class, method="countByExample")
    long countByExample(DialogMessageExample example);

    @DeleteProvider(type=DialogMessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(DialogMessageExample example);

    @Delete({
        "delete from dialog_message",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into dialog_message (id, dialog_id, ",
        "user_id, attachment_id, ",
        "created_at, updated_at, ",
        "message_text)",
        "values (#{id,jdbcType=BIGINT}, #{dialogId,jdbcType=BIGINT}, ",
        "#{userId,jdbcType=BIGINT}, #{attachmentId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{messageText,jdbcType=LONGVARCHAR})"
    })
    int insert(DialogMessage record);

    @InsertProvider(type=DialogMessageSqlProvider.class, method="insertSelective")
    int insertSelective(DialogMessage record);

    @SelectProvider(type=DialogMessageSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_id", property="dialogId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="attachment_id", property="attachmentId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="message_text", property="messageText", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<DialogMessage> selectByExampleWithBLOBsWithRowbounds(DialogMessageExample example, RowBounds rowBounds);

    @SelectProvider(type=DialogMessageSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_id", property="dialogId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="attachment_id", property="attachmentId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="message_text", property="messageText", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<DialogMessage> selectByExampleWithBLOBs(DialogMessageExample example);

    @SelectProvider(type=DialogMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_id", property="dialogId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="attachment_id", property="attachmentId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DialogMessage> selectByExampleWithRowbounds(DialogMessageExample example, RowBounds rowBounds);

    @SelectProvider(type=DialogMessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_id", property="dialogId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="attachment_id", property="attachmentId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DialogMessage> selectByExample(DialogMessageExample example);

    @Select({
        "select",
        "id, dialog_id, user_id, attachment_id, created_at, updated_at, message_text",
        "from dialog_message",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_id", property="dialogId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="attachment_id", property="attachmentId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="message_text", property="messageText", jdbcType=JdbcType.LONGVARCHAR)
    })
    DialogMessage selectByPrimaryKey(Long id);

    @UpdateProvider(type=DialogMessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DialogMessage record, @Param("example") DialogMessageExample example);

    @UpdateProvider(type=DialogMessageSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") DialogMessage record, @Param("example") DialogMessageExample example);

    @UpdateProvider(type=DialogMessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DialogMessage record, @Param("example") DialogMessageExample example);

    @UpdateProvider(type=DialogMessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DialogMessage record);

    @Update({
        "update dialog_message",
        "set dialog_id = #{dialogId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "attachment_id = #{attachmentId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "message_text = #{messageText,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(DialogMessage record);

    @Update({
        "update dialog_message",
        "set dialog_id = #{dialogId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "attachment_id = #{attachmentId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(DialogMessage record);
}