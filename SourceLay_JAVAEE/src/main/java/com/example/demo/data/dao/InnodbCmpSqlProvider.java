package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmp;
import com.example.demo.data.model.InnodbCmpExample.Criteria;
import com.example.demo.data.model.InnodbCmpExample.Criterion;
import com.example.demo.data.model.InnodbCmpExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbCmpSqlProvider {
    public String countByExample(InnodbCmpExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_CMP");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbCmpExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_CMP");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbCmp record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_CMP");
        
        if (record.getPageSize() != null) {
            sql.VALUES("page_size", "#{pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getCompressOps() != null) {
            sql.VALUES("compress_ops", "#{compressOps,jdbcType=INTEGER}");
        }
        
        if (record.getCompressOpsOk() != null) {
            sql.VALUES("compress_ops_ok", "#{compressOpsOk,jdbcType=INTEGER}");
        }
        
        if (record.getCompressTime() != null) {
            sql.VALUES("compress_time", "#{compressTime,jdbcType=INTEGER}");
        }
        
        if (record.getUncompressOps() != null) {
            sql.VALUES("uncompress_ops", "#{uncompressOps,jdbcType=INTEGER}");
        }
        
        if (record.getUncompressTime() != null) {
            sql.VALUES("uncompress_time", "#{uncompressTime,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbCmpExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("page_size");
        } else {
            sql.SELECT("page_size");
        }
        sql.SELECT("compress_ops");
        sql.SELECT("compress_ops_ok");
        sql.SELECT("compress_time");
        sql.SELECT("uncompress_ops");
        sql.SELECT("uncompress_time");
        sql.FROM("INNODB_CMP");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbCmp record = (InnodbCmp) parameter.get("record");
        InnodbCmpExample example = (InnodbCmpExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_CMP");
        
        if (record.getPageSize() != null) {
            sql.SET("page_size = #{record.pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getCompressOps() != null) {
            sql.SET("compress_ops = #{record.compressOps,jdbcType=INTEGER}");
        }
        
        if (record.getCompressOpsOk() != null) {
            sql.SET("compress_ops_ok = #{record.compressOpsOk,jdbcType=INTEGER}");
        }
        
        if (record.getCompressTime() != null) {
            sql.SET("compress_time = #{record.compressTime,jdbcType=INTEGER}");
        }
        
        if (record.getUncompressOps() != null) {
            sql.SET("uncompress_ops = #{record.uncompressOps,jdbcType=INTEGER}");
        }
        
        if (record.getUncompressTime() != null) {
            sql.SET("uncompress_time = #{record.uncompressTime,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_CMP");
        
        sql.SET("page_size = #{record.pageSize,jdbcType=INTEGER}");
        sql.SET("compress_ops = #{record.compressOps,jdbcType=INTEGER}");
        sql.SET("compress_ops_ok = #{record.compressOpsOk,jdbcType=INTEGER}");
        sql.SET("compress_time = #{record.compressTime,jdbcType=INTEGER}");
        sql.SET("uncompress_ops = #{record.uncompressOps,jdbcType=INTEGER}");
        sql.SET("uncompress_time = #{record.uncompressTime,jdbcType=INTEGER}");
        
        InnodbCmpExample example = (InnodbCmpExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbCmpExample example, boolean includeExamplePhrase) {
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