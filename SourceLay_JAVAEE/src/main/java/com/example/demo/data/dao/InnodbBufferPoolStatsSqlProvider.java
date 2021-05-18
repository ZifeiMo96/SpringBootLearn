package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbBufferPoolStats;
import com.example.demo.data.model.InnodbBufferPoolStatsExample.Criteria;
import com.example.demo.data.model.InnodbBufferPoolStatsExample.Criterion;
import com.example.demo.data.model.InnodbBufferPoolStatsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbBufferPoolStatsSqlProvider {
    public String countByExample(InnodbBufferPoolStatsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_BUFFER_POOL_STATS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbBufferPoolStatsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_BUFFER_POOL_STATS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbBufferPoolStats record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_BUFFER_POOL_STATS");
        
        if (record.getPoolId() != null) {
            sql.VALUES("POOL_ID", "#{poolId,jdbcType=BIGINT}");
        }
        
        if (record.getPoolSize() != null) {
            sql.VALUES("POOL_SIZE", "#{poolSize,jdbcType=BIGINT}");
        }
        
        if (record.getFreeBuffers() != null) {
            sql.VALUES("FREE_BUFFERS", "#{freeBuffers,jdbcType=BIGINT}");
        }
        
        if (record.getDatabasePages() != null) {
            sql.VALUES("DATABASE_PAGES", "#{databasePages,jdbcType=BIGINT}");
        }
        
        if (record.getOldDatabasePages() != null) {
            sql.VALUES("OLD_DATABASE_PAGES", "#{oldDatabasePages,jdbcType=BIGINT}");
        }
        
        if (record.getModifiedDatabasePages() != null) {
            sql.VALUES("MODIFIED_DATABASE_PAGES", "#{modifiedDatabasePages,jdbcType=BIGINT}");
        }
        
        if (record.getPendingDecompress() != null) {
            sql.VALUES("PENDING_DECOMPRESS", "#{pendingDecompress,jdbcType=BIGINT}");
        }
        
        if (record.getPendingReads() != null) {
            sql.VALUES("PENDING_READS", "#{pendingReads,jdbcType=BIGINT}");
        }
        
        if (record.getPendingFlushLru() != null) {
            sql.VALUES("PENDING_FLUSH_LRU", "#{pendingFlushLru,jdbcType=BIGINT}");
        }
        
        if (record.getPendingFlushList() != null) {
            sql.VALUES("PENDING_FLUSH_LIST", "#{pendingFlushList,jdbcType=BIGINT}");
        }
        
        if (record.getPagesMadeYoung() != null) {
            sql.VALUES("PAGES_MADE_YOUNG", "#{pagesMadeYoung,jdbcType=BIGINT}");
        }
        
        if (record.getPagesNotMadeYoung() != null) {
            sql.VALUES("PAGES_NOT_MADE_YOUNG", "#{pagesNotMadeYoung,jdbcType=BIGINT}");
        }
        
        if (record.getPagesMadeYoungRate() != null) {
            sql.VALUES("PAGES_MADE_YOUNG_RATE", "#{pagesMadeYoungRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesMadeNotYoungRate() != null) {
            sql.VALUES("PAGES_MADE_NOT_YOUNG_RATE", "#{pagesMadeNotYoungRate,jdbcType=DOUBLE}");
        }
        
        if (record.getNumberPagesRead() != null) {
            sql.VALUES("NUMBER_PAGES_READ", "#{numberPagesRead,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesCreated() != null) {
            sql.VALUES("NUMBER_PAGES_CREATED", "#{numberPagesCreated,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesWritten() != null) {
            sql.VALUES("NUMBER_PAGES_WRITTEN", "#{numberPagesWritten,jdbcType=BIGINT}");
        }
        
        if (record.getPagesReadRate() != null) {
            sql.VALUES("PAGES_READ_RATE", "#{pagesReadRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesCreateRate() != null) {
            sql.VALUES("PAGES_CREATE_RATE", "#{pagesCreateRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesWrittenRate() != null) {
            sql.VALUES("PAGES_WRITTEN_RATE", "#{pagesWrittenRate,jdbcType=DOUBLE}");
        }
        
        if (record.getNumberPagesGet() != null) {
            sql.VALUES("NUMBER_PAGES_GET", "#{numberPagesGet,jdbcType=BIGINT}");
        }
        
        if (record.getHitRate() != null) {
            sql.VALUES("HIT_RATE", "#{hitRate,jdbcType=BIGINT}");
        }
        
        if (record.getYoungMakePerThousandGets() != null) {
            sql.VALUES("YOUNG_MAKE_PER_THOUSAND_GETS", "#{youngMakePerThousandGets,jdbcType=BIGINT}");
        }
        
        if (record.getNotYoungMakePerThousandGets() != null) {
            sql.VALUES("NOT_YOUNG_MAKE_PER_THOUSAND_GETS", "#{notYoungMakePerThousandGets,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesReadAhead() != null) {
            sql.VALUES("NUMBER_PAGES_READ_AHEAD", "#{numberPagesReadAhead,jdbcType=BIGINT}");
        }
        
        if (record.getNumberReadAheadEvicted() != null) {
            sql.VALUES("NUMBER_READ_AHEAD_EVICTED", "#{numberReadAheadEvicted,jdbcType=BIGINT}");
        }
        
        if (record.getReadAheadRate() != null) {
            sql.VALUES("READ_AHEAD_RATE", "#{readAheadRate,jdbcType=DOUBLE}");
        }
        
        if (record.getReadAheadEvictedRate() != null) {
            sql.VALUES("READ_AHEAD_EVICTED_RATE", "#{readAheadEvictedRate,jdbcType=DOUBLE}");
        }
        
        if (record.getLruIoTotal() != null) {
            sql.VALUES("LRU_IO_TOTAL", "#{lruIoTotal,jdbcType=BIGINT}");
        }
        
        if (record.getLruIoCurrent() != null) {
            sql.VALUES("LRU_IO_CURRENT", "#{lruIoCurrent,jdbcType=BIGINT}");
        }
        
        if (record.getUncompressTotal() != null) {
            sql.VALUES("UNCOMPRESS_TOTAL", "#{uncompressTotal,jdbcType=BIGINT}");
        }
        
        if (record.getUncompressCurrent() != null) {
            sql.VALUES("UNCOMPRESS_CURRENT", "#{uncompressCurrent,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbBufferPoolStatsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("POOL_ID");
        } else {
            sql.SELECT("POOL_ID");
        }
        sql.SELECT("POOL_SIZE");
        sql.SELECT("FREE_BUFFERS");
        sql.SELECT("DATABASE_PAGES");
        sql.SELECT("OLD_DATABASE_PAGES");
        sql.SELECT("MODIFIED_DATABASE_PAGES");
        sql.SELECT("PENDING_DECOMPRESS");
        sql.SELECT("PENDING_READS");
        sql.SELECT("PENDING_FLUSH_LRU");
        sql.SELECT("PENDING_FLUSH_LIST");
        sql.SELECT("PAGES_MADE_YOUNG");
        sql.SELECT("PAGES_NOT_MADE_YOUNG");
        sql.SELECT("PAGES_MADE_YOUNG_RATE");
        sql.SELECT("PAGES_MADE_NOT_YOUNG_RATE");
        sql.SELECT("NUMBER_PAGES_READ");
        sql.SELECT("NUMBER_PAGES_CREATED");
        sql.SELECT("NUMBER_PAGES_WRITTEN");
        sql.SELECT("PAGES_READ_RATE");
        sql.SELECT("PAGES_CREATE_RATE");
        sql.SELECT("PAGES_WRITTEN_RATE");
        sql.SELECT("NUMBER_PAGES_GET");
        sql.SELECT("HIT_RATE");
        sql.SELECT("YOUNG_MAKE_PER_THOUSAND_GETS");
        sql.SELECT("NOT_YOUNG_MAKE_PER_THOUSAND_GETS");
        sql.SELECT("NUMBER_PAGES_READ_AHEAD");
        sql.SELECT("NUMBER_READ_AHEAD_EVICTED");
        sql.SELECT("READ_AHEAD_RATE");
        sql.SELECT("READ_AHEAD_EVICTED_RATE");
        sql.SELECT("LRU_IO_TOTAL");
        sql.SELECT("LRU_IO_CURRENT");
        sql.SELECT("UNCOMPRESS_TOTAL");
        sql.SELECT("UNCOMPRESS_CURRENT");
        sql.FROM("INNODB_BUFFER_POOL_STATS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbBufferPoolStats record = (InnodbBufferPoolStats) parameter.get("record");
        InnodbBufferPoolStatsExample example = (InnodbBufferPoolStatsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_BUFFER_POOL_STATS");
        
        if (record.getPoolId() != null) {
            sql.SET("POOL_ID = #{record.poolId,jdbcType=BIGINT}");
        }
        
        if (record.getPoolSize() != null) {
            sql.SET("POOL_SIZE = #{record.poolSize,jdbcType=BIGINT}");
        }
        
        if (record.getFreeBuffers() != null) {
            sql.SET("FREE_BUFFERS = #{record.freeBuffers,jdbcType=BIGINT}");
        }
        
        if (record.getDatabasePages() != null) {
            sql.SET("DATABASE_PAGES = #{record.databasePages,jdbcType=BIGINT}");
        }
        
        if (record.getOldDatabasePages() != null) {
            sql.SET("OLD_DATABASE_PAGES = #{record.oldDatabasePages,jdbcType=BIGINT}");
        }
        
        if (record.getModifiedDatabasePages() != null) {
            sql.SET("MODIFIED_DATABASE_PAGES = #{record.modifiedDatabasePages,jdbcType=BIGINT}");
        }
        
        if (record.getPendingDecompress() != null) {
            sql.SET("PENDING_DECOMPRESS = #{record.pendingDecompress,jdbcType=BIGINT}");
        }
        
        if (record.getPendingReads() != null) {
            sql.SET("PENDING_READS = #{record.pendingReads,jdbcType=BIGINT}");
        }
        
        if (record.getPendingFlushLru() != null) {
            sql.SET("PENDING_FLUSH_LRU = #{record.pendingFlushLru,jdbcType=BIGINT}");
        }
        
        if (record.getPendingFlushList() != null) {
            sql.SET("PENDING_FLUSH_LIST = #{record.pendingFlushList,jdbcType=BIGINT}");
        }
        
        if (record.getPagesMadeYoung() != null) {
            sql.SET("PAGES_MADE_YOUNG = #{record.pagesMadeYoung,jdbcType=BIGINT}");
        }
        
        if (record.getPagesNotMadeYoung() != null) {
            sql.SET("PAGES_NOT_MADE_YOUNG = #{record.pagesNotMadeYoung,jdbcType=BIGINT}");
        }
        
        if (record.getPagesMadeYoungRate() != null) {
            sql.SET("PAGES_MADE_YOUNG_RATE = #{record.pagesMadeYoungRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesMadeNotYoungRate() != null) {
            sql.SET("PAGES_MADE_NOT_YOUNG_RATE = #{record.pagesMadeNotYoungRate,jdbcType=DOUBLE}");
        }
        
        if (record.getNumberPagesRead() != null) {
            sql.SET("NUMBER_PAGES_READ = #{record.numberPagesRead,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesCreated() != null) {
            sql.SET("NUMBER_PAGES_CREATED = #{record.numberPagesCreated,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesWritten() != null) {
            sql.SET("NUMBER_PAGES_WRITTEN = #{record.numberPagesWritten,jdbcType=BIGINT}");
        }
        
        if (record.getPagesReadRate() != null) {
            sql.SET("PAGES_READ_RATE = #{record.pagesReadRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesCreateRate() != null) {
            sql.SET("PAGES_CREATE_RATE = #{record.pagesCreateRate,jdbcType=DOUBLE}");
        }
        
        if (record.getPagesWrittenRate() != null) {
            sql.SET("PAGES_WRITTEN_RATE = #{record.pagesWrittenRate,jdbcType=DOUBLE}");
        }
        
        if (record.getNumberPagesGet() != null) {
            sql.SET("NUMBER_PAGES_GET = #{record.numberPagesGet,jdbcType=BIGINT}");
        }
        
        if (record.getHitRate() != null) {
            sql.SET("HIT_RATE = #{record.hitRate,jdbcType=BIGINT}");
        }
        
        if (record.getYoungMakePerThousandGets() != null) {
            sql.SET("YOUNG_MAKE_PER_THOUSAND_GETS = #{record.youngMakePerThousandGets,jdbcType=BIGINT}");
        }
        
        if (record.getNotYoungMakePerThousandGets() != null) {
            sql.SET("NOT_YOUNG_MAKE_PER_THOUSAND_GETS = #{record.notYoungMakePerThousandGets,jdbcType=BIGINT}");
        }
        
        if (record.getNumberPagesReadAhead() != null) {
            sql.SET("NUMBER_PAGES_READ_AHEAD = #{record.numberPagesReadAhead,jdbcType=BIGINT}");
        }
        
        if (record.getNumberReadAheadEvicted() != null) {
            sql.SET("NUMBER_READ_AHEAD_EVICTED = #{record.numberReadAheadEvicted,jdbcType=BIGINT}");
        }
        
        if (record.getReadAheadRate() != null) {
            sql.SET("READ_AHEAD_RATE = #{record.readAheadRate,jdbcType=DOUBLE}");
        }
        
        if (record.getReadAheadEvictedRate() != null) {
            sql.SET("READ_AHEAD_EVICTED_RATE = #{record.readAheadEvictedRate,jdbcType=DOUBLE}");
        }
        
        if (record.getLruIoTotal() != null) {
            sql.SET("LRU_IO_TOTAL = #{record.lruIoTotal,jdbcType=BIGINT}");
        }
        
        if (record.getLruIoCurrent() != null) {
            sql.SET("LRU_IO_CURRENT = #{record.lruIoCurrent,jdbcType=BIGINT}");
        }
        
        if (record.getUncompressTotal() != null) {
            sql.SET("UNCOMPRESS_TOTAL = #{record.uncompressTotal,jdbcType=BIGINT}");
        }
        
        if (record.getUncompressCurrent() != null) {
            sql.SET("UNCOMPRESS_CURRENT = #{record.uncompressCurrent,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_BUFFER_POOL_STATS");
        
        sql.SET("POOL_ID = #{record.poolId,jdbcType=BIGINT}");
        sql.SET("POOL_SIZE = #{record.poolSize,jdbcType=BIGINT}");
        sql.SET("FREE_BUFFERS = #{record.freeBuffers,jdbcType=BIGINT}");
        sql.SET("DATABASE_PAGES = #{record.databasePages,jdbcType=BIGINT}");
        sql.SET("OLD_DATABASE_PAGES = #{record.oldDatabasePages,jdbcType=BIGINT}");
        sql.SET("MODIFIED_DATABASE_PAGES = #{record.modifiedDatabasePages,jdbcType=BIGINT}");
        sql.SET("PENDING_DECOMPRESS = #{record.pendingDecompress,jdbcType=BIGINT}");
        sql.SET("PENDING_READS = #{record.pendingReads,jdbcType=BIGINT}");
        sql.SET("PENDING_FLUSH_LRU = #{record.pendingFlushLru,jdbcType=BIGINT}");
        sql.SET("PENDING_FLUSH_LIST = #{record.pendingFlushList,jdbcType=BIGINT}");
        sql.SET("PAGES_MADE_YOUNG = #{record.pagesMadeYoung,jdbcType=BIGINT}");
        sql.SET("PAGES_NOT_MADE_YOUNG = #{record.pagesNotMadeYoung,jdbcType=BIGINT}");
        sql.SET("PAGES_MADE_YOUNG_RATE = #{record.pagesMadeYoungRate,jdbcType=DOUBLE}");
        sql.SET("PAGES_MADE_NOT_YOUNG_RATE = #{record.pagesMadeNotYoungRate,jdbcType=DOUBLE}");
        sql.SET("NUMBER_PAGES_READ = #{record.numberPagesRead,jdbcType=BIGINT}");
        sql.SET("NUMBER_PAGES_CREATED = #{record.numberPagesCreated,jdbcType=BIGINT}");
        sql.SET("NUMBER_PAGES_WRITTEN = #{record.numberPagesWritten,jdbcType=BIGINT}");
        sql.SET("PAGES_READ_RATE = #{record.pagesReadRate,jdbcType=DOUBLE}");
        sql.SET("PAGES_CREATE_RATE = #{record.pagesCreateRate,jdbcType=DOUBLE}");
        sql.SET("PAGES_WRITTEN_RATE = #{record.pagesWrittenRate,jdbcType=DOUBLE}");
        sql.SET("NUMBER_PAGES_GET = #{record.numberPagesGet,jdbcType=BIGINT}");
        sql.SET("HIT_RATE = #{record.hitRate,jdbcType=BIGINT}");
        sql.SET("YOUNG_MAKE_PER_THOUSAND_GETS = #{record.youngMakePerThousandGets,jdbcType=BIGINT}");
        sql.SET("NOT_YOUNG_MAKE_PER_THOUSAND_GETS = #{record.notYoungMakePerThousandGets,jdbcType=BIGINT}");
        sql.SET("NUMBER_PAGES_READ_AHEAD = #{record.numberPagesReadAhead,jdbcType=BIGINT}");
        sql.SET("NUMBER_READ_AHEAD_EVICTED = #{record.numberReadAheadEvicted,jdbcType=BIGINT}");
        sql.SET("READ_AHEAD_RATE = #{record.readAheadRate,jdbcType=DOUBLE}");
        sql.SET("READ_AHEAD_EVICTED_RATE = #{record.readAheadEvictedRate,jdbcType=DOUBLE}");
        sql.SET("LRU_IO_TOTAL = #{record.lruIoTotal,jdbcType=BIGINT}");
        sql.SET("LRU_IO_CURRENT = #{record.lruIoCurrent,jdbcType=BIGINT}");
        sql.SET("UNCOMPRESS_TOTAL = #{record.uncompressTotal,jdbcType=BIGINT}");
        sql.SET("UNCOMPRESS_CURRENT = #{record.uncompressCurrent,jdbcType=BIGINT}");
        
        InnodbBufferPoolStatsExample example = (InnodbBufferPoolStatsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbBufferPoolStatsExample example, boolean includeExamplePhrase) {
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