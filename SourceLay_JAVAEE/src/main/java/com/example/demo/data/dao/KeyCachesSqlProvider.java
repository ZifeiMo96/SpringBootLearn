package com.example.demo.data.dao;

import com.example.demo.data.model.KeyCaches;
import com.example.demo.data.model.KeyCachesExample.Criteria;
import com.example.demo.data.model.KeyCachesExample.Criterion;
import com.example.demo.data.model.KeyCachesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class KeyCachesSqlProvider {
    public String countByExample(KeyCachesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("KEY_CACHES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(KeyCachesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("KEY_CACHES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(KeyCaches record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("KEY_CACHES");
        
        if (record.getKeyCacheName() != null) {
            sql.VALUES("KEY_CACHE_NAME", "#{keyCacheName,jdbcType=VARCHAR}");
        }
        
        if (record.getSegments() != null) {
            sql.VALUES("SEGMENTS", "#{segments,jdbcType=INTEGER}");
        }
        
        if (record.getSegmentNumber() != null) {
            sql.VALUES("SEGMENT_NUMBER", "#{segmentNumber,jdbcType=INTEGER}");
        }
        
        if (record.getFullSize() != null) {
            sql.VALUES("FULL_SIZE", "#{fullSize,jdbcType=BIGINT}");
        }
        
        if (record.getBlockSize() != null) {
            sql.VALUES("BLOCK_SIZE", "#{blockSize,jdbcType=BIGINT}");
        }
        
        if (record.getUsedBlocks() != null) {
            sql.VALUES("USED_BLOCKS", "#{usedBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getUnusedBlocks() != null) {
            sql.VALUES("UNUSED_BLOCKS", "#{unusedBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getDirtyBlocks() != null) {
            sql.VALUES("DIRTY_BLOCKS", "#{dirtyBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getReadRequests() != null) {
            sql.VALUES("READ_REQUESTS", "#{readRequests,jdbcType=BIGINT}");
        }
        
        if (record.getReads() != null) {
            sql.VALUES("READS", "#{reads,jdbcType=BIGINT}");
        }
        
        if (record.getWriteRequests() != null) {
            sql.VALUES("WRITE_REQUESTS", "#{writeRequests,jdbcType=BIGINT}");
        }
        
        if (record.getWrites() != null) {
            sql.VALUES("WRITES", "#{writes,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(KeyCachesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("KEY_CACHE_NAME");
        } else {
            sql.SELECT("KEY_CACHE_NAME");
        }
        sql.SELECT("SEGMENTS");
        sql.SELECT("SEGMENT_NUMBER");
        sql.SELECT("FULL_SIZE");
        sql.SELECT("BLOCK_SIZE");
        sql.SELECT("USED_BLOCKS");
        sql.SELECT("UNUSED_BLOCKS");
        sql.SELECT("DIRTY_BLOCKS");
        sql.SELECT("READ_REQUESTS");
        sql.SELECT("READS");
        sql.SELECT("WRITE_REQUESTS");
        sql.SELECT("WRITES");
        sql.FROM("KEY_CACHES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        KeyCaches record = (KeyCaches) parameter.get("record");
        KeyCachesExample example = (KeyCachesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("KEY_CACHES");
        
        if (record.getKeyCacheName() != null) {
            sql.SET("KEY_CACHE_NAME = #{record.keyCacheName,jdbcType=VARCHAR}");
        }
        
        if (record.getSegments() != null) {
            sql.SET("SEGMENTS = #{record.segments,jdbcType=INTEGER}");
        }
        
        if (record.getSegmentNumber() != null) {
            sql.SET("SEGMENT_NUMBER = #{record.segmentNumber,jdbcType=INTEGER}");
        }
        
        if (record.getFullSize() != null) {
            sql.SET("FULL_SIZE = #{record.fullSize,jdbcType=BIGINT}");
        }
        
        if (record.getBlockSize() != null) {
            sql.SET("BLOCK_SIZE = #{record.blockSize,jdbcType=BIGINT}");
        }
        
        if (record.getUsedBlocks() != null) {
            sql.SET("USED_BLOCKS = #{record.usedBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getUnusedBlocks() != null) {
            sql.SET("UNUSED_BLOCKS = #{record.unusedBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getDirtyBlocks() != null) {
            sql.SET("DIRTY_BLOCKS = #{record.dirtyBlocks,jdbcType=BIGINT}");
        }
        
        if (record.getReadRequests() != null) {
            sql.SET("READ_REQUESTS = #{record.readRequests,jdbcType=BIGINT}");
        }
        
        if (record.getReads() != null) {
            sql.SET("READS = #{record.reads,jdbcType=BIGINT}");
        }
        
        if (record.getWriteRequests() != null) {
            sql.SET("WRITE_REQUESTS = #{record.writeRequests,jdbcType=BIGINT}");
        }
        
        if (record.getWrites() != null) {
            sql.SET("WRITES = #{record.writes,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("KEY_CACHES");
        
        sql.SET("KEY_CACHE_NAME = #{record.keyCacheName,jdbcType=VARCHAR}");
        sql.SET("SEGMENTS = #{record.segments,jdbcType=INTEGER}");
        sql.SET("SEGMENT_NUMBER = #{record.segmentNumber,jdbcType=INTEGER}");
        sql.SET("FULL_SIZE = #{record.fullSize,jdbcType=BIGINT}");
        sql.SET("BLOCK_SIZE = #{record.blockSize,jdbcType=BIGINT}");
        sql.SET("USED_BLOCKS = #{record.usedBlocks,jdbcType=BIGINT}");
        sql.SET("UNUSED_BLOCKS = #{record.unusedBlocks,jdbcType=BIGINT}");
        sql.SET("DIRTY_BLOCKS = #{record.dirtyBlocks,jdbcType=BIGINT}");
        sql.SET("READ_REQUESTS = #{record.readRequests,jdbcType=BIGINT}");
        sql.SET("READS = #{record.reads,jdbcType=BIGINT}");
        sql.SET("WRITE_REQUESTS = #{record.writeRequests,jdbcType=BIGINT}");
        sql.SET("WRITES = #{record.writes,jdbcType=BIGINT}");
        
        KeyCachesExample example = (KeyCachesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, KeyCachesExample example, boolean includeExamplePhrase) {
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