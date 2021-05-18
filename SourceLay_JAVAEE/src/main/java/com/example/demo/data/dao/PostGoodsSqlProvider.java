package com.example.demo.data.dao;

import com.example.demo.data.model.PostGoodsExample.Criteria;
import com.example.demo.data.model.PostGoodsExample.Criterion;
import com.example.demo.data.model.PostGoodsExample;
import com.example.demo.data.model.PostGoodsWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PostGoodsSqlProvider {
    public String countByExample(PostGoodsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("post_goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PostGoodsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("post_goods");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PostGoodsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("post_goods");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.VALUES("post_id", "#{postId,jdbcType=BIGINT}");
        }
        
        if (record.getPlatformId() != null) {
            sql.VALUES("platform_id", "#{platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=VARCHAR}");
        }
        
        if (record.getImagePath() != null) {
            sql.VALUES("image_path", "#{imagePath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
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
        
        if (record.getReadyContent() != null) {
            sql.VALUES("ready_content", "#{readyContent,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getDetailContent() != null) {
            sql.VALUES("detail_content", "#{detailContent,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(PostGoodsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("post_id");
        sql.SELECT("platform_id");
        sql.SELECT("title");
        sql.SELECT("price");
        sql.SELECT("image_path");
        sql.SELECT("type");
        sql.SELECT("status");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.SELECT("ready_content");
        sql.SELECT("detail_content");
        sql.FROM("post_goods");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(PostGoodsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("post_id");
        sql.SELECT("platform_id");
        sql.SELECT("title");
        sql.SELECT("price");
        sql.SELECT("image_path");
        sql.SELECT("type");
        sql.SELECT("status");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("deleted_at");
        sql.FROM("post_goods");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PostGoodsWithBLOBs record = (PostGoodsWithBLOBs) parameter.get("record");
        PostGoodsExample example = (PostGoodsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("post_goods");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        }
        
        if (record.getPlatformId() != null) {
            sql.SET("platform_id = #{record.platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{record.price,jdbcType=VARCHAR}");
        }
        
        if (record.getImagePath() != null) {
            sql.SET("image_path = #{record.imagePath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
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
        
        if (record.getReadyContent() != null) {
            sql.SET("ready_content = #{record.readyContent,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getDetailContent() != null) {
            sql.SET("detail_content = #{record.detailContent,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("post_goods");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        sql.SET("platform_id = #{record.platformId,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("price = #{record.price,jdbcType=VARCHAR}");
        sql.SET("image_path = #{record.imagePath,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        sql.SET("ready_content = #{record.readyContent,jdbcType=LONGVARCHAR}");
        sql.SET("detail_content = #{record.detailContent,jdbcType=LONGVARCHAR}");
        
        PostGoodsExample example = (PostGoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("post_goods");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        sql.SET("platform_id = #{record.platformId,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("price = #{record.price,jdbcType=VARCHAR}");
        sql.SET("image_path = #{record.imagePath,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        
        PostGoodsExample example = (PostGoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PostGoodsWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("post_goods");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{postId,jdbcType=BIGINT}");
        }
        
        if (record.getPlatformId() != null) {
            sql.SET("platform_id = #{platformId,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=VARCHAR}");
        }
        
        if (record.getImagePath() != null) {
            sql.SET("image_path = #{imagePath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
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
        
        if (record.getReadyContent() != null) {
            sql.SET("ready_content = #{readyContent,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getDetailContent() != null) {
            sql.SET("detail_content = #{detailContent,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PostGoodsExample example, boolean includeExamplePhrase) {
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