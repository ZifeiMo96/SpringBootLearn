package com.example.demo.data.dao;

import com.example.demo.data.model.TableStatistics;
import com.example.demo.data.model.TableStatisticsExample.Criteria;
import com.example.demo.data.model.TableStatisticsExample.Criterion;
import com.example.demo.data.model.TableStatisticsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TableStatisticsSqlProvider {
    public String countByExample(TableStatisticsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TABLE_STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TableStatisticsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TABLE_STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TableStatistics record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TABLE_STATISTICS");
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getRowsRead() != null) {
            sql.VALUES("ROWS_READ", "#{rowsRead,jdbcType=BIGINT}");
        }
        
        if (record.getRowsChanged() != null) {
            sql.VALUES("ROWS_CHANGED", "#{rowsChanged,jdbcType=BIGINT}");
        }
        
        if (record.getRowsChangedXIndexes() != null) {
            sql.VALUES("ROWS_CHANGED_X_INDEXES", "#{rowsChangedXIndexes,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TableStatisticsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_SCHEMA");
        } else {
            sql.SELECT("TABLE_SCHEMA");
        }
        sql.SELECT("TABLE_NAME");
        sql.SELECT("ROWS_READ");
        sql.SELECT("ROWS_CHANGED");
        sql.SELECT("ROWS_CHANGED_X_INDEXES");
        sql.FROM("TABLE_STATISTICS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TableStatistics record = (TableStatistics) parameter.get("record");
        TableStatisticsExample example = (TableStatisticsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TABLE_STATISTICS");
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getRowsRead() != null) {
            sql.SET("ROWS_READ = #{record.rowsRead,jdbcType=BIGINT}");
        }
        
        if (record.getRowsChanged() != null) {
            sql.SET("ROWS_CHANGED = #{record.rowsChanged,jdbcType=BIGINT}");
        }
        
        if (record.getRowsChangedXIndexes() != null) {
            sql.SET("ROWS_CHANGED_X_INDEXES = #{record.rowsChangedXIndexes,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TABLE_STATISTICS");
        
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("ROWS_READ = #{record.rowsRead,jdbcType=BIGINT}");
        sql.SET("ROWS_CHANGED = #{record.rowsChanged,jdbcType=BIGINT}");
        sql.SET("ROWS_CHANGED_X_INDEXES = #{record.rowsChangedXIndexes,jdbcType=BIGINT}");
        
        TableStatisticsExample example = (TableStatisticsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TableStatisticsExample example, boolean includeExamplePhrase) {
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