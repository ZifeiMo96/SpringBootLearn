package com.example.demo.data.dao;

import com.example.demo.data.model.SystemVariables;
import com.example.demo.data.model.SystemVariablesExample.Criteria;
import com.example.demo.data.model.SystemVariablesExample.Criterion;
import com.example.demo.data.model.SystemVariablesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SystemVariablesSqlProvider {
    public String countByExample(SystemVariablesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("SYSTEM_VARIABLES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SystemVariablesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("SYSTEM_VARIABLES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SystemVariables record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("SYSTEM_VARIABLES");
        
        if (record.getVariableName() != null) {
            sql.VALUES("VARIABLE_NAME", "#{variableName,jdbcType=VARCHAR}");
        }
        
        if (record.getSessionValue() != null) {
            sql.VALUES("SESSION_VALUE", "#{sessionValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGlobalValue() != null) {
            sql.VALUES("GLOBAL_VALUE", "#{globalValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGlobalValueOrigin() != null) {
            sql.VALUES("GLOBAL_VALUE_ORIGIN", "#{globalValueOrigin,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultValue() != null) {
            sql.VALUES("DEFAULT_VALUE", "#{defaultValue,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableScope() != null) {
            sql.VALUES("VARIABLE_SCOPE", "#{variableScope,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableType() != null) {
            sql.VALUES("VARIABLE_TYPE", "#{variableType,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableComment() != null) {
            sql.VALUES("VARIABLE_COMMENT", "#{variableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericMinValue() != null) {
            sql.VALUES("NUMERIC_MIN_VALUE", "#{numericMinValue,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericMaxValue() != null) {
            sql.VALUES("NUMERIC_MAX_VALUE", "#{numericMaxValue,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericBlockSize() != null) {
            sql.VALUES("NUMERIC_BLOCK_SIZE", "#{numericBlockSize,jdbcType=VARCHAR}");
        }
        
        if (record.getReadOnly() != null) {
            sql.VALUES("READ_ONLY", "#{readOnly,jdbcType=VARCHAR}");
        }
        
        if (record.getCommandLineArgument() != null) {
            sql.VALUES("COMMAND_LINE_ARGUMENT", "#{commandLineArgument,jdbcType=VARCHAR}");
        }
        
        if (record.getEnumValueList() != null) {
            sql.VALUES("ENUM_VALUE_LIST", "#{enumValueList,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(SystemVariablesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("VARIABLE_NAME");
        } else {
            sql.SELECT("VARIABLE_NAME");
        }
        sql.SELECT("SESSION_VALUE");
        sql.SELECT("GLOBAL_VALUE");
        sql.SELECT("GLOBAL_VALUE_ORIGIN");
        sql.SELECT("DEFAULT_VALUE");
        sql.SELECT("VARIABLE_SCOPE");
        sql.SELECT("VARIABLE_TYPE");
        sql.SELECT("VARIABLE_COMMENT");
        sql.SELECT("NUMERIC_MIN_VALUE");
        sql.SELECT("NUMERIC_MAX_VALUE");
        sql.SELECT("NUMERIC_BLOCK_SIZE");
        sql.SELECT("READ_ONLY");
        sql.SELECT("COMMAND_LINE_ARGUMENT");
        sql.SELECT("ENUM_VALUE_LIST");
        sql.FROM("SYSTEM_VARIABLES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(SystemVariablesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("VARIABLE_NAME");
        } else {
            sql.SELECT("VARIABLE_NAME");
        }
        sql.SELECT("SESSION_VALUE");
        sql.SELECT("GLOBAL_VALUE");
        sql.SELECT("GLOBAL_VALUE_ORIGIN");
        sql.SELECT("DEFAULT_VALUE");
        sql.SELECT("VARIABLE_SCOPE");
        sql.SELECT("VARIABLE_TYPE");
        sql.SELECT("VARIABLE_COMMENT");
        sql.SELECT("NUMERIC_MIN_VALUE");
        sql.SELECT("NUMERIC_MAX_VALUE");
        sql.SELECT("NUMERIC_BLOCK_SIZE");
        sql.SELECT("READ_ONLY");
        sql.SELECT("COMMAND_LINE_ARGUMENT");
        sql.FROM("SYSTEM_VARIABLES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SystemVariables record = (SystemVariables) parameter.get("record");
        SystemVariablesExample example = (SystemVariablesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("SYSTEM_VARIABLES");
        
        if (record.getVariableName() != null) {
            sql.SET("VARIABLE_NAME = #{record.variableName,jdbcType=VARCHAR}");
        }
        
        if (record.getSessionValue() != null) {
            sql.SET("SESSION_VALUE = #{record.sessionValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGlobalValue() != null) {
            sql.SET("GLOBAL_VALUE = #{record.globalValue,jdbcType=VARCHAR}");
        }
        
        if (record.getGlobalValueOrigin() != null) {
            sql.SET("GLOBAL_VALUE_ORIGIN = #{record.globalValueOrigin,jdbcType=VARCHAR}");
        }
        
        if (record.getDefaultValue() != null) {
            sql.SET("DEFAULT_VALUE = #{record.defaultValue,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableScope() != null) {
            sql.SET("VARIABLE_SCOPE = #{record.variableScope,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableType() != null) {
            sql.SET("VARIABLE_TYPE = #{record.variableType,jdbcType=VARCHAR}");
        }
        
        if (record.getVariableComment() != null) {
            sql.SET("VARIABLE_COMMENT = #{record.variableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericMinValue() != null) {
            sql.SET("NUMERIC_MIN_VALUE = #{record.numericMinValue,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericMaxValue() != null) {
            sql.SET("NUMERIC_MAX_VALUE = #{record.numericMaxValue,jdbcType=VARCHAR}");
        }
        
        if (record.getNumericBlockSize() != null) {
            sql.SET("NUMERIC_BLOCK_SIZE = #{record.numericBlockSize,jdbcType=VARCHAR}");
        }
        
        if (record.getReadOnly() != null) {
            sql.SET("READ_ONLY = #{record.readOnly,jdbcType=VARCHAR}");
        }
        
        if (record.getCommandLineArgument() != null) {
            sql.SET("COMMAND_LINE_ARGUMENT = #{record.commandLineArgument,jdbcType=VARCHAR}");
        }
        
        if (record.getEnumValueList() != null) {
            sql.SET("ENUM_VALUE_LIST = #{record.enumValueList,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("SYSTEM_VARIABLES");
        
        sql.SET("VARIABLE_NAME = #{record.variableName,jdbcType=VARCHAR}");
        sql.SET("SESSION_VALUE = #{record.sessionValue,jdbcType=VARCHAR}");
        sql.SET("GLOBAL_VALUE = #{record.globalValue,jdbcType=VARCHAR}");
        sql.SET("GLOBAL_VALUE_ORIGIN = #{record.globalValueOrigin,jdbcType=VARCHAR}");
        sql.SET("DEFAULT_VALUE = #{record.defaultValue,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_SCOPE = #{record.variableScope,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_TYPE = #{record.variableType,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_COMMENT = #{record.variableComment,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_MIN_VALUE = #{record.numericMinValue,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_MAX_VALUE = #{record.numericMaxValue,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_BLOCK_SIZE = #{record.numericBlockSize,jdbcType=VARCHAR}");
        sql.SET("READ_ONLY = #{record.readOnly,jdbcType=VARCHAR}");
        sql.SET("COMMAND_LINE_ARGUMENT = #{record.commandLineArgument,jdbcType=VARCHAR}");
        sql.SET("ENUM_VALUE_LIST = #{record.enumValueList,jdbcType=LONGVARCHAR}");
        
        SystemVariablesExample example = (SystemVariablesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("SYSTEM_VARIABLES");
        
        sql.SET("VARIABLE_NAME = #{record.variableName,jdbcType=VARCHAR}");
        sql.SET("SESSION_VALUE = #{record.sessionValue,jdbcType=VARCHAR}");
        sql.SET("GLOBAL_VALUE = #{record.globalValue,jdbcType=VARCHAR}");
        sql.SET("GLOBAL_VALUE_ORIGIN = #{record.globalValueOrigin,jdbcType=VARCHAR}");
        sql.SET("DEFAULT_VALUE = #{record.defaultValue,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_SCOPE = #{record.variableScope,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_TYPE = #{record.variableType,jdbcType=VARCHAR}");
        sql.SET("VARIABLE_COMMENT = #{record.variableComment,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_MIN_VALUE = #{record.numericMinValue,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_MAX_VALUE = #{record.numericMaxValue,jdbcType=VARCHAR}");
        sql.SET("NUMERIC_BLOCK_SIZE = #{record.numericBlockSize,jdbcType=VARCHAR}");
        sql.SET("READ_ONLY = #{record.readOnly,jdbcType=VARCHAR}");
        sql.SET("COMMAND_LINE_ARGUMENT = #{record.commandLineArgument,jdbcType=VARCHAR}");
        
        SystemVariablesExample example = (SystemVariablesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SystemVariablesExample example, boolean includeExamplePhrase) {
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