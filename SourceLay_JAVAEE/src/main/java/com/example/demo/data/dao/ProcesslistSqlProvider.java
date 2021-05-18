package com.example.demo.data.dao;

import com.example.demo.data.model.ProcesslistExample.Criteria;
import com.example.demo.data.model.ProcesslistExample.Criterion;
import com.example.demo.data.model.ProcesslistExample;
import com.example.demo.data.model.ProcesslistWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProcesslistSqlProvider {
    public String countByExample(ProcesslistExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PROCESSLIST");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ProcesslistExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PROCESSLIST");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ProcesslistWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PROCESSLIST");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUser() != null) {
            sql.VALUES("USER", "#{user,jdbcType=VARCHAR}");
        }
        
        if (record.getHost() != null) {
            sql.VALUES("HOST", "#{host,jdbcType=VARCHAR}");
        }
        
        if (record.getDb() != null) {
            sql.VALUES("DB", "#{db,jdbcType=VARCHAR}");
        }
        
        if (record.getCommand() != null) {
            sql.VALUES("COMMAND", "#{command,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            sql.VALUES("TIME", "#{time,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("STATE", "#{state,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeMs() != null) {
            sql.VALUES("TIME_MS", "#{timeMs,jdbcType=DECIMAL}");
        }
        
        if (record.getStage() != null) {
            sql.VALUES("STAGE", "#{stage,jdbcType=TINYINT}");
        }
        
        if (record.getMaxStage() != null) {
            sql.VALUES("MAX_STAGE", "#{maxStage,jdbcType=TINYINT}");
        }
        
        if (record.getProgress() != null) {
            sql.VALUES("PROGRESS", "#{progress,jdbcType=DECIMAL}");
        }
        
        if (record.getMemoryUsed() != null) {
            sql.VALUES("MEMORY_USED", "#{memoryUsed,jdbcType=BIGINT}");
        }
        
        if (record.getMaxMemoryUsed() != null) {
            sql.VALUES("MAX_MEMORY_USED", "#{maxMemoryUsed,jdbcType=BIGINT}");
        }
        
        if (record.getExaminedRows() != null) {
            sql.VALUES("EXAMINED_ROWS", "#{examinedRows,jdbcType=INTEGER}");
        }
        
        if (record.getQueryId() != null) {
            sql.VALUES("QUERY_ID", "#{queryId,jdbcType=BIGINT}");
        }
        
        if (record.getTid() != null) {
            sql.VALUES("TID", "#{tid,jdbcType=BIGINT}");
        }
        
        if (record.getInfo() != null) {
            sql.VALUES("INFO", "#{info,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getInfoBinary() != null) {
            sql.VALUES("INFO_BINARY", "#{infoBinary,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ProcesslistExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("USER");
        sql.SELECT("HOST");
        sql.SELECT("DB");
        sql.SELECT("COMMAND");
        sql.SELECT("TIME");
        sql.SELECT("STATE");
        sql.SELECT("TIME_MS");
        sql.SELECT("STAGE");
        sql.SELECT("MAX_STAGE");
        sql.SELECT("PROGRESS");
        sql.SELECT("MEMORY_USED");
        sql.SELECT("MAX_MEMORY_USED");
        sql.SELECT("EXAMINED_ROWS");
        sql.SELECT("QUERY_ID");
        sql.SELECT("TID");
        sql.SELECT("INFO");
        sql.SELECT("INFO_BINARY");
        sql.FROM("PROCESSLIST");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ProcesslistExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("USER");
        sql.SELECT("HOST");
        sql.SELECT("DB");
        sql.SELECT("COMMAND");
        sql.SELECT("TIME");
        sql.SELECT("STATE");
        sql.SELECT("TIME_MS");
        sql.SELECT("STAGE");
        sql.SELECT("MAX_STAGE");
        sql.SELECT("PROGRESS");
        sql.SELECT("MEMORY_USED");
        sql.SELECT("MAX_MEMORY_USED");
        sql.SELECT("EXAMINED_ROWS");
        sql.SELECT("QUERY_ID");
        sql.SELECT("TID");
        sql.FROM("PROCESSLIST");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ProcesslistWithBLOBs record = (ProcesslistWithBLOBs) parameter.get("record");
        ProcesslistExample example = (ProcesslistExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PROCESSLIST");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUser() != null) {
            sql.SET("USER = #{record.user,jdbcType=VARCHAR}");
        }
        
        if (record.getHost() != null) {
            sql.SET("HOST = #{record.host,jdbcType=VARCHAR}");
        }
        
        if (record.getDb() != null) {
            sql.SET("DB = #{record.db,jdbcType=VARCHAR}");
        }
        
        if (record.getCommand() != null) {
            sql.SET("COMMAND = #{record.command,jdbcType=VARCHAR}");
        }
        
        if (record.getTime() != null) {
            sql.SET("TIME = #{record.time,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            sql.SET("STATE = #{record.state,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeMs() != null) {
            sql.SET("TIME_MS = #{record.timeMs,jdbcType=DECIMAL}");
        }
        
        if (record.getStage() != null) {
            sql.SET("STAGE = #{record.stage,jdbcType=TINYINT}");
        }
        
        if (record.getMaxStage() != null) {
            sql.SET("MAX_STAGE = #{record.maxStage,jdbcType=TINYINT}");
        }
        
        if (record.getProgress() != null) {
            sql.SET("PROGRESS = #{record.progress,jdbcType=DECIMAL}");
        }
        
        if (record.getMemoryUsed() != null) {
            sql.SET("MEMORY_USED = #{record.memoryUsed,jdbcType=BIGINT}");
        }
        
        if (record.getMaxMemoryUsed() != null) {
            sql.SET("MAX_MEMORY_USED = #{record.maxMemoryUsed,jdbcType=BIGINT}");
        }
        
        if (record.getExaminedRows() != null) {
            sql.SET("EXAMINED_ROWS = #{record.examinedRows,jdbcType=INTEGER}");
        }
        
        if (record.getQueryId() != null) {
            sql.SET("QUERY_ID = #{record.queryId,jdbcType=BIGINT}");
        }
        
        if (record.getTid() != null) {
            sql.SET("TID = #{record.tid,jdbcType=BIGINT}");
        }
        
        if (record.getInfo() != null) {
            sql.SET("INFO = #{record.info,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getInfoBinary() != null) {
            sql.SET("INFO_BINARY = #{record.infoBinary,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PROCESSLIST");
        
        sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        sql.SET("USER = #{record.user,jdbcType=VARCHAR}");
        sql.SET("HOST = #{record.host,jdbcType=VARCHAR}");
        sql.SET("DB = #{record.db,jdbcType=VARCHAR}");
        sql.SET("COMMAND = #{record.command,jdbcType=VARCHAR}");
        sql.SET("TIME = #{record.time,jdbcType=INTEGER}");
        sql.SET("STATE = #{record.state,jdbcType=VARCHAR}");
        sql.SET("TIME_MS = #{record.timeMs,jdbcType=DECIMAL}");
        sql.SET("STAGE = #{record.stage,jdbcType=TINYINT}");
        sql.SET("MAX_STAGE = #{record.maxStage,jdbcType=TINYINT}");
        sql.SET("PROGRESS = #{record.progress,jdbcType=DECIMAL}");
        sql.SET("MEMORY_USED = #{record.memoryUsed,jdbcType=BIGINT}");
        sql.SET("MAX_MEMORY_USED = #{record.maxMemoryUsed,jdbcType=BIGINT}");
        sql.SET("EXAMINED_ROWS = #{record.examinedRows,jdbcType=INTEGER}");
        sql.SET("QUERY_ID = #{record.queryId,jdbcType=BIGINT}");
        sql.SET("TID = #{record.tid,jdbcType=BIGINT}");
        sql.SET("INFO = #{record.info,jdbcType=LONGVARCHAR}");
        sql.SET("INFO_BINARY = #{record.infoBinary,jdbcType=LONGVARBINARY}");
        
        ProcesslistExample example = (ProcesslistExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PROCESSLIST");
        
        sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        sql.SET("USER = #{record.user,jdbcType=VARCHAR}");
        sql.SET("HOST = #{record.host,jdbcType=VARCHAR}");
        sql.SET("DB = #{record.db,jdbcType=VARCHAR}");
        sql.SET("COMMAND = #{record.command,jdbcType=VARCHAR}");
        sql.SET("TIME = #{record.time,jdbcType=INTEGER}");
        sql.SET("STATE = #{record.state,jdbcType=VARCHAR}");
        sql.SET("TIME_MS = #{record.timeMs,jdbcType=DECIMAL}");
        sql.SET("STAGE = #{record.stage,jdbcType=TINYINT}");
        sql.SET("MAX_STAGE = #{record.maxStage,jdbcType=TINYINT}");
        sql.SET("PROGRESS = #{record.progress,jdbcType=DECIMAL}");
        sql.SET("MEMORY_USED = #{record.memoryUsed,jdbcType=BIGINT}");
        sql.SET("MAX_MEMORY_USED = #{record.maxMemoryUsed,jdbcType=BIGINT}");
        sql.SET("EXAMINED_ROWS = #{record.examinedRows,jdbcType=INTEGER}");
        sql.SET("QUERY_ID = #{record.queryId,jdbcType=BIGINT}");
        sql.SET("TID = #{record.tid,jdbcType=BIGINT}");
        
        ProcesslistExample example = (ProcesslistExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ProcesslistExample example, boolean includeExamplePhrase) {
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