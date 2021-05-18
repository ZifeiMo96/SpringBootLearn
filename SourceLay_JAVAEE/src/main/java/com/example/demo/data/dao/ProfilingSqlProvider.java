package com.example.demo.data.dao;

import com.example.demo.data.model.Profiling;
import com.example.demo.data.model.ProfilingExample.Criteria;
import com.example.demo.data.model.ProfilingExample.Criterion;
import com.example.demo.data.model.ProfilingExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProfilingSqlProvider {
    public String countByExample(ProfilingExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PROFILING");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ProfilingExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PROFILING");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Profiling record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PROFILING");
        
        if (record.getQueryId() != null) {
            sql.VALUES("QUERY_ID", "#{queryId,jdbcType=INTEGER}");
        }
        
        if (record.getSeq() != null) {
            sql.VALUES("SEQ", "#{seq,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("STATE", "#{state,jdbcType=VARCHAR}");
        }
        
        if (record.getDuration() != null) {
            sql.VALUES("DURATION", "#{duration,jdbcType=DECIMAL}");
        }
        
        if (record.getCpuUser() != null) {
            sql.VALUES("CPU_USER", "#{cpuUser,jdbcType=DECIMAL}");
        }
        
        if (record.getCpuSystem() != null) {
            sql.VALUES("CPU_SYSTEM", "#{cpuSystem,jdbcType=DECIMAL}");
        }
        
        if (record.getContextVoluntary() != null) {
            sql.VALUES("CONTEXT_VOLUNTARY", "#{contextVoluntary,jdbcType=INTEGER}");
        }
        
        if (record.getContextInvoluntary() != null) {
            sql.VALUES("CONTEXT_INVOLUNTARY", "#{contextInvoluntary,jdbcType=INTEGER}");
        }
        
        if (record.getBlockOpsIn() != null) {
            sql.VALUES("BLOCK_OPS_IN", "#{blockOpsIn,jdbcType=INTEGER}");
        }
        
        if (record.getBlockOpsOut() != null) {
            sql.VALUES("BLOCK_OPS_OUT", "#{blockOpsOut,jdbcType=INTEGER}");
        }
        
        if (record.getMessagesSent() != null) {
            sql.VALUES("MESSAGES_SENT", "#{messagesSent,jdbcType=INTEGER}");
        }
        
        if (record.getMessagesReceived() != null) {
            sql.VALUES("MESSAGES_RECEIVED", "#{messagesReceived,jdbcType=INTEGER}");
        }
        
        if (record.getPageFaultsMajor() != null) {
            sql.VALUES("PAGE_FAULTS_MAJOR", "#{pageFaultsMajor,jdbcType=INTEGER}");
        }
        
        if (record.getPageFaultsMinor() != null) {
            sql.VALUES("PAGE_FAULTS_MINOR", "#{pageFaultsMinor,jdbcType=INTEGER}");
        }
        
        if (record.getSwaps() != null) {
            sql.VALUES("SWAPS", "#{swaps,jdbcType=INTEGER}");
        }
        
        if (record.getSourceFunction() != null) {
            sql.VALUES("SOURCE_FUNCTION", "#{sourceFunction,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceFile() != null) {
            sql.VALUES("SOURCE_FILE", "#{sourceFile,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceLine() != null) {
            sql.VALUES("SOURCE_LINE", "#{sourceLine,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ProfilingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("QUERY_ID");
        } else {
            sql.SELECT("QUERY_ID");
        }
        sql.SELECT("SEQ");
        sql.SELECT("STATE");
        sql.SELECT("DURATION");
        sql.SELECT("CPU_USER");
        sql.SELECT("CPU_SYSTEM");
        sql.SELECT("CONTEXT_VOLUNTARY");
        sql.SELECT("CONTEXT_INVOLUNTARY");
        sql.SELECT("BLOCK_OPS_IN");
        sql.SELECT("BLOCK_OPS_OUT");
        sql.SELECT("MESSAGES_SENT");
        sql.SELECT("MESSAGES_RECEIVED");
        sql.SELECT("PAGE_FAULTS_MAJOR");
        sql.SELECT("PAGE_FAULTS_MINOR");
        sql.SELECT("SWAPS");
        sql.SELECT("SOURCE_FUNCTION");
        sql.SELECT("SOURCE_FILE");
        sql.SELECT("SOURCE_LINE");
        sql.FROM("PROFILING");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Profiling record = (Profiling) parameter.get("record");
        ProfilingExample example = (ProfilingExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PROFILING");
        
        if (record.getQueryId() != null) {
            sql.SET("QUERY_ID = #{record.queryId,jdbcType=INTEGER}");
        }
        
        if (record.getSeq() != null) {
            sql.SET("SEQ = #{record.seq,jdbcType=INTEGER}");
        }
        
        if (record.getState() != null) {
            sql.SET("STATE = #{record.state,jdbcType=VARCHAR}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("DURATION = #{record.duration,jdbcType=DECIMAL}");
        }
        
        if (record.getCpuUser() != null) {
            sql.SET("CPU_USER = #{record.cpuUser,jdbcType=DECIMAL}");
        }
        
        if (record.getCpuSystem() != null) {
            sql.SET("CPU_SYSTEM = #{record.cpuSystem,jdbcType=DECIMAL}");
        }
        
        if (record.getContextVoluntary() != null) {
            sql.SET("CONTEXT_VOLUNTARY = #{record.contextVoluntary,jdbcType=INTEGER}");
        }
        
        if (record.getContextInvoluntary() != null) {
            sql.SET("CONTEXT_INVOLUNTARY = #{record.contextInvoluntary,jdbcType=INTEGER}");
        }
        
        if (record.getBlockOpsIn() != null) {
            sql.SET("BLOCK_OPS_IN = #{record.blockOpsIn,jdbcType=INTEGER}");
        }
        
        if (record.getBlockOpsOut() != null) {
            sql.SET("BLOCK_OPS_OUT = #{record.blockOpsOut,jdbcType=INTEGER}");
        }
        
        if (record.getMessagesSent() != null) {
            sql.SET("MESSAGES_SENT = #{record.messagesSent,jdbcType=INTEGER}");
        }
        
        if (record.getMessagesReceived() != null) {
            sql.SET("MESSAGES_RECEIVED = #{record.messagesReceived,jdbcType=INTEGER}");
        }
        
        if (record.getPageFaultsMajor() != null) {
            sql.SET("PAGE_FAULTS_MAJOR = #{record.pageFaultsMajor,jdbcType=INTEGER}");
        }
        
        if (record.getPageFaultsMinor() != null) {
            sql.SET("PAGE_FAULTS_MINOR = #{record.pageFaultsMinor,jdbcType=INTEGER}");
        }
        
        if (record.getSwaps() != null) {
            sql.SET("SWAPS = #{record.swaps,jdbcType=INTEGER}");
        }
        
        if (record.getSourceFunction() != null) {
            sql.SET("SOURCE_FUNCTION = #{record.sourceFunction,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceFile() != null) {
            sql.SET("SOURCE_FILE = #{record.sourceFile,jdbcType=VARCHAR}");
        }
        
        if (record.getSourceLine() != null) {
            sql.SET("SOURCE_LINE = #{record.sourceLine,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PROFILING");
        
        sql.SET("QUERY_ID = #{record.queryId,jdbcType=INTEGER}");
        sql.SET("SEQ = #{record.seq,jdbcType=INTEGER}");
        sql.SET("STATE = #{record.state,jdbcType=VARCHAR}");
        sql.SET("DURATION = #{record.duration,jdbcType=DECIMAL}");
        sql.SET("CPU_USER = #{record.cpuUser,jdbcType=DECIMAL}");
        sql.SET("CPU_SYSTEM = #{record.cpuSystem,jdbcType=DECIMAL}");
        sql.SET("CONTEXT_VOLUNTARY = #{record.contextVoluntary,jdbcType=INTEGER}");
        sql.SET("CONTEXT_INVOLUNTARY = #{record.contextInvoluntary,jdbcType=INTEGER}");
        sql.SET("BLOCK_OPS_IN = #{record.blockOpsIn,jdbcType=INTEGER}");
        sql.SET("BLOCK_OPS_OUT = #{record.blockOpsOut,jdbcType=INTEGER}");
        sql.SET("MESSAGES_SENT = #{record.messagesSent,jdbcType=INTEGER}");
        sql.SET("MESSAGES_RECEIVED = #{record.messagesReceived,jdbcType=INTEGER}");
        sql.SET("PAGE_FAULTS_MAJOR = #{record.pageFaultsMajor,jdbcType=INTEGER}");
        sql.SET("PAGE_FAULTS_MINOR = #{record.pageFaultsMinor,jdbcType=INTEGER}");
        sql.SET("SWAPS = #{record.swaps,jdbcType=INTEGER}");
        sql.SET("SOURCE_FUNCTION = #{record.sourceFunction,jdbcType=VARCHAR}");
        sql.SET("SOURCE_FILE = #{record.sourceFile,jdbcType=VARCHAR}");
        sql.SET("SOURCE_LINE = #{record.sourceLine,jdbcType=INTEGER}");
        
        ProfilingExample example = (ProfilingExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ProfilingExample example, boolean includeExamplePhrase) {
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