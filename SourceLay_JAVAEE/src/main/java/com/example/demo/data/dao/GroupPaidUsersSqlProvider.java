package com.example.demo.data.dao;

import com.example.demo.data.model.GroupPaidUsers;
import com.example.demo.data.model.GroupPaidUsersExample.Criteria;
import com.example.demo.data.model.GroupPaidUsersExample.Criterion;
import com.example.demo.data.model.GroupPaidUsersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GroupPaidUsersSqlProvider {
    public String countByExample(GroupPaidUsersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("group_paid_users");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GroupPaidUsersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("group_paid_users");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GroupPaidUsers record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("group_paid_users");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.VALUES("group_id", "#{groupId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=BIGINT}");
        }
        
        if (record.getDeleteType() != null) {
            sql.VALUES("delete_type", "#{deleteType,jdbcType=TINYINT}");
        }
        
        if (record.getExpirationTime() != null) {
            sql.VALUES("expiration_time", "#{expirationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.VALUES("deleted_at", "#{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(GroupPaidUsersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("group_id");
        sql.SELECT("order_id");
        sql.SELECT("operator_id");
        sql.SELECT("delete_type");
        sql.SELECT("expiration_time");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.FROM("group_paid_users");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GroupPaidUsers record = (GroupPaidUsers) parameter.get("record");
        GroupPaidUsersExample example = (GroupPaidUsersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("group_paid_users");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{record.groupId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{record.operatorId,jdbcType=BIGINT}");
        }
        
        if (record.getDeleteType() != null) {
            sql.SET("delete_type = #{record.deleteType,jdbcType=TINYINT}");
        }
        
        if (record.getExpirationTime() != null) {
            sql.SET("expiration_time = #{record.expirationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("group_paid_users");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("group_id = #{record.groupId,jdbcType=BIGINT}");
        sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("operator_id = #{record.operatorId,jdbcType=BIGINT}");
        sql.SET("delete_type = #{record.deleteType,jdbcType=TINYINT}");
        sql.SET("expiration_time = #{record.expirationTime,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        
        GroupPaidUsersExample example = (GroupPaidUsersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GroupPaidUsers record) {
        SQL sql = new SQL();
        sql.UPDATE("group_paid_users");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{groupId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=BIGINT}");
        }
        
        if (record.getDeleteType() != null) {
            sql.SET("delete_type = #{deleteType,jdbcType=TINYINT}");
        }
        
        if (record.getExpirationTime() != null) {
            sql.SET("expiration_time = #{expirationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.SET("deleted_at = #{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GroupPaidUsersExample example, boolean includeExamplePhrase) {
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