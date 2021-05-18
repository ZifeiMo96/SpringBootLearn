package com.example.demo.data.dao;

import com.example.demo.data.model.ColumnsExample.Criteria;
import com.example.demo.data.model.ColumnsExample.Criterion;
import com.example.demo.data.model.ColumnsExample;
import com.example.demo.data.model.ColumnsWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ColumnsSqlProvider {
    public String countByExample(ColumnsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("COLUMNS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ColumnsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("COLUMNS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ColumnsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("COLUMNS");
        
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
        
        if (record.getIsNullable() != null) {
            sql.VALUES("IS_NULLABLE", "#{isNullable,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.VALUES("DATA_TYPE", "#{dataType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterMaximumLength() != null) {
            sql.VALUES("CHARACTER_MAXIMUM_LENGTH", "#{characterMaximumLength,jdbcType=BIGINT}");
        }
        
        if (record.getCharacterOctetLength() != null) {
            sql.VALUES("CHARACTER_OCTET_LENGTH", "#{characterOctetLength,jdbcType=BIGINT}");
        }
        
        if (record.getNumericPrecision() != null) {
            sql.VALUES("NUMERIC_PRECISION", "#{numericPrecision,jdbcType=BIGINT}");
        }
        
        if (record.getNumericScale() != null) {
            sql.VALUES("NUMERIC_SCALE", "#{numericScale,jdbcType=BIGINT}");
        }
        
        if (record.getDatetimePrecision() != null) {
            sql.VALUES("DATETIME_PRECISION", "#{datetimePrecision,jdbcType=BIGINT}");
        }
        
        if (record.getCharacterSetName() != null) {
            sql.VALUES("CHARACTER_SET_NAME", "#{characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationName() != null) {
            sql.VALUES("COLLATION_NAME", "#{collationName,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnKey() != null) {
            sql.VALUES("COLUMN_KEY", "#{columnKey,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra() != null) {
            sql.VALUES("EXTRA", "#{extra,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivileges() != null) {
            sql.VALUES("PRIVILEGES", "#{privileges,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnComment() != null) {
            sql.VALUES("COLUMN_COMMENT", "#{columnComment,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGenerated() != null) {
            sql.VALUES("IS_GENERATED", "#{isGenerated,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnDefault() != null) {
            sql.VALUES("COLUMN_DEFAULT", "#{columnDefault,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getColumnType() != null) {
            sql.VALUES("COLUMN_TYPE", "#{columnType,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGenerationExpression() != null) {
            sql.VALUES("GENERATION_EXPRESSION", "#{generationExpression,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ColumnsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("COLUMN_NAME");
        sql.SELECT("ORDINAL_POSITION");
        sql.SELECT("IS_NULLABLE");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("COLUMN_KEY");
        sql.SELECT("EXTRA");
        sql.SELECT("PRIVILEGES");
        sql.SELECT("COLUMN_COMMENT");
        sql.SELECT("IS_GENERATED");
        sql.SELECT("COLUMN_DEFAULT");
        sql.SELECT("COLUMN_TYPE");
        sql.SELECT("GENERATION_EXPRESSION");
        sql.FROM("COLUMNS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ColumnsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("COLUMN_NAME");
        sql.SELECT("ORDINAL_POSITION");
        sql.SELECT("IS_NULLABLE");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("COLUMN_KEY");
        sql.SELECT("EXTRA");
        sql.SELECT("PRIVILEGES");
        sql.SELECT("COLUMN_COMMENT");
        sql.SELECT("IS_GENERATED");
        sql.FROM("COLUMNS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ColumnsWithBLOBs record = (ColumnsWithBLOBs) parameter.get("record");
        ColumnsExample example = (ColumnsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("COLUMNS");
        
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
        
        if (record.getIsNullable() != null) {
            sql.SET("IS_NULLABLE = #{record.isNullable,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterMaximumLength() != null) {
            sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=BIGINT}");
        }
        
        if (record.getCharacterOctetLength() != null) {
            sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=BIGINT}");
        }
        
        if (record.getNumericPrecision() != null) {
            sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=BIGINT}");
        }
        
        if (record.getNumericScale() != null) {
            sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=BIGINT}");
        }
        
        if (record.getDatetimePrecision() != null) {
            sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        }
        
        if (record.getCharacterSetName() != null) {
            sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationName() != null) {
            sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnKey() != null) {
            sql.SET("COLUMN_KEY = #{record.columnKey,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra() != null) {
            sql.SET("EXTRA = #{record.extra,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivileges() != null) {
            sql.SET("PRIVILEGES = #{record.privileges,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnComment() != null) {
            sql.SET("COLUMN_COMMENT = #{record.columnComment,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGenerated() != null) {
            sql.SET("IS_GENERATED = #{record.isGenerated,jdbcType=VARCHAR}");
        }
        
        if (record.getColumnDefault() != null) {
            sql.SET("COLUMN_DEFAULT = #{record.columnDefault,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getColumnType() != null) {
            sql.SET("COLUMN_TYPE = #{record.columnType,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGenerationExpression() != null) {
            sql.SET("GENERATION_EXPRESSION = #{record.generationExpression,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("COLUMNS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=BIGINT}");
        sql.SET("IS_NULLABLE = #{record.isNullable,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=BIGINT}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=BIGINT}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=BIGINT}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=BIGINT}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_KEY = #{record.columnKey,jdbcType=VARCHAR}");
        sql.SET("EXTRA = #{record.extra,jdbcType=VARCHAR}");
        sql.SET("PRIVILEGES = #{record.privileges,jdbcType=VARCHAR}");
        sql.SET("COLUMN_COMMENT = #{record.columnComment,jdbcType=VARCHAR}");
        sql.SET("IS_GENERATED = #{record.isGenerated,jdbcType=VARCHAR}");
        sql.SET("COLUMN_DEFAULT = #{record.columnDefault,jdbcType=LONGVARCHAR}");
        sql.SET("COLUMN_TYPE = #{record.columnType,jdbcType=LONGVARCHAR}");
        sql.SET("GENERATION_EXPRESSION = #{record.generationExpression,jdbcType=LONGVARCHAR}");
        
        ColumnsExample example = (ColumnsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("COLUMNS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=BIGINT}");
        sql.SET("IS_NULLABLE = #{record.isNullable,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=BIGINT}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=BIGINT}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=BIGINT}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=BIGINT}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("COLUMN_KEY = #{record.columnKey,jdbcType=VARCHAR}");
        sql.SET("EXTRA = #{record.extra,jdbcType=VARCHAR}");
        sql.SET("PRIVILEGES = #{record.privileges,jdbcType=VARCHAR}");
        sql.SET("COLUMN_COMMENT = #{record.columnComment,jdbcType=VARCHAR}");
        sql.SET("IS_GENERATED = #{record.isGenerated,jdbcType=VARCHAR}");
        
        ColumnsExample example = (ColumnsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ColumnsExample example, boolean includeExamplePhrase) {
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