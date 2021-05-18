package com.example.demo.data.dao;

import com.example.demo.data.model.NotificationTpls;
import com.example.demo.data.model.NotificationTplsExample;
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

public interface NotificationTplsMapper {
    @SelectProvider(type=NotificationTplsSqlProvider.class, method="countByExample")
    long countByExample(NotificationTplsExample example);

    @DeleteProvider(type=NotificationTplsSqlProvider.class, method="deleteByExample")
    int deleteByExample(NotificationTplsExample example);

    @Delete({
        "delete from notification_tpls",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into notification_tpls (id, status, ",
        "type, type_name, ",
        "title, vars, template_id, ",
        "content)",
        "values (#{id,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, ",
        "#{type,jdbcType=TINYINT}, #{typeName,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{vars,jdbcType=VARCHAR}, #{templateId,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(NotificationTpls record);

    @InsertProvider(type=NotificationTplsSqlProvider.class, method="insertSelective")
    int insertSelective(NotificationTpls record);

    @SelectProvider(type=NotificationTplsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="vars", property="vars", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<NotificationTpls> selectByExampleWithBLOBsWithRowbounds(NotificationTplsExample example, RowBounds rowBounds);

    @SelectProvider(type=NotificationTplsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="vars", property="vars", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<NotificationTpls> selectByExampleWithBLOBs(NotificationTplsExample example);

    @SelectProvider(type=NotificationTplsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="vars", property="vars", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR)
    })
    List<NotificationTpls> selectByExampleWithRowbounds(NotificationTplsExample example, RowBounds rowBounds);

    @SelectProvider(type=NotificationTplsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="vars", property="vars", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR)
    })
    List<NotificationTpls> selectByExample(NotificationTplsExample example);

    @Select({
        "select",
        "id, status, type, type_name, title, vars, template_id, content",
        "from notification_tpls",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="vars", property="vars", jdbcType=JdbcType.VARCHAR),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    NotificationTpls selectByPrimaryKey(Long id);

    @UpdateProvider(type=NotificationTplsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NotificationTpls record, @Param("example") NotificationTplsExample example);

    @UpdateProvider(type=NotificationTplsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") NotificationTpls record, @Param("example") NotificationTplsExample example);

    @UpdateProvider(type=NotificationTplsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NotificationTpls record, @Param("example") NotificationTplsExample example);

    @UpdateProvider(type=NotificationTplsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NotificationTpls record);

    @Update({
        "update notification_tpls",
        "set status = #{status,jdbcType=TINYINT},",
          "type = #{type,jdbcType=TINYINT},",
          "type_name = #{typeName,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "vars = #{vars,jdbcType=VARCHAR},",
          "template_id = #{templateId,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(NotificationTpls record);

    @Update({
        "update notification_tpls",
        "set status = #{status,jdbcType=TINYINT},",
          "type = #{type,jdbcType=TINYINT},",
          "type_name = #{typeName,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "vars = #{vars,jdbcType=VARCHAR},",
          "template_id = #{templateId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(NotificationTpls record);
}