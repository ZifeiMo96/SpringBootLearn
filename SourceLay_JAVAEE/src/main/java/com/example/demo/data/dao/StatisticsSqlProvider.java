package com.example.demo.data.dao;

import com.example.demo.data.model.Statistics;
import com.example.demo.data.model.StatisticsExample.Criteria;
import com.example.demo.data.model.StatisticsExample.Criterion;
import com.example.demo.data.model.StatisticsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class StatisticsSqlProvider {
    public String countByExample(StatisticsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(StatisticsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("STATISTICS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Statistics record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("STATISTICS");
        
        if (record.getTableCatalog() != null) {
            sql.VALUES("TABLE_CATALOG", "#{tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getNonUnique() != null) {
            sql.VALUES("NON_UNIQUE", "#{nonUnique,jdbcType=BIGINT}");
        }
        
        if (record.getIndexSchema() != null) {
            sql.VALUES("INDEX_SCHEMA", "#{indexSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexName() != null) {
            sql.VALUES("INDEX_NAME", "#{indexName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqInIndex() != null) {
            sql.VALUES("SEQ_IN_INDEX", "#{seqInIndex,jdbcType=BIGINT}");
        }
        
        if (record.getColumnName() != null) {
            sql.VALUES("COLUMN_NAME", "#{columnName,jdbcType=VARCHAR}");
        }
        
        if (record.getCollation() != null) {
            sql.VALUES("COLLATION", "#{collation,jdbcType=VARCHAR}");
        }
        
        if (record.getCardinality() != null) {
            sql.VALUES("CARDINALITY", "#{cardinality,jdbcType=BIGINT}");
        }
        
        if (record.getSubPart() != null) {
            sql.VALUES("SUB_PART", "#{subPart,jdbcType=BIGINT}");
        }
        
        if (record.getPacked() != null) {
            sql.VALUES("PACKED", "#{packed,jdbcType=VARCHAR}");
        }
        
        if (record.getNullable() != null) {
            sql.VALUES("NULLABLE", "#{nullable,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexType() != null) {
            sql.VALUES("INDEX_TYPE", "#{indexType,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("COMMENT", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexComment() != null) {
            sql.VALUES("INDEX_COMMENT", "#{indexComment,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(StatisticsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("NON_UNIQUE");
        sql.SELECT("INDEX_SCHEMA");
        sql.SELECT("INDEX_NAME");
        sql.SELECT("SEQ_IN_INDEX");
        sql.SELECT("COLUMN_NAME");
        sql.SELECT("COLLATION");
        sql.SELECT("CARDINALITY");
        sql.SELECT("SUB_PART");
        sql.SELECT("PACKED");
        sql.SELECT("NULLABLE");
        sql.SELECT("INDEX_TYPE");
        sql.SELECT("COMMENT");
        sql.SELECT("INDEX_COMMENT");
        sql.FROM("STATISTICS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Statistics record = (Statistics) parameter.get("record");
        StatisticsExample example = (StatisticsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("STATISTICS");
        
        if (record.getTableCatalog() != null) {
            sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getNonUnique() != null) {
            sql.SET("NON_UNIQUE = #{record.nonUnique,jdbcType=BIGINT}");
        }
        
        if (record.getIndexSchema() != null) {
            sql.SET("INDEX_SCHEMA = #{record.indexSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexName() != null) {
            sql.SET("INDEX_NAME = #{record.indexName,jdbcType=VARCHAR}");
        }
        
        if (record.getSeqInIndex() != null) {
            sql.SET("SEQ_IN_INDEX = #{record.seqInIndex,jdbcType=BIGINT}");
        }
        
        if (record.getColumnName() != null) {
            sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        }
        
        if (record.getCollation() != null) {
            sql.SET("COLLATION = #{record.collation,jdbcType=VARCHAR}");
        }
        
        if (record.getCardinality() != null) {
            sql.SET("CARDINALITY = #{record.cardinality,jdbcType=BIGINT}");
        }
        
        if (record.getSubPart() != null) {
            sql.SET("SUB_PART = #{record.subPart,jdbcType=BIGINT}");
        }
        
        if (record.getPacked() != null) {
            sql.SET("PACKED = #{record.packed,jdbcType=VARCHAR}");
        }
        
        if (record.getNullable() != null) {
            sql.SET("NULLABLE = #{record.nullable,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexType() != null) {
            sql.SET("INDEX_TYPE = #{record.indexType,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexComment() != null) {
            sql.SET("INDEX_COMMENT = #{record.indexComment,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("STATISTICS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("NON_UNIQUE = #{record.nonUnique,jdbcType=BIGINT}");
        sql.SET("INDEX_SCHEMA = #{record.indexSchema,jdbcType=VARCHAR}");
        sql.SET("INDEX_NAME = #{record.indexName,jdbcType=VARCHAR}");
        sql.SET("SEQ_IN_INDEX = #{record.seqInIndex,jdbcType=BIGINT}");
        sql.SET("COLUMN_NAME = #{record.columnName,jdbcType=VARCHAR}");
        sql.SET("COLLATION = #{record.collation,jdbcType=VARCHAR}");
        sql.SET("CARDINALITY = #{record.cardinality,jdbcType=BIGINT}");
        sql.SET("SUB_PART = #{record.subPart,jdbcType=BIGINT}");
        sql.SET("PACKED = #{record.packed,jdbcType=VARCHAR}");
        sql.SET("NULLABLE = #{record.nullable,jdbcType=VARCHAR}");
        sql.SET("INDEX_TYPE = #{record.indexType,jdbcType=VARCHAR}");
        sql.SET("COMMENT = #{record.comment,jdbcType=VARCHAR}");
        sql.SET("INDEX_COMMENT = #{record.indexComment,jdbcType=VARCHAR}");
        
        StatisticsExample example = (StatisticsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, StatisticsExample example, boolean includeExamplePhrase) {
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