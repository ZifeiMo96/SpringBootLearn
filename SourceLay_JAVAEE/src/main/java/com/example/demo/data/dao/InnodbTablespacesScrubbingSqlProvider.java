package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTablespacesScrubbing;
import com.example.demo.data.model.InnodbTablespacesScrubbingExample.Criteria;
import com.example.demo.data.model.InnodbTablespacesScrubbingExample.Criterion;
import com.example.demo.data.model.InnodbTablespacesScrubbingExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbTablespacesScrubbingSqlProvider {
    public String countByExample(InnodbTablespacesScrubbingExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_TABLESPACES_SCRUBBING");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbTablespacesScrubbingExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_TABLESPACES_SCRUBBING");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbTablespacesScrubbing record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_TABLESPACES_SCRUBBING");
        
        if (record.getSpace() != null) {
            sql.VALUES("SPACE", "#{space,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getCompressed() != null) {
            sql.VALUES("COMPRESSED", "#{compressed,jdbcType=INTEGER}");
        }
        
        if (record.getLastScrubCompleted() != null) {
            sql.VALUES("LAST_SCRUB_COMPLETED", "#{lastScrubCompleted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentScrubStarted() != null) {
            sql.VALUES("CURRENT_SCRUB_STARTED", "#{currentScrubStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentScrubActiveThreads() != null) {
            sql.VALUES("CURRENT_SCRUB_ACTIVE_THREADS", "#{currentScrubActiveThreads,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentScrubPageNumber() != null) {
            sql.VALUES("CURRENT_SCRUB_PAGE_NUMBER", "#{currentScrubPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentScrubMaxPageNumber() != null) {
            sql.VALUES("CURRENT_SCRUB_MAX_PAGE_NUMBER", "#{currentScrubMaxPageNumber,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbTablespacesScrubbingExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPACE");
        } else {
            sql.SELECT("SPACE");
        }
        sql.SELECT("NAME");
        sql.SELECT("COMPRESSED");
        sql.SELECT("LAST_SCRUB_COMPLETED");
        sql.SELECT("CURRENT_SCRUB_STARTED");
        sql.SELECT("CURRENT_SCRUB_ACTIVE_THREADS");
        sql.SELECT("CURRENT_SCRUB_PAGE_NUMBER");
        sql.SELECT("CURRENT_SCRUB_MAX_PAGE_NUMBER");
        sql.FROM("INNODB_TABLESPACES_SCRUBBING");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbTablespacesScrubbing record = (InnodbTablespacesScrubbing) parameter.get("record");
        InnodbTablespacesScrubbingExample example = (InnodbTablespacesScrubbingExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TABLESPACES_SCRUBBING");
        
        if (record.getSpace() != null) {
            sql.SET("SPACE = #{record.space,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getCompressed() != null) {
            sql.SET("COMPRESSED = #{record.compressed,jdbcType=INTEGER}");
        }
        
        if (record.getLastScrubCompleted() != null) {
            sql.SET("LAST_SCRUB_COMPLETED = #{record.lastScrubCompleted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentScrubStarted() != null) {
            sql.SET("CURRENT_SCRUB_STARTED = #{record.currentScrubStarted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCurrentScrubActiveThreads() != null) {
            sql.SET("CURRENT_SCRUB_ACTIVE_THREADS = #{record.currentScrubActiveThreads,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentScrubPageNumber() != null) {
            sql.SET("CURRENT_SCRUB_PAGE_NUMBER = #{record.currentScrubPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentScrubMaxPageNumber() != null) {
            sql.SET("CURRENT_SCRUB_MAX_PAGE_NUMBER = #{record.currentScrubMaxPageNumber,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TABLESPACES_SCRUBBING");
        
        sql.SET("SPACE = #{record.space,jdbcType=BIGINT}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("COMPRESSED = #{record.compressed,jdbcType=INTEGER}");
        sql.SET("LAST_SCRUB_COMPLETED = #{record.lastScrubCompleted,jdbcType=TIMESTAMP}");
        sql.SET("CURRENT_SCRUB_STARTED = #{record.currentScrubStarted,jdbcType=TIMESTAMP}");
        sql.SET("CURRENT_SCRUB_ACTIVE_THREADS = #{record.currentScrubActiveThreads,jdbcType=INTEGER}");
        sql.SET("CURRENT_SCRUB_PAGE_NUMBER = #{record.currentScrubPageNumber,jdbcType=BIGINT}");
        sql.SET("CURRENT_SCRUB_MAX_PAGE_NUMBER = #{record.currentScrubMaxPageNumber,jdbcType=BIGINT}");
        
        InnodbTablespacesScrubbingExample example = (InnodbTablespacesScrubbingExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbTablespacesScrubbingExample example, boolean includeExamplePhrase) {
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