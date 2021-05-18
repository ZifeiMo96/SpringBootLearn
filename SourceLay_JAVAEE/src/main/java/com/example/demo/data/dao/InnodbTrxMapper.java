package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTrx;
import com.example.demo.data.model.InnodbTrxExample;
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

public interface InnodbTrxMapper {
    @SelectProvider(type=InnodbTrxSqlProvider.class, method="countByExample")
    long countByExample(InnodbTrxExample example);

    @DeleteProvider(type=InnodbTrxSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbTrxExample example);

    @Insert({
        "insert into INNODB_TRX (trx_id, trx_state, ",
        "trx_started, trx_requested_lock_id, ",
        "trx_wait_started, trx_weight, ",
        "trx_mysql_thread_id, trx_query, ",
        "trx_operation_state, trx_tables_in_use, ",
        "trx_tables_locked, trx_lock_structs, ",
        "trx_lock_memory_bytes, trx_rows_locked, ",
        "trx_rows_modified, trx_concurrency_tickets, ",
        "trx_isolation_level, trx_unique_checks, ",
        "trx_foreign_key_checks, trx_last_foreign_key_error, ",
        "trx_is_read_only, trx_autocommit_non_locking)",
        "values (#{trxId,jdbcType=VARCHAR}, #{trxState,jdbcType=VARCHAR}, ",
        "#{trxStarted,jdbcType=TIMESTAMP}, #{trxRequestedLockId,jdbcType=VARCHAR}, ",
        "#{trxWaitStarted,jdbcType=TIMESTAMP}, #{trxWeight,jdbcType=BIGINT}, ",
        "#{trxMysqlThreadId,jdbcType=BIGINT}, #{trxQuery,jdbcType=VARCHAR}, ",
        "#{trxOperationState,jdbcType=VARCHAR}, #{trxTablesInUse,jdbcType=BIGINT}, ",
        "#{trxTablesLocked,jdbcType=BIGINT}, #{trxLockStructs,jdbcType=BIGINT}, ",
        "#{trxLockMemoryBytes,jdbcType=BIGINT}, #{trxRowsLocked,jdbcType=BIGINT}, ",
        "#{trxRowsModified,jdbcType=BIGINT}, #{trxConcurrencyTickets,jdbcType=BIGINT}, ",
        "#{trxIsolationLevel,jdbcType=VARCHAR}, #{trxUniqueChecks,jdbcType=INTEGER}, ",
        "#{trxForeignKeyChecks,jdbcType=INTEGER}, #{trxLastForeignKeyError,jdbcType=VARCHAR}, ",
        "#{trxIsReadOnly,jdbcType=INTEGER}, #{trxAutocommitNonLocking,jdbcType=INTEGER})"
    })
    int insert(InnodbTrx record);

    @InsertProvider(type=InnodbTrxSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbTrx record);

    @SelectProvider(type=InnodbTrxSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="trx_id", property="trxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_state", property="trxState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_started", property="trxStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_requested_lock_id", property="trxRequestedLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_wait_started", property="trxWaitStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_weight", property="trxWeight", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_mysql_thread_id", property="trxMysqlThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_query", property="trxQuery", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_operation_state", property="trxOperationState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_tables_in_use", property="trxTablesInUse", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_tables_locked", property="trxTablesLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_structs", property="trxLockStructs", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_memory_bytes", property="trxLockMemoryBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_locked", property="trxRowsLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_modified", property="trxRowsModified", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_concurrency_tickets", property="trxConcurrencyTickets", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_isolation_level", property="trxIsolationLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_unique_checks", property="trxUniqueChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_foreign_key_checks", property="trxForeignKeyChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_last_foreign_key_error", property="trxLastForeignKeyError", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_is_read_only", property="trxIsReadOnly", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_autocommit_non_locking", property="trxAutocommitNonLocking", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTrx> selectByExampleWithRowbounds(InnodbTrxExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbTrxSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="trx_id", property="trxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_state", property="trxState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_started", property="trxStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_requested_lock_id", property="trxRequestedLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_wait_started", property="trxWaitStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trx_weight", property="trxWeight", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_mysql_thread_id", property="trxMysqlThreadId", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_query", property="trxQuery", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_operation_state", property="trxOperationState", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_tables_in_use", property="trxTablesInUse", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_tables_locked", property="trxTablesLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_structs", property="trxLockStructs", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_lock_memory_bytes", property="trxLockMemoryBytes", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_locked", property="trxRowsLocked", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_rows_modified", property="trxRowsModified", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_concurrency_tickets", property="trxConcurrencyTickets", jdbcType=JdbcType.BIGINT),
        @Result(column="trx_isolation_level", property="trxIsolationLevel", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_unique_checks", property="trxUniqueChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_foreign_key_checks", property="trxForeignKeyChecks", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_last_foreign_key_error", property="trxLastForeignKeyError", jdbcType=JdbcType.VARCHAR),
        @Result(column="trx_is_read_only", property="trxIsReadOnly", jdbcType=JdbcType.INTEGER),
        @Result(column="trx_autocommit_non_locking", property="trxAutocommitNonLocking", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTrx> selectByExample(InnodbTrxExample example);

    @UpdateProvider(type=InnodbTrxSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);

    @UpdateProvider(type=InnodbTrxSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);
}