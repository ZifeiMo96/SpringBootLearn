package com.example.demo.data.dao;

import com.example.demo.data.model.Questions;
import com.example.demo.data.model.QuestionsExample.Criteria;
import com.example.demo.data.model.QuestionsExample.Criterion;
import com.example.demo.data.model.QuestionsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class QuestionsSqlProvider {
    public String countByExample(QuestionsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("questions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(QuestionsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("questions");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Questions record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("questions");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.VALUES("thread_id", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBeUserId() != null) {
            sql.VALUES("be_user_id", "#{beUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.VALUES("port", "#{port,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerUnitPrice() != null) {
            sql.VALUES("onlooker_unit_price", "#{onlookerUnitPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerPrice() != null) {
            sql.VALUES("onlooker_price", "#{onlookerPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerNumber() != null) {
            sql.VALUES("onlooker_number", "#{onlookerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getIsOnlooker() != null) {
            sql.VALUES("is_onlooker", "#{isOnlooker,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnswer() != null) {
            sql.VALUES("is_answer", "#{isAnswer,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.VALUES("is_approved", "#{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.VALUES("expired_at", "#{expiredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnsweredAt() != null) {
            sql.VALUES("answered_at", "#{answeredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(QuestionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("thread_id");
        sql.SELECT("user_id");
        sql.SELECT("be_user_id");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("price");
        sql.SELECT("onlooker_unit_price");
        sql.SELECT("onlooker_price");
        sql.SELECT("onlooker_number");
        sql.SELECT("is_onlooker");
        sql.SELECT("is_answer");
        sql.SELECT("is_approved");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.SELECT("expired_at");
        sql.SELECT("answered_at");
        sql.SELECT("content");
        sql.FROM("questions");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(QuestionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("thread_id");
        sql.SELECT("user_id");
        sql.SELECT("be_user_id");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("price");
        sql.SELECT("onlooker_unit_price");
        sql.SELECT("onlooker_price");
        sql.SELECT("onlooker_number");
        sql.SELECT("is_onlooker");
        sql.SELECT("is_answer");
        sql.SELECT("is_approved");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.SELECT("expired_at");
        sql.SELECT("answered_at");
        sql.FROM("questions");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Questions record = (Questions) parameter.get("record");
        QuestionsExample example = (QuestionsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("questions");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getBeUserId() != null) {
            sql.SET("be_user_id = #{record.beUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.SET("port = #{record.port,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerUnitPrice() != null) {
            sql.SET("onlooker_unit_price = #{record.onlookerUnitPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerPrice() != null) {
            sql.SET("onlooker_price = #{record.onlookerPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerNumber() != null) {
            sql.SET("onlooker_number = #{record.onlookerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getIsOnlooker() != null) {
            sql.SET("is_onlooker = #{record.isOnlooker,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnswer() != null) {
            sql.SET("is_answer = #{record.isAnswer,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnsweredAt() != null) {
            sql.SET("answered_at = #{record.answeredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("questions");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("be_user_id = #{record.beUserId,jdbcType=BIGINT}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("price = #{record.price,jdbcType=DECIMAL}");
        sql.SET("onlooker_unit_price = #{record.onlookerUnitPrice,jdbcType=DECIMAL}");
        sql.SET("onlooker_price = #{record.onlookerPrice,jdbcType=DECIMAL}");
        sql.SET("onlooker_number = #{record.onlookerNumber,jdbcType=BIGINT}");
        sql.SET("is_onlooker = #{record.isOnlooker,jdbcType=TINYINT}");
        sql.SET("is_answer = #{record.isAnswer,jdbcType=TINYINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
        sql.SET("answered_at = #{record.answeredAt,jdbcType=TIMESTAMP}");
        sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        
        QuestionsExample example = (QuestionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("questions");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("be_user_id = #{record.beUserId,jdbcType=BIGINT}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("price = #{record.price,jdbcType=DECIMAL}");
        sql.SET("onlooker_unit_price = #{record.onlookerUnitPrice,jdbcType=DECIMAL}");
        sql.SET("onlooker_price = #{record.onlookerPrice,jdbcType=DECIMAL}");
        sql.SET("onlooker_number = #{record.onlookerNumber,jdbcType=BIGINT}");
        sql.SET("is_onlooker = #{record.isOnlooker,jdbcType=TINYINT}");
        sql.SET("is_answer = #{record.isAnswer,jdbcType=TINYINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
        sql.SET("answered_at = #{record.answeredAt,jdbcType=TIMESTAMP}");
        
        QuestionsExample example = (QuestionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Questions record) {
        SQL sql = new SQL();
        sql.UPDATE("questions");
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getBeUserId() != null) {
            sql.SET("be_user_id = #{beUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.SET("port = #{port,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerUnitPrice() != null) {
            sql.SET("onlooker_unit_price = #{onlookerUnitPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerPrice() != null) {
            sql.SET("onlooker_price = #{onlookerPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOnlookerNumber() != null) {
            sql.SET("onlooker_number = #{onlookerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getIsOnlooker() != null) {
            sql.SET("is_onlooker = #{isOnlooker,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnswer() != null) {
            sql.SET("is_answer = #{isAnswer,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{expiredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnsweredAt() != null) {
            sql.SET("answered_at = #{answeredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, QuestionsExample example, boolean includeExamplePhrase) {
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