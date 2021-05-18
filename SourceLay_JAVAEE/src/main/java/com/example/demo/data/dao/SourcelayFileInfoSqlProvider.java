package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileInfo;
import com.example.demo.data.model.SourcelayFileInfoExample.Criteria;
import com.example.demo.data.model.SourcelayFileInfoExample.Criterion;
import com.example.demo.data.model.SourcelayFileInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SourcelayFileInfoSqlProvider {
    public String countByExample(SourcelayFileInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sourcelay_file_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SourcelayFileInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sourcelay_file_info");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(SourcelayFileInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sourcelay_file_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getFolder() != null) {
            sql.VALUES("folder", "#{folder,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.VALUES("size", "#{size,jdbcType=BIGINT}");
        }
        
        if (record.getMd5() != null) {
            sql.VALUES("md5", "#{md5,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.VALUES("download_count", "#{downloadCount,jdbcType=INTEGER}");
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
        
        if (record.getIsShared() != null) {
            sql.VALUES("is_shared", "#{isShared,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.VALUES("is_essence", "#{isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.VALUES("deleted_at", "#{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedId() != null) {
            sql.VALUES("deleted_id", "#{deletedId,jdbcType=BIGINT}");
        }
        
        if (record.getRandomId() != null) {
            sql.VALUES("random_id", "#{randomId,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageName() != null) {
            sql.VALUES("storage_name", "#{storageName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SourcelayFileInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("name");
        sql.SELECT("type");
        sql.SELECT("folder");
        sql.SELECT("size");
        sql.SELECT("md5");
        sql.SELECT("status");
        sql.SELECT("download_count");
        sql.SELECT("like_count");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("is_shared");
        sql.SELECT("is_essence");
        sql.SELECT("deleted_at");
        sql.SELECT("deleted_id");
        sql.SELECT("random_id");
        sql.SELECT("storage_name");
        sql.FROM("sourcelay_file_info");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SourcelayFileInfo record = (SourcelayFileInfo) parameter.get("record");
        SourcelayFileInfoExample example = (SourcelayFileInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_file_info");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getFolder() != null) {
            sql.SET("folder = #{record.folder,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.SET("size = #{record.size,jdbcType=BIGINT}");
        }
        
        if (record.getMd5() != null) {
            sql.SET("md5 = #{record.md5,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.SET("download_count = #{record.downloadCount,jdbcType=INTEGER}");
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
        
        if (record.getIsShared() != null) {
            sql.SET("is_shared = #{record.isShared,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.SET("is_essence = #{record.isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedId() != null) {
            sql.SET("deleted_id = #{record.deletedId,jdbcType=BIGINT}");
        }
        
        if (record.getRandomId() != null) {
            sql.SET("random_id = #{record.randomId,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageName() != null) {
            sql.SET("storage_name = #{record.storageName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_file_info");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        sql.SET("folder = #{record.folder,jdbcType=VARCHAR}");
        sql.SET("size = #{record.size,jdbcType=BIGINT}");
        sql.SET("md5 = #{record.md5,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=SMALLINT}");
        sql.SET("download_count = #{record.downloadCount,jdbcType=INTEGER}");
        sql.SET("like_count = #{record.likeCount,jdbcType=INTEGER}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("is_shared = #{record.isShared,jdbcType=TINYINT}");
        sql.SET("is_essence = #{record.isEssence,jdbcType=TINYINT}");
        sql.SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        sql.SET("deleted_id = #{record.deletedId,jdbcType=BIGINT}");
        sql.SET("random_id = #{record.randomId,jdbcType=VARCHAR}");
        sql.SET("storage_name = #{record.storageName,jdbcType=VARCHAR}");
        
        SourcelayFileInfoExample example = (SourcelayFileInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SourcelayFileInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("sourcelay_file_info");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getFolder() != null) {
            sql.SET("folder = #{folder,jdbcType=VARCHAR}");
        }
        
        if (record.getSize() != null) {
            sql.SET("size = #{size,jdbcType=BIGINT}");
        }
        
        if (record.getMd5() != null) {
            sql.SET("md5 = #{md5,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        if (record.getDownloadCount() != null) {
            sql.SET("download_count = #{downloadCount,jdbcType=INTEGER}");
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
        
        if (record.getIsShared() != null) {
            sql.SET("is_shared = #{isShared,jdbcType=TINYINT}");
        }
        
        if (record.getIsEssence() != null) {
            sql.SET("is_essence = #{isEssence,jdbcType=TINYINT}");
        }
        
        if (record.getDeletedAt() != null) {
            sql.SET("deleted_at = #{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeletedId() != null) {
            sql.SET("deleted_id = #{deletedId,jdbcType=BIGINT}");
        }
        
        if (record.getRandomId() != null) {
            sql.SET("random_id = #{randomId,jdbcType=VARCHAR}");
        }
        
        if (record.getStorageName() != null) {
            sql.SET("storage_name = #{storageName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SourcelayFileInfoExample example, boolean includeExamplePhrase) {
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