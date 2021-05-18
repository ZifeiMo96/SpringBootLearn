package com.example.demo.data.dao;

import com.example.demo.data.model.Files;
import com.example.demo.data.model.FilesExample.Criteria;
import com.example.demo.data.model.FilesExample.Criterion;
import com.example.demo.data.model.FilesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FilesSqlProvider {
    public String countByExample(FilesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("FILES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FilesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("FILES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Files record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("FILES");
        
        if (record.getFileId() != null) {
            sql.VALUES("FILE_ID", "#{fileId,jdbcType=BIGINT}");
        }
        
        if (record.getFileName() != null) {
            sql.VALUES("FILE_NAME", "#{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileType() != null) {
            sql.VALUES("FILE_TYPE", "#{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceName() != null) {
            sql.VALUES("TABLESPACE_NAME", "#{tablespaceName,jdbcType=VARCHAR}");
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
        
        if (record.getLogfileGroupName() != null) {
            sql.VALUES("LOGFILE_GROUP_NAME", "#{logfileGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getLogfileGroupNumber() != null) {
            sql.VALUES("LOGFILE_GROUP_NUMBER", "#{logfileGroupNumber,jdbcType=BIGINT}");
        }
        
        if (record.getEngine() != null) {
            sql.VALUES("ENGINE", "#{engine,jdbcType=VARCHAR}");
        }
        
        if (record.getFulltextKeys() != null) {
            sql.VALUES("FULLTEXT_KEYS", "#{fulltextKeys,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletedRows() != null) {
            sql.VALUES("DELETED_ROWS", "#{deletedRows,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateCount() != null) {
            sql.VALUES("UPDATE_COUNT", "#{updateCount,jdbcType=BIGINT}");
        }
        
        if (record.getFreeExtents() != null) {
            sql.VALUES("FREE_EXTENTS", "#{freeExtents,jdbcType=BIGINT}");
        }
        
        if (record.getTotalExtents() != null) {
            sql.VALUES("TOTAL_EXTENTS", "#{totalExtents,jdbcType=BIGINT}");
        }
        
        if (record.getExtentSize() != null) {
            sql.VALUES("EXTENT_SIZE", "#{extentSize,jdbcType=BIGINT}");
        }
        
        if (record.getInitialSize() != null) {
            sql.VALUES("INITIAL_SIZE", "#{initialSize,jdbcType=BIGINT}");
        }
        
        if (record.getMaximumSize() != null) {
            sql.VALUES("MAXIMUM_SIZE", "#{maximumSize,jdbcType=BIGINT}");
        }
        
        if (record.getAutoextendSize() != null) {
            sql.VALUES("AUTOEXTEND_SIZE", "#{autoextendSize,jdbcType=BIGINT}");
        }
        
        if (record.getCreationTime() != null) {
            sql.VALUES("CREATION_TIME", "#{creationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.VALUES("LAST_UPDATE_TIME", "#{lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAccessTime() != null) {
            sql.VALUES("LAST_ACCESS_TIME", "#{lastAccessTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecoverTime() != null) {
            sql.VALUES("RECOVER_TIME", "#{recoverTime,jdbcType=BIGINT}");
        }
        
        if (record.getTransactionCounter() != null) {
            sql.VALUES("TRANSACTION_COUNTER", "#{transactionCounter,jdbcType=BIGINT}");
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
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra() != null) {
            sql.VALUES("EXTRA", "#{extra,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FilesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("FILE_ID");
        } else {
            sql.SELECT("FILE_ID");
        }
        sql.SELECT("FILE_NAME");
        sql.SELECT("FILE_TYPE");
        sql.SELECT("TABLESPACE_NAME");
        sql.SELECT("TABLE_CATALOG");
        sql.SELECT("TABLE_SCHEMA");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("LOGFILE_GROUP_NAME");
        sql.SELECT("LOGFILE_GROUP_NUMBER");
        sql.SELECT("ENGINE");
        sql.SELECT("FULLTEXT_KEYS");
        sql.SELECT("DELETED_ROWS");
        sql.SELECT("UPDATE_COUNT");
        sql.SELECT("FREE_EXTENTS");
        sql.SELECT("TOTAL_EXTENTS");
        sql.SELECT("EXTENT_SIZE");
        sql.SELECT("INITIAL_SIZE");
        sql.SELECT("MAXIMUM_SIZE");
        sql.SELECT("AUTOEXTEND_SIZE");
        sql.SELECT("CREATION_TIME");
        sql.SELECT("LAST_UPDATE_TIME");
        sql.SELECT("LAST_ACCESS_TIME");
        sql.SELECT("RECOVER_TIME");
        sql.SELECT("TRANSACTION_COUNTER");
        sql.SELECT("VERSION");
        sql.SELECT("ROW_FORMAT");
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
        sql.SELECT("STATUS");
        sql.SELECT("EXTRA");
        sql.FROM("FILES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Files record = (Files) parameter.get("record");
        FilesExample example = (FilesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("FILES");
        
        if (record.getFileId() != null) {
            sql.SET("FILE_ID = #{record.fileId,jdbcType=BIGINT}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("FILE_NAME = #{record.fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileType() != null) {
            sql.SET("FILE_TYPE = #{record.fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceName() != null) {
            sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
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
        
        if (record.getLogfileGroupName() != null) {
            sql.SET("LOGFILE_GROUP_NAME = #{record.logfileGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getLogfileGroupNumber() != null) {
            sql.SET("LOGFILE_GROUP_NUMBER = #{record.logfileGroupNumber,jdbcType=BIGINT}");
        }
        
        if (record.getEngine() != null) {
            sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        }
        
        if (record.getFulltextKeys() != null) {
            sql.SET("FULLTEXT_KEYS = #{record.fulltextKeys,jdbcType=VARCHAR}");
        }
        
        if (record.getDeletedRows() != null) {
            sql.SET("DELETED_ROWS = #{record.deletedRows,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateCount() != null) {
            sql.SET("UPDATE_COUNT = #{record.updateCount,jdbcType=BIGINT}");
        }
        
        if (record.getFreeExtents() != null) {
            sql.SET("FREE_EXTENTS = #{record.freeExtents,jdbcType=BIGINT}");
        }
        
        if (record.getTotalExtents() != null) {
            sql.SET("TOTAL_EXTENTS = #{record.totalExtents,jdbcType=BIGINT}");
        }
        
        if (record.getExtentSize() != null) {
            sql.SET("EXTENT_SIZE = #{record.extentSize,jdbcType=BIGINT}");
        }
        
        if (record.getInitialSize() != null) {
            sql.SET("INITIAL_SIZE = #{record.initialSize,jdbcType=BIGINT}");
        }
        
        if (record.getMaximumSize() != null) {
            sql.SET("MAXIMUM_SIZE = #{record.maximumSize,jdbcType=BIGINT}");
        }
        
        if (record.getAutoextendSize() != null) {
            sql.SET("AUTOEXTEND_SIZE = #{record.autoextendSize,jdbcType=BIGINT}");
        }
        
        if (record.getCreationTime() != null) {
            sql.SET("CREATION_TIME = #{record.creationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastUpdateTime() != null) {
            sql.SET("LAST_UPDATE_TIME = #{record.lastUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAccessTime() != null) {
            sql.SET("LAST_ACCESS_TIME = #{record.lastAccessTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecoverTime() != null) {
            sql.SET("RECOVER_TIME = #{record.recoverTime,jdbcType=BIGINT}");
        }
        
        if (record.getTransactionCounter() != null) {
            sql.SET("TRANSACTION_COUNTER = #{record.transactionCounter,jdbcType=BIGINT}");
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
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getExtra() != null) {
            sql.SET("EXTRA = #{record.extra,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("FILES");
        
        sql.SET("FILE_ID = #{record.fileId,jdbcType=BIGINT}");
        sql.SET("FILE_NAME = #{record.fileName,jdbcType=VARCHAR}");
        sql.SET("FILE_TYPE = #{record.fileType,jdbcType=VARCHAR}");
        sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        sql.SET("TABLE_CATALOG = #{record.tableCatalog,jdbcType=VARCHAR}");
        sql.SET("TABLE_SCHEMA = #{record.tableSchema,jdbcType=VARCHAR}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("LOGFILE_GROUP_NAME = #{record.logfileGroupName,jdbcType=VARCHAR}");
        sql.SET("LOGFILE_GROUP_NUMBER = #{record.logfileGroupNumber,jdbcType=BIGINT}");
        sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        sql.SET("FULLTEXT_KEYS = #{record.fulltextKeys,jdbcType=VARCHAR}");
        sql.SET("DELETED_ROWS = #{record.deletedRows,jdbcType=BIGINT}");
        sql.SET("UPDATE_COUNT = #{record.updateCount,jdbcType=BIGINT}");
        sql.SET("FREE_EXTENTS = #{record.freeExtents,jdbcType=BIGINT}");
        sql.SET("TOTAL_EXTENTS = #{record.totalExtents,jdbcType=BIGINT}");
        sql.SET("EXTENT_SIZE = #{record.extentSize,jdbcType=BIGINT}");
        sql.SET("INITIAL_SIZE = #{record.initialSize,jdbcType=BIGINT}");
        sql.SET("MAXIMUM_SIZE = #{record.maximumSize,jdbcType=BIGINT}");
        sql.SET("AUTOEXTEND_SIZE = #{record.autoextendSize,jdbcType=BIGINT}");
        sql.SET("CREATION_TIME = #{record.creationTime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_UPDATE_TIME = #{record.lastUpdateTime,jdbcType=TIMESTAMP}");
        sql.SET("LAST_ACCESS_TIME = #{record.lastAccessTime,jdbcType=TIMESTAMP}");
        sql.SET("RECOVER_TIME = #{record.recoverTime,jdbcType=BIGINT}");
        sql.SET("TRANSACTION_COUNTER = #{record.transactionCounter,jdbcType=BIGINT}");
        sql.SET("VERSION = #{record.version,jdbcType=BIGINT}");
        sql.SET("ROW_FORMAT = #{record.rowFormat,jdbcType=VARCHAR}");
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
        sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        sql.SET("EXTRA = #{record.extra,jdbcType=VARCHAR}");
        
        FilesExample example = (FilesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FilesExample example, boolean includeExamplePhrase) {
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