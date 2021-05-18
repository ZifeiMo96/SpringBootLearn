package com.example.demo.data.dao;

import com.example.demo.data.model.Attachments;
import com.example.demo.data.model.AttachmentsExample;
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

public interface AttachmentsMapper {
    @SelectProvider(type=AttachmentsSqlProvider.class, method="countByExample")
    long countByExample(AttachmentsExample example);

    @DeleteProvider(type=AttachmentsSqlProvider.class, method="deleteByExample")
    int deleteByExample(AttachmentsExample example);

    @Delete({
        "delete from attachments",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into attachments (id, uuid, user_id, ",
        "type_id, order, type, ",
        "is_remote, is_approved, ",
        "attachment, file_path, ",
        "file_name, file_size, ",
        "file_type, ip, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{uuid,jdbcType=CHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{typeId,jdbcType=BIGINT}, #{order,jdbcType=TINYINT}, #{type,jdbcType=SMALLINT}, ",
        "#{isRemote,jdbcType=TINYINT}, #{isApproved,jdbcType=TINYINT}, ",
        "#{attachment,jdbcType=VARCHAR}, #{filePath,jdbcType=VARCHAR}, ",
        "#{fileName,jdbcType=VARCHAR}, #{fileSize,jdbcType=INTEGER}, ",
        "#{fileType,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Attachments record);

    @InsertProvider(type=AttachmentsSqlProvider.class, method="insertSelective")
    int insertSelective(Attachments record);

    @SelectProvider(type=AttachmentsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uuid", property="uuid", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.BIGINT),
        @Result(column="order", property="order", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_remote", property="isRemote", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="attachment", property="attachment", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_size", property="fileSize", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Attachments> selectByExampleWithRowbounds(AttachmentsExample example, RowBounds rowBounds);

    @SelectProvider(type=AttachmentsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uuid", property="uuid", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.BIGINT),
        @Result(column="order", property="order", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_remote", property="isRemote", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="attachment", property="attachment", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_size", property="fileSize", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Attachments> selectByExample(AttachmentsExample example);

    @Select({
        "select",
        "id, uuid, user_id, type_id, order, type, is_remote, is_approved, attachment, ",
        "file_path, file_name, file_size, file_type, ip, created_at, updated_at",
        "from attachments",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uuid", property="uuid", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.BIGINT),
        @Result(column="order", property="order", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_remote", property="isRemote", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="attachment", property="attachment", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_size", property="fileSize", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Attachments selectByPrimaryKey(Long id);

    @UpdateProvider(type=AttachmentsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Attachments record, @Param("example") AttachmentsExample example);

    @UpdateProvider(type=AttachmentsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Attachments record, @Param("example") AttachmentsExample example);

    @UpdateProvider(type=AttachmentsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Attachments record);

    @Update({
        "update attachments",
        "set uuid = #{uuid,jdbcType=CHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "type_id = #{typeId,jdbcType=BIGINT},",
          "order = #{order,jdbcType=TINYINT},",
          "type = #{type,jdbcType=SMALLINT},",
          "is_remote = #{isRemote,jdbcType=TINYINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT},",
          "attachment = #{attachment,jdbcType=VARCHAR},",
          "file_path = #{filePath,jdbcType=VARCHAR},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "file_size = #{fileSize,jdbcType=INTEGER},",
          "file_type = #{fileType,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Attachments record);
}