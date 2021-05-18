package com.example.demo.data.dao;

import com.example.demo.data.model.Attachments;
import com.example.demo.data.model.AttachmentsExample.Criteria;
import com.example.demo.data.model.AttachmentsExample.Criterion;
import com.example.demo.data.model.AttachmentsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AttachmentsSqlProvider {
    public String countByExample(AttachmentsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("attachments");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AttachmentsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("attachments");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Attachments record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("attachments");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUuid() != null) {
            sql.VALUES("uuid", "#{uuid,jdbcType=CHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTypeId() != null) {
            sql.VALUES("type_id", "#{typeId,jdbcType=BIGINT}");
        }
        
        if (record.getOrder() != null) {
            sql.VALUES("order", "#{order,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=SMALLINT}");
        }
        
        if (record.getIsRemote() != null) {
            sql.VALUES("is_remote", "#{isRemote,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.VALUES("is_approved", "#{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getAttachment() != null) {
            sql.VALUES("attachment", "#{attachment,jdbcType=VARCHAR}");
        }
        
        if (record.getFilePath() != null) {
            sql.VALUES("file_path", "#{filePath,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.VALUES("file_name", "#{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileSize() != null) {
            sql.VALUES("file_size", "#{fileSize,jdbcType=INTEGER}");
        }
        
        if (record.getFileType() != null) {
            sql.VALUES("file_type", "#{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AttachmentsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("uuid");
        sql.SELECT("user_id");
        sql.SELECT("type_id");
        sql.SELECT("order");
        sql.SELECT("type");
        sql.SELECT("is_remote");
        sql.SELECT("is_approved");
        sql.SELECT("attachment");
        sql.SELECT("file_path");
        sql.SELECT("file_name");
        sql.SELECT("file_size");
        sql.SELECT("file_type");
        sql.SELECT("ip");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("attachments");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Attachments record = (Attachments) parameter.get("record");
        AttachmentsExample example = (AttachmentsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("attachments");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUuid() != null) {
            sql.SET("uuid = #{record.uuid,jdbcType=CHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getTypeId() != null) {
            sql.SET("type_id = #{record.typeId,jdbcType=BIGINT}");
        }
        
        if (record.getOrder() != null) {
            sql.SET("order = #{record.order,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=SMALLINT}");
        }
        
        if (record.getIsRemote() != null) {
            sql.SET("is_remote = #{record.isRemote,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getAttachment() != null) {
            sql.SET("attachment = #{record.attachment,jdbcType=VARCHAR}");
        }
        
        if (record.getFilePath() != null) {
            sql.SET("file_path = #{record.filePath,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileSize() != null) {
            sql.SET("file_size = #{record.fileSize,jdbcType=INTEGER}");
        }
        
        if (record.getFileType() != null) {
            sql.SET("file_type = #{record.fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
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
        sql.UPDATE("attachments");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("uuid = #{record.uuid,jdbcType=CHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("type_id = #{record.typeId,jdbcType=BIGINT}");
        sql.SET("order = #{record.order,jdbcType=TINYINT}");
        sql.SET("type = #{record.type,jdbcType=SMALLINT}");
        sql.SET("is_remote = #{record.isRemote,jdbcType=TINYINT}");
        sql.SET("is_approved = #{record.isApproved,jdbcType=TINYINT}");
        sql.SET("attachment = #{record.attachment,jdbcType=VARCHAR}");
        sql.SET("file_path = #{record.filePath,jdbcType=VARCHAR}");
        sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        sql.SET("file_size = #{record.fileSize,jdbcType=INTEGER}");
        sql.SET("file_type = #{record.fileType,jdbcType=VARCHAR}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        AttachmentsExample example = (AttachmentsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Attachments record) {
        SQL sql = new SQL();
        sql.UPDATE("attachments");
        
        if (record.getUuid() != null) {
            sql.SET("uuid = #{uuid,jdbcType=CHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getTypeId() != null) {
            sql.SET("type_id = #{typeId,jdbcType=BIGINT}");
        }
        
        if (record.getOrder() != null) {
            sql.SET("order = #{order,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=SMALLINT}");
        }
        
        if (record.getIsRemote() != null) {
            sql.SET("is_remote = #{isRemote,jdbcType=TINYINT}");
        }
        
        if (record.getIsApproved() != null) {
            sql.SET("is_approved = #{isApproved,jdbcType=TINYINT}");
        }
        
        if (record.getAttachment() != null) {
            sql.SET("attachment = #{attachment,jdbcType=VARCHAR}");
        }
        
        if (record.getFilePath() != null) {
            sql.SET("file_path = #{filePath,jdbcType=VARCHAR}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getFileSize() != null) {
            sql.SET("file_size = #{fileSize,jdbcType=INTEGER}");
        }
        
        if (record.getFileType() != null) {
            sql.SET("file_type = #{fileType,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
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

    protected void applyWhere(SQL sql, AttachmentsExample example, boolean includeExamplePhrase) {
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