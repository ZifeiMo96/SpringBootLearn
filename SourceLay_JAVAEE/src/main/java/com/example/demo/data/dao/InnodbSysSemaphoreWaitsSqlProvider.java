package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysSemaphoreWaits;
import com.example.demo.data.model.InnodbSysSemaphoreWaitsExample.Criteria;
import com.example.demo.data.model.InnodbSysSemaphoreWaitsExample.Criterion;
import com.example.demo.data.model.InnodbSysSemaphoreWaitsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysSemaphoreWaitsSqlProvider {
    public String countByExample(InnodbSysSemaphoreWaitsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_SEMAPHORE_WAITS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysSemaphoreWaitsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_SEMAPHORE_WAITS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysSemaphoreWaits record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_SEMAPHORE_WAITS");
        
        if (record.getThreadId() != null) {
            sql.VALUES("THREAD_ID", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getObjectName() != null) {
            sql.VALUES("OBJECT_NAME", "#{objectName,jdbcType=VARCHAR}");
        }
        
        if (record.getFile() != null) {
            sql.VALUES("FILE", "#{file,jdbcType=VARCHAR}");
        }
        
        if (record.getLine() != null) {
            sql.VALUES("LINE", "#{line,jdbcType=INTEGER}");
        }
        
        if (record.getWaitTime() != null) {
            sql.VALUES("WAIT_TIME", "#{waitTime,jdbcType=BIGINT}");
        }
        
        if (record.getWaitObject() != null) {
            sql.VALUES("WAIT_OBJECT", "#{waitObject,jdbcType=BIGINT}");
        }
        
        if (record.getWaitType() != null) {
            sql.VALUES("WAIT_TYPE", "#{waitType,jdbcType=VARCHAR}");
        }
        
        if (record.getHolderThreadId() != null) {
            sql.VALUES("HOLDER_THREAD_ID", "#{holderThreadId,jdbcType=BIGINT}");
        }
        
        if (record.getHolderFile() != null) {
            sql.VALUES("HOLDER_FILE", "#{holderFile,jdbcType=VARCHAR}");
        }
        
        if (record.getHolderLine() != null) {
            sql.VALUES("HOLDER_LINE", "#{holderLine,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedFile() != null) {
            sql.VALUES("CREATED_FILE", "#{createdFile,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedLine() != null) {
            sql.VALUES("CREATED_LINE", "#{createdLine,jdbcType=INTEGER}");
        }
        
        if (record.getWriterThread() != null) {
            sql.VALUES("WRITER_THREAD", "#{writerThread,jdbcType=BIGINT}");
        }
        
        if (record.getReservationMode() != null) {
            sql.VALUES("RESERVATION_MODE", "#{reservationMode,jdbcType=VARCHAR}");
        }
        
        if (record.getReaders() != null) {
            sql.VALUES("READERS", "#{readers,jdbcType=INTEGER}");
        }
        
        if (record.getWaitersFlag() != null) {
            sql.VALUES("WAITERS_FLAG", "#{waitersFlag,jdbcType=BIGINT}");
        }
        
        if (record.getLockWord() != null) {
            sql.VALUES("LOCK_WORD", "#{lockWord,jdbcType=BIGINT}");
        }
        
        if (record.getLastWriterFile() != null) {
            sql.VALUES("LAST_WRITER_FILE", "#{lastWriterFile,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWriterLine() != null) {
            sql.VALUES("LAST_WRITER_LINE", "#{lastWriterLine,jdbcType=INTEGER}");
        }
        
        if (record.getOsWaitCount() != null) {
            sql.VALUES("OS_WAIT_COUNT", "#{osWaitCount,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysSemaphoreWaitsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("THREAD_ID");
        } else {
            sql.SELECT("THREAD_ID");
        }
        sql.SELECT("OBJECT_NAME");
        sql.SELECT("FILE");
        sql.SELECT("LINE");
        sql.SELECT("WAIT_TIME");
        sql.SELECT("WAIT_OBJECT");
        sql.SELECT("WAIT_TYPE");
        sql.SELECT("HOLDER_THREAD_ID");
        sql.SELECT("HOLDER_FILE");
        sql.SELECT("HOLDER_LINE");
        sql.SELECT("CREATED_FILE");
        sql.SELECT("CREATED_LINE");
        sql.SELECT("WRITER_THREAD");
        sql.SELECT("RESERVATION_MODE");
        sql.SELECT("READERS");
        sql.SELECT("WAITERS_FLAG");
        sql.SELECT("LOCK_WORD");
        sql.SELECT("LAST_WRITER_FILE");
        sql.SELECT("LAST_WRITER_LINE");
        sql.SELECT("OS_WAIT_COUNT");
        sql.FROM("INNODB_SYS_SEMAPHORE_WAITS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysSemaphoreWaits record = (InnodbSysSemaphoreWaits) parameter.get("record");
        InnodbSysSemaphoreWaitsExample example = (InnodbSysSemaphoreWaitsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_SEMAPHORE_WAITS");
        
        if (record.getThreadId() != null) {
            sql.SET("THREAD_ID = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getObjectName() != null) {
            sql.SET("OBJECT_NAME = #{record.objectName,jdbcType=VARCHAR}");
        }
        
        if (record.getFile() != null) {
            sql.SET("FILE = #{record.file,jdbcType=VARCHAR}");
        }
        
        if (record.getLine() != null) {
            sql.SET("LINE = #{record.line,jdbcType=INTEGER}");
        }
        
        if (record.getWaitTime() != null) {
            sql.SET("WAIT_TIME = #{record.waitTime,jdbcType=BIGINT}");
        }
        
        if (record.getWaitObject() != null) {
            sql.SET("WAIT_OBJECT = #{record.waitObject,jdbcType=BIGINT}");
        }
        
        if (record.getWaitType() != null) {
            sql.SET("WAIT_TYPE = #{record.waitType,jdbcType=VARCHAR}");
        }
        
        if (record.getHolderThreadId() != null) {
            sql.SET("HOLDER_THREAD_ID = #{record.holderThreadId,jdbcType=BIGINT}");
        }
        
        if (record.getHolderFile() != null) {
            sql.SET("HOLDER_FILE = #{record.holderFile,jdbcType=VARCHAR}");
        }
        
        if (record.getHolderLine() != null) {
            sql.SET("HOLDER_LINE = #{record.holderLine,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedFile() != null) {
            sql.SET("CREATED_FILE = #{record.createdFile,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedLine() != null) {
            sql.SET("CREATED_LINE = #{record.createdLine,jdbcType=INTEGER}");
        }
        
        if (record.getWriterThread() != null) {
            sql.SET("WRITER_THREAD = #{record.writerThread,jdbcType=BIGINT}");
        }
        
        if (record.getReservationMode() != null) {
            sql.SET("RESERVATION_MODE = #{record.reservationMode,jdbcType=VARCHAR}");
        }
        
        if (record.getReaders() != null) {
            sql.SET("READERS = #{record.readers,jdbcType=INTEGER}");
        }
        
        if (record.getWaitersFlag() != null) {
            sql.SET("WAITERS_FLAG = #{record.waitersFlag,jdbcType=BIGINT}");
        }
        
        if (record.getLockWord() != null) {
            sql.SET("LOCK_WORD = #{record.lockWord,jdbcType=BIGINT}");
        }
        
        if (record.getLastWriterFile() != null) {
            sql.SET("LAST_WRITER_FILE = #{record.lastWriterFile,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWriterLine() != null) {
            sql.SET("LAST_WRITER_LINE = #{record.lastWriterLine,jdbcType=INTEGER}");
        }
        
        if (record.getOsWaitCount() != null) {
            sql.SET("OS_WAIT_COUNT = #{record.osWaitCount,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_SEMAPHORE_WAITS");
        
        sql.SET("THREAD_ID = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("OBJECT_NAME = #{record.objectName,jdbcType=VARCHAR}");
        sql.SET("FILE = #{record.file,jdbcType=VARCHAR}");
        sql.SET("LINE = #{record.line,jdbcType=INTEGER}");
        sql.SET("WAIT_TIME = #{record.waitTime,jdbcType=BIGINT}");
        sql.SET("WAIT_OBJECT = #{record.waitObject,jdbcType=BIGINT}");
        sql.SET("WAIT_TYPE = #{record.waitType,jdbcType=VARCHAR}");
        sql.SET("HOLDER_THREAD_ID = #{record.holderThreadId,jdbcType=BIGINT}");
        sql.SET("HOLDER_FILE = #{record.holderFile,jdbcType=VARCHAR}");
        sql.SET("HOLDER_LINE = #{record.holderLine,jdbcType=INTEGER}");
        sql.SET("CREATED_FILE = #{record.createdFile,jdbcType=VARCHAR}");
        sql.SET("CREATED_LINE = #{record.createdLine,jdbcType=INTEGER}");
        sql.SET("WRITER_THREAD = #{record.writerThread,jdbcType=BIGINT}");
        sql.SET("RESERVATION_MODE = #{record.reservationMode,jdbcType=VARCHAR}");
        sql.SET("READERS = #{record.readers,jdbcType=INTEGER}");
        sql.SET("WAITERS_FLAG = #{record.waitersFlag,jdbcType=BIGINT}");
        sql.SET("LOCK_WORD = #{record.lockWord,jdbcType=BIGINT}");
        sql.SET("LAST_WRITER_FILE = #{record.lastWriterFile,jdbcType=VARCHAR}");
        sql.SET("LAST_WRITER_LINE = #{record.lastWriterLine,jdbcType=INTEGER}");
        sql.SET("OS_WAIT_COUNT = #{record.osWaitCount,jdbcType=INTEGER}");
        
        InnodbSysSemaphoreWaitsExample example = (InnodbSysSemaphoreWaitsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysSemaphoreWaitsExample example, boolean includeExamplePhrase) {
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