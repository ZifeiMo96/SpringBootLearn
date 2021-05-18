package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysSemaphoreWaits;
import com.example.demo.data.model.InnodbSysSemaphoreWaitsExample;
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

public interface InnodbSysSemaphoreWaitsMapper {
    @SelectProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysSemaphoreWaitsExample example);

    @DeleteProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysSemaphoreWaitsExample example);

    @Insert({
        "insert into INNODB_SYS_SEMAPHORE_WAITS (THREAD_ID, OBJECT_NAME, ",
        "FILE, LINE, WAIT_TIME, ",
        "WAIT_OBJECT, WAIT_TYPE, ",
        "HOLDER_THREAD_ID, HOLDER_FILE, ",
        "HOLDER_LINE, CREATED_FILE, ",
        "CREATED_LINE, WRITER_THREAD, ",
        "RESERVATION_MODE, READERS, ",
        "WAITERS_FLAG, LOCK_WORD, ",
        "LAST_WRITER_FILE, LAST_WRITER_LINE, ",
        "OS_WAIT_COUNT)",
        "values (#{threadId,jdbcType=BIGINT}, #{objectName,jdbcType=VARCHAR}, ",
        "#{file,jdbcType=VARCHAR}, #{line,jdbcType=INTEGER}, #{waitTime,jdbcType=BIGINT}, ",
        "#{waitObject,jdbcType=BIGINT}, #{waitType,jdbcType=VARCHAR}, ",
        "#{holderThreadId,jdbcType=BIGINT}, #{holderFile,jdbcType=VARCHAR}, ",
        "#{holderLine,jdbcType=INTEGER}, #{createdFile,jdbcType=VARCHAR}, ",
        "#{createdLine,jdbcType=INTEGER}, #{writerThread,jdbcType=BIGINT}, ",
        "#{reservationMode,jdbcType=VARCHAR}, #{readers,jdbcType=INTEGER}, ",
        "#{waitersFlag,jdbcType=BIGINT}, #{lockWord,jdbcType=BIGINT}, ",
        "#{lastWriterFile,jdbcType=VARCHAR}, #{lastWriterLine,jdbcType=INTEGER}, ",
        "#{osWaitCount,jdbcType=INTEGER})"
    })
    int insert(InnodbSysSemaphoreWaits record);

    @InsertProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysSemaphoreWaits record);

    @SelectProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE", property="file", jdbcType=JdbcType.VARCHAR),
        @Result(column="LINE", property="line", jdbcType=JdbcType.INTEGER),
        @Result(column="WAIT_TIME", property="waitTime", jdbcType=JdbcType.BIGINT),
        @Result(column="WAIT_OBJECT", property="waitObject", jdbcType=JdbcType.BIGINT),
        @Result(column="WAIT_TYPE", property="waitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLDER_THREAD_ID", property="holderThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="HOLDER_FILE", property="holderFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLDER_LINE", property="holderLine", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_FILE", property="createdFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_LINE", property="createdLine", jdbcType=JdbcType.INTEGER),
        @Result(column="WRITER_THREAD", property="writerThread", jdbcType=JdbcType.BIGINT),
        @Result(column="RESERVATION_MODE", property="reservationMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="READERS", property="readers", jdbcType=JdbcType.INTEGER),
        @Result(column="WAITERS_FLAG", property="waitersFlag", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_WORD", property="lockWord", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_WRITER_FILE", property="lastWriterFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_WRITER_LINE", property="lastWriterLine", jdbcType=JdbcType.INTEGER),
        @Result(column="OS_WAIT_COUNT", property="osWaitCount", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysSemaphoreWaits> selectByExampleWithRowbounds(InnodbSysSemaphoreWaitsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="THREAD_ID", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="OBJECT_NAME", property="objectName", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE", property="file", jdbcType=JdbcType.VARCHAR),
        @Result(column="LINE", property="line", jdbcType=JdbcType.INTEGER),
        @Result(column="WAIT_TIME", property="waitTime", jdbcType=JdbcType.BIGINT),
        @Result(column="WAIT_OBJECT", property="waitObject", jdbcType=JdbcType.BIGINT),
        @Result(column="WAIT_TYPE", property="waitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLDER_THREAD_ID", property="holderThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="HOLDER_FILE", property="holderFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLDER_LINE", property="holderLine", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATED_FILE", property="createdFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_LINE", property="createdLine", jdbcType=JdbcType.INTEGER),
        @Result(column="WRITER_THREAD", property="writerThread", jdbcType=JdbcType.BIGINT),
        @Result(column="RESERVATION_MODE", property="reservationMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="READERS", property="readers", jdbcType=JdbcType.INTEGER),
        @Result(column="WAITERS_FLAG", property="waitersFlag", jdbcType=JdbcType.BIGINT),
        @Result(column="LOCK_WORD", property="lockWord", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_WRITER_FILE", property="lastWriterFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_WRITER_LINE", property="lastWriterLine", jdbcType=JdbcType.INTEGER),
        @Result(column="OS_WAIT_COUNT", property="osWaitCount", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysSemaphoreWaits> selectByExample(InnodbSysSemaphoreWaitsExample example);

    @UpdateProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysSemaphoreWaits record, @Param("example") InnodbSysSemaphoreWaitsExample example);

    @UpdateProvider(type=InnodbSysSemaphoreWaitsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysSemaphoreWaits record, @Param("example") InnodbSysSemaphoreWaitsExample example);
}