package com.example.demo.data.dao;

import com.example.demo.data.model.Finance;
import com.example.demo.data.model.FinanceExample.Criteria;
import com.example.demo.data.model.FinanceExample.Criterion;
import com.example.demo.data.model.FinanceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinanceSqlProvider {
    public String countByExample(FinanceExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("finance");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FinanceExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("finance");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Finance record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("finance");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getIncome() != null) {
            sql.VALUES("income", "#{income,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawal() != null) {
            sql.VALUES("withdrawal", "#{withdrawal,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderCount() != null) {
            sql.VALUES("order_count", "#{orderCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.VALUES("order_amount", "#{orderAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalProfit() != null) {
            sql.VALUES("total_profit", "#{totalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getRegisterProfit() != null) {
            sql.VALUES("register_profit", "#{registerProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterPortion() != null) {
            sql.VALUES("master_portion", "#{masterPortion,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawalProfit() != null) {
            sql.VALUES("withdrawal_profit", "#{withdrawalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FinanceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("income");
        sql.SELECT("withdrawal");
        sql.SELECT("order_count");
        sql.SELECT("order_amount");
        sql.SELECT("total_profit");
        sql.SELECT("register_profit");
        sql.SELECT("master_portion");
        sql.SELECT("withdrawal_profit");
        sql.SELECT("created_at");
        sql.FROM("finance");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Finance record = (Finance) parameter.get("record");
        FinanceExample example = (FinanceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getIncome() != null) {
            sql.SET("income = #{record.income,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawal() != null) {
            sql.SET("withdrawal = #{record.withdrawal,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderCount() != null) {
            sql.SET("order_count = #{record.orderCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.SET("order_amount = #{record.orderAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalProfit() != null) {
            sql.SET("total_profit = #{record.totalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getRegisterProfit() != null) {
            sql.SET("register_profit = #{record.registerProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterPortion() != null) {
            sql.SET("master_portion = #{record.masterPortion,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawalProfit() != null) {
            sql.SET("withdrawal_profit = #{record.withdrawalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=DATE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("income = #{record.income,jdbcType=DECIMAL}");
        sql.SET("withdrawal = #{record.withdrawal,jdbcType=DECIMAL}");
        sql.SET("order_count = #{record.orderCount,jdbcType=INTEGER}");
        sql.SET("order_amount = #{record.orderAmount,jdbcType=DECIMAL}");
        sql.SET("total_profit = #{record.totalProfit,jdbcType=DECIMAL}");
        sql.SET("register_profit = #{record.registerProfit,jdbcType=DECIMAL}");
        sql.SET("master_portion = #{record.masterPortion,jdbcType=DECIMAL}");
        sql.SET("withdrawal_profit = #{record.withdrawalProfit,jdbcType=DECIMAL}");
        sql.SET("created_at = #{record.createdAt,jdbcType=DATE}");
        
        FinanceExample example = (FinanceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Finance record) {
        SQL sql = new SQL();
        sql.UPDATE("finance");
        
        if (record.getIncome() != null) {
            sql.SET("income = #{income,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawal() != null) {
            sql.SET("withdrawal = #{withdrawal,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderCount() != null) {
            sql.SET("order_count = #{orderCount,jdbcType=INTEGER}");
        }
        
        if (record.getOrderAmount() != null) {
            sql.SET("order_amount = #{orderAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalProfit() != null) {
            sql.SET("total_profit = #{totalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getRegisterProfit() != null) {
            sql.SET("register_profit = #{registerProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterPortion() != null) {
            sql.SET("master_portion = #{masterPortion,jdbcType=DECIMAL}");
        }
        
        if (record.getWithdrawalProfit() != null) {
            sql.SET("withdrawal_profit = #{withdrawalProfit,jdbcType=DECIMAL}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=DATE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FinanceExample example, boolean includeExamplePhrase) {
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