package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileThreadRelationInfo;
import com.example.demo.data.model.SourcelayFileThreadRelationInfoExample;
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

public interface SourcelayFileThreadRelationInfoMapper {
    @SelectProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileThreadRelationInfoExample example);

    @DeleteProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileThreadRelationInfoExample example);

    @Delete({
        "delete from sourcelay_file_thread_relation_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sourcelay_file_thread_relation_info (id, file_id, ",
        "post_id, priority, ",
        "thread_id, created_at)",
        "values (#{id,jdbcType=BIGINT}, #{fileId,jdbcType=BIGINT}, ",
        "#{postId,jdbcType=BIGINT}, #{priority,jdbcType=INTEGER}, ",
        "#{threadId,jdbcType=BIGINT}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(SourcelayFileThreadRelationInfo record);

    @InsertProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileThreadRelationInfo record);

    @SelectProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileThreadRelationInfo> selectByExampleWithRowbounds(SourcelayFileThreadRelationInfoExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileThreadRelationInfo> selectByExample(SourcelayFileThreadRelationInfoExample example);

    @Select({
        "select",
        "id, file_id, post_id, priority, thread_id, created_at",
        "from sourcelay_file_thread_relation_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.BIGINT),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    SourcelayFileThreadRelationInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileThreadRelationInfo record, @Param("example") SourcelayFileThreadRelationInfoExample example);

    @UpdateProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileThreadRelationInfo record, @Param("example") SourcelayFileThreadRelationInfoExample example);

    @UpdateProvider(type=SourcelayFileThreadRelationInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileThreadRelationInfo record);

    @Update({
        "update sourcelay_file_thread_relation_info",
        "set file_id = #{fileId,jdbcType=BIGINT},",
          "post_id = #{postId,jdbcType=BIGINT},",
          "priority = #{priority,jdbcType=INTEGER},",
          "thread_id = #{threadId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileThreadRelationInfo record);
}