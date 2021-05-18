package com.example.demo.data.dao;

import com.example.demo.data.model.OperationLogs;
import com.example.demo.data.model.OperationLogsExample;
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

public interface OperationLogsMapper {
    @SelectProvider(type=OperationLogsSqlProvider.class, method="countByExample")
    long countByExample(OperationLogsExample example);

    @DeleteProvider(type=OperationLogsSqlProvider.class, method="deleteByExample")
    int deleteByExample(OperationLogsExample example);

    @Delete({
        "delete from operation_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into operation_logs (id, user_id, ",
        "path, method, ip, ",
        "type, created_at, ",
        "updated_at, input)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{path,jdbcType=VARCHAR}, #{method,jdbcType=VARCHAR}, #{ip,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{input,jdbcType=LONGVARCHAR})"
    })
    int insert(OperationLogs record);

    @InsertProvider(type=OperationLogsSqlProvider.class, method="insertSelective")
    int insertSelective(OperationLogs record);

    @SelectProvider(type=OperationLogsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="input", property="input", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OperationLogs> selectByExampleWithBLOBsWithRowbounds(OperationLogsExample example, RowBounds rowBounds);

    @SelectProvider(type=OperationLogsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="input", property="input", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OperationLogs> selectByExampleWithBLOBs(OperationLogsExample example);

    @SelectProvider(type=OperationLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OperationLogs> selectByExampleWithRowbounds(OperationLogsExample example, RowBounds rowBounds);

    @SelectProvider(type=OperationLogsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OperationLogs> selectByExample(OperationLogsExample example);

    @Select({
        "select",
        "id, user_id, path, method, ip, type, created_at, updated_at, input",
        "from operation_logs",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="input", property="input", jdbcType=JdbcType.LONGVARCHAR)
    })
    OperationLogs selectByPrimaryKey(Long id);

    @UpdateProvider(type=OperationLogsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OperationLogs record, @Param("example") OperationLogsExample example);

    @UpdateProvider(type=OperationLogsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") OperationLogs record, @Param("example") OperationLogsExample example);

    @UpdateProvider(type=OperationLogsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") OperationLogs record, @Param("example") OperationLogsExample example);

    @UpdateProvider(type=OperationLogsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(OperationLogs record);

    @Update({
        "update operation_logs",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "path = #{path,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "input = #{input,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(OperationLogs record);

    @Update({
        "update operation_logs",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "path = #{path,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(OperationLogs record);
}