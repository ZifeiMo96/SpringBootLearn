package com.example.demo.data.dao;

import com.example.demo.data.model.PartitionsExample.Criteria;
import com.example.demo.data.model.PartitionsExample.Criterion;
import com.example.demo.data.model.PartitionsExample;
import com.example.demo.data.model.PartitionsWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PartitionsSqlProvider {
    public String countByExample(PartitionsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PARTITIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PartitionsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PARTITIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PartitionsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PARTITIONS");
        
        if (record.getTableCatalog() != null) {
            sql.VALUES("TABLE_CATALOG", "#{tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionName() != null) {
            sql.VALUES("PARTITION_NAME", "#{partitionName,jdbcType=VARCHAR}");
        }
        
        if (record.getSubpartitionName() != null) {
            sql.VALUES("SUBPARTITION_NAME", "#{subpartitionName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionOrdinalPosition() != null) {
            sql.VALUES("PARTITION_ORDINAL_POSITION", "#{partitionOrdinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getSubpartitionOrdinalPosition() != null) {
            sql.VALUES("SUBPARTITION_ORDINAL_POSITION", "#{subpartitionOrdinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getPartitionMethod() != null) {
            sql.VALUES("PARTITION_METHOD", "#{partitionMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getSubpartitionMethod() != null) {
            sql.VALUES("SUBPARTITION_METHOD", "#{subpartitionMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getTableRows() != null) {
            sql.VALUES("TABLE_ROWS", "#{tableRows,jdbcType=BIGINT}");
        }
        
        if (record.getAvgRowLength() != null) {
            sql.VALUES("AVG_ROW_LENGTH", "#{avgRowLength,jdbcType=BIGINT}");
        }
        
        if (record.getDataLength() != null) {
            sql.VALUES("DATA_LENGTH", "#{dataLength,jdbcType=BIGINT}");
        }
        
        if (record.getMaxDataLength() != null) {
            sql.VALUES("MAX_DATA_LENGTH", "#{maxDataLength,jdbcType=BIGINT}");
        }
        
        if (record.getIndexLength() != null) {
            sql.VALUES("INDEX_LENGTH", "#{indexLength,jdbcType=BIGINT}");
        }
        
        if (record.getDataFree() != null) {
            sql.VALUES("DATA_FREE", "#{dataFree,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("CREATE_TIME", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("UPDATE_TIME", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckTime() != null) {
            sql.VALUES("CHECK_TIME", "#{checkTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChecksum() != null) {
            sql.VALUES("CHECKSUM", "#{checksum,jdbcType=BIGINT}");
        }
        
        if (record.getPartitionComment() != null) {
            sql.VALUES("PARTITION_COMMENT", "#{partitionComment,jdbcType=VARCHAR}");
        }
        
        if (record.getNodegroup() != null) {
            sql.VALUES("NODEGROUP", "#{nodegroup,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceName() != null) {
            sql.VALUES("TABLESPACE_NAME", "#{tablespaceName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionExpression() != null) {
            sql.VALUES("PARTITION_EXPRESSION", "#{partitionExpression,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getSubpartitionExpression() != null) {
            sql.VALUES("SUBPARTITION_EXPRESSION", "#{subpartitionExpression,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getPartitionDescription() != null) {
            sql.VALUES("PARTITION_DESCRIPTION", "#{partitionDescription,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(PartitionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("PARTITION_NAME");
        sql.SELECT("SUBPARTITION_NAME");
        sql.SELECT("PARTITION_ORDINAL_POSITION");
        sql.SELECT("SUBPARTITION_ORDINAL_POSITION");
        sql.SELECT("PARTITION_METHOD");
        sql.SELECT("SUBPARTITION_METHOD");
        sql.SELECT("TABLE_ROWS");
        sql.SELECT("AVG_ROW_LENGTH");
        sql.SELECT("DATA_LENGTH");
        sql.SELECT("MAX_DATA_LENGTH");
        sql.SELECT("INDEX_LENGTH");
        sql.SELECT("DATA_FREE");
        sql.SELECT("CREATE_TIME");
        sql.SELECT("UPDATE_TIME");
        sql.SELECT("CHECK_TIME");
        sql.SELECT("CHECKSUM");
        sql.SELECT("PARTITION_COMMENT");
        sql.SELECT("NODEGROUP");
        sql.SELECT("TABLESPACE_NAME");
        sql.SELECT("PARTITION_EXPRESSION");
        sql.SELECT("SUBPARTITION_EXPRESSION");
        sql.SELECT("PARTITION_DESCRIPTION");
        sql.FROM("PARTITIONS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(PartitionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("PARTITION_NAME");
        sql.SELECT("SUBPARTITION_NAME");
        sql.SELECT("PARTITION_ORDINAL_POSITION");
        sql.SELECT("SUBPARTITION_ORDINAL_POSITION");
        sql.SELECT("PARTITION_METHOD");
        sql.SELECT("SUBPARTITION_METHOD");
        sql.SELECT("TABLE_ROWS");
        sql.SELECT("AVG_ROW_LENGTH");
        sql.SELECT("DATA_LENGTH");
        sql.SELECT("MAX_DATA_LENGTH");
        sql.SELECT("INDEX_LENGTH");
        sql.SELECT("DATA_FREE");
        sql.SELECT("CREATE_TIME");
        sql.SELECT("UPDATE_TIME");
        sql.SELECT("CHECK_TIME");
        sql.SELECT("CHECKSUM");
        sql.SELECT("PARTITION_COMMENT");
        sql.SELECT("NODEGROUP");
        sql.SELECT("TABLESPACE_NAME");
        sql.FROM("PARTITIONS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PartitionsWithBLOBs record = (PartitionsWithBLOBs) parameter.get("record");
        PartitionsExample example = (PartitionsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PARTITIONS");
        
        if (record.getTableCatalog() != null) {
            sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionName() != null) {
            sql.SET("PARTITION_NAME = #{record.partitionName,jdbcType=VARCHAR}");
        }
        
        if (record.getSubpartitionName() != null) {
            sql.SET("SUBPARTITION_NAME = #{record.subpartitionName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionOrdinalPosition() != null) {
            sql.SET("PARTITION_ORDINAL_POSITION = #{record.partitionOrdinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getSubpartitionOrdinalPosition() != null) {
            sql.SET("SUBPARTITION_ORDINAL_POSITION = #{record.subpartitionOrdinalPosition,jdbcType=BIGINT}");
        }
        
        if (record.getPartitionMethod() != null) {
            sql.SET("PARTITION_METHOD = #{record.partitionMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getSubpartitionMethod() != null) {
            sql.SET("SUBPARTITION_METHOD = #{record.subpartitionMethod,jdbcType=VARCHAR}");
        }
        
        if (record.getTableRows() != null) {
            sql.SET("TABLE_ROWS = #{record.tableRows,jdbcType=BIGINT}");
        }
        
        if (record.getAvgRowLength() != null) {
            sql.SET("AVG_ROW_LENGTH = #{record.avgRowLength,jdbcType=BIGINT}");
        }
        
        if (record.getDataLength() != null) {
            sql.SET("DATA_LENGTH = #{record.dataLength,jdbcType=BIGINT}");
        }
        
        if (record.getMaxDataLength() != null) {
            sql.SET("MAX_DATA_LENGTH = #{record.maxDataLength,jdbcType=BIGINT}");
        }
        
        if (record.getIndexLength() != null) {
            sql.SET("INDEX_LENGTH = #{record.indexLength,jdbcType=BIGINT}");
        }
        
        if (record.getDataFree() != null) {
            sql.SET("DATA_FREE = #{record.dataFree,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCheckTime() != null) {
            sql.SET("CHECK_TIME = #{record.checkTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getChecksum() != null) {
            sql.SET("CHECKSUM = #{record.checksum,jdbcType=BIGINT}");
        }
        
        if (record.getPartitionComment() != null) {
            sql.SET("PARTITION_COMMENT = #{record.partitionComment,jdbcType=VARCHAR}");
        }
        
        if (record.getNodegroup() != null) {
            sql.SET("NODEGROUP = #{record.nodegroup,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceName() != null) {
            sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        }
        
        if (record.getPartitionExpression() != null) {
            sql.SET("PARTITION_EXPRESSION = #{record.partitionExpression,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getSubpartitionExpression() != null) {
            sql.SET("SUBPARTITION_EXPRESSION = #{record.subpartitionExpression,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getPartitionDescription() != null) {
            sql.SET("PARTITION_DESCRIPTION = #{record.partitionDescription,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PARTITIONS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("PARTITION_NAME = #{record.partitionName,jdbcType=VARCHAR}");
        sql.SET("SUBPARTITION_NAME = #{record.subpartitionName,jdbcType=VARCHAR}");
        sql.SET("PARTITION_ORDINAL_POSITION = #{record.partitionOrdinalPosition,jdbcType=BIGINT}");
        sql.SET("SUBPARTITION_ORDINAL_POSITION = #{record.subpartitionOrdinalPosition,jdbcType=BIGINT}");
        sql.SET("PARTITION_METHOD = #{record.partitionMethod,jdbcType=VARCHAR}");
        sql.SET("SUBPARTITION_METHOD = #{record.subpartitionMethod,jdbcType=VARCHAR}");
        sql.SET("TABLE_ROWS = #{record.tableRows,jdbcType=BIGINT}");
        sql.SET("AVG_ROW_LENGTH = #{record.avgRowLength,jdbcType=BIGINT}");
        sql.SET("DATA_LENGTH = #{record.dataLength,jdbcType=BIGINT}");
        sql.SET("MAX_DATA_LENGTH = #{record.maxDataLength,jdbcType=BIGINT}");
        sql.SET("INDEX_LENGTH = #{record.indexLength,jdbcType=BIGINT}");
        sql.SET("DATA_FREE = #{record.dataFree,jdbcType=BIGINT}");
        sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("CHECK_TIME = #{record.checkTime,jdbcType=TIMESTAMP}");
        sql.SET("CHECKSUM = #{record.checksum,jdbcType=BIGINT}");
        sql.SET("PARTITION_COMMENT = #{record.partitionComment,jdbcType=VARCHAR}");
        sql.SET("NODEGROUP = #{record.nodegroup,jdbcType=VARCHAR}");
        sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        sql.SET("PARTITION_EXPRESSION = #{record.partitionExpression,jdbcType=LONGVARCHAR}");
        sql.SET("SUBPARTITION_EXPRESSION = #{record.subpartitionExpression,jdbcType=LONGVARCHAR}");
        sql.SET("PARTITION_DESCRIPTION = #{record.partitionDescription,jdbcType=LONGVARCHAR}");
        
        PartitionsExample example = (PartitionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PARTITIONS");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("PARTITION_NAME = #{record.partitionName,jdbcType=VARCHAR}");
        sql.SET("SUBPARTITION_NAME = #{record.subpartitionName,jdbcType=VARCHAR}");
        sql.SET("PARTITION_ORDINAL_POSITION = #{record.partitionOrdinalPosition,jdbcType=BIGINT}");
        sql.SET("SUBPARTITION_ORDINAL_POSITION = #{record.subpartitionOrdinalPosition,jdbcType=BIGINT}");
        sql.SET("PARTITION_METHOD = #{record.partitionMethod,jdbcType=VARCHAR}");
        sql.SET("SUBPARTITION_METHOD = #{record.subpartitionMethod,jdbcType=VARCHAR}");
        sql.SET("TABLE_ROWS = #{record.tableRows,jdbcType=BIGINT}");
        sql.SET("AVG_ROW_LENGTH = #{record.avgRowLength,jdbcType=BIGINT}");
        sql.SET("DATA_LENGTH = #{record.dataLength,jdbcType=BIGINT}");
        sql.SET("MAX_DATA_LENGTH = #{record.maxDataLength,jdbcType=BIGINT}");
        sql.SET("INDEX_LENGTH = #{record.indexLength,jdbcType=BIGINT}");
        sql.SET("DATA_FREE = #{record.dataFree,jdbcType=BIGINT}");
        sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("CHECK_TIME = #{record.checkTime,jdbcType=TIMESTAMP}");
        sql.SET("CHECKSUM = #{record.checksum,jdbcType=BIGINT}");
        sql.SET("PARTITION_COMMENT = #{record.partitionComment,jdbcType=VARCHAR}");
        sql.SET("NODEGROUP = #{record.nodegroup,jdbcType=VARCHAR}");
        sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        
        PartitionsExample example = (PartitionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PartitionsExample example, boolean includeExamplePhrase) {
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