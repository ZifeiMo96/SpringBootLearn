package com.example.demo.data.dao;

import com.example.demo.data.model.ColumnPrivileges;
import com.example.demo.data.model.ColumnPrivilegesExample.Criteria;
import com.example.demo.data.model.ColumnPrivilegesExample.Criterion;
import com.example.demo.data.model.ColumnPrivilegesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ColumnPrivilegesSqlProvider {
    public String countByExample(ColumnPrivilegesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("COLUMN_PRIVILEGES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ColumnPrivilegesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("COLUMN_PRIVILEGES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ColumnPrivileges record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("COLUMN_PRIVILEGES");
        
        if (record.getGrantee() != null) {
            sql.VALUES("GRANTEE", "#{grantee,jdbcType=VARCHAR}");
        }
        
        if (record.getTableCatalog() != null) {
            sql.VALUES("TABLE_CATALOG", "#{tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnName() != null) {
            sql.VALUES("COLUMN_NAME", "#{columnName,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivilegeType() != null) {
            sql.VALUES("PRIVILEGE_TYPE", "#{privilegeType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGrantable() != null) {
            sql.VALUES("IS_GRANTABLE", "#{isGrantable,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ColumnPrivilegesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("GRANTEE");
        } else {
            sql.SELECT("GRANTEE");
        }
        sql.SELECT("TABLE_CATALOG");
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("COLUMN_NAME");
        sql.SELECT("PRIVILEGE_TYPE");
        sql.SELECT("IS_GRANTABLE");
        sql.FROM("COLUMN_PRIVILEGES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ColumnPrivileges record = (ColumnPrivileges) parameter.get("record");
        ColumnPrivilegesExample example = (ColumnPrivilegesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("COLUMN_PRIVILEGES");
        
        if (record.getGrantee() != null) {
            sql.SET("GRANTEE = #{record.grantee,jdbcType=VARCHAR}");
        }
        
        if (record.getTableCatalog() != null) {
            sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnName() != null) {
            sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivilegeType() != null) {
            sql.SET("PRIVILEGE_TYPE = #{record.privilegeType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGrantable() != null) {
            sql.SET("IS_GRANTABLE = #{record.isGrantable,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("COLUMN_PRIVILEGES");
        
        sql.SET("GRANTEE = #{record.grantee,jdbcType=VARCHAR}");
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        sql.SET("PRIVILEGE_TYPE = #{record.privilegeType,jdbcType=VARCHAR}");
        sql.SET("IS_GRANTABLE = #{record.isGrantable,jdbcType=VARCHAR}");
        
        ColumnPrivilegesExample example = (ColumnPrivilegesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ColumnPrivilegesExample example, boolean includeExamplePhrase) {
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