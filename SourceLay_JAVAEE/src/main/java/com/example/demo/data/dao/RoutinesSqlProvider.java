package com.example.demo.data.dao;

import com.example.demo.data.model.RoutinesExample.Criteria;
import com.example.demo.data.model.RoutinesExample.Criterion;
import com.example.demo.data.model.RoutinesExample;
import com.example.demo.data.model.RoutinesWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RoutinesSqlProvider {
    public String countByExample(RoutinesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("ROUTINES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RoutinesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("ROUTINES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RoutinesWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ROUTINES");
        
        if (record.getSpecificName() != null) {
            sql.VALUES("SPECIFIC_NAME", "#{specificName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineCatalog() != null) {
            sql.VALUES("ROUTINE_CATALOG", "#{routineCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineSchema() != null) {
            sql.VALUES("ROUTINE_SCHEMA", "#{routineSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineName() != null) {
            sql.VALUES("ROUTINE_NAME", "#{routineName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineType() != null) {
            sql.VALUES("ROUTINE_TYPE", "#{routineType,jdbcType=VARCHAR}");
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
        
        if (record.getRoutineBody() != null) {
            sql.VALUES("ROUTINE_BODY", "#{routineBody,jdbcType=VARCHAR}");
        }
        
        if (record.getExternalName() != null) {
            sql.VALUES("EXTERNAL_NAME", "#{externalName,jdbcType=VARCHAR}");
        }
        
        if (record.getExternalLanguage() != null) {
            sql.VALUES("EXTERNAL_LANGUAGE", "#{externalLanguage,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterStyle() != null) {
            sql.VALUES("PARAMETER_STYLE", "#{parameterStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeterministic() != null) {
            sql.VALUES("IS_DETERMINISTIC", "#{isDeterministic,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlDataAccess() != null) {
            sql.VALUES("SQL_DATA_ACCESS", "#{sqlDataAccess,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlPath() != null) {
            sql.VALUES("SQL_PATH", "#{sqlPath,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            sql.VALUES("SECURITY_TYPE", "#{securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.VALUES("CREATED", "#{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAltered() != null) {
            sql.VALUES("LAST_ALTERED", "#{lastAltered,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSqlMode() != null) {
            sql.VALUES("SQL_MODE", "#{sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.VALUES("DEFINER", "#{definer,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.VALUES("CHARACTER_SET_CLIENT", "#{characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.VALUES("COLLATION_CONNECTION", "#{collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getDatabaseCollation() != null) {
            sql.VALUES("DATABASE_COLLATION", "#{databaseCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getDtdIdentifier() != null) {
            sql.VALUES("DTD_IDENTIFIER", "#{dtdIdentifier,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRoutineDefinition() != null) {
            sql.VALUES("ROUTINE_DEFINITION", "#{routineDefinition,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRoutineComment() != null) {
            sql.VALUES("ROUTINE_COMMENT", "#{routineComment,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(RoutinesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPECIFIC_NAME");
        } else {
            sql.SELECT("SPECIFIC_NAME");
        }
        sql.SELECT("ROUTINE_CATALOG");
        sql.SELECT("ROUTINE_SCHEMA");
        sql.SELECT("ROUTINE_NAME");
        sql.SELECT("ROUTINE_TYPE");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("ROUTINE_BODY");
        sql.SELECT("EXTERNAL_NAME");
        sql.SELECT("EXTERNAL_LANGUAGE");
        sql.SELECT("PARAMETER_STYLE");
        sql.SELECT("IS_DETERMINISTIC");
        sql.SELECT("SQL_DATA_ACCESS");
        sql.SELECT("SQL_PATH");
        sql.SELECT("SECURITY_TYPE");
        sql.SELECT("CREATED");
        sql.SELECT("LAST_ALTERED");
        sql.SELECT("SQL_MODE");
        sql.SELECT("DEFINER");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.SELECT("DTD_IDENTIFIER");
        sql.SELECT("ROUTINE_DEFINITION");
        sql.SELECT("ROUTINE_COMMENT");
        sql.FROM("ROUTINES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(RoutinesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPECIFIC_NAME");
        } else {
            sql.SELECT("SPECIFIC_NAME");
        }
        sql.SELECT("ROUTINE_CATALOG");
        sql.SELECT("ROUTINE_SCHEMA");
        sql.SELECT("ROUTINE_NAME");
        sql.SELECT("ROUTINE_TYPE");
        sql.SELECT("DATA_TYPE");
        sql.SELECT("CHARACTER_MAXIMUM_LENGTH");
        sql.SELECT("CHARACTER_OCTET_LENGTH");
        sql.SELECT("NUMERIC_PRECISION");
        sql.SELECT("NUMERIC_SCALE");
        sql.SELECT("DATETIME_PRECISION");
        sql.SELECT("CHARACTER_SET_NAME");
        sql.SELECT("COLLATION_NAME");
        sql.SELECT("ROUTINE_BODY");
        sql.SELECT("EXTERNAL_NAME");
        sql.SELECT("EXTERNAL_LANGUAGE");
        sql.SELECT("PARAMETER_STYLE");
        sql.SELECT("IS_DETERMINISTIC");
        sql.SELECT("SQL_DATA_ACCESS");
        sql.SELECT("SQL_PATH");
        sql.SELECT("SECURITY_TYPE");
        sql.SELECT("CREATED");
        sql.SELECT("LAST_ALTERED");
        sql.SELECT("SQL_MODE");
        sql.SELECT("DEFINER");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.FROM("ROUTINES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RoutinesWithBLOBs record = (RoutinesWithBLOBs) parameter.get("record");
        RoutinesExample example = (RoutinesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("ROUTINES");
        
        if (record.getSpecificName() != null) {
            sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineCatalog() != null) {
            sql.SET("ROUTINE_CATALOG = #{record.routineCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineSchema() != null) {
            sql.SET("ROUTINE_SCHEMA = #{record.routineSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineName() != null) {
            sql.SET("ROUTINE_NAME = #{record.routineName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoutineType() != null) {
            sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
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
        
        if (record.getRoutineBody() != null) {
            sql.SET("ROUTINE_BODY = #{record.routineBody,jdbcType=VARCHAR}");
        }
        
        if (record.getExternalName() != null) {
            sql.SET("EXTERNAL_NAME = #{record.externalName,jdbcType=VARCHAR}");
        }
        
        if (record.getExternalLanguage() != null) {
            sql.SET("EXTERNAL_LANGUAGE = #{record.externalLanguage,jdbcType=VARCHAR}");
        }
        
        if (record.getParameterStyle() != null) {
            sql.SET("PARAMETER_STYLE = #{record.parameterStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeterministic() != null) {
            sql.SET("IS_DETERMINISTIC = #{record.isDeterministic,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlDataAccess() != null) {
            sql.SET("SQL_DATA_ACCESS = #{record.sqlDataAccess,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlPath() != null) {
            sql.SET("SQL_PATH = #{record.sqlPath,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAltered() != null) {
            sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSqlMode() != null) {
            sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getDatabaseCollation() != null) {
            sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getDtdIdentifier() != null) {
            sql.SET("DTD_IDENTIFIER = #{record.dtdIdentifier,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRoutineDefinition() != null) {
            sql.SET("ROUTINE_DEFINITION = #{record.routineDefinition,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getRoutineComment() != null) {
            sql.SET("ROUTINE_COMMENT = #{record.routineComment,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ROUTINES");
        
        sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_CATALOG = #{record.routineCatalog,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_SCHEMA = #{record.routineSchema,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_NAME = #{record.routineName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=INTEGER}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=INTEGER}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=INTEGER}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=INTEGER}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_BODY = #{record.routineBody,jdbcType=VARCHAR}");
        sql.SET("EXTERNAL_NAME = #{record.externalName,jdbcType=VARCHAR}");
        sql.SET("EXTERNAL_LANGUAGE = #{record.externalLanguage,jdbcType=VARCHAR}");
        sql.SET("PARAMETER_STYLE = #{record.parameterStyle,jdbcType=VARCHAR}");
        sql.SET("IS_DETERMINISTIC = #{record.isDeterministic,jdbcType=VARCHAR}");
        sql.SET("SQL_DATA_ACCESS = #{record.sqlDataAccess,jdbcType=VARCHAR}");
        sql.SET("SQL_PATH = #{record.sqlPath,jdbcType=VARCHAR}");
        sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        sql.SET("DTD_IDENTIFIER = #{record.dtdIdentifier,jdbcType=LONGVARCHAR}");
        sql.SET("ROUTINE_DEFINITION = #{record.routineDefinition,jdbcType=LONGVARCHAR}");
        sql.SET("ROUTINE_COMMENT = #{record.routineComment,jdbcType=LONGVARCHAR}");
        
        RoutinesExample example = (RoutinesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("ROUTINES");
        
        sql.SET("SPECIFIC_NAME = #{record.specificName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_CATALOG = #{record.routineCatalog,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_SCHEMA = #{record.routineSchema,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_NAME = #{record.routineName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_TYPE = #{record.routineType,jdbcType=VARCHAR}");
        sql.SET("DATA_TYPE = #{record.dataType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_MAXIMUM_LENGTH = #{record.characterMaximumLength,jdbcType=INTEGER}");
        sql.SET("CHARACTER_OCTET_LENGTH = #{record.characterOctetLength,jdbcType=INTEGER}");
        sql.SET("NUMERIC_PRECISION = #{record.numericPrecision,jdbcType=INTEGER}");
        sql.SET("NUMERIC_SCALE = #{record.numericScale,jdbcType=INTEGER}");
        sql.SET("DATETIME_PRECISION = #{record.datetimePrecision,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_NAME = #{record.characterSetName,jdbcType=VARCHAR}");
        sql.SET("COLLATION_NAME = #{record.collationName,jdbcType=VARCHAR}");
        sql.SET("ROUTINE_BODY = #{record.routineBody,jdbcType=VARCHAR}");
        sql.SET("EXTERNAL_NAME = #{record.externalName,jdbcType=VARCHAR}");
        sql.SET("EXTERNAL_LANGUAGE = #{record.externalLanguage,jdbcType=VARCHAR}");
        sql.SET("PARAMETER_STYLE = #{record.parameterStyle,jdbcType=VARCHAR}");
        sql.SET("IS_DETERMINISTIC = #{record.isDeterministic,jdbcType=VARCHAR}");
        sql.SET("SQL_DATA_ACCESS = #{record.sqlDataAccess,jdbcType=VARCHAR}");
        sql.SET("SQL_PATH = #{record.sqlPath,jdbcType=VARCHAR}");
        sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        
        RoutinesExample example = (RoutinesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RoutinesExample example, boolean includeExamplePhrase) {
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