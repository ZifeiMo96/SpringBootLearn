package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysForeignCols;
import com.example.demo.data.model.InnodbSysForeignColsExample.Criteria;
import com.example.demo.data.model.InnodbSysForeignColsExample.Criterion;
import com.example.demo.data.model.InnodbSysForeignColsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysForeignColsSqlProvider {
    public String countByExample(InnodbSysForeignColsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_FOREIGN_COLS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysForeignColsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_FOREIGN_COLS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysForeignCols record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_FOREIGN_COLS");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getForColName() != null) {
            sql.VALUES("FOR_COL_NAME", "#{forColName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefColName() != null) {
            sql.VALUES("REF_COL_NAME", "#{refColName,jdbcType=VARCHAR}");
        }
        
        if (record.getPos() != null) {
            sql.VALUES("POS", "#{pos,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysForeignColsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("FOR_COL_NAME");
        sql.SELECT("REF_COL_NAME");
        sql.SELECT("POS");
        sql.FROM("INNODB_SYS_FOREIGN_COLS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysForeignCols record = (InnodbSysForeignCols) parameter.get("record");
        InnodbSysForeignColsExample example = (InnodbSysForeignColsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_FOREIGN_COLS");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getForColName() != null) {
            sql.SET("FOR_COL_NAME = #{record.forColName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefColName() != null) {
            sql.SET("REF_COL_NAME = #{record.refColName,jdbcType=VARCHAR}");
        }
        
        if (record.getPos() != null) {
            sql.SET("POS = #{record.pos,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_FOREIGN_COLS");
        
        sql.SET("ID = #{record.id,jdbcType=VARCHAR}");
        sql.SET("FOR_COL_NAME = #{record.forColName,jdbcType=VARCHAR}");
        sql.SET("REF_COL_NAME = #{record.refColName,jdbcType=VARCHAR}");
        sql.SET("POS = #{record.pos,jdbcType=INTEGER}");
        
        InnodbSysForeignColsExample example = (InnodbSysForeignColsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysForeignColsExample example, boolean includeExamplePhrase) {
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