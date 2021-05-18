package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTrx;
import com.example.demo.data.model.InnodbTrxExample.Criteria;
import com.example.demo.data.model.InnodbTrxExample.Criterion;
import com.example.demo.data.model.InnodbTrxExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbTrxSqlProvider {
    public String countByExample(InnodbTrxExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_TRX");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbTrxExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_TRX");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbTrx record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_TRX");
        
        if (record.getTrxId() != null) {
            sql.VALUES("trx_id", "#{trxId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxState() != null) {
            sql.VALUES("trx_state", "#{trxState,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxStarted() != null) {
            sql.VALUES("trx_started", "#{trxStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrxRequestedLockId() != null) {
            sql.VALUES("trx_requested_lock_id", "#{trxRequestedLockId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxWaitStarted() != null) {
            sql.VALUES("trx_wait_started", "#{trxWaitStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrxWeight() != null) {
            sql.VALUES("trx_weight", "#{trxWeight,jdbcType=BIGINT}");
        }
        
        if (record.getTrxMysqlThreadId() != null) {
            sql.VALUES("trx_mysql_thread_id", "#{trxMysqlThreadId,jdbcType=BIGINT}");
        }
        
        if (record.getTrxQuery() != null) {
            sql.VALUES("trx_query", "#{trxQuery,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxOperationState() != null) {
            sql.VALUES("trx_operation_state", "#{trxOperationState,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxTablesInUse() != null) {
            sql.VALUES("trx_tables_in_use", "#{trxTablesInUse,jdbcType=BIGINT}");
        }
        
        if (record.getTrxTablesLocked() != null) {
            sql.VALUES("trx_tables_locked", "#{trxTablesLocked,jdbcType=BIGINT}");
        }
        
        if (record.getTrxLockStructs() != null) {
            sql.VALUES("trx_lock_structs", "#{trxLockStructs,jdbcType=BIGINT}");
        }
        
        if (record.getTrxLockMemoryBytes() != null) {
            sql.VALUES("trx_lock_memory_bytes", "#{trxLockMemoryBytes,jdbcType=BIGINT}");
        }
        
        if (record.getTrxRowsLocked() != null) {
            sql.VALUES("trx_rows_locked", "#{trxRowsLocked,jdbcType=BIGINT}");
        }
        
        if (record.getTrxRowsModified() != null) {
            sql.VALUES("trx_rows_modified", "#{trxRowsModified,jdbcType=BIGINT}");
        }
        
        if (record.getTrxConcurrencyTickets() != null) {
            sql.VALUES("trx_concurrency_tickets", "#{trxConcurrencyTickets,jdbcType=BIGINT}");
        }
        
        if (record.getTrxIsolationLevel() != null) {
            sql.VALUES("trx_isolation_level", "#{trxIsolationLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxUniqueChecks() != null) {
            sql.VALUES("trx_unique_checks", "#{trxUniqueChecks,jdbcType=INTEGER}");
        }
        
        if (record.getTrxForeignKeyChecks() != null) {
            sql.VALUES("trx_foreign_key_checks", "#{trxForeignKeyChecks,jdbcType=INTEGER}");
        }
        
        if (record.getTrxLastForeignKeyError() != null) {
            sql.VALUES("trx_last_foreign_key_error", "#{trxLastForeignKeyError,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxIsReadOnly() != null) {
            sql.VALUES("trx_is_read_only", "#{trxIsReadOnly,jdbcType=INTEGER}");
        }
        
        if (record.getTrxAutocommitNonLocking() != null) {
            sql.VALUES("trx_autocommit_non_locking", "#{trxAutocommitNonLocking,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbTrxExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("trx_id");
        } else {
            sql.SELECT("trx_id");
        }
        sql.SELECT("trx_state");
        sql.SELECT("trx_started");
        sql.SELECT("trx_requested_lock_id");
        sql.SELECT("trx_wait_started");
        sql.SELECT("trx_weight");
        sql.SELECT("trx_mysql_thread_id");
        sql.SELECT("trx_query");
        sql.SELECT("trx_operation_state");
        sql.SELECT("trx_tables_in_use");
        sql.SELECT("trx_tables_locked");
        sql.SELECT("trx_lock_structs");
        sql.SELECT("trx_lock_memory_bytes");
        sql.SELECT("trx_rows_locked");
        sql.SELECT("trx_rows_modified");
        sql.SELECT("trx_concurrency_tickets");
        sql.SELECT("trx_isolation_level");
        sql.SELECT("trx_unique_checks");
        sql.SELECT("trx_foreign_key_checks");
        sql.SELECT("trx_last_foreign_key_error");
        sql.SELECT("trx_is_read_only");
        sql.SELECT("trx_autocommit_non_locking");
        sql.FROM("INNODB_TRX");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbTrx record = (InnodbTrx) parameter.get("record");
        InnodbTrxExample example = (InnodbTrxExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TRX");
        
        if (record.getTrxId() != null) {
            sql.SET("trx_id = #{record.trxId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxState() != null) {
            sql.SET("trx_state = #{record.trxState,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxStarted() != null) {
            sql.SET("trx_started = #{record.trxStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrxRequestedLockId() != null) {
            sql.SET("trx_requested_lock_id = #{record.trxRequestedLockId,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxWaitStarted() != null) {
            sql.SET("trx_wait_started = #{record.trxWaitStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTrxWeight() != null) {
            sql.SET("trx_weight = #{record.trxWeight,jdbcType=BIGINT}");
        }
        
        if (record.getTrxMysqlThreadId() != null) {
            sql.SET("trx_mysql_thread_id = #{record.trxMysqlThreadId,jdbcType=BIGINT}");
        }
        
        if (record.getTrxQuery() != null) {
            sql.SET("trx_query = #{record.trxQuery,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxOperationState() != null) {
            sql.SET("trx_operation_state = #{record.trxOperationState,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxTablesInUse() != null) {
            sql.SET("trx_tables_in_use = #{record.trxTablesInUse,jdbcType=BIGINT}");
        }
        
        if (record.getTrxTablesLocked() != null) {
            sql.SET("trx_tables_locked = #{record.trxTablesLocked,jdbcType=BIGINT}");
        }
        
        if (record.getTrxLockStructs() != null) {
            sql.SET("trx_lock_structs = #{record.trxLockStructs,jdbcType=BIGINT}");
        }
        
        if (record.getTrxLockMemoryBytes() != null) {
            sql.SET("trx_lock_memory_bytes = #{record.trxLockMemoryBytes,jdbcType=BIGINT}");
        }
        
        if (record.getTrxRowsLocked() != null) {
            sql.SET("trx_rows_locked = #{record.trxRowsLocked,jdbcType=BIGINT}");
        }
        
        if (record.getTrxRowsModified() != null) {
            sql.SET("trx_rows_modified = #{record.trxRowsModified,jdbcType=BIGINT}");
        }
        
        if (record.getTrxConcurrencyTickets() != null) {
            sql.SET("trx_concurrency_tickets = #{record.trxConcurrencyTickets,jdbcType=BIGINT}");
        }
        
        if (record.getTrxIsolationLevel() != null) {
            sql.SET("trx_isolation_level = #{record.trxIsolationLevel,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxUniqueChecks() != null) {
            sql.SET("trx_unique_checks = #{record.trxUniqueChecks,jdbcType=INTEGER}");
        }
        
        if (record.getTrxForeignKeyChecks() != null) {
            sql.SET("trx_foreign_key_checks = #{record.trxForeignKeyChecks,jdbcType=INTEGER}");
        }
        
        if (record.getTrxLastForeignKeyError() != null) {
            sql.SET("trx_last_foreign_key_error = #{record.trxLastForeignKeyError,jdbcType=VARCHAR}");
        }
        
        if (record.getTrxIsReadOnly() != null) {
            sql.SET("trx_is_read_only = #{record.trxIsReadOnly,jdbcType=INTEGER}");
        }
        
        if (record.getTrxAutocommitNonLocking() != null) {
            sql.SET("trx_autocommit_non_locking = #{record.trxAutocommitNonLocking,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TRX");
        
        sql.SET("trx_id = #{record.trxId,jdbcType=VARCHAR}");
        sql.SET("trx_state = #{record.trxState,jdbcType=VARCHAR}");
        sql.SET("trx_started = #{record.trxStarted,jdbcType=TIMESTAMP}");
        sql.SET("trx_requested_lock_id = #{record.trxRequestedLockId,jdbcType=VARCHAR}");
        sql.SET("trx_wait_started = #{record.trxWaitStarted,jdbcType=TIMESTAMP}");
        sql.SET("trx_weight = #{record.trxWeight,jdbcType=BIGINT}");
        sql.SET("trx_mysql_thread_id = #{record.trxMysqlThreadId,jdbcType=BIGINT}");
        sql.SET("trx_query = #{record.trxQuery,jdbcType=VARCHAR}");
        sql.SET("trx_operation_state = #{record.trxOperationState,jdbcType=VARCHAR}");
        sql.SET("trx_tables_in_use = #{record.trxTablesInUse,jdbcType=BIGINT}");
        sql.SET("trx_tables_locked = #{record.trxTablesLocked,jdbcType=BIGINT}");
        sql.SET("trx_lock_structs = #{record.trxLockStructs,jdbcType=BIGINT}");
        sql.SET("trx_lock_memory_bytes = #{record.trxLockMemoryBytes,jdbcType=BIGINT}");
        sql.SET("trx_rows_locked = #{record.trxRowsLocked,jdbcType=BIGINT}");
        sql.SET("trx_rows_modified = #{record.trxRowsModified,jdbcType=BIGINT}");
        sql.SET("trx_concurrency_tickets = #{record.trxConcurrencyTickets,jdbcType=BIGINT}");
        sql.SET("trx_isolation_level = #{record.trxIsolationLevel,jdbcType=VARCHAR}");
        sql.SET("trx_unique_checks = #{record.trxUniqueChecks,jdbcType=INTEGER}");
        sql.SET("trx_foreign_key_checks = #{record.trxForeignKeyChecks,jdbcType=INTEGER}");
        sql.SET("trx_last_foreign_key_error = #{record.trxLastForeignKeyError,jdbcType=VARCHAR}");
        sql.SET("trx_is_read_only = #{record.trxIsReadOnly,jdbcType=INTEGER}");
        sql.SET("trx_autocommit_non_locking = #{record.trxAutocommitNonLocking,jdbcType=INTEGER}");
        
        InnodbTrxExample example = (InnodbTrxExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbTrxExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}