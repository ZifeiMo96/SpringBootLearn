package com.example.demo.data.dao;

import com.example.demo.data.model.ParapartyActivities;
import com.example.demo.data.model.ParapartyActivitiesExample.Criteria;
import com.example.demo.data.model.ParapartyActivitiesExample.Criterion;
import com.example.demo.data.model.ParapartyActivitiesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ParapartyActivitiesSqlProvider {
    public String countByExample(ParapartyActivitiesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("paraparty_activities");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ParapartyActivitiesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("paraparty_activities");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ParapartyActivities record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("paraparty_activities");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.VALUES("thread_id", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.VALUES("is_first", "#{isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.VALUES("category_id", "#{categoryId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ParapartyActivitiesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("thread_id");
        sql.SELECT("is_first");
        sql.SELECT("category_id");
        sql.SELECT("created_at");
        sql.FROM("paraparty_activities");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ParapartyActivities record = (ParapartyActivities) parameter.get("record");
        ParapartyActivitiesExample example = (ParapartyActivitiesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("paraparty_activities");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.SET("is_first = #{record.isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{record.categoryId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("paraparty_activities");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("is_first = #{record.isFirst,jdbcType=TINYINT}");
        sql.SET("category_id = #{record.categoryId,jdbcType=BIGINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        ParapartyActivitiesExample example = (ParapartyActivitiesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ParapartyActivities record) {
        SQL sql = new SQL();
        sql.UPDATE("paraparty_activities");
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.SET("is_first = #{isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{categoryId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ParapartyActivitiesExample example, boolean includeExamplePhrase) {
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