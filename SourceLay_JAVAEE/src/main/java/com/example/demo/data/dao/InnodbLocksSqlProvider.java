package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbLocks;
import com.example.demo.data.model.InnodbLocksExample.Criteria;
import com.example.demo.data.model.InnodbLocksExample.Criterion;
import com.example.demo.data.model.InnodbLocksExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbLocksSqlProvider {
    public String countByExample(InnodbLocksExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_LOCKS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbLocksExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_LOCKS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbLocks record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_LOCKS");
        
        if (record.getLockId() != null) {
            sql.VALUES("lock_id", "#{lockId,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTrxId() != null) {
            sql.VALUES("lock_trx_id", "#{lockTrxId,jdbcType=VARCHAR}");
        }
        
        if (record.getLockMode() != null) {
            sql.VALUES("lock_mode", "#{lockMode,jdbcType=VARCHAR}");
        }
        
        if (record.getLockType() != null) {
            sql.VALUES("lock_type", "#{lockType,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTable() != null) {
            sql.VALUES("lock_table", "#{lockTable,jdbcType=VARCHAR}");
        }
        
        if (record.getLockIndex() != null) {
            sql.VALUES("lock_index", "#{lockIndex,jdbcType=VARCHAR}");
        }
        
        if (record.getLockSpace() != null) {
            sql.VALUES("lock_space", "#{lockSpace,jdbcType=BIGINT}");
        }
        
        if (record.getLockPage() != null) {
            sql.VALUES("lock_page", "#{lockPage,jdbcType=BIGINT}");
        }
        
        if (record.getLockRec() != null) {
            sql.VALUES("lock_rec", "#{lockRec,jdbcType=BIGINT}");
        }
        
        if (record.getLockData() != null) {
            sql.VALUES("lock_data", "#{lockData,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbLocksExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("lock_id");
        } else {
            sql.SELECT("lock_id");
        }
        sql.SELECT("lock_trx_id");
        sql.SELECT("lock_mode");
        sql.SELECT("lock_type");
        sql.SELECT("lock_table");
        sql.SELECT("lock_index");
        sql.SELECT("lock_space");
        sql.SELECT("lock_page");
        sql.SELECT("lock_rec");
        sql.SELECT("lock_data");
        sql.FROM("INNODB_LOCKS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbLocks record = (InnodbLocks) parameter.get("record");
        InnodbLocksExample example = (InnodbLocksExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_LOCKS");
        
        if (record.getLockId() != null) {
            sql.SET("lock_id = #{record.lockId,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTrxId() != null) {
            sql.SET("lock_trx_id = #{record.lockTrxId,jdbcType=VARCHAR}");
        }
        
        if (record.getLockMode() != null) {
            sql.SET("lock_mode = #{record.lockMode,jdbcType=VARCHAR}");
        }
        
        if (record.getLockType() != null) {
            sql.SET("lock_type = #{record.lockType,jdbcType=VARCHAR}");
        }
        
        if (record.getLockTable() != null) {
            sql.SET("lock_table = #{record.lockTable,jdbcType=VARCHAR}");
        }
        
        if (record.getLockIndex() != null) {
            sql.SET("lock_index = #{record.lockIndex,jdbcType=VARCHAR}");
        }
        
        if (record.getLockSpace() != null) {
            sql.SET("lock_space = #{record.lockSpace,jdbcType=BIGINT}");
        }
        
        if (record.getLockPage() != null) {
            sql.SET("lock_page = #{record.lockPage,jdbcType=BIGINT}");
        }
        
        if (record.getLockRec() != null) {
            sql.SET("lock_rec = #{record.lockRec,jdbcType=BIGINT}");
        }
        
        if (record.getLockData() != null) {
            sql.SET("lock_data = #{record.lockData,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_LOCKS");
        
        sql.SET("lock_id = #{record.lockId,jdbcType=VARCHAR}");
        sql.SET("lock_trx_id = #{record.lockTrxId,jdbcType=VARCHAR}");
        sql.SET("lock_mode = #{record.lockMode,jdbcType=VARCHAR}");
        sql.SET("lock_type = #{record.lockType,jdbcType=VARCHAR}");
        sql.SET("lock_table = #{record.lockTable,jdbcType=VARCHAR}");
        sql.SET("lock_index = #{record.lockIndex,jdbcType=VARCHAR}");
        sql.SET("lock_space = #{record.lockSpace,jdbcType=BIGINT}");
        sql.SET("lock_page = #{record.lockPage,jdbcType=BIGINT}");
        sql.SET("lock_rec = #{record.lockRec,jdbcType=BIGINT}");
        sql.SET("lock_data = #{record.lockData,jdbcType=VARCHAR}");
        
        InnodbLocksExample example = (InnodbLocksExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbLocksExample example, boolean includeExamplePhrase) {
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