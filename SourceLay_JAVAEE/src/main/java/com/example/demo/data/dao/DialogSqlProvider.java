package com.example.demo.data.dao;

import com.example.demo.data.model.Dialog;
import com.example.demo.data.model.DialogExample.Criteria;
import com.example.demo.data.model.DialogExample.Criterion;
import com.example.demo.data.model.DialogExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DialogSqlProvider {
    public String countByExample(DialogExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dialog");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DialogExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dialog");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Dialog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dialog");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getDialogMessageId() != null) {
            sql.VALUES("dialog_message_id", "#{dialogMessageId,jdbcType=BIGINT}");
        }
        
        if (record.getSenderUserId() != null) {
            sql.VALUES("sender_user_id", "#{senderUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientUserId() != null) {
            sql.VALUES("recipient_user_id", "#{recipientUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientReadAt() != null) {
            sql.VALUES("recipient_read_at", "#{recipientReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderReadAt() != null) {
            sql.VALUES("sender_read_at", "#{senderReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderDeletedAt() != null) {
            sql.VALUES("sender_deleted_at", "#{senderDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecipientDeletedAt() != null) {
            sql.VALUES("recipient_deleted_at", "#{recipientDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DialogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("dialog_message_id");
        sql.SELECT("sender_user_id");
        sql.SELECT("recipient_user_id");
        sql.SELECT("recipient_read_at");
        sql.SELECT("sender_read_at");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("sender_deleted_at");
        sql.SELECT("recipient_deleted_at");
        sql.FROM("dialog");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Dialog record = (Dialog) parameter.get("record");
        DialogExample example = (DialogExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dialog");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getDialogMessageId() != null) {
            sql.SET("dialog_message_id = #{record.dialogMessageId,jdbcType=BIGINT}");
        }
        
        if (record.getSenderUserId() != null) {
            sql.SET("sender_user_id = #{record.senderUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientUserId() != null) {
            sql.SET("recipient_user_id = #{record.recipientUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientReadAt() != null) {
            sql.SET("recipient_read_at = #{record.recipientReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderReadAt() != null) {
            sql.SET("sender_read_at = #{record.senderReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderDeletedAt() != null) {
            sql.SET("sender_deleted_at = #{record.senderDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecipientDeletedAt() != null) {
            sql.SET("recipient_deleted_at = #{record.recipientDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dialog");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("dialog_message_id = #{record.dialogMessageId,jdbcType=BIGINT}");
        sql.SET("sender_user_id = #{record.senderUserId,jdbcType=BIGINT}");
        sql.SET("recipient_user_id = #{record.recipientUserId,jdbcType=BIGINT}");
        sql.SET("recipient_read_at = #{record.recipientReadAt,jdbcType=TIMESTAMP}");
        sql.SET("sender_read_at = #{record.senderReadAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("sender_deleted_at = #{record.senderDeletedAt,jdbcType=TIMESTAMP}");
        sql.SET("recipient_deleted_at = #{record.recipientDeletedAt,jdbcType=TIMESTAMP}");
        
        DialogExample example = (DialogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Dialog record) {
        SQL sql = new SQL();
        sql.UPDATE("dialog");
        
        if (record.getDialogMessageId() != null) {
            sql.SET("dialog_message_id = #{dialogMessageId,jdbcType=BIGINT}");
        }
        
        if (record.getSenderUserId() != null) {
            sql.SET("sender_user_id = #{senderUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientUserId() != null) {
            sql.SET("recipient_user_id = #{recipientUserId,jdbcType=BIGINT}");
        }
        
        if (record.getRecipientReadAt() != null) {
            sql.SET("recipient_read_at = #{recipientReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderReadAt() != null) {
            sql.SET("sender_read_at = #{senderReadAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSenderDeletedAt() != null) {
            sql.SET("sender_deleted_at = #{senderDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecipientDeletedAt() != null) {
            sql.SET("recipient_deleted_at = #{recipientDeletedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DialogExample example, boolean includeExamplePhrase) {
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