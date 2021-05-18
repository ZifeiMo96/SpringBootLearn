package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysColumns;
import com.example.demo.data.model.InnodbSysColumnsExample.Criteria;
import com.example.demo.data.model.InnodbSysColumnsExample.Criterion;
import com.example.demo.data.model.InnodbSysColumnsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysColumnsSqlProvider {
    public String countByExample(InnodbSysColumnsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_COLUMNS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysColumnsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_COLUMNS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysColumns record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_COLUMNS");
        
        if (record.getTableId() != null) {
            sql.VALUES("TABLE_ID", "#{tableId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPos() != null) {
            sql.VALUES("POS", "#{pos,jdbcType=BIGINT}");
        }
        
        if (record.getMtype() != null) {
            sql.VALUES("MTYPE", "#{mtype,jdbcType=INTEGER}");
        }
        
        if (record.getPrtype() != null) {
            sql.VALUES("PRTYPE", "#{prtype,jdbcType=INTEGER}");
        }
        
        if (record.getLen() != null) {
            sql.VALUES("LEN", "#{len,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysColumnsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_ID");
        } else {
            sql.SELECT("TABLE_ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("POS");
        sql.SELECT("MTYPE");
        sql.SELECT("PRTYPE");
        sql.SELECT("LEN");
        sql.FROM("INNODB_SYS_COLUMNS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysColumns record = (InnodbSysColumns) parameter.get("record");
        InnodbSysColumnsExample example = (InnodbSysColumnsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_COLUMNS");
        
        if (record.getTableId() != null) {
            sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getPos() != null) {
            sql.SET("POS = #{record.pos,jdbcType=BIGINT}");
        }
        
        if (record.getMtype() != null) {
            sql.SET("MTYPE = #{record.mtype,jdbcType=INTEGER}");
        }
        
        if (record.getPrtype() != null) {
            sql.SET("PRTYPE = #{record.prtype,jdbcType=INTEGER}");
        }
        
        if (record.getLen() != null) {
            sql.SET("LEN = #{record.len,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_COLUMNS");
        
        sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("POS = #{record.pos,jdbcType=BIGINT}");
        sql.SET("MTYPE = #{record.mtype,jdbcType=INTEGER}");
        sql.SET("PRTYPE = #{record.prtype,jdbcType=INTEGER}");
        sql.SET("LEN = #{record.len,jdbcType=INTEGER}");
        
        InnodbSysColumnsExample example = (InnodbSysColumnsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysColumnsExample example, boolean includeExamplePhrase) {
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