package com.example.demo.data.dao;

import com.example.demo.data.model.Engines;
import com.example.demo.data.model.EnginesExample.Criteria;
import com.example.demo.data.model.EnginesExample.Criterion;
import com.example.demo.data.model.EnginesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class EnginesSqlProvider {
    public String countByExample(EnginesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ENGINES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(EnginesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ENGINES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Engines record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ENGINES");
        
        if (record.getEngine() != null) {
            sql.VALUES("ENGINE", "#{engine,jdbcType=VARCHAR}");
        }
        
        if (record.getSupport() != null) {
            sql.VALUES("SUPPORT", "#{support,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("COMMENT", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactions() != null) {
            sql.VALUES("TRANSACTIONS", "#{transactions,jdbcType=VARCHAR}");
        }
        
        if (record.getXa() != null) {
            sql.VALUES("XA", "#{xa,jdbcType=VARCHAR}");
        }
        
        if (record.getSavepoints() != null) {
            sql.VALUES("SAVEPOINTS", "#{savepoints,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(EnginesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ENGINE");
        } else {
            sql.SELECT("ENGINE");
        }
        sql.SELECT("SUPPORT");
        sql.SELECT("COMMENT");
        sql.SELECT("TRANSACTIONS");
        sql.SELECT("XA");
        sql.SELECT("SAVEPOINTS");
        sql.FROM("ENGINES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Engines record = (Engines) parameter.get("record");
        EnginesExample example = (EnginesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ENGINES");
        
        if (record.getEngine() != null) {
            sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        }
        
        if (record.getSupport() != null) {
            sql.SET("SUPPORT = #{record.support,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getTransactions() != null) {
            sql.SET("TRANSACTIONS = #{record.transactions,jdbcType=VARCHAR}");
        }
        
        if (record.getXa() != null) {
            sql.SET("XA = #{record.xa,jdbcType=VARCHAR}");
        }
        
        if (record.getSavepoints() != null) {
            sql.SET("SAVEPOINTS = #{record.savepoints,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ENGINES");
        
        sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        sql.SET("SUPPORT = #{record.support,jdbcType=VARCHAR}");
        sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        sql.SET("TRANSACTIONS = #{record.transactions,jdbcType=VARCHAR}");
        sql.SET("XA = #{record.xa,jdbcType=VARCHAR}");
        sql.SET("SAVEPOINTS = #{record.savepoints,jdbcType=VARCHAR}");
        
        EnginesExample example = (EnginesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, EnginesExample example, boolean includeExamplePhrase) {
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