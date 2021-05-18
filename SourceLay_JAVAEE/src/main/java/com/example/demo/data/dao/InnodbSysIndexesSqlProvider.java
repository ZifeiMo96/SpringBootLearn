package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysIndexes;
import com.example.demo.data.model.InnodbSysIndexesExample.Criteria;
import com.example.demo.data.model.InnodbSysIndexesExample.Criterion;
import com.example.demo.data.model.InnodbSysIndexesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysIndexesSqlProvider {
    public String countByExample(InnodbSysIndexesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_INDEXES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysIndexesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_INDEXES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysIndexes record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_INDEXES");
        
        if (record.getIndexId() != null) {
            sql.VALUES("INDEX_ID", "#{indexId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getTableId() != null) {
            sql.VALUES("TABLE_ID", "#{tableId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("TYPE", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getnFields() != null) {
            sql.VALUES("N_FIELDS", "#{nFields,jdbcType=INTEGER}");
        }
        
        if (record.getPageNo() != null) {
            sql.VALUES("PAGE_NO", "#{pageNo,jdbcType=INTEGER}");
        }
        
        if (record.getSpace() != null) {
            sql.VALUES("SPACE", "#{space,jdbcType=INTEGER}");
        }
        
        if (record.getMergeThreshold() != null) {
            sql.VALUES("MERGE_THRESHOLD", "#{mergeThreshold,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysIndexesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("INDEX_ID");
        } else {
            sql.SELECT("INDEX_ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("TABLE_ID");
        sql.SELECT("TYPE");
        sql.SELECT("N_FIELDS");
        sql.SELECT("PAGE_NO");
        sql.SELECT("SPACE");
        sql.SELECT("MERGE_THRESHOLD");
        sql.FROM("INNODB_SYS_INDEXES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysIndexes record = (InnodbSysIndexes) parameter.get("record");
        InnodbSysIndexesExample example = (InnodbSysIndexesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_INDEXES");
        
        if (record.getIndexId() != null) {
            sql.SET("INDEX_ID = #{record.indexId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getTableId() != null) {
            sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("TYPE = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getnFields() != null) {
            sql.SET("N_FIELDS = #{record.nFields,jdbcType=INTEGER}");
        }
        
        if (record.getPageNo() != null) {
            sql.SET("PAGE_NO = #{record.pageNo,jdbcType=INTEGER}");
        }
        
        if (record.getSpace() != null) {
            sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        }
        
        if (record.getMergeThreshold() != null) {
            sql.SET("MERGE_THRESHOLD = #{record.mergeThreshold,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_INDEXES");
        
        sql.SET("INDEX_ID = #{record.indexId,jdbcType=BIGINT}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("TABLE_ID = #{record.tableId,jdbcType=BIGINT}");
        sql.SET("TYPE = #{record.type,jdbcType=INTEGER}");
        sql.SET("N_FIELDS = #{record.nFields,jdbcType=INTEGER}");
        sql.SET("PAGE_NO = #{record.pageNo,jdbcType=INTEGER}");
        sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        sql.SET("MERGE_THRESHOLD = #{record.mergeThreshold,jdbcType=INTEGER}");
        
        InnodbSysIndexesExample example = (InnodbSysIndexesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysIndexesExample example, boolean includeExamplePhrase) {
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