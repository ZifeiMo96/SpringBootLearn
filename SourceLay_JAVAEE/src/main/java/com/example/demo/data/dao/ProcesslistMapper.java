package com.example.demo.data.dao;

import com.example.demo.data.model.Processlist;
import com.example.demo.data.model.ProcesslistExample;
import com.example.demo.data.model.ProcesslistWithBLOBs;
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

public interface ProcesslistMapper {
    @SelectProvider(type=ProcesslistSqlProvider.class, method="countByExample")
    long countByExample(ProcesslistExample example);

    @DeleteProvider(type=ProcesslistSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProcesslistExample example);

    @Insert({
        "insert into PROCESSLIST (ID, USER, ",
        "HOST, DB, COMMAND, ",
        "TIME, STATE, TIME_MS, ",
        "STAGE, MAX_STAGE, ",
        "PROGRESS, MEMORY_USED, ",
        "MAX_MEMORY_USED, EXAMINED_ROWS, ",
        "QUERY_ID, TID, INFO, ",
        "INFO_BINARY)",
        "values (#{id,jdbcType=BIGINT}, #{user,jdbcType=VARCHAR}, ",
        "#{host,jdbcType=VARCHAR}, #{db,jdbcType=VARCHAR}, #{command,jdbcType=VARCHAR}, ",
        "#{time,jdbcType=INTEGER}, #{state,jdbcType=VARCHAR}, #{timeMs,jdbcType=DECIMAL}, ",
        "#{stage,jdbcType=TINYINT}, #{maxStage,jdbcType=TINYINT}, ",
        "#{progress,jdbcType=DECIMAL}, #{memoryUsed,jdbcType=BIGINT}, ",
        "#{maxMemoryUsed,jdbcType=BIGINT}, #{examinedRows,jdbcType=INTEGER}, ",
        "#{queryId,jdbcType=BIGINT}, #{tid,jdbcType=BIGINT}, #{info,jdbcType=LONGVARCHAR}, ",
        "#{infoBinary,jdbcType=LONGVARBINARY})"
    })
    int insert(ProcesslistWithBLOBs record);

    @InsertProvider(type=ProcesslistSqlProvider.class, method="insertSelective")
    int insertSelective(ProcesslistWithBLOBs record);

    @SelectProvider(type=ProcesslistSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_MS", property="timeMs", jdbcType=JdbcType.DECIMAL),
        @Result(column="STAGE", property="stage", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_STAGE", property="maxStage", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.DECIMAL),
        @Result(column="MEMORY_USED", property="memoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_MEMORY_USED", property="maxMemoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="EXAMINED_ROWS", property="examinedRows", jdbcType=JdbcType.INTEGER),
        @Result(column="QUERY_ID", property="queryId", jdbcType=JdbcType.BIGINT),
        @Result(column="TID", property="tid", jdbcType=JdbcType.BIGINT),
        @Result(column="INFO", property="info", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="INFO_BINARY", property="infoBinary", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<ProcesslistWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ProcesslistExample example, RowBounds rowBounds);

    @SelectProvider(type=ProcesslistSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_MS", property="timeMs", jdbcType=JdbcType.DECIMAL),
        @Result(column="STAGE", property="stage", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_STAGE", property="maxStage", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.DECIMAL),
        @Result(column="MEMORY_USED", property="memoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_MEMORY_USED", property="maxMemoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="EXAMINED_ROWS", property="examinedRows", jdbcType=JdbcType.INTEGER),
        @Result(column="QUERY_ID", property="queryId", jdbcType=JdbcType.BIGINT),
        @Result(column="TID", property="tid", jdbcType=JdbcType.BIGINT),
        @Result(column="INFO", property="info", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="INFO_BINARY", property="infoBinary", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<ProcesslistWithBLOBs> selectByExampleWithBLOBs(ProcesslistExample example);

    @SelectProvider(type=ProcesslistSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_MS", property="timeMs", jdbcType=JdbcType.DECIMAL),
        @Result(column="STAGE", property="stage", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_STAGE", property="maxStage", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.DECIMAL),
        @Result(column="MEMORY_USED", property="memoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_MEMORY_USED", property="maxMemoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="EXAMINED_ROWS", property="examinedRows", jdbcType=JdbcType.INTEGER),
        @Result(column="QUERY_ID", property="queryId", jdbcType=JdbcType.BIGINT),
        @Result(column="TID", property="tid", jdbcType=JdbcType.BIGINT)
    })
    List<Processlist> selectByExampleWithRowbounds(ProcesslistExample example, RowBounds rowBounds);

    @SelectProvider(type=ProcesslistSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="USER", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOST", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="DB", property="db", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND", property="command", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME", property="time", jdbcType=JdbcType.INTEGER),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_MS", property="timeMs", jdbcType=JdbcType.DECIMAL),
        @Result(column="STAGE", property="stage", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_STAGE", property="maxStage", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.DECIMAL),
        @Result(column="MEMORY_USED", property="memoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_MEMORY_USED", property="maxMemoryUsed", jdbcType=JdbcType.BIGINT),
        @Result(column="EXAMINED_ROWS", property="examinedRows", jdbcType=JdbcType.INTEGER),
        @Result(column="QUERY_ID", property="queryId", jdbcType=JdbcType.BIGINT),
        @Result(column="TID", property="tid", jdbcType=JdbcType.BIGINT)
    })
    List<Processlist> selectByExample(ProcesslistExample example);

    @UpdateProvider(type=ProcesslistSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ProcesslistWithBLOBs record, @Param("example") ProcesslistExample example);

    @UpdateProvider(type=ProcesslistSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") ProcesslistWithBLOBs record, @Param("example") ProcesslistExample example);

    @UpdateProvider(type=ProcesslistSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Processlist record, @Param("example") ProcesslistExample example);
}