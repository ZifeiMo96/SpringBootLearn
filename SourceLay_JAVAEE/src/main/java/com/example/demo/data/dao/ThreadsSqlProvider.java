package com.example.demo.data.dao;

import com.example.demo.data.model.Threads;
import com.example.demo.data.model.ThreadsExample.Criteria;
import com.example.demo.data.model.ThreadsExample.Criterion;
import com.example.demo.data.model.ThreadsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ThreadsSqlProvider {
    public String countByExample(ThreadsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("threads");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ThreadsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("threads");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Threads record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("threads");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLastPostedUserId() != null) {
            sql.VALUES("last_posted_user_id", "#{lastPostedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.VALUES("category_id", "#{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getAttachmentPrice() != null) {
            sql.VALUES("attachment_price", "#{attachmentPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFreeWords() != null) {
            sql.VALUES("free_words", "#{freeWords,jdbcType=DOUBLE}");
        }
        
        if (record.getPostCount() != null) {
            sql.VALUES("post_count", "#{postCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.VALUES("view_count", "#{viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardedCount() != null) {
            sql.VALUES("rewarded_count", "#{rewardedCount,jdbcType=INTEGER}");
        }
        
        if (record.getPaidCount() != null) {
            sql.VALUES("paid_count", "#{paidCount,jdbcType=INTEGER}");
        }
        
        if (record.getLongitude() != null) {
            sql.VALUES("longitude", "#{longitude,jdbcType=DECIMAL}");
        }
        
        if (record.getLatitude() != null) {
            sql.VALUES("latitude", "#{latitude,jdbcType=DECIMAL}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.VALUES("location", "#{location,jdbcType=VARCHAR}");
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
        
        if (record.getIsApproved() != null) {
            sql.VALUES("is_approved", "#{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getIsSticky() != null) {
            sql.VALUES("is_sticky", "#{isSticky,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.VALUES("is_essence", "#{isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getIsSite() != null) {
            sql.VALUES("is_site", "#{isSite,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.VALUES("is_anonymous", "#{isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.VALUES("is_display", "#{isDisplay,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ThreadsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("last_posted_user_id");
        sql.SELECT("category_id");
        sql.SELECT("type");
        sql.SELECT("title");
        sql.SELECT("price");
        sql.SELECT("attachment_price");
        sql.SELECT("free_words");
        sql.SELECT("post_count");
        sql.SELECT("view_count");
        sql.SELECT("rewarded_count");
        sql.SELECT("paid_count");
        sql.SELECT("longitude");
        sql.SELECT("latitude");
        sql.SELECT("address");
        sql.SELECT("location");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.SELECT("deleted_user_id");
        sql.SELECT("is_approved");
        sql.SELECT("is_sticky");
        sql.SELECT("is_essence");
        sql.SELECT("is_site");
        sql.SELECT("is_anonymous");
        sql.SELECT("is_display");
        sql.FROM("threads");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Threads record = (Threads) parameter.get("record");
        ThreadsExample example = (ThreadsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("threads");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getLastPostedUserId() != null) {
            sql.SET("last_posted_user_id = #{record.lastPostedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=DECIMAL}");
        }
        
        if (record.getAttachmentPrice() != null) {
            sql.SET("attachment_price = #{record.attachmentPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFreeWords() != null) {
            sql.SET("free_words = #{record.freeWords,jdbcType=DOUBLE}");
        }
        
        if (record.getPostCount() != null) {
            sql.SET("post_count = #{record.postCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.SET("view_count = #{record.viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardedCount() != null) {
            sql.SET("rewarded_count = #{record.rewardedCount,jdbcType=INTEGER}");
        }
        
        if (record.getPaidCount() != null) {
            sql.SET("paid_count = #{record.paidCount,jdbcType=INTEGER}");
        }
        
        if (record.getLongitude() != null) {
            sql.SET("longitude = #{record.longitude,jdbcType=DECIMAL}");
        }
        
        if (record.getLatitude() != null) {
            sql.SET("latitude = #{record.latitude,jdbcType=DECIMAL}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.SET("location = #{record.location,jdbcType=VARCHAR}");
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
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getIsSticky() != null) {
            sql.SET("is_sticky = #{record.isSticky,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.SET("is_essence = #{record.isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getIsSite() != null) {
            sql.SET("is_site = #{record.isSite,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.SET("is_anonymous = #{record.isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.SET("is_display = #{record.isDisplay,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("threads");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("last_posted_user_id = #{record.lastPostedUserId,jdbcType=BIGINT}");
        sql.SET("category_id = #{record.categoryId,jdbcType=INTEGER}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("price = #{record.price,jdbcType=DECIMAL}");
        sql.SET("attachment_price = #{record.attachmentPrice,jdbcType=DECIMAL}");
        sql.SET("free_words = #{record.freeWords,jdbcType=DOUBLE}");
        sql.SET("post_count = #{record.postCount,jdbcType=INTEGER}");
        sql.SET("view_count = #{record.viewCount,jdbcType=INTEGER}");
        sql.SET("rewarded_count = #{record.rewardedCount,jdbcType=INTEGER}");
        sql.SET("paid_count = #{record.paidCount,jdbcType=INTEGER}");
        sql.SET("longitude = #{record.longitude,jdbcType=DECIMAL}");
        sql.SET("latitude = #{record.latitude,jdbcType=DECIMAL}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("location = #{record.location,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_user_id = #{record.deletedUserId,jdbcType=BIGINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        sql.SET("is_sticky = #{record.isSticky,jdbcType=TINYINT}");
        sql.SET("is_essence = #{record.isEssence,jdbcType=TINYINT}");
        sql.SET("is_site = #{record.isSite,jdbcType=TINYINT}");
        sql.SET("is_anonymous = #{record.isAnonymous,jdbcType=TINYINT}");
        sql.SET("is_display = #{record.isDisplay,jdbcType=TINYINT}");
        
        ThreadsExample example = (ThreadsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Threads record) {
        SQL sql = new SQL();
        sql.UPDATE("threads");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getLastPostedUserId() != null) {
            sql.SET("last_posted_user_id = #{lastPostedUserId,jdbcType=BIGINT}");
        }
        
        if (record.getCategoryId() != null) {
            sql.SET("category_id = #{categoryId,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getAttachmentPrice() != null) {
            sql.SET("attachment_price = #{attachmentPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getFreeWords() != null) {
            sql.SET("free_words = #{freeWords,jdbcType=DOUBLE}");
        }
        
        if (record.getPostCount() != null) {
            sql.SET("post_count = #{postCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.SET("view_count = #{viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getRewardedCount() != null) {
            sql.SET("rewarded_count = #{rewardedCount,jdbcType=INTEGER}");
        }
        
        if (record.getPaidCount() != null) {
            sql.SET("paid_count = #{paidCount,jdbcType=INTEGER}");
        }
        
        if (record.getLongitude() != null) {
            sql.SET("longitude = #{longitude,jdbcType=DECIMAL}");
        }
        
        if (record.getLatitude() != null) {
            sql.SET("latitude = #{latitude,jdbcType=DECIMAL}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getLocation() != null) {
            sql.SET("location = #{location,jdbcType=VARCHAR}");
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
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getIsSticky() != null) {
            sql.SET("is_sticky = #{isSticky,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.SET("is_essence = #{isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getIsSite() != null) {
            sql.SET("is_site = #{isSite,jdbcType=TINYINT}");
        }
        
        if (record.getIsAnonymous() != null) {
            sql.SET("is_anonymous = #{isAnonymous,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.SET("is_display = #{isDisplay,jdbcType=TINYINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ThreadsExample example, boolean includeExamplePhrase) {
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