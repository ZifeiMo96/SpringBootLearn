package com.example.demo.data.dao;

import com.example.demo.data.model.UserWalletLogs;
import com.example.demo.data.model.UserWalletLogsExample.Criteria;
import com.example.demo.data.model.UserWalletLogsExample.Criterion;
import com.example.demo.data.model.UserWalletLogsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserWalletLogsSqlProvider {
    public String countByExample(UserWalletLogsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_wallet_logs");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserWalletLogsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_wallet_logs");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserWalletLogs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_wallet_logs");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getSourceUserId() != null) {
            sql.VALUES("source_user_id", "#{sourceUserId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeAvailableAmount() != null) {
            sql.VALUES("change_available_amount", "#{changeAvailableAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeFreezeAmount() != null) {
            sql.VALUES("change_freeze_amount", "#{changeFreezeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeType() != null) {
            sql.VALUES("change_type", "#{changeType,jdbcType=SMALLINT}");
        }
        
        if (record.getChangeDesc() != null) {
            sql.VALUES("change_desc", "#{changeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWalletCashId() != null) {
            sql.VALUES("user_wallet_cash_id", "#{userWalletCashId,jdbcType=BIGINT}");
        }
        
        if (record.getQuestionId() != null) {
            sql.VALUES("question_id", "#{questionId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserWalletLogsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("source_user_id");
        sql.SELECT("change_available_amount");
        sql.SELECT("change_freeze_amount");
        sql.SELECT("change_type");
        sql.SELECT("change_desc");
        sql.SELECT("order_id");
        sql.SELECT("user_wallet_cash_id");
        sql.SELECT("question_id");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("user_wallet_logs");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserWalletLogs record = (UserWalletLogs) parameter.get("record");
        UserWalletLogsExample example = (UserWalletLogsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_wallet_logs");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getSourceUserId() != null) {
            sql.SET("source_user_id = #{record.sourceUserId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeAvailableAmount() != null) {
            sql.SET("change_available_amount = #{record.changeAvailableAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeFreezeAmount() != null) {
            sql.SET("change_freeze_amount = #{record.changeFreezeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeType() != null) {
            sql.SET("change_type = #{record.changeType,jdbcType=SMALLINT}");
        }
        
        if (record.getChangeDesc() != null) {
            sql.SET("change_desc = #{record.changeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWalletCashId() != null) {
            sql.SET("user_wallet_cash_id = #{record.userWalletCashId,jdbcType=BIGINT}");
        }
        
        if (record.getQuestionId() != null) {
            sql.SET("question_id = #{record.questionId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_wallet_logs");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("source_user_id = #{record.sourceUserId,jdbcType=BIGINT}");
        sql.SET("change_available_amount = #{record.changeAvailableAmount,jdbcType=DECIMAL}");
        sql.SET("change_freeze_amount = #{record.changeFreezeAmount,jdbcType=DECIMAL}");
        sql.SET("change_type = #{record.changeType,jdbcType=SMALLINT}");
        sql.SET("change_desc = #{record.changeDesc,jdbcType=VARCHAR}");
        sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("user_wallet_cash_id = #{record.userWalletCashId,jdbcType=BIGINT}");
        sql.SET("question_id = #{record.questionId,jdbcType=BIGINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        UserWalletLogsExample example = (UserWalletLogsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserWalletLogs record) {
        SQL sql = new SQL();
        sql.UPDATE("user_wallet_logs");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getSourceUserId() != null) {
            sql.SET("source_user_id = #{sourceUserId,jdbcType=BIGINT}");
        }
        
        if (record.getChangeAvailableAmount() != null) {
            sql.SET("change_available_amount = #{changeAvailableAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeFreezeAmount() != null) {
            sql.SET("change_freeze_amount = #{changeFreezeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getChangeType() != null) {
            sql.SET("change_type = #{changeType,jdbcType=SMALLINT}");
        }
        
        if (record.getChangeDesc() != null) {
            sql.SET("change_desc = #{changeDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getUserWalletCashId() != null) {
            sql.SET("user_wallet_cash_id = #{userWalletCashId,jdbcType=BIGINT}");
        }
        
        if (record.getQuestionId() != null) {
            sql.SET("question_id = #{questionId,jdbcType=BIGINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserWalletLogsExample example, boolean includeExamplePhrase) {
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