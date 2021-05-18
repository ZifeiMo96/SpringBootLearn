package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmpmemReset;
import com.example.demo.data.model.InnodbCmpmemResetExample.Criteria;
import com.example.demo.data.model.InnodbCmpmemResetExample.Criterion;
import com.example.demo.data.model.InnodbCmpmemResetExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbCmpmemResetSqlProvider {
    public String countByExample(InnodbCmpmemResetExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_CMPMEM_RESET");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbCmpmemResetExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_CMPMEM_RESET");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbCmpmemReset record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_CMPMEM_RESET");
        
        if (record.getPageSize() != null) {
            sql.VALUES("page_size", "#{pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getBufferPoolInstance() != null) {
            sql.VALUES("buffer_pool_instance", "#{bufferPoolInstance,jdbcType=INTEGER}");
        }
        
        if (record.getPagesUsed() != null) {
            sql.VALUES("pages_used", "#{pagesUsed,jdbcType=INTEGER}");
        }
        
        if (record.getPagesFree() != null) {
            sql.VALUES("pages_free", "#{pagesFree,jdbcType=INTEGER}");
        }
        
        if (record.getRelocationOps() != null) {
            sql.VALUES("relocation_ops", "#{relocationOps,jdbcType=BIGINT}");
        }
        
        if (record.getRelocationTime() != null) {
            sql.VALUES("relocation_time", "#{relocationTime,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbCmpmemResetExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("page_size");
        } else {
            sql.SELECT("page_size");
        }
        sql.SELECT("buffer_pool_instance");
        sql.SELECT("pages_used");
        sql.SELECT("pages_free");
        sql.SELECT("relocation_ops");
        sql.SELECT("relocation_time");
        sql.FROM("INNODB_CMPMEM_RESET");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbCmpmemReset record = (InnodbCmpmemReset) parameter.get("record");
        InnodbCmpmemResetExample example = (InnodbCmpmemResetExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_CMPMEM_RESET");
        
        if (record.getPageSize() != null) {
            sql.SET("page_size = #{record.pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getBufferPoolInstance() != null) {
            sql.SET("buffer_pool_instance = #{record.bufferPoolInstance,jdbcType=INTEGER}");
        }
        
        if (record.getPagesUsed() != null) {
            sql.SET("pages_used = #{record.pagesUsed,jdbcType=INTEGER}");
        }
        
        if (record.getPagesFree() != null) {
            sql.SET("pages_free = #{record.pagesFree,jdbcType=INTEGER}");
        }
        
        if (record.getRelocationOps() != null) {
            sql.SET("relocation_ops = #{record.relocationOps,jdbcType=BIGINT}");
        }
        
        if (record.getRelocationTime() != null) {
            sql.SET("relocation_time = #{record.relocationTime,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_CMPMEM_RESET");
        
        sql.SET("page_size = #{record.pageSize,jdbcType=INTEGER}");
        sql.SET("buffer_pool_instance = #{record.bufferPoolInstance,jdbcType=INTEGER}");
        sql.SET("pages_used = #{record.pagesUsed,jdbcType=INTEGER}");
        sql.SET("pages_free = #{record.pagesFree,jdbcType=INTEGER}");
        sql.SET("relocation_ops = #{record.relocationOps,jdbcType=BIGINT}");
        sql.SET("relocation_time = #{record.relocationTime,jdbcType=INTEGER}");
        
        InnodbCmpmemResetExample example = (InnodbCmpmemResetExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbCmpmemResetExample example, boolean includeExamplePhrase) {
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