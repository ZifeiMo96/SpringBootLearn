package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysTablestats;
import com.example.demo.data.model.InnodbSysTablestatsExample.Criteria;
import com.example.demo.data.model.InnodbSysTablestatsExample.Criterion;
import com.example.demo.data.model.InnodbSysTablestatsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysTablestatsSqlProvider {
    public String countByExample(InnodbSysTablestatsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_TABLESTATS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysTablestatsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_TABLESTATS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysTablestats record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_TABLESTATS");
        
        if (record.getTableId() != null) {
            sql.VALUES("TABLE_ID", "#{tableId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatsInitialized() != null) {
            sql.VALUES("STATS_INITIALIZED", "#{statsInitialized,jdbcType=VARCHAR}");
        }
        
        if (record.getNumRows() != null) {
            sql.VALUES("NUM_ROWS", "#{numRows,jdbcType=BIGINT}");
        }
        
        if (record.getClustIndexSize() != null) {
            sql.VALUES("CLUST_INDEX_SIZE", "#{clustIndexSize,jdbcType=BIGINT}");
        }
        
        if (record.getOtherIndexSize() != null) {
            sql.VALUES("OTHER_INDEX_SIZE", "#{otherIndexSize,jdbcType=BIGINT}");
        }
        
        if (record.getModifiedCounter() != null) {
            sql.VALUES("MODIFIED_COUNTER", "#{modifiedCounter,jdbcType=BIGINT}");
        }
        
        if (record.getAutoinc() != null) {
            sql.VALUES("AUTOINC", "#{autoinc,jdbcType=BIGINT}");
        }
        
        if (record.getRefCount() != null) {
            sql.VALUES("REF_COUNT", "#{refCount,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysTablestatsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLE_ID");
        } else {
            sql.SELECT("TABLE_ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("STATS_INITIALIZED");
        sql.SELECT("NUM_ROWS");
        sql.SELECT("CLUST_INDEX_SIZE");
        sql.SELECT("OTHER_INDEX_SIZE");
        sql.SELECT("MODIFIED_COUNTER");
        sql.SELECT("AUTOINC");
        sql.SELECT("REF_COUNT");
        sql.FROM("INNODB_SYS_TABLESTATS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysTablestats record = (InnodbSysTablestats) parameter.get("record");
        InnodbSysTablestatsExample example = (InnodbSysTablestatsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_TABLESTATS");
        
        if (record.getTableId() != null) {
            sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatsInitialized() != null) {
            sql.SET("STATS_INITIALIZED = #{record.statsInitialized,jdbcType=VARCHAR}");
        }
        
        if (record.getNumRows() != null) {
            sql.SET("NUM_ROWS = #{record.numRows,jdbcType=BIGINT}");
        }
        
        if (record.getClustIndexSize() != null) {
            sql.SET("CLUST_INDEX_SIZE = #{record.clustIndexSize,jdbcType=BIGINT}");
        }
        
        if (record.getOtherIndexSize() != null) {
            sql.SET("OTHER_INDEX_SIZE = #{record.otherIndexSize,jdbcType=BIGINT}");
        }
        
        if (record.getModifiedCounter() != null) {
            sql.SET("MODIFIED_COUNTER = #{record.modifiedCounter,jdbcType=BIGINT}");
        }
        
        if (record.getAutoinc() != null) {
            sql.SET("AUTOINC = #{record.autoinc,jdbcType=BIGINT}");
        }
        
        if (record.getRefCount() != null) {
            sql.SET("REF_COUNT = #{record.refCount,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_TABLESTATS");
        
        sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("STATS_INITIALIZED = #{record.statsInitialized,jdbcType=VARCHAR}");
        sql.SET("NUM_ROWS = #{record.numRows,jdbcType=BIGINT}");
        sql.SET("CLUST_INDEX_SIZE = #{record.clustIndexSize,jdbcType=BIGINT}");
        sql.SET("OTHER_INDEX_SIZE = #{record.otherIndexSize,jdbcType=BIGINT}");
        sql.SET("MODIFIED_COUNTER = #{record.modifiedCounter,jdbcType=BIGINT}");
        sql.SET("AUTOINC = #{record.autoinc,jdbcType=BIGINT}");
        sql.SET("REF_COUNT = #{record.refCount,jdbcType=INTEGER}");
        
        InnodbSysTablestatsExample example = (InnodbSysTablestatsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysTablestatsExample example, boolean includeExamplePhrase) {
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