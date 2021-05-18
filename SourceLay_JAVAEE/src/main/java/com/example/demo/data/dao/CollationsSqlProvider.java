package com.example.demo.data.dao;

import com.example.demo.data.model.Collations;
import com.example.demo.data.model.CollationsExample.Criteria;
import com.example.demo.data.model.CollationsExample.Criterion;
import com.example.demo.data.model.CollationsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CollationsSqlProvider {
    public String countByExample(CollationsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("COLLATIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CollationsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("COLLATIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Collations record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("COLLATIONS");
        
        if (record.getCollationName() != null) {
            sql.VALUES("COLLATION_NAME", "#{collationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetName() != null) {
            sql.VALUES("CHARACTER_SET_NAME", "#{characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getIsDefault() != null) {
            sql.VALUES("IS_DEFAULT", "#{isDefault,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCompiled() != null) {
            sql.VALUES("IS_COMPILED", "#{isCompiled,jdbcType=VARCHAR}");
        }
        
        if (record.getSortlen() != null) {
            sql.VALUES("SORTLEN", "#{sortlen,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CollationsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("COLLATION_NAME");
        } else {
            sql.SELECT("COLLATION_NAME");
        }
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("ID");
        sql.SELECT("IS_DEFAULT");
        sql.SELECT("IS_COMPILED");
        sql.SELECT("SORTLEN");
        sql.FROM("COLLATIONS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Collations record = (Collations) parameter.get("record");
        CollationsExample example = (CollationsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("COLLATIONS");
        
        if (record.getCollationName() != null) {
            sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetName() != null) {
            sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getIsDefault() != null) {
            sql.SET("IS_DEFAULT = #{record.isDefault,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCompiled() != null) {
            sql.SET("IS_COMPILED = #{record.isCompiled,jdbcType=VARCHAR}");
        }
        
        if (record.getSortlen() != null) {
            sql.SET("SORTLEN = #{record.sortlen,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("COLLATIONS");
        
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("ID = #{record.id,jdbcType=BIGINT}");
        sql.SET("IS_DEFAULT = #{record.isDefault,jdbcType=VARCHAR}");
        sql.SET("IS_COMPILED = #{record.isCompiled,jdbcType=VARCHAR}");
        sql.SET("SORTLEN = #{record.sortlen,jdbcType=BIGINT}");
        
        CollationsExample example = (CollationsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CollationsExample example, boolean includeExamplePhrase) {
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