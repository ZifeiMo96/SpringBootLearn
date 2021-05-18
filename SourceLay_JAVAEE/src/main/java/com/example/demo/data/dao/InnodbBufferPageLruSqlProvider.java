package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbBufferPageLru;
import com.example.demo.data.model.InnodbBufferPageLruExample.Criteria;
import com.example.demo.data.model.InnodbBufferPageLruExample.Criterion;
import com.example.demo.data.model.InnodbBufferPageLruExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbBufferPageLruSqlProvider {
    public String countByExample(InnodbBufferPageLruExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_BUFFER_PAGE_LRU");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbBufferPageLruExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_BUFFER_PAGE_LRU");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbBufferPageLru record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_BUFFER_PAGE_LRU");
        
        if (record.getPoolId() != null) {
            sql.VALUES("POOL_ID", "#{poolId,jdbcType=BIGINT}");
        }
        
        if (record.getLruPosition() != null) {
            sql.VALUES("LRU_POSITION", "#{lruPosition,jdbcType=BIGINT}");
        }
        
        if (record.getSpace() != null) {
            sql.VALUES("SPACE", "#{space,jdbcType=BIGINT}");
        }
        
        if (record.getPageNumber() != null) {
            sql.VALUES("PAGE_NUMBER", "#{pageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getPageType() != null) {
            sql.VALUES("PAGE_TYPE", "#{pageType,jdbcType=VARCHAR}");
        }
        
        if (record.getFlushType() != null) {
            sql.VALUES("FLUSH_TYPE", "#{flushType,jdbcType=BIGINT}");
        }
        
        if (record.getFixCount() != null) {
            sql.VALUES("FIX_COUNT", "#{fixCount,jdbcType=BIGINT}");
        }
        
        if (record.getIsHashed() != null) {
            sql.VALUES("IS_HASHED", "#{isHashed,jdbcType=VARCHAR}");
        }
        
        if (record.getNewestModification() != null) {
            sql.VALUES("NEWEST_MODIFICATION", "#{newestModification,jdbcType=BIGINT}");
        }
        
        if (record.getOldestModification() != null) {
            sql.VALUES("OLDEST_MODIFICATION", "#{oldestModification,jdbcType=BIGINT}");
        }
        
        if (record.getAccessTime() != null) {
            sql.VALUES("ACCESS_TIME", "#{accessTime,jdbcType=BIGINT}");
        }
        
        if (record.getTableName() != null) {
            sql.VALUES("TABLE_NAME", "#{tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexName() != null) {
            sql.VALUES("INDEX_NAME", "#{indexName,jdbcType=VARCHAR}");
        }
        
        if (record.getNumberRecords() != null) {
            sql.VALUES("NUMBER_RECORDS", "#{numberRecords,jdbcType=BIGINT}");
        }
        
        if (record.getDataSize() != null) {
            sql.VALUES("DATA_SIZE", "#{dataSize,jdbcType=BIGINT}");
        }
        
        if (record.getCompressedSize() != null) {
            sql.VALUES("COMPRESSED_SIZE", "#{compressedSize,jdbcType=BIGINT}");
        }
        
        if (record.getCompressed() != null) {
            sql.VALUES("COMPRESSED", "#{compressed,jdbcType=VARCHAR}");
        }
        
        if (record.getIoFix() != null) {
            sql.VALUES("IO_FIX", "#{ioFix,jdbcType=VARCHAR}");
        }
        
        if (record.getIsOld() != null) {
            sql.VALUES("IS_OLD", "#{isOld,jdbcType=VARCHAR}");
        }
        
        if (record.getFreePageClock() != null) {
            sql.VALUES("FREE_PAGE_CLOCK", "#{freePageClock,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbBufferPageLruExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("POOL_ID");
        } else {
            sql.SELECT("POOL_ID");
        }
        sql.SELECT("LRU_POSITION");
        sql.SELECT("SPACE");
        sql.SELECT("PAGE_NUMBER");
        sql.SELECT("PAGE_TYPE");
        sql.SELECT("FLUSH_TYPE");
        sql.SELECT("FIX_COUNT");
        sql.SELECT("IS_HASHED");
        sql.SELECT("NEWEST_MODIFICATION");
        sql.SELECT("OLDEST_MODIFICATION");
        sql.SELECT("ACCESS_TIME");
        sql.SELECT("TABLE_NAME");
        sql.SELECT("INDEX_NAME");
        sql.SELECT("NUMBER_RECORDS");
        sql.SELECT("DATA_SIZE");
        sql.SELECT("COMPRESSED_SIZE");
        sql.SELECT("COMPRESSED");
        sql.SELECT("IO_FIX");
        sql.SELECT("IS_OLD");
        sql.SELECT("FREE_PAGE_CLOCK");
        sql.FROM("INNODB_BUFFER_PAGE_LRU");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbBufferPageLru record = (InnodbBufferPageLru) parameter.get("record");
        InnodbBufferPageLruExample example = (InnodbBufferPageLruExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_BUFFER_PAGE_LRU");
        
        if (record.getPoolId() != null) {
            sql.SET("POOL_ID = #{record.poolId,jdbcType=BIGINT}");
        }
        
        if (record.getLruPosition() != null) {
            sql.SET("LRU_POSITION = #{record.lruPosition,jdbcType=BIGINT}");
        }
        
        if (record.getSpace() != null) {
            sql.SET("SPACE = #{record.space,jdbcType=BIGINT}");
        }
        
        if (record.getPageNumber() != null) {
            sql.SET("PAGE_NUMBER = #{record.pageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getPageType() != null) {
            sql.SET("PAGE_TYPE = #{record.pageType,jdbcType=VARCHAR}");
        }
        
        if (record.getFlushType() != null) {
            sql.SET("FLUSH_TYPE = #{record.flushType,jdbcType=BIGINT}");
        }
        
        if (record.getFixCount() != null) {
            sql.SET("FIX_COUNT = #{record.fixCount,jdbcType=BIGINT}");
        }
        
        if (record.getIsHashed() != null) {
            sql.SET("IS_HASHED = #{record.isHashed,jdbcType=VARCHAR}");
        }
        
        if (record.getNewestModification() != null) {
            sql.SET("NEWEST_MODIFICATION = #{record.newestModification,jdbcType=BIGINT}");
        }
        
        if (record.getOldestModification() != null) {
            sql.SET("OLDEST_MODIFICATION = #{record.oldestModification,jdbcType=BIGINT}");
        }
        
        if (record.getAccessTime() != null) {
            sql.SET("ACCESS_TIME = #{record.accessTime,jdbcType=BIGINT}");
        }
        
        if (record.getTableName() != null) {
            sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        }
        
        if (record.getIndexName() != null) {
            sql.SET("INDEX_NAME = #{record.indexName,jdbcType=VARCHAR}");
        }
        
        if (record.getNumberRecords() != null) {
            sql.SET("NUMBER_RECORDS = #{record.numberRecords,jdbcType=BIGINT}");
        }
        
        if (record.getDataSize() != null) {
            sql.SET("DATA_SIZE = #{record.dataSize,jdbcType=BIGINT}");
        }
        
        if (record.getCompressedSize() != null) {
            sql.SET("COMPRESSED_SIZE = #{record.compressedSize,jdbcType=BIGINT}");
        }
        
        if (record.getCompressed() != null) {
            sql.SET("COMPRESSED = #{record.compressed,jdbcType=VARCHAR}");
        }
        
        if (record.getIoFix() != null) {
            sql.SET("IO_FIX = #{record.ioFix,jdbcType=VARCHAR}");
        }
        
        if (record.getIsOld() != null) {
            sql.SET("IS_OLD = #{record.isOld,jdbcType=VARCHAR}");
        }
        
        if (record.getFreePageClock() != null) {
            sql.SET("FREE_PAGE_CLOCK = #{record.freePageClock,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_BUFFER_PAGE_LRU");
        
        sql.SET("POOL_ID = #{record.poolId,jdbcType=BIGINT}");
        sql.SET("LRU_POSITION = #{record.lruPosition,jdbcType=BIGINT}");
        sql.SET("SPACE = #{record.space,jdbcType=BIGINT}");
        sql.SET("PAGE_NUMBER = #{record.pageNumber,jdbcType=BIGINT}");
        sql.SET("PAGE_TYPE = #{record.pageType,jdbcType=VARCHAR}");
        sql.SET("FLUSH_TYPE = #{record.flushType,jdbcType=BIGINT}");
        sql.SET("FIX_COUNT = #{record.fixCount,jdbcType=BIGINT}");
        sql.SET("IS_HASHED = #{record.isHashed,jdbcType=VARCHAR}");
        sql.SET("NEWEST_MODIFICATION = #{record.newestModification,jdbcType=BIGINT}");
        sql.SET("OLDEST_MODIFICATION = #{record.oldestModification,jdbcType=BIGINT}");
        sql.SET("ACCESS_TIME = #{record.accessTime,jdbcType=BIGINT}");
        sql.SET("TABLE_NAME = #{record.tableName,jdbcType=VARCHAR}");
        sql.SET("INDEX_NAME = #{record.indexName,jdbcType=VARCHAR}");
        sql.SET("NUMBER_RECORDS = #{record.numberRecords,jdbcType=BIGINT}");
        sql.SET("DATA_SIZE = #{record.dataSize,jdbcType=BIGINT}");
        sql.SET("COMPRESSED_SIZE = #{record.compressedSize,jdbcType=BIGINT}");
        sql.SET("COMPRESSED = #{record.compressed,jdbcType=VARCHAR}");
        sql.SET("IO_FIX = #{record.ioFix,jdbcType=VARCHAR}");
        sql.SET("IS_OLD = #{record.isOld,jdbcType=VARCHAR}");
        sql.SET("FREE_PAGE_CLOCK = #{record.freePageClock,jdbcType=BIGINT}");
        
        InnodbBufferPageLruExample example = (InnodbBufferPageLruExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbBufferPageLruExample example, boolean includeExamplePhrase) {
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