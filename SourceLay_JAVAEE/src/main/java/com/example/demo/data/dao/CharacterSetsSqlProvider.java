package com.example.demo.data.dao;

import com.example.demo.data.model.CharacterSets;
import com.example.demo.data.model.CharacterSetsExample.Criteria;
import com.example.demo.data.model.CharacterSetsExample.Criterion;
import com.example.demo.data.model.CharacterSetsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CharacterSetsSqlProvider {
    public String countByExample(CharacterSetsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("CHARACTER_SETS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CharacterSetsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("CHARACTER_SETS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CharacterSets record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("CHARACTER_SETS");
        
        if (record.getCharacterSetName() != null) {
            sql.VALUES("CHARACTER_SET_NAME", "#{characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultCollateName() != null) {
            sql.VALUES("DEFAULT_COLLATE_NAME", "#{defaultCollateName,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxlen() != null) {
            sql.VALUES("MAXLEN", "#{maxlen,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CharacterSetsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CHARACTER_SET_NAME");
        } else {
            sql.SELECT("CHARACTER_SET_NAME");
        }
        sql.SELECT("DEFAULT_COLLATE_NAME");
        sql.SELECT("DESCRIPTION");
        sql.SELECT("MAXLEN");
        sql.FROM("CHARACTER_SETS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CharacterSets record = (CharacterSets) parameter.get("record");
        CharacterSetsExample example = (CharacterSetsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("CHARACTER_SETS");
        
        if (record.getCharacterSetName() != null) {
            sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultCollateName() != null) {
            sql.SET("DEFAULT_COLLATE_NAME = #{record.defaultCollateName,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxlen() != null) {
            sql.SET("MAXLEN = #{record.maxlen,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("CHARACTER_SETS");
        
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("DEFAULT_COLLATE_NAME = #{record.defaultCollateName,jdbcType=VARCHAR}");
        sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        sql.SET("MAXLEN = #{record.maxlen,jdbcType=BIGINT}");
        
        CharacterSetsExample example = (CharacterSetsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CharacterSetsExample example, boolean includeExamplePhrase) {
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