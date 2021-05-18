package com.example.demo.data.dao;

import com.example.demo.data.model.SpatialRefSys;
import com.example.demo.data.model.SpatialRefSysExample.Criteria;
import com.example.demo.data.model.SpatialRefSysExample.Criterion;
import com.example.demo.data.model.SpatialRefSysExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SpatialRefSysSqlProvider {
    public String countByExample(SpatialRefSysExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("SPATIAL_REF_SYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SpatialRefSysExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("SPATIAL_REF_SYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SpatialRefSys record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("SPATIAL_REF_SYS");
        
        if (record.getSrid() != null) {
            sql.VALUES("SRID", "#{srid,jdbcType=SMALLINT}");
        }
        
        if (record.getAuthName() != null) {
            sql.VALUES("AUTH_NAME", "#{authName,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthSrid() != null) {
            sql.VALUES("AUTH_SRID", "#{authSrid,jdbcType=INTEGER}");
        }
        
        if (record.getSrtext() != null) {
            sql.VALUES("SRTEXT", "#{srtext,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SpatialRefSysExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SRID");
        } else {
            sql.SELECT("SRID");
        }
        sql.SELECT("AUTH_NAME");
        sql.SELECT("AUTH_SRID");
        sql.SELECT("SRTEXT");
        sql.FROM("SPATIAL_REF_SYS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SpatialRefSys record = (SpatialRefSys) parameter.get("record");
        SpatialRefSysExample example = (SpatialRefSysExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("SPATIAL_REF_SYS");
        
        if (record.getSrid() != null) {
            sql.SET("SRID = #{record.srid,jdbcType=SMALLINT}");
        }
        
        if (record.getAuthName() != null) {
            sql.SET("AUTH_NAME = #{record.authName,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthSrid() != null) {
            sql.SET("AUTH_SRID = #{record.authSrid,jdbcType=INTEGER}");
        }
        
        if (record.getSrtext() != null) {
            sql.SET("SRTEXT = #{record.srtext,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("SPATIAL_REF_SYS");
        
        sql.SET("SRID = #{record.srid,jdbcType=SMALLINT}");
        sql.SET("AUTH_NAME = #{record.authName,jdbcType=VARCHAR}");
        sql.SET("AUTH_SRID = #{record.authSrid,jdbcType=INTEGER}");
        sql.SET("SRTEXT = #{record.srtext,jdbcType=VARCHAR}");
        
        SpatialRefSysExample example = (SpatialRefSysExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SpatialRefSysExample example, boolean includeExamplePhrase) {
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