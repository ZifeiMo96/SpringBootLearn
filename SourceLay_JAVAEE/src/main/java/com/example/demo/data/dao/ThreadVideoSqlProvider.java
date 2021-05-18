package com.example.demo.data.dao;

import com.example.demo.data.model.ThreadVideo;
import com.example.demo.data.model.ThreadVideoExample.Criteria;
import com.example.demo.data.model.ThreadVideoExample.Criterion;
import com.example.demo.data.model.ThreadVideoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ThreadVideoSqlProvider {
    public String countByExample(ThreadVideoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("thread_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ThreadVideoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("thread_video");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ThreadVideo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("thread_video");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.VALUES("thread_id", "#{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.VALUES("post_id", "#{postId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.VALUES("file_name", "#{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            sql.VALUES("file_id", "#{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getHeight() != null) {
            sql.VALUES("height", "#{height,jdbcType=INTEGER}");
        }
        
        if (record.getWidth() != null) {
            sql.VALUES("width", "#{width,jdbcType=INTEGER}");
        }
        
        if (record.getDuration() != null) {
            sql.VALUES("duration", "#{duration,jdbcType=DECIMAL}");
        }
        
        if (record.getMediaUrl() != null) {
            sql.VALUES("media_url", "#{mediaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCoverUrl() != null) {
            sql.VALUES("cover_url", "#{coverUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ThreadVideoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("thread_id");
        sql.SELECT("post_id");
        sql.SELECT("user_id");
        sql.SELECT("type");
        sql.SELECT("status");
        sql.SELECT("reason");
        sql.SELECT("file_name");
        sql.SELECT("file_id");
        sql.SELECT("height");
        sql.SELECT("width");
        sql.SELECT("duration");
        sql.SELECT("media_url");
        sql.SELECT("cover_url");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("thread_video");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ThreadVideo record = (ThreadVideo) parameter.get("record");
        ThreadVideoExample example = (ThreadVideoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("thread_video");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("height = #{record.height,jdbcType=INTEGER}");
        }
        
        if (record.getWidth() != null) {
            sql.SET("width = #{record.width,jdbcType=INTEGER}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{record.duration,jdbcType=DECIMAL}");
        }
        
        if (record.getMediaUrl() != null) {
            sql.SET("media_url = #{record.mediaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCoverUrl() != null) {
            sql.SET("cover_url = #{record.coverUrl,jdbcType=VARCHAR}");
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
        sql.UPDATE("thread_video");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("thread_id = #{record.threadId,jdbcType=BIGINT}");
        sql.SET("post_id = #{record.postId,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("type = #{record.type,jdbcType=TINYINT}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        sql.SET("file_id = #{record.fileId,jdbcType=VARCHAR}");
        sql.SET("height = #{record.height,jdbcType=INTEGER}");
        sql.SET("width = #{record.width,jdbcType=INTEGER}");
        sql.SET("duration = #{record.duration,jdbcType=DECIMAL}");
        sql.SET("media_url = #{record.mediaUrl,jdbcType=VARCHAR}");
        sql.SET("cover_url = #{record.coverUrl,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        ThreadVideoExample example = (ThreadVideoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ThreadVideo record) {
        SQL sql = new SQL();
        sql.UPDATE("thread_video");
        
        if (record.getThreadId() != null) {
            sql.SET("thread_id = #{threadId,jdbcType=BIGINT}");
        }
        
        if (record.getPostId() != null) {
            sql.SET("post_id = #{postId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileId() != null) {
            sql.SET("file_id = #{fileId,jdbcType=VARCHAR}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("height = #{height,jdbcType=INTEGER}");
        }
        
        if (record.getWidth() != null) {
            sql.SET("width = #{width,jdbcType=INTEGER}");
        }
        
        if (record.getDuration() != null) {
            sql.SET("duration = #{duration,jdbcType=DECIMAL}");
        }
        
        if (record.getMediaUrl() != null) {
            sql.SET("media_url = #{mediaUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getCoverUrl() != null) {
            sql.SET("cover_url = #{coverUrl,jdbcType=VARCHAR}");
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

    protected void applyWhere(SQL sql, ThreadVideoExample example, boolean includeExamplePhrase) {
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