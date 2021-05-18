package com.example.demo.data.dao;

import com.example.demo.data.model.Parameters;
import com.example.demo.data.model.ParametersExample.Criteria;
import com.example.demo.data.model.ParametersExample.Criterion;
import com.example.demo.data.model.ParametersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ParametersSqlProvider {
    public String countByExample(ParametersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PARAMETERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ParametersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PARAMETERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Parameters record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PARAMETERS");
        
        if (record.getSpecificCatalog() != null) {
            sql.VALUES("SPECIFIC_CATALOG", "#{specificCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getSpecificSchema() != null) {
            sql.VALUES("SPECIFIC_SCHEMA", "#{specificSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getSpecificName() != null) {
            sql.VALUES("SPECIFIC_NAME", "#{specificName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrdinalPosition() != null) {
            sql.VALUES("ORDINAL_POSITION", "#{ordinalPosition,jdbcType=INTEGER}");
        }
        
        if (record.getParameterMode() != null) {
            sql.VALUES("PARAMETER_MODE", "#{parameterMode,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterName() != null) {
            sql.VALUES("PARAMETER_NAME", "#{parameterName,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.VALUES("DATA_TYPE", "#{dataType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterMaximumLength() != null) {
            sql.VALUES("CHARACTER_MAXIMUM_LENGTH", "#{characterMaximumLength,jdbcType=INTEGER}");
        }
        
        if (record.getCharacterOctetLength() != null) {
            sql.VALUES("CHARACTER_OCTET_LENGTH", "#{characterOctetLength,jdbcType=INTEGER}");
        }
        
        if (record.getNumericPrecision() != null) {
            sql.VALUES("NUMERIC_PRECISION", "#{numericPrecision,jdbcType=INTEGER}");
        }
        
        if (record.getNumericScale() != null) {
            sql.VALUES("NUMERIC_SCALE", "#{numericScale,jdbcType=INTEGER}");
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
        
        if (record.getRoutineType() != null) {
            sql.VALUES("ROUTINE_TYPE", "#{routineType,jdbcType=VARCHAR}");
        }
        
        if (record.getDtdIdentifier() != null) {
            sql.VALUES("DTD_IDENTIFIER", "#{dtdIdentifier,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ParametersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPECIFIC_CATALOG");
        } else {
            sql.SELECT("SPECIFIC_CATALOG");
        }
        sql.SELECT("SPECIFIC_SCHEMA");
        sql.SELECT("SPECIFIC_NAME");
        sql.SELECT("ORDINAL_POSITION");
        sql.SELECT("PARAMETER_MODE");
        sql.SELECT("PARAMETER_NAME");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("ROUTINE_TYPE");
        sql.SELECT("DTD_IDENTIFIER");
        sql.FROM("PARAMETERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ParametersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPECIFIC_CATALOG");
        } else {
            sql.SELECT("SPECIFIC_CATALOG");
        }
        sql.SELECT("SPECIFIC_SCHEMA");
        sql.SELECT("SPECIFIC_NAME");
        sql.SELECT("ORDINAL_POSITION");
        sql.SELECT("PARAMETER_MODE");
        sql.SELECT("PARAMETER_NAME");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("ROUTINE_TYPE");
        sql.FROM("PARAMETERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Parameters record = (Parameters) parameter.get("record");
        ParametersExample example = (ParametersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PARAMETERS");
        
        if (record.getSpecificCatalog() != null) {
            sql.SET("SPECIFIC_CATALOG = #{record.specificCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getSpecificSchema() != null) {
            sql.SET("SPECIFIC_SCHEMA = #{record.specificSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getSpecificName() != null) {
            sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrdinalPosition() != null) {
            sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=INTEGER}");
        }
        
        if (record.getParameterMode() != null) {
            sql.SET("PARAMETER_MODE = #{record.parameterMode,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterName() != null) {
            sql.SET("PARAMETER_NAME = #{record.parameterName,jdbcType=VARCHAR}");
        }
        
        if (record.getDataType() != null) {
            sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterMaximumLength() != null) {
            sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=INTEGER}");
        }
        
        if (record.getCharacterOctetLength() != null) {
            sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=INTEGER}");
        }
        
        if (record.getNumericPrecision() != null) {
            sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=INTEGER}");
        }
        
        if (record.getNumericScale() != null) {
            sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=INTEGER}");
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
        
        if (record.getRoutineType() != null) {
            sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
        }
        
        if (record.getDtdIdentifier() != null) {
            sql.SET("DTD_IDENTIFIER = #{record.dtdIdentifier,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PARAMETERS");
        
        sql.SET("SPECIFIC_CATALOG = #{record.specificCatalog,jdbcType=VARCHAR}");
        sql.SET("SPECIFIC_SCHEMA = #{record.specificSchema,jdbcType=VARCHAR}");
        sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=INTEGER}");
        sql.SET("PARAMETER_MODE = #{record.parameterMode,jdbcType=VARCHAR}");
        sql.SET("PARAMETER_NAME = #{record.parameterName,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=INTEGER}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=INTEGER}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=INTEGER}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=INTEGER}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
        sql.SET("DTD_IDENTIFIER = #{record.dtdIdentifier,jdbcType=LONGVARCHAR}");
        
        ParametersExample example = (ParametersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PARAMETERS");
        
        sql.SET("SPECIFIC_CATALOG = #{record.specificCatalog,jdbcType=VARCHAR}");
        sql.SET("SPECIFIC_SCHEMA = #{record.specificSchema,jdbcType=VARCHAR}");
        sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        sql.SET("ORDINAL_POSITION = #{record.ordinalPosition,jdbcType=INTEGER}");
        sql.SET("PARAMETER_MODE = #{record.parameterMode,jdbcType=VARCHAR}");
        sql.SET("PARAMETER_NAME = #{record.parameterName,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=INTEGER}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=INTEGER}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=INTEGER}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=INTEGER}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
        
        ParametersExample example = (ParametersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ParametersExample example, boolean includeExamplePhrase) {
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