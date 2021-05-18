package com.example.demo.data.dao;

import com.example.demo.data.model.KeyColumnUsage;
import com.example.demo.data.model.KeyColumnUsageExample.Criteria;
import com.example.demo.data.model.KeyColumnUsageExample.Criterion;
import com.example.demo.data.model.KeyColumnUsageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class KeyColumnUsageSqlProvider {
    public String countByExample(KeyColumnUsageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEY_COLUMN_USAGE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(KeyColumnUsageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEY_COLUMN_USAGE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(KeyColumnUsage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEY_COLUMN_USAGE");
        
        if (record.getConstraintCatalog() != null) {
            sql.VALUES("CONSTRAINT_CATALOG", "#{constraintCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getConstraintSchema() != null) {
            sql.VALUES("CONSTRAINT_SCHEMA", "#{constraintSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getConstraintName() != null) {
            sql.VALUES("CONSTRAINT_NAME", "#{constraintName,jdbcType=VARCHAR}");
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
        
        if (record.getOrdinalPosition() != null) {
            sql.VALUES("ORDINAL_POSITION", "#{ordinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getPositionInUniqueConstraint() != null) {
            sql.VALUES("POSITION_IN_UNIQUE_CONSTRAINT", "#{positionInUniqueConstraint,jdbcType=BIGINT}");
        }
        
        if (record.getReferencedTableSchema() != null) {
            sql.VALUES("REFERENCED_TABLE_SCHEMA", "#{referencedTableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getReferencedTableName() != null) {
            sql.VALUES("REFERENCED_TABLE_NAME", "#{referencedTableName,jdbcType=VARCHAR}");
        }
        
        if (record.getReferencedColumnName() != null) {
            sql.VALUES("REFERENCED_COLUMN_NAME", "#{referencedColumnName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(KeyColumnUsageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CONSTRAINT_CATALOG");
        } else {
            sql.SELECT("CONSTRAINT_CATALOG");
        }
        sql.SELECT("CONSTRAINT_SCHEMA");
        sql.SELECT("CONSTRAINT_NAME");
        sql.SELECT("TABLE_CATALOG");
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("COLUMN_NAME");
        sql.SELECT("ORDINAL_POSITION");
        sql.SELECT("POSITION_IN_UNIQUE_CONSTRAINT");
        sql.SELECT("REFERENCED_TABLE_SCHEMA");
        sql.SELECT("REFERENCED_TABLE_NAME");
        sql.SELECT("REFERENCED_COLUMN_NAME");
        sql.FROM("KEY_COLUMN_USAGE");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        KeyColumnUsage record = (KeyColumnUsage) parameter.get("record");
        KeyColumnUsageExample example = (KeyColumnUsageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEY_COLUMN_USAGE");
        
        if (record.getConstraintCatalog() != null) {
            sql.SET("CONSTRAINT_CATALOG = #{record.constraintCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getConstraintSchema() != null) {
            sql.SET("CONSTRAINT_SCHEMA = #{record.constraintSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getConstraintName() != null) {
            sql.SET("CONSTRAINT_NAME = #{record.constraintName,jdbcType=VARCHAR}");
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
        
        if (record.getOrdinalPosition() != null) {
            sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getPositionInUniqueConstraint() != null) {
            sql.SET("POSITION_IN_UNIQUE_CONSTRAINT = #{record.positionInUniqueConstraint,jdbcType=BIGINT}");
        }
        
        if (record.getReferencedTableSchema() != null) {
            sql.SET("REFERENCED_TABLE_SCHEMA = #{record.referencedTableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getReferencedTableName() != null) {
            sql.SET("REFERENCED_TABLE_NAME = #{record.referencedTableName,jdbcType=VARCHAR}");
        }
        
        if (record.getReferencedColumnName() != null) {
            sql.SET("REFERENCED_COLUMN_NAME = #{record.referencedColumnName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("KEY_COLUMN_USAGE");
        
        sql.SET("CONSTRAINT_CATALOG = #{record.constraintCatalog,jdbcType=VARCHAR}");
        sql.SET("CONSTRAINT_SCHEMA = #{record.constraintSchema,jdbcType=VARCHAR}");
        sql.SET("CONSTRAINT_NAME = #{record.constraintName,jdbcType=VARCHAR}");
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=BIGINT}");
        sql.SET("POSITION_IN_UNIQUE_CONSTRAINT = #{record.positionInUniqueConstraint,jdbcType=BIGINT}");
        sql.SET("REFERENCED_TABLE_SCHEMA = #{record.referencedTableSchema,jdbcType=VARCHAR}");
        sql.SET("REFERENCED_TABLE_NAME = #{record.referencedTableName,jdbcType=VARCHAR}");
        sql.SET("REFERENCED_COLUMN_NAME = #{record.referencedColumnName,jdbcType=VARCHAR}");
        
        KeyColumnUsageExample example = (KeyColumnUsageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, KeyColumnUsageExample example, boolean includeExamplePhrase) {
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