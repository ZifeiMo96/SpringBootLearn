package com.example.demo.data.dao;

import com.example.demo.data.model.Posts;
import com.example.demo.data.model.PostsExample.Criteria;
import com.example.demo.data.model.PostsExample.Criterion;
import com.example.demo.data.model.PostsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PostsSqlProvider {
    public String countByExample(PostsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("posts");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PostsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("posts");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Posts record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("posts");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.VALUES("thread_id", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyPostId() != null) {
            sql.VALUES("reply_post_id", "#{replyPostId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyUserId() != null) {
            sql.VALUES("reply_user_id", "#{replyUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.VALUES("port", "#{port,jdbcType=INTEGER}");
        }
        
        if (record.getReplyCount() != null) {
            sql.VALUES("reply_count", "#{replyCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikeCount() != null) {
            sql.VALUES("like_count", "#{likeCount,jdbcType=INTEGER}");
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
        
        if (record.getDeletedUserId() != null) {
            sql.VALUES("deleted_user_id", "#{deletedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.VALUES("is_first", "#{isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getIsComment() != null) {
            sql.VALUES("is_comment", "#{isComment,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.VALUES("is_approved", "#{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(PostsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("thread_id");
        sql.SELECT("reply_post_id");
        sql.SELECT("reply_user_id");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("reply_count");
        sql.SELECT("like_count");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.SELECT("deleted_user_id");
        sql.SELECT("is_first");
        sql.SELECT("is_comment");
        sql.SELECT("is_approved");
        sql.SELECT("content");
        sql.FROM("posts");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(PostsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("thread_id");
        sql.SELECT("reply_post_id");
        sql.SELECT("reply_user_id");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("reply_count");
        sql.SELECT("like_count");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.SELECT("deleted_user_id");
        sql.SELECT("is_first");
        sql.SELECT("is_comment");
        sql.SELECT("is_approved");
        sql.FROM("posts");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Posts record = (Posts) parameter.get("record");
        PostsExample example = (PostsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("posts");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyPostId() != null) {
            sql.SET("reply_post_id = #{record.replyPostId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyUserId() != null) {
            sql.SET("reply_user_id = #{record.replyUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.SET("port = #{record.port,jdbcType=INTEGER}");
        }
        
        if (record.getReplyCount() != null) {
            sql.SET("reply_count = #{record.replyCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikeCount() != null) {
            sql.SET("like_count = #{record.likeCount,jdbcType=INTEGER}");
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
        
        if (record.getDeletedUserId() != null) {
            sql.SET("deleted_user_id = #{record.deletedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.SET("is_first = #{record.isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getIsComment() != null) {
            sql.SET("is_comment = #{record.isComment,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("posts");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("reply_post_id = #{record.replyPostId,jdbcType=BIGINT}");
        sql.SET("reply_user_id = #{record.replyUserId,jdbcType=BIGINT}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("reply_count = #{record.replyCount,jdbcType=INTEGER}");
        sql.SET("like_count = #{record.likeCount,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_user_id = #{record.deletedUserId,jdbcType=BIGINT}");
        sql.SET("is_first = #{record.isFirst,jdbcType=TINYINT}");
        sql.SET("is_comment = #{record.isComment,jdbcType=TINYINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        sql.SET("content = #{record.content,jdbcType=LONGVARCHAR}");
        
        PostsExample example = (PostsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("posts");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("reply_post_id = #{record.replyPostId,jdbcType=BIGINT}");
        sql.SET("reply_user_id = #{record.replyUserId,jdbcType=BIGINT}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("reply_count = #{record.replyCount,jdbcType=INTEGER}");
        sql.SET("like_count = #{record.likeCount,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_user_id = #{record.deletedUserId,jdbcType=BIGINT}");
        sql.SET("is_first = #{record.isFirst,jdbcType=TINYINT}");
        sql.SET("is_comment = #{record.isComment,jdbcType=TINYINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        
        PostsExample example = (PostsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Posts record) {
        SQL sql = new SQL();
        sql.UPDATE("posts");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyPostId() != null) {
            sql.SET("reply_post_id = #{replyPostId,jdbcType=BIGINT}");
        }
        
        if (record.getReplyUserId() != null) {
            sql.SET("reply_user_id = #{replyUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.SET("port = #{port,jdbcType=INTEGER}");
        }
        
        if (record.getReplyCount() != null) {
            sql.SET("reply_count = #{replyCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikeCount() != null) {
            sql.SET("like_count = #{likeCount,jdbcType=INTEGER}");
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
        
        if (record.getDeletedUserId() != null) {
            sql.SET("deleted_user_id = #{deletedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getIsFirst() != null) {
            sql.SET("is_first = #{isFirst,jdbcType=TINYINT}");
        }
        
        if (record.getIsComment() != null) {
            sql.SET("is_comment = #{isComment,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PostsExample example, boolean includeExamplePhrase) {
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