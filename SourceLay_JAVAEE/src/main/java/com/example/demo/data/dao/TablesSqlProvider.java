package com.example.demo.data.dao;

import com.example.demo.data.model.Tables;
import com.example.demo.data.model.TablesExample.Criteria;
import com.example.demo.data.model.TablesExample.Criterion;
import com.example.demo.data.model.TablesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TablesSqlProvider {
    public String countByExample(TablesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TABLES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TablesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TABLES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Tables record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TABLES");
        
        if (record.getTableCatalog() != null) {
            sql.VALUES("TABLE_CATALOG", "#{tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.VALUES("TABLE_SCHEMA", "#{tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getTableType() != null) {
            sql.VALUES("TABLE_TYPE", "#{tableType,jdbcType=VARCHAR}");
        }
        
        if (record.getEngine() != null) {
            sql.VALUES("ENGINE", "#{engine,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("VERSION", "#{version,jdbcType=BIGINT}");
        }
        
        if (record.getRowFormat() != null) {
            sql.VALUES("ROW_FORMAT", "#{rowFormat,jdbcType=VARCHAR}");
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
        
        if (record.getAutoIncrement() != null) {
            sql.VALUES("AUTO_INCREMENT", "#{autoIncrement,jdbcType=BIGINT}");
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
        
        if (record.getTableCollation() != null) {
            sql.VALUES("TABLE_COLLATION", "#{tableCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getChecksum() != null) {
            sql.VALUES("CHECKSUM", "#{checksum,jdbcType=BIGINT}");
        }
        
        if (record.getCreateOptions() != null) {
            sql.VALUES("CREATE_OPTIONS", "#{createOptions,jdbcType=VARCHAR}");
        }
        
        if (record.getTableComment() != null) {
            sql.VALUES("TABLE_COMMENT", "#{tableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxIndexLength() != null) {
            sql.VALUES("MAX_INDEX_LENGTH", "#{maxIndexLength,jdbcType=BIGINT}");
        }
        
        if (record.getTemporary() != null) {
            sql.VALUES("TEMPORARY", "#{temporary,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TablesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_CATALOG");
        } else {
            sql.SELECT("TABLE_CATALOG");
        }
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("TABLE_TYPE");
        sql.SELECT("ENGINE");
        sql.SELECT("VERSION");
        sql.SELECT("ROW_FORMAT");
        sql.SELECT("TABLE_ROWS");
        sql.SELECT("AVG_ROW_LENGTH");
        sql.SELECT("DATA_LENGTH");
        sql.SELECT("MAX_DATA_LENGTH");
        sql.SELECT("INDEX_LENGTH");
        sql.SELECT("DATA_FREE");
        sql.SELECT("AUTO_INCREMENT");
        sql.SELECT("CREATE_TIME");
        sql.SELECT("UPDATE_TIME");
        sql.SELECT("CHECK_TIME");
        sql.SELECT("TABLE_COLLATION");
        sql.SELECT("CHECKSUM");
        sql.SELECT("CREATE_OPTIONS");
        sql.SELECT("TABLE_COMMENT");
        sql.SELECT("MAX_INDEX_LENGTH");
        sql.SELECT("TEMPORARY");
        sql.FROM("TABLES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Tables record = (Tables) parameter.get("record");
        TablesExample example = (TablesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TABLES");
        
        if (record.getTableCatalog() != null) {
            sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTableSchema() != null) {
            sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getTableType() != null) {
            sql.SET("TABLE_TYPE = #{record.tableType,jdbcType=VARCHAR}");
        }
        
        if (record.getEngine() != null) {
            sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("VERSION = #{record.version,jdbcType=BIGINT}");
        }
        
        if (record.getRowFormat() != null) {
            sql.SET("ROW_FORMAT = #{record.rowFormat,jdbcType=VARCHAR}");
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
        
        if (record.getAutoIncrement() != null) {
            sql.SET("AUTO_INCREMENT = #{record.autoIncrement,jdbcType=BIGINT}");
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
        
        if (record.getTableCollation() != null) {
            sql.SET("TABLE_COLLATION = #{record.tableCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getChecksum() != null) {
            sql.SET("CHECKSUM = #{record.checksum,jdbcType=BIGINT}");
        }
        
        if (record.getCreateOptions() != null) {
            sql.SET("CREATE_OPTIONS = #{record.createOptions,jdbcType=VARCHAR}");
        }
        
        if (record.getTableComment() != null) {
            sql.SET("TABLE_COMMENT = #{record.tableComment,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxIndexLength() != null) {
            sql.SET("MAX_INDEX_LENGTH = #{record.maxIndexLength,jdbcType=BIGINT}");
        }
        
        if (record.getTemporary() != null) {
            sql.SET("TEMPORARY = #{record.temporary,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TABLES");
        
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("TABLE_TYPE = #{record.tableType,jdbcType=VARCHAR}");
        sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        sql.SET("VERSION = #{record.version,jdbcType=BIGINT}");
        sql.SET("ROW_FORMAT = #{record.rowFormat,jdbcType=VARCHAR}");
        sql.SET("TABLE_ROWS = #{record.tableRows,jdbcType=BIGINT}");
        sql.SET("AVG_ROW_LENGTH = #{record.avgRowLength,jdbcType=BIGINT}");
        sql.SET("DATA_LENGTH = #{record.dataLength,jdbcType=BIGINT}");
        sql.SET("MAX_DATA_LENGTH = #{record.maxDataLength,jdbcType=BIGINT}");
        sql.SET("INDEX_LENGTH = #{record.indexLength,jdbcType=BIGINT}");
        sql.SET("DATA_FREE = #{record.dataFree,jdbcType=BIGINT}");
        sql.SET("AUTO_INCREMENT = #{record.autoIncrement,jdbcType=BIGINT}");
        sql.SET("CREATE_TIME = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("UPDATE_TIME = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("CHECK_TIME = #{record.checkTime,jdbcType=TIMESTAMP}");
        sql.SET("TABLE_COLLATION = #{record.tableCollation,jdbcType=VARCHAR}");
        sql.SET("CHECKSUM = #{record.checksum,jdbcType=BIGINT}");
        sql.SET("CREATE_OPTIONS = #{record.createOptions,jdbcType=VARCHAR}");
        sql.SET("TABLE_COMMENT = #{record.tableComment,jdbcType=VARCHAR}");
        sql.SET("MAX_INDEX_LENGTH = #{record.maxIndexLength,jdbcType=BIGINT}");
        sql.SET("TEMPORARY = #{record.temporary,jdbcType=VARCHAR}");
        
        TablesExample example = (TablesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TablesExample example, boolean includeExamplePhrase) {
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