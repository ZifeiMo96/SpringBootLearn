package com.example.demo.data.dao;

import com.example.demo.data.model.UserWalletCash;
import com.example.demo.data.model.UserWalletCashExample.Criteria;
import com.example.demo.data.model.UserWalletCashExample.Criterion;
import com.example.demo.data.model.UserWalletCashExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserWalletCashSqlProvider {
    public String countByExample(UserWalletCashExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_wallet_cash");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserWalletCashExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_wallet_cash");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserWalletCash record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_wallet_cash");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getCashSn() != null) {
            sql.VALUES("cash_sn", "#{cashSn,jdbcType=BIGINT}");
        }
        
        if (record.getCashCharge() != null) {
            sql.VALUES("cash_charge", "#{cashCharge,jdbcType=DECIMAL}");
        }
        
        if (record.getCashActualAmount() != null) {
            sql.VALUES("cash_actual_amount", "#{cashActualAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashApplyAmount() != null) {
            sql.VALUES("cash_apply_amount", "#{cashApplyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashStatus() != null) {
            sql.VALUES("cash_status", "#{cashStatus,jdbcType=TINYINT}");
        }
        
        if (record.getCashMobile() != null) {
            sql.VALUES("cash_mobile", "#{cashMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCashType() != null) {
            sql.VALUES("cash_type", "#{cashType,jdbcType=TINYINT}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getTradeTime() != null) {
            sql.VALUES("trade_time", "#{tradeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTradeNo() != null) {
            sql.VALUES("trade_no", "#{tradeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorCode() != null) {
            sql.VALUES("error_code", "#{errorCode,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorMessage() != null) {
            sql.VALUES("error_message", "#{errorMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundsStatus() != null) {
            sql.VALUES("refunds_status", "#{refundsStatus,jdbcType=TINYINT}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserWalletCashExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("cash_sn");
        sql.SELECT("cash_charge");
        sql.SELECT("cash_actual_amount");
        sql.SELECT("cash_apply_amount");
        sql.SELECT("cash_status");
        sql.SELECT("cash_mobile");
        sql.SELECT("cash_type");
        sql.SELECT("remark");
        sql.SELECT("trade_time");
        sql.SELECT("trade_no");
        sql.SELECT("error_code");
        sql.SELECT("error_message");
        sql.SELECT("refunds_status");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("user_wallet_cash");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserWalletCash record = (UserWalletCash) parameter.get("record");
        UserWalletCashExample example = (UserWalletCashExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_wallet_cash");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getCashSn() != null) {
            sql.SET("cash_sn = #{record.cashSn,jdbcType=BIGINT}");
        }
        
        if (record.getCashCharge() != null) {
            sql.SET("cash_charge = #{record.cashCharge,jdbcType=DECIMAL}");
        }
        
        if (record.getCashActualAmount() != null) {
            sql.SET("cash_actual_amount = #{record.cashActualAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashApplyAmount() != null) {
            sql.SET("cash_apply_amount = #{record.cashApplyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashStatus() != null) {
            sql.SET("cash_status = #{record.cashStatus,jdbcType=TINYINT}");
        }
        
        if (record.getCashMobile() != null) {
            sql.SET("cash_mobile = #{record.cashMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCashType() != null) {
            sql.SET("cash_type = #{record.cashType,jdbcType=TINYINT}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getTradeTime() != null) {
            sql.SET("trade_time = #{record.tradeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTradeNo() != null) {
            sql.SET("trade_no = #{record.tradeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorCode() != null) {
            sql.SET("error_code = #{record.errorCode,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorMessage() != null) {
            sql.SET("error_message = #{record.errorMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundsStatus() != null) {
            sql.SET("refunds_status = #{record.refundsStatus,jdbcType=TINYINT}");
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
        sql.UPDATE("user_wallet_cash");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("cash_sn = #{record.cashSn,jdbcType=BIGINT}");
        sql.SET("cash_charge = #{record.cashCharge,jdbcType=DECIMAL}");
        sql.SET("cash_actual_amount = #{record.cashActualAmount,jdbcType=DECIMAL}");
        sql.SET("cash_apply_amount = #{record.cashApplyAmount,jdbcType=DECIMAL}");
        sql.SET("cash_status = #{record.cashStatus,jdbcType=TINYINT}");
        sql.SET("cash_mobile = #{record.cashMobile,jdbcType=VARCHAR}");
        sql.SET("cash_type = #{record.cashType,jdbcType=TINYINT}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("trade_time = #{record.tradeTime,jdbcType=TIMESTAMP}");
        sql.SET("trade_no = #{record.tradeNo,jdbcType=VARCHAR}");
        sql.SET("error_code = #{record.errorCode,jdbcType=VARCHAR}");
        sql.SET("error_message = #{record.errorMessage,jdbcType=VARCHAR}");
        sql.SET("refunds_status = #{record.refundsStatus,jdbcType=TINYINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        UserWalletCashExample example = (UserWalletCashExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserWalletCash record) {
        SQL sql = new SQL();
        sql.UPDATE("user_wallet_cash");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getCashSn() != null) {
            sql.SET("cash_sn = #{cashSn,jdbcType=BIGINT}");
        }
        
        if (record.getCashCharge() != null) {
            sql.SET("cash_charge = #{cashCharge,jdbcType=DECIMAL}");
        }
        
        if (record.getCashActualAmount() != null) {
            sql.SET("cash_actual_amount = #{cashActualAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashApplyAmount() != null) {
            sql.SET("cash_apply_amount = #{cashApplyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getCashStatus() != null) {
            sql.SET("cash_status = #{cashStatus,jdbcType=TINYINT}");
        }
        
        if (record.getCashMobile() != null) {
            sql.SET("cash_mobile = #{cashMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCashType() != null) {
            sql.SET("cash_type = #{cashType,jdbcType=TINYINT}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getTradeTime() != null) {
            sql.SET("trade_time = #{tradeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTradeNo() != null) {
            sql.SET("trade_no = #{tradeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorCode() != null) {
            sql.SET("error_code = #{errorCode,jdbcType=VARCHAR}");
        }
        
        if (record.getErrorMessage() != null) {
            sql.SET("error_message = #{errorMessage,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundsStatus() != null) {
            sql.SET("refunds_status = #{refundsStatus,jdbcType=TINYINT}");
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

    protected void applyWhere(SQL sql, UserWalletCashExample example, boolean includeExamplePhrase) {
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