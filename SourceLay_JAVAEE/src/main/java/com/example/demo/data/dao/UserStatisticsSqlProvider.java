package com.example.demo.data.dao;

import com.example.demo.data.model.UserStatistics;
import com.example.demo.data.model.UserStatisticsExample.Criteria;
import com.example.demo.data.model.UserStatisticsExample.Criterion;
import com.example.demo.data.model.UserStatisticsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserStatisticsSqlProvider {
    public String countByExample(UserStatisticsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("USER_STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserStatisticsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("USER_STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserStatistics record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("USER_STATISTICS");
        
        if (record.getUser() != null) {
            sql.VALUES("USER", "#{user,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalConnections() != null) {
            sql.VALUES("TOTAL_CONNECTIONS", "#{totalConnections,jdbcType=INTEGER}");
        }
        
        if (record.getConcurrentConnections() != null) {
            sql.VALUES("CONCURRENT_CONNECTIONS", "#{concurrentConnections,jdbcType=INTEGER}");
        }
        
        if (record.getConnectedTime() != null) {
            sql.VALUES("CONNECTED_TIME", "#{connectedTime,jdbcType=INTEGER}");
        }
        
        if (record.getBusyTime() != null) {
            sql.VALUES("BUSY_TIME", "#{busyTime,jdbcType=DOUBLE}");
        }
        
        if (record.getCpuTime() != null) {
            sql.VALUES("CPU_TIME", "#{cpuTime,jdbcType=DOUBLE}");
        }
        
        if (record.getBytesReceived() != null) {
            sql.VALUES("BYTES_RECEIVED", "#{bytesReceived,jdbcType=BIGINT}");
        }
        
        if (record.getBytesSent() != null) {
            sql.VALUES("BYTES_SENT", "#{bytesSent,jdbcType=BIGINT}");
        }
        
        if (record.getBinlogBytesWritten() != null) {
            sql.VALUES("BINLOG_BYTES_WRITTEN", "#{binlogBytesWritten,jdbcType=BIGINT}");
        }
        
        if (record.getRowsRead() != null) {
            sql.VALUES("ROWS_READ", "#{rowsRead,jdbcType=BIGINT}");
        }
        
        if (record.getRowsSent() != null) {
            sql.VALUES("ROWS_SENT", "#{rowsSent,jdbcType=BIGINT}");
        }
        
        if (record.getRowsDeleted() != null) {
            sql.VALUES("ROWS_DELETED", "#{rowsDeleted,jdbcType=BIGINT}");
        }
        
        if (record.getRowsInserted() != null) {
            sql.VALUES("ROWS_INSERTED", "#{rowsInserted,jdbcType=BIGINT}");
        }
        
        if (record.getRowsUpdated() != null) {
            sql.VALUES("ROWS_UPDATED", "#{rowsUpdated,jdbcType=BIGINT}");
        }
        
        if (record.getSelectCommands() != null) {
            sql.VALUES("SELECT_COMMANDS", "#{selectCommands,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateCommands() != null) {
            sql.VALUES("UPDATE_COMMANDS", "#{updateCommands,jdbcType=BIGINT}");
        }
        
        if (record.getOtherCommands() != null) {
            sql.VALUES("OTHER_COMMANDS", "#{otherCommands,jdbcType=BIGINT}");
        }
        
        if (record.getCommitTransactions() != null) {
            sql.VALUES("COMMIT_TRANSACTIONS", "#{commitTransactions,jdbcType=BIGINT}");
        }
        
        if (record.getRollbackTransactions() != null) {
            sql.VALUES("ROLLBACK_TRANSACTIONS", "#{rollbackTransactions,jdbcType=BIGINT}");
        }
        
        if (record.getDeniedConnections() != null) {
            sql.VALUES("DENIED_CONNECTIONS", "#{deniedConnections,jdbcType=BIGINT}");
        }
        
        if (record.getLostConnections() != null) {
            sql.VALUES("LOST_CONNECTIONS", "#{lostConnections,jdbcType=BIGINT}");
        }
        
        if (record.getAccessDenied() != null) {
            sql.VALUES("ACCESS_DENIED", "#{accessDenied,jdbcType=BIGINT}");
        }
        
        if (record.getEmptyQueries() != null) {
            sql.VALUES("EMPTY_QUERIES", "#{emptyQueries,jdbcType=BIGINT}");
        }
        
        if (record.getTotalSslConnections() != null) {
            sql.VALUES("TOTAL_SSL_CONNECTIONS", "#{totalSslConnections,jdbcType=BIGINT}");
        }
        
        if (record.getMaxStatementTimeExceeded() != null) {
            sql.VALUES("MAX_STATEMENT_TIME_EXCEEDED", "#{maxStatementTimeExceeded,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserStatisticsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("USER");
        } else {
            sql.SELECT("USER");
        }
        sql.SELECT("TOTAL_CONNECTIONS");
        sql.SELECT("CONCURRENT_CONNECTIONS");
        sql.SELECT("CONNECTED_TIME");
        sql.SELECT("BUSY_TIME");
        sql.SELECT("CPU_TIME");
        sql.SELECT("BYTES_RECEIVED");
        sql.SELECT("BYTES_SENT");
        sql.SELECT("BINLOG_BYTES_WRITTEN");
        sql.SELECT("ROWS_READ");
        sql.SELECT("ROWS_SENT");
        sql.SELECT("ROWS_DELETED");
        sql.SELECT("ROWS_INSERTED");
        sql.SELECT("ROWS_UPDATED");
        sql.SELECT("SELECT_COMMANDS");
        sql.SELECT("UPDATE_COMMANDS");
        sql.SELECT("OTHER_COMMANDS");
        sql.SELECT("COMMIT_TRANSACTIONS");
        sql.SELECT("ROLLBACK_TRANSACTIONS");
        sql.SELECT("DENIED_CONNECTIONS");
        sql.SELECT("LOST_CONNECTIONS");
        sql.SELECT("ACCESS_DENIED");
        sql.SELECT("EMPTY_QUERIES");
        sql.SELECT("TOTAL_SSL_CONNECTIONS");
        sql.SELECT("MAX_STATEMENT_TIME_EXCEEDED");
        sql.FROM("USER_STATISTICS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserStatistics record = (UserStatistics) parameter.get("record");
        UserStatisticsExample example = (UserStatisticsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("USER_STATISTICS");
        
        if (record.getUser() != null) {
            sql.SET("USER = #{record.user,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalConnections() != null) {
            sql.SET("TOTAL_CONNECTIONS = #{record.totalConnections,jdbcType=INTEGER}");
        }
        
        if (record.getConcurrentConnections() != null) {
            sql.SET("CONCURRENT_CONNECTIONS = #{record.concurrentConnections,jdbcType=INTEGER}");
        }
        
        if (record.getConnectedTime() != null) {
            sql.SET("CONNECTED_TIME = #{record.connectedTime,jdbcType=INTEGER}");
        }
        
        if (record.getBusyTime() != null) {
            sql.SET("BUSY_TIME = #{record.busyTime,jdbcType=DOUBLE}");
        }
        
        if (record.getCpuTime() != null) {
            sql.SET("CPU_TIME = #{record.cpuTime,jdbcType=DOUBLE}");
        }
        
        if (record.getBytesReceived() != null) {
            sql.SET("BYTES_RECEIVED = #{record.bytesReceived,jdbcType=BIGINT}");
        }
        
        if (record.getBytesSent() != null) {
            sql.SET("BYTES_SENT = #{record.bytesSent,jdbcType=BIGINT}");
        }
        
        if (record.getBinlogBytesWritten() != null) {
            sql.SET("BINLOG_BYTES_WRITTEN = #{record.binlogBytesWritten,jdbcType=BIGINT}");
        }
        
        if (record.getRowsRead() != null) {
            sql.SET("ROWS_READ = #{record.rowsRead,jdbcType=BIGINT}");
        }
        
        if (record.getRowsSent() != null) {
            sql.SET("ROWS_SENT = #{record.rowsSent,jdbcType=BIGINT}");
        }
        
        if (record.getRowsDeleted() != null) {
            sql.SET("ROWS_DELETED = #{record.rowsDeleted,jdbcType=BIGINT}");
        }
        
        if (record.getRowsInserted() != null) {
            sql.SET("ROWS_INSERTED = #{record.rowsInserted,jdbcType=BIGINT}");
        }
        
        if (record.getRowsUpdated() != null) {
            sql.SET("ROWS_UPDATED = #{record.rowsUpdated,jdbcType=BIGINT}");
        }
        
        if (record.getSelectCommands() != null) {
            sql.SET("SELECT_COMMANDS = #{record.selectCommands,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateCommands() != null) {
            sql.SET("UPDATE_COMMANDS = #{record.updateCommands,jdbcType=BIGINT}");
        }
        
        if (record.getOtherCommands() != null) {
            sql.SET("OTHER_COMMANDS = #{record.otherCommands,jdbcType=BIGINT}");
        }
        
        if (record.getCommitTransactions() != null) {
            sql.SET("COMMIT_TRANSACTIONS = #{record.commitTransactions,jdbcType=BIGINT}");
        }
        
        if (record.getRollbackTransactions() != null) {
            sql.SET("ROLLBACK_TRANSACTIONS = #{record.rollbackTransactions,jdbcType=BIGINT}");
        }
        
        if (record.getDeniedConnections() != null) {
            sql.SET("DENIED_CONNECTIONS = #{record.deniedConnections,jdbcType=BIGINT}");
        }
        
        if (record.getLostConnections() != null) {
            sql.SET("LOST_CONNECTIONS = #{record.lostConnections,jdbcType=BIGINT}");
        }
        
        if (record.getAccessDenied() != null) {
            sql.SET("ACCESS_DENIED = #{record.accessDenied,jdbcType=BIGINT}");
        }
        
        if (record.getEmptyQueries() != null) {
            sql.SET("EMPTY_QUERIES = #{record.emptyQueries,jdbcType=BIGINT}");
        }
        
        if (record.getTotalSslConnections() != null) {
            sql.SET("TOTAL_SSL_CONNECTIONS = #{record.totalSslConnections,jdbcType=BIGINT}");
        }
        
        if (record.getMaxStatementTimeExceeded() != null) {
            sql.SET("MAX_STATEMENT_TIME_EXCEEDED = #{record.maxStatementTimeExceeded,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("USER_STATISTICS");
        
        sql.SET("USER = #{record.user,jdbcType=VARCHAR}");
        sql.SET("TOTAL_CONNECTIONS = #{record.totalConnections,jdbcType=INTEGER}");
        sql.SET("CONCURRENT_CONNECTIONS = #{record.concurrentConnections,jdbcType=INTEGER}");
        sql.SET("CONNECTED_TIME = #{record.connectedTime,jdbcType=INTEGER}");
        sql.SET("BUSY_TIME = #{record.busyTime,jdbcType=DOUBLE}");
        sql.SET("CPU_TIME = #{record.cpuTime,jdbcType=DOUBLE}");
        sql.SET("BYTES_RECEIVED = #{record.bytesReceived,jdbcType=BIGINT}");
        sql.SET("BYTES_SENT = #{record.bytesSent,jdbcType=BIGINT}");
        sql.SET("BINLOG_BYTES_WRITTEN = #{record.binlogBytesWritten,jdbcType=BIGINT}");
        sql.SET("ROWS_READ = #{record.rowsRead,jdbcType=BIGINT}");
        sql.SET("ROWS_SENT = #{record.rowsSent,jdbcType=BIGINT}");
        sql.SET("ROWS_DELETED = #{record.rowsDeleted,jdbcType=BIGINT}");
        sql.SET("ROWS_INSERTED = #{record.rowsInserted,jdbcType=BIGINT}");
        sql.SET("ROWS_UPDATED = #{record.rowsUpdated,jdbcType=BIGINT}");
        sql.SET("SELECT_COMMANDS = #{record.selectCommands,jdbcType=BIGINT}");
        sql.SET("UPDATE_COMMANDS = #{record.updateCommands,jdbcType=BIGINT}");
        sql.SET("OTHER_COMMANDS = #{record.otherCommands,jdbcType=BIGINT}");
        sql.SET("COMMIT_TRANSACTIONS = #{record.commitTransactions,jdbcType=BIGINT}");
        sql.SET("ROLLBACK_TRANSACTIONS = #{record.rollbackTransactions,jdbcType=BIGINT}");
        sql.SET("DENIED_CONNECTIONS = #{record.deniedConnections,jdbcType=BIGINT}");
        sql.SET("LOST_CONNECTIONS = #{record.lostConnections,jdbcType=BIGINT}");
        sql.SET("ACCESS_DENIED = #{record.accessDenied,jdbcType=BIGINT}");
        sql.SET("EMPTY_QUERIES = #{record.emptyQueries,jdbcType=BIGINT}");
        sql.SET("TOTAL_SSL_CONNECTIONS = #{record.totalSslConnections,jdbcType=BIGINT}");
        sql.SET("MAX_STATEMENT_TIME_EXCEEDED = #{record.maxStatementTimeExceeded,jdbcType=BIGINT}");
        
        UserStatisticsExample example = (UserStatisticsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserStatisticsExample example, boolean includeExamplePhrase) {
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