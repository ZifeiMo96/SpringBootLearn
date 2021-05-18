package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayTagInfo;
import com.example.demo.data.model.SourcelayTagInfoExample.Criteria;
import com.example.demo.data.model.SourcelayTagInfoExample.Criterion;
import com.example.demo.data.model.SourcelayTagInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SourcelayTagInfoSqlProvider {
    public String countByExample(SourcelayTagInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sourcelay_tag_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SourcelayTagInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sourcelay_tag_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SourcelayTagInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sourcelay_tag_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getFileCount() != null) {
            sql.VALUES("file_count", "#{fileCount,jdbcType=INTEGER}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.VALUES("download_count", "#{downloadCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.VALUES("view_count", "#{viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsRecommended() != null) {
            sql.VALUES("is_recommended", "#{isRecommended,jdbcType=TINYINT}");
        }
        
        if (record.getRecommendedAt() != null) {
            sql.VALUES("recommended_at", "#{recommendedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SourcelayTagInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("user_id");
        sql.SELECT("file_count");
        sql.SELECT("download_count");
        sql.SELECT("view_count");
        sql.SELECT("is_recommended");
        sql.SELECT("recommended_at");
        sql.FROM("sourcelay_tag_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SourcelayTagInfo record = (SourcelayTagInfo) parameter.get("record");
        SourcelayTagInfoExample example = (SourcelayTagInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_tag_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getFileCount() != null) {
            sql.SET("file_count = #{record.fileCount,jdbcType=INTEGER}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.SET("download_count = #{record.downloadCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.SET("view_count = #{record.viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsRecommended() != null) {
            sql.SET("is_recommended = #{record.isRecommended,jdbcType=TINYINT}");
        }
        
        if (record.getRecommendedAt() != null) {
            sql.SET("recommended_at = #{record.recommendedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_tag_info");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("file_count = #{record.fileCount,jdbcType=INTEGER}");
        sql.SET("download_count = #{record.downloadCount,jdbcType=INTEGER}");
        sql.SET("view_count = #{record.viewCount,jdbcType=INTEGER}");
        sql.SET("is_recommended = #{record.isRecommended,jdbcType=TINYINT}");
        sql.SET("recommended_at = #{record.recommendedAt,jdbcType=TIMESTAMP}");
        
        SourcelayTagInfoExample example = (SourcelayTagInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SourcelayTagInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_tag_info");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getFileCount() != null) {
            sql.SET("file_count = #{fileCount,jdbcType=INTEGER}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.SET("download_count = #{downloadCount,jdbcType=INTEGER}");
        }
        
        if (record.getViewCount() != null) {
            sql.SET("view_count = #{viewCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsRecommended() != null) {
            sql.SET("is_recommended = #{isRecommended,jdbcType=TINYINT}");
        }
        
        if (record.getRecommendedAt() != null) {
            sql.SET("recommended_at = #{recommendedAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SourcelayTagInfoExample example, boolean includeExamplePhrase) {
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