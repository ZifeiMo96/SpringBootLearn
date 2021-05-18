package com.example.demo.data.dao;

import com.example.demo.data.model.Orders;
import com.example.demo.data.model.OrdersExample.Criteria;
import com.example.demo.data.model.OrdersExample.Criterion;
import com.example.demo.data.model.OrdersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrdersSqlProvider {
    public String countByExample(OrdersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("orders");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("orders");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Orders record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("orders");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderSn() != null) {
            sql.VALUES("order_sn", "#{orderSn,jdbcType=CHAR}");
        }
        
        if (record.getPaymentSn() != null) {
            sql.VALUES("payment_sn", "#{paymentSn,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterAmount() != null) {
            sql.VALUES("master_amount", "#{masterAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAuthorAmount() != null) {
            sql.VALUES("author_amount", "#{authorAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getThirdPartyAmount() != null) {
            sql.VALUES("third_party_amount", "#{thirdPartyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBeScale() != null) {
            sql.VALUES("be_scale", "#{beScale,jdbcType=DOUBLE}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayeeId() != null) {
            sql.VALUES("payee_id", "#{payeeId,jdbcType=BIGINT}");
        }
        
        if (record.getThirdPartyId() != null) {
            sql.VALUES("third_party_id", "#{thirdPartyId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.VALUES("group_id", "#{groupId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.VALUES("thread_id", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getPaymentType() != null) {
            sql.VALUES("payment_type", "#{paymentType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.VALUES("is_anonymous", "#{isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.VALUES("expired_at", "#{expiredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_sn");
        sql.SELECT("payment_sn");
        sql.SELECT("amount");
        sql.SELECT("master_amount");
        sql.SELECT("author_amount");
        sql.SELECT("third_party_amount");
        sql.SELECT("be_scale");
        sql.SELECT("user_id");
        sql.SELECT("payee_id");
        sql.SELECT("third_party_id");
        sql.SELECT("type");
        sql.SELECT("group_id");
        sql.SELECT("thread_id");
        sql.SELECT("status");
        sql.SELECT("payment_type");
        sql.SELECT("is_anonymous");
        sql.SELECT("expired_at");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("orders");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Orders record = (Orders) parameter.get("record");
        OrdersExample example = (OrdersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("orders");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{record.orderSn,jdbcType=CHAR}");
        }
        
        if (record.getPaymentSn() != null) {
            sql.SET("payment_sn = #{record.paymentSn,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterAmount() != null) {
            sql.SET("master_amount = #{record.masterAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAuthorAmount() != null) {
            sql.SET("author_amount = #{record.authorAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getThirdPartyAmount() != null) {
            sql.SET("third_party_amount = #{record.thirdPartyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBeScale() != null) {
            sql.SET("be_scale = #{record.beScale,jdbcType=DOUBLE}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayeeId() != null) {
            sql.SET("payee_id = #{record.payeeId,jdbcType=BIGINT}");
        }
        
        if (record.getThirdPartyId() != null) {
            sql.SET("third_party_id = #{record.thirdPartyId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=TINYINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{record.groupId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getPaymentType() != null) {
            sql.SET("payment_type = #{record.paymentType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.SET("is_anonymous = #{record.isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("orders");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("order_sn = #{record.orderSn,jdbcType=CHAR}");
        sql.SET("payment_sn = #{record.paymentSn,jdbcType=VARCHAR}");
        sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("master_amount = #{record.masterAmount,jdbcType=DECIMAL}");
        sql.SET("author_amount = #{record.authorAmount,jdbcType=DECIMAL}");
        sql.SET("third_party_amount = #{record.thirdPartyAmount,jdbcType=DECIMAL}");
        sql.SET("be_scale = #{record.beScale,jdbcType=DOUBLE}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("payee_id = #{record.payeeId,jdbcType=BIGINT}");
        sql.SET("third_party_id = #{record.thirdPartyId,jdbcType=BIGINT}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("group_id = #{record.groupId,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("payment_type = #{record.paymentType,jdbcType=SMALLINT}");
        sql.SET("is_anonymous = #{record.isAnonymous,jdbcType=TINYINT}");
        sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        OrdersExample example = (OrdersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Orders record) {
        SQL sql = new SQL();
        sql.UPDATE("orders");
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{orderSn,jdbcType=CHAR}");
        }
        
        if (record.getPaymentSn() != null) {
            sql.SET("payment_sn = #{paymentSn,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getMasterAmount() != null) {
            sql.SET("master_amount = #{masterAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAuthorAmount() != null) {
            sql.SET("author_amount = #{authorAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getThirdPartyAmount() != null) {
            sql.SET("third_party_amount = #{thirdPartyAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getBeScale() != null) {
            sql.SET("be_scale = #{beScale,jdbcType=DOUBLE}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPayeeId() != null) {
            sql.SET("payee_id = #{payeeId,jdbcType=BIGINT}");
        }
        
        if (record.getThirdPartyId() != null) {
            sql.SET("third_party_id = #{thirdPartyId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{groupId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getPaymentType() != null) {
            sql.SET("payment_type = #{paymentType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.SET("is_anonymous = #{isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{expiredAt,jdbcType=TIMESTAMP}");
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

    protected void applyWhere(SQL sql, OrdersExample example, boolean includeExamplePhrase) {
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