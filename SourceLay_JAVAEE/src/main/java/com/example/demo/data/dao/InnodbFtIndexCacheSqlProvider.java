package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtIndexCache;
import com.example.demo.data.model.InnodbFtIndexCacheExample.Criteria;
import com.example.demo.data.model.InnodbFtIndexCacheExample.Criterion;
import com.example.demo.data.model.InnodbFtIndexCacheExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbFtIndexCacheSqlProvider {
    public String countByExample(InnodbFtIndexCacheExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_FT_INDEX_CACHE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbFtIndexCacheExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_FT_INDEX_CACHE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbFtIndexCache record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_FT_INDEX_CACHE");
        
        if (record.getWord() != null) {
            sql.VALUES("WORD", "#{word,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstDocId() != null) {
            sql.VALUES("FIRST_DOC_ID", "#{firstDocId,jdbcType=BIGINT}");
        }
        
        if (record.getLastDocId() != null) {
            sql.VALUES("LAST_DOC_ID", "#{lastDocId,jdbcType=BIGINT}");
        }
        
        if (record.getDocCount() != null) {
            sql.VALUES("DOC_COUNT", "#{docCount,jdbcType=BIGINT}");
        }
        
        if (record.getDocId() != null) {
            sql.VALUES("DOC_ID", "#{docId,jdbcType=BIGINT}");
        }
        
        if (record.getPosition() != null) {
            sql.VALUES("POSITION", "#{position,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbFtIndexCacheExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("WORD");
        } else {
            sql.SELECT("WORD");
        }
        sql.SELECT("FIRST_DOC_ID");
        sql.SELECT("LAST_DOC_ID");
        sql.SELECT("DOC_COUNT");
        sql.SELECT("DOC_ID");
        sql.SELECT("POSITION");
        sql.FROM("INNODB_FT_INDEX_CACHE");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbFtIndexCache record = (InnodbFtIndexCache) parameter.get("record");
        InnodbFtIndexCacheExample example = (InnodbFtIndexCacheExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_FT_INDEX_CACHE");
        
        if (record.getWord() != null) {
            sql.SET("WORD = #{record.word,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstDocId() != null) {
            sql.SET("FIRST_DOC_ID = #{record.firstDocId,jdbcType=BIGINT}");
        }
        
        if (record.getLastDocId() != null) {
            sql.SET("LAST_DOC_ID = #{record.lastDocId,jdbcType=BIGINT}");
        }
        
        if (record.getDocCount() != null) {
            sql.SET("DOC_COUNT = #{record.docCount,jdbcType=BIGINT}");
        }
        
        if (record.getDocId() != null) {
            sql.SET("DOC_ID = #{record.docId,jdbcType=BIGINT}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("POSITION = #{record.position,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_FT_INDEX_CACHE");
        
        sql.SET("WORD = #{record.word,jdbcType=VARCHAR}");
        sql.SET("FIRST_DOC_ID = #{record.firstDocId,jdbcType=BIGINT}");
        sql.SET("LAST_DOC_ID = #{record.lastDocId,jdbcType=BIGINT}");
        sql.SET("DOC_COUNT = #{record.docCount,jdbcType=BIGINT}");
        sql.SET("DOC_ID = #{record.docId,jdbcType=BIGINT}");
        sql.SET("POSITION = #{record.position,jdbcType=BIGINT}");
        
        InnodbFtIndexCacheExample example = (InnodbFtIndexCacheExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbFtIndexCacheExample example, boolean includeExamplePhrase) {
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