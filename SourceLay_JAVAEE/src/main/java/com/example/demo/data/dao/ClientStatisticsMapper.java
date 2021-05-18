package com.example.demo.data.dao;

import com.example.demo.data.model.ClientStatistics;
import com.example.demo.data.model.ClientStatisticsExample;
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

public interface ClientStatisticsMapper {
    @SelectProvider(type=ClientStatisticsSqlProvider.class, method="countByExample")
    long countByExample(ClientStatisticsExample example);

    @DeleteProvider(type=ClientStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClientStatisticsExample example);

    @Insert({
        "insert into CLIENT_STATISTICS (CLIENT, TOTAL_CONNECTIONS, ",
        "CONCURRENT_CONNECTIONS, CONNECTED_TIME, ",
        "BUSY_TIME, CPU_TIME, ",
        "BYTES_RECEIVED, BYTES_SENT, ",
        "BINLOG_BYTES_WRITTEN, ROWS_READ, ",
        "ROWS_SENT, ROWS_DELETED, ",
        "ROWS_INSERTED, ROWS_UPDATED, ",
        "SELECT_COMMANDS, UPDATE_COMMANDS, ",
        "OTHER_COMMANDS, COMMIT_TRANSACTIONS, ",
        "ROLLBACK_TRANSACTIONS, DENIED_CONNECTIONS, ",
        "LOST_CONNECTIONS, ACCESS_DENIED, ",
        "EMPTY_QUERIES, TOTAL_SSL_CONNECTIONS, ",
        "MAX_STATEMENT_TIME_EXCEEDED)",
        "values (#{client,jdbcType=VARCHAR}, #{totalConnections,jdbcType=BIGINT}, ",
        "#{concurrentConnections,jdbcType=BIGINT}, #{connectedTime,jdbcType=BIGINT}, ",
        "#{busyTime,jdbcType=DOUBLE}, #{cpuTime,jdbcType=DOUBLE}, ",
        "#{bytesReceived,jdbcType=BIGINT}, #{bytesSent,jdbcType=BIGINT}, ",
        "#{binlogBytesWritten,jdbcType=BIGINT}, #{rowsRead,jdbcType=BIGINT}, ",
        "#{rowsSent,jdbcType=BIGINT}, #{rowsDeleted,jdbcType=BIGINT}, ",
        "#{rowsInserted,jdbcType=BIGINT}, #{rowsUpdated,jdbcType=BIGINT}, ",
        "#{selectCommands,jdbcType=BIGINT}, #{updateCommands,jdbcType=BIGINT}, ",
        "#{otherCommands,jdbcType=BIGINT}, #{commitTransactions,jdbcType=BIGINT}, ",
        "#{rollbackTransactions,jdbcType=BIGINT}, #{deniedConnections,jdbcType=BIGINT}, ",
        "#{lostConnections,jdbcType=BIGINT}, #{accessDenied,jdbcType=BIGINT}, ",
        "#{emptyQueries,jdbcType=BIGINT}, #{totalSslConnections,jdbcType=BIGINT}, ",
        "#{maxStatementTimeExceeded,jdbcType=BIGINT})"
    })
    int insert(ClientStatistics record);

    @InsertProvider(type=ClientStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(ClientStatistics record);

    @SelectProvider(type=ClientStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CLIENT", property="client", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOTAL_CONNECTIONS", property="totalConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="CONCURRENT_CONNECTIONS", property="concurrentConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="CONNECTED_TIME", property="connectedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="BUSY_TIME", property="busyTime", jdbcType=JdbcType.DOUBLE),
        @Result(column="CPU_TIME", property="cpuTime", jdbcType=JdbcType.DOUBLE),
        @Result(column="BYTES_RECEIVED", property="bytesReceived", jdbcType=JdbcType.BIGINT),
        @Result(column="BYTES_SENT", property="bytesSent", jdbcType=JdbcType.BIGINT),
        @Result(column="BINLOG_BYTES_WRITTEN", property="binlogBytesWritten", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_SENT", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_DELETED", property="rowsDeleted", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_INSERTED", property="rowsInserted", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_UPDATED", property="rowsUpdated", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_COMMANDS", property="selectCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="UPDATE_COMMANDS", property="updateCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_COMMANDS", property="otherCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="COMMIT_TRANSACTIONS", property="commitTransactions", jdbcType=JdbcType.BIGINT),
        @Result(column="ROLLBACK_TRANSACTIONS", property="rollbackTransactions", jdbcType=JdbcType.BIGINT),
        @Result(column="DENIED_CONNECTIONS", property="deniedConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="LOST_CONNECTIONS", property="lostConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCESS_DENIED", property="accessDenied", jdbcType=JdbcType.BIGINT),
        @Result(column="EMPTY_QUERIES", property="emptyQueries", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_SSL_CONNECTIONS", property="totalSslConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_STATEMENT_TIME_EXCEEDED", property="maxStatementTimeExceeded", jdbcType=JdbcType.BIGINT)
    })
    List<ClientStatistics> selectByExampleWithRowbounds(ClientStatisticsExample example, RowBounds rowBounds);

    @SelectProvider(type=ClientStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CLIENT", property="client", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOTAL_CONNECTIONS", property="totalConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="CONCURRENT_CONNECTIONS", property="concurrentConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="CONNECTED_TIME", property="connectedTime", jdbcType=JdbcType.BIGINT),
        @Result(column="BUSY_TIME", property="busyTime", jdbcType=JdbcType.DOUBLE),
        @Result(column="CPU_TIME", property="cpuTime", jdbcType=JdbcType.DOUBLE),
        @Result(column="BYTES_RECEIVED", property="bytesReceived", jdbcType=JdbcType.BIGINT),
        @Result(column="BYTES_SENT", property="bytesSent", jdbcType=JdbcType.BIGINT),
        @Result(column="BINLOG_BYTES_WRITTEN", property="binlogBytesWritten", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_SENT", property="rowsSent", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_DELETED", property="rowsDeleted", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_INSERTED", property="rowsInserted", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_UPDATED", property="rowsUpdated", jdbcType=JdbcType.BIGINT),
        @Result(column="SELECT_COMMANDS", property="selectCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="UPDATE_COMMANDS", property="updateCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_COMMANDS", property="otherCommands", jdbcType=JdbcType.BIGINT),
        @Result(column="COMMIT_TRANSACTIONS", property="commitTransactions", jdbcType=JdbcType.BIGINT),
        @Result(column="ROLLBACK_TRANSACTIONS", property="rollbackTransactions", jdbcType=JdbcType.BIGINT),
        @Result(column="DENIED_CONNECTIONS", property="deniedConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="LOST_CONNECTIONS", property="lostConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="ACCESS_DENIED", property="accessDenied", jdbcType=JdbcType.BIGINT),
        @Result(column="EMPTY_QUERIES", property="emptyQueries", jdbcType=JdbcType.BIGINT),
        @Result(column="TOTAL_SSL_CONNECTIONS", property="totalSslConnections", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_STATEMENT_TIME_EXCEEDED", property="maxStatementTimeExceeded", jdbcType=JdbcType.BIGINT)
    })
    List<ClientStatistics> selectByExample(ClientStatisticsExample example);

    @UpdateProvider(type=ClientStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientStatistics record, @Param("example") ClientStatisticsExample example);

    @UpdateProvider(type=ClientStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClientStatistics record, @Param("example") ClientStatisticsExample example);
}