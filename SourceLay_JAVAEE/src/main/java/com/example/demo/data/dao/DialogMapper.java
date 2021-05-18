package com.example.demo.data.dao;

import com.example.demo.data.model.Dialog;
import com.example.demo.data.model.DialogExample;
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

public interface DialogMapper {
    @SelectProvider(type=DialogSqlProvider.class, method="countByExample")
    long countByExample(DialogExample example);

    @DeleteProvider(type=DialogSqlProvider.class, method="deleteByExample")
    int deleteByExample(DialogExample example);

    @Delete({
        "delete from dialog",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into dialog (id, dialog_message_id, ",
        "sender_user_id, recipient_user_id, ",
        "recipient_read_at, sender_read_at, ",
        "created_at, updated_at, ",
        "sender_deleted_at, recipient_deleted_at)",
        "values (#{id,jdbcType=BIGINT}, #{dialogMessageId,jdbcType=BIGINT}, ",
        "#{senderUserId,jdbcType=BIGINT}, #{recipientUserId,jdbcType=BIGINT}, ",
        "#{recipientReadAt,jdbcType=TIMESTAMP}, #{senderReadAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{senderDeletedAt,jdbcType=TIMESTAMP}, #{recipientDeletedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Dialog record);

    @InsertProvider(type=DialogSqlProvider.class, method="insertSelective")
    int insertSelective(Dialog record);

    @SelectProvider(type=DialogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_message_id", property="dialogMessageId", jdbcType=JdbcType.BIGINT),
        @Result(column="sender_user_id", property="senderUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_user_id", property="recipientUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_read_at", property="recipientReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_read_at", property="senderReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_deleted_at", property="senderDeletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recipient_deleted_at", property="recipientDeletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Dialog> selectByExampleWithRowbounds(DialogExample example, RowBounds rowBounds);

    @SelectProvider(type=DialogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_message_id", property="dialogMessageId", jdbcType=JdbcType.BIGINT),
        @Result(column="sender_user_id", property="senderUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_user_id", property="recipientUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_read_at", property="recipientReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_read_at", property="senderReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_deleted_at", property="senderDeletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recipient_deleted_at", property="recipientDeletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Dialog> selectByExample(DialogExample example);

    @Select({
        "select",
        "id, dialog_message_id, sender_user_id, recipient_user_id, recipient_read_at, ",
        "sender_read_at, created_at, updated_at, sender_deleted_at, recipient_deleted_at",
        "from dialog",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="dialog_message_id", property="dialogMessageId", jdbcType=JdbcType.BIGINT),
        @Result(column="sender_user_id", property="senderUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_user_id", property="recipientUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="recipient_read_at", property="recipientReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_read_at", property="senderReadAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="sender_deleted_at", property="senderDeletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="recipient_deleted_at", property="recipientDeletedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Dialog selectByPrimaryKey(Long id);

    @UpdateProvider(type=DialogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Dialog record, @Param("example") DialogExample example);

    @UpdateProvider(type=DialogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Dialog record, @Param("example") DialogExample example);

    @UpdateProvider(type=DialogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Dialog record);

    @Update({
        "update dialog",
        "set dialog_message_id = #{dialogMessageId,jdbcType=BIGINT},",
          "sender_user_id = #{senderUserId,jdbcType=BIGINT},",
          "recipient_user_id = #{recipientUserId,jdbcType=BIGINT},",
          "recipient_read_at = #{recipientReadAt,jdbcType=TIMESTAMP},",
          "sender_read_at = #{senderReadAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "sender_deleted_at = #{senderDeletedAt,jdbcType=TIMESTAMP},",
          "recipient_deleted_at = #{recipientDeletedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Dialog record);
}