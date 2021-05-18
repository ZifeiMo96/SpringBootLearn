package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbMetrics;
import com.example.demo.data.model.InnodbMetricsExample.Criteria;
import com.example.demo.data.model.InnodbMetricsExample.Criterion;
import com.example.demo.data.model.InnodbMetricsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbMetricsSqlProvider {
    public String countByExample(InnodbMetricsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_METRICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbMetricsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_METRICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbMetrics record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_METRICS");
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSubsystem() != null) {
            sql.VALUES("SUBSYSTEM", "#{subsystem,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            sql.VALUES("COUNT", "#{count,jdbcType=BIGINT}");
        }
        
        if (record.getMaxCount() != null) {
            sql.VALUES("MAX_COUNT", "#{maxCount,jdbcType=BIGINT}");
        }
        
        if (record.getMinCount() != null) {
            sql.VALUES("MIN_COUNT", "#{minCount,jdbcType=BIGINT}");
        }
        
        if (record.getAvgCount() != null) {
            sql.VALUES("AVG_COUNT", "#{avgCount,jdbcType=DOUBLE}");
        }
        
        if (record.getCountReset() != null) {
            sql.VALUES("COUNT_RESET", "#{countReset,jdbcType=BIGINT}");
        }
        
        if (record.getMaxCountReset() != null) {
            sql.VALUES("MAX_COUNT_RESET", "#{maxCountReset,jdbcType=BIGINT}");
        }
        
        if (record.getMinCountReset() != null) {
            sql.VALUES("MIN_COUNT_RESET", "#{minCountReset,jdbcType=BIGINT}");
        }
        
        if (record.getAvgCountReset() != null) {
            sql.VALUES("AVG_COUNT_RESET", "#{avgCountReset,jdbcType=DOUBLE}");
        }
        
        if (record.getTimeEnabled() != null) {
            sql.VALUES("TIME_ENABLED", "#{timeEnabled,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTimeDisabled() != null) {
            sql.VALUES("TIME_DISABLED", "#{timeDisabled,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTimeElapsed() != null) {
            sql.VALUES("TIME_ELAPSED", "#{timeElapsed,jdbcType=BIGINT}");
        }
        
        if (record.getTimeReset() != null) {
            sql.VALUES("TIME_RESET", "#{timeReset,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("TYPE", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("COMMENT", "#{comment,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbMetricsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("NAME");
        } else {
            sql.SELECT("NAME");
        }
        sql.SELECT("SUBSYSTEM");
        sql.SELECT("COUNT");
        sql.SELECT("MAX_COUNT");
        sql.SELECT("MIN_COUNT");
        sql.SELECT("AVG_COUNT");
        sql.SELECT("COUNT_RESET");
        sql.SELECT("MAX_COUNT_RESET");
        sql.SELECT("MIN_COUNT_RESET");
        sql.SELECT("AVG_COUNT_RESET");
        sql.SELECT("TIME_ENABLED");
        sql.SELECT("TIME_DISABLED");
        sql.SELECT("TIME_ELAPSED");
        sql.SELECT("TIME_RESET");
        sql.SELECT("STATUS");
        sql.SELECT("TYPE");
        sql.SELECT("COMMENT");
        sql.FROM("INNODB_METRICS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbMetrics record = (InnodbMetrics) parameter.get("record");
        InnodbMetricsExample example = (InnodbMetricsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_METRICS");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getSubsystem() != null) {
            sql.SET("SUBSYSTEM = #{record.subsystem,jdbcType=VARCHAR}");
        }
        
        if (record.getCount() != null) {
            sql.SET("COUNT = #{record.count,jdbcType=BIGINT}");
        }
        
        if (record.getMaxCount() != null) {
            sql.SET("MAX_COUNT = #{record.maxCount,jdbcType=BIGINT}");
        }
        
        if (record.getMinCount() != null) {
            sql.SET("MIN_COUNT = #{record.minCount,jdbcType=BIGINT}");
        }
        
        if (record.getAvgCount() != null) {
            sql.SET("AVG_COUNT = #{record.avgCount,jdbcType=DOUBLE}");
        }
        
        if (record.getCountReset() != null) {
            sql.SET("COUNT_RESET = #{record.countReset,jdbcType=BIGINT}");
        }
        
        if (record.getMaxCountReset() != null) {
            sql.SET("MAX_COUNT_RESET = #{record.maxCountReset,jdbcType=BIGINT}");
        }
        
        if (record.getMinCountReset() != null) {
            sql.SET("MIN_COUNT_RESET = #{record.minCountReset,jdbcType=BIGINT}");
        }
        
        if (record.getAvgCountReset() != null) {
            sql.SET("AVG_COUNT_RESET = #{record.avgCountReset,jdbcType=DOUBLE}");
        }
        
        if (record.getTimeEnabled() != null) {
            sql.SET("TIME_ENABLED = #{record.timeEnabled,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTimeDisabled() != null) {
            sql.SET("TIME_DISABLED = #{record.timeDisabled,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTimeElapsed() != null) {
            sql.SET("TIME_ELAPSED = #{record.timeElapsed,jdbcType=BIGINT}");
        }
        
        if (record.getTimeReset() != null) {
            sql.SET("TIME_RESET = #{record.timeReset,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("TYPE = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_METRICS");
        
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("SUBSYSTEM = #{record.subsystem,jdbcType=VARCHAR}");
        sql.SET("COUNT = #{record.count,jdbcType=BIGINT}");
        sql.SET("MAX_COUNT = #{record.maxCount,jdbcType=BIGINT}");
        sql.SET("MIN_COUNT = #{record.minCount,jdbcType=BIGINT}");
        sql.SET("AVG_COUNT = #{record.avgCount,jdbcType=DOUBLE}");
        sql.SET("COUNT_RESET = #{record.countReset,jdbcType=BIGINT}");
        sql.SET("MAX_COUNT_RESET = #{record.maxCountReset,jdbcType=BIGINT}");
        sql.SET("MIN_COUNT_RESET = #{record.minCountReset,jdbcType=BIGINT}");
        sql.SET("AVG_COUNT_RESET = #{record.avgCountReset,jdbcType=DOUBLE}");
        sql.SET("TIME_ENABLED = #{record.timeEnabled,jdbcType=TIMESTAMP}");
        sql.SET("TIME_DISABLED = #{record.timeDisabled,jdbcType=TIMESTAMP}");
        sql.SET("TIME_ELAPSED = #{record.timeElapsed,jdbcType=BIGINT}");
        sql.SET("TIME_RESET = #{record.timeReset,jdbcType=TIMESTAMP}");
        sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        sql.SET("TYPE = #{record.type,jdbcType=VARCHAR}");
        sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        
        InnodbMetricsExample example = (InnodbMetricsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbMetricsExample example, boolean includeExamplePhrase) {
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