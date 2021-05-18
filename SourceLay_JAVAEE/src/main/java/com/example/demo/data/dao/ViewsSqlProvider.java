package com.example.demo.data.dao;

import com.example.demo.data.model.Views;
import com.example.demo.data.model.ViewsExample.Criteria;
import com.example.demo.data.model.ViewsExample.Criterion;
import com.example.demo.data.model.ViewsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ViewsSqlProvider {
    public String countByExample(ViewsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("VIEWS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ViewsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("VIEWS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Views record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("VIEWS");
        
        if (record.getTableCatalog() != null) {
            sql.VALUES("TABLE_CATALOG", "#{tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckOption() != null) {
            sql.VALUES("CHECK_OPTION", "#{checkOption,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUpdatable() != null) {
            sql.VALUES("IS_UPDATABLE", "#{isUpdatable,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.VALUES("DEFINER", "#{definer,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            sql.VALUES("SECURITY_TYPE", "#{securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.VALUES("CHARACTER_SET_CLIENT", "#{characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.VALUES("COLLATION_CONNECTION", "#{collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getAlgorithm() != null) {
            sql.VALUES("ALGORITHM", "#{algorithm,jdbcType=VARCHAR}");
        }
        
        if (record.getViewDefinition() != null) {
            sql.VALUES("VIEW_DEFINITION", "#{viewDefinition,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ViewsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("CHECK_OPTION");
        sql.SELECT("IS_UPDATABLE");
        sql.SELECT("DEFINER");
        sql.SELECT("SECURITY_TYPE");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("ALGORITHM");
        sql.SELECT("VIEW_DEFINITION");
        sql.FROM("VIEWS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ViewsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("CHECK_OPTION");
        sql.SELECT("IS_UPDATABLE");
        sql.SELECT("DEFINER");
        sql.SELECT("SECURITY_TYPE");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("ALGORITHM");
        sql.FROM("VIEWS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Views record = (Views) parameter.get("record");
        ViewsExample example = (ViewsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("VIEWS");
        
        if (record.getTableCatalog() != null) {
            sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckOption() != null) {
            sql.SET("CHECK_OPTION = #{record.checkOption,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUpdatable() != null) {
            sql.SET("IS_UPDATABLE = #{record.isUpdatable,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getAlgorithm() != null) {
            sql.SET("ALGORITHM = #{record.algorithm,jdbcType=VARCHAR}");
        }
        
        if (record.getViewDefinition() != null) {
            sql.SET("VIEW_DEFINITION = #{record.viewDefinition,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("VIEWS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("CHECK_OPTION = #{record.checkOption,jdbcType=VARCHAR}");
        sql.SET("IS_UPDATABLE = #{record.isUpdatable,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("ALGORITHM = #{record.algorithm,jdbcType=VARCHAR}");
        sql.SET("VIEW_DEFINITION = #{record.viewDefinition,jdbcType=LONGVARCHAR}");
        
        ViewsExample example = (ViewsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("VIEWS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("CHECK_OPTION = #{record.checkOption,jdbcType=VARCHAR}");
        sql.SET("IS_UPDATABLE = #{record.isUpdatable,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("ALGORITHM = #{record.algorithm,jdbcType=VARCHAR}");
        
        ViewsExample example = (ViewsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ViewsExample example, boolean includeExamplePhrase) {
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