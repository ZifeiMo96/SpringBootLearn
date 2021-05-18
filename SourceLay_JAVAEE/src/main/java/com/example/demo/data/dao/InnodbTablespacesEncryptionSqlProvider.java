package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTablespacesEncryption;
import com.example.demo.data.model.InnodbTablespacesEncryptionExample.Criteria;
import com.example.demo.data.model.InnodbTablespacesEncryptionExample.Criterion;
import com.example.demo.data.model.InnodbTablespacesEncryptionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbTablespacesEncryptionSqlProvider {
    public String countByExample(InnodbTablespacesEncryptionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_TABLESPACES_ENCRYPTION");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbTablespacesEncryptionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_TABLESPACES_ENCRYPTION");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbTablespacesEncryption record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_TABLESPACES_ENCRYPTION");
        
        if (record.getSpace() != null) {
            sql.VALUES("SPACE", "#{space,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getEncryptionScheme() != null) {
            sql.VALUES("ENCRYPTION_SCHEME", "#{encryptionScheme,jdbcType=INTEGER}");
        }
        
        if (record.getKeyserverRequests() != null) {
            sql.VALUES("KEYSERVER_REQUESTS", "#{keyserverRequests,jdbcType=INTEGER}");
        }
        
        if (record.getMinKeyVersion() != null) {
            sql.VALUES("MIN_KEY_VERSION", "#{minKeyVersion,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentKeyVersion() != null) {
            sql.VALUES("CURRENT_KEY_VERSION", "#{currentKeyVersion,jdbcType=INTEGER}");
        }
        
        if (record.getKeyRotationPageNumber() != null) {
            sql.VALUES("KEY_ROTATION_PAGE_NUMBER", "#{keyRotationPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getKeyRotationMaxPageNumber() != null) {
            sql.VALUES("KEY_ROTATION_MAX_PAGE_NUMBER", "#{keyRotationMaxPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentKeyId() != null) {
            sql.VALUES("CURRENT_KEY_ID", "#{currentKeyId,jdbcType=INTEGER}");
        }
        
        if (record.getRotatingOrFlushing() != null) {
            sql.VALUES("ROTATING_OR_FLUSHING", "#{rotatingOrFlushing,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbTablespacesEncryptionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPACE");
        } else {
            sql.SELECT("SPACE");
        }
        sql.SELECT("NAME");
        sql.SELECT("ENCRYPTION_SCHEME");
        sql.SELECT("KEYSERVER_REQUESTS");
        sql.SELECT("MIN_KEY_VERSION");
        sql.SELECT("CURRENT_KEY_VERSION");
        sql.SELECT("KEY_ROTATION_PAGE_NUMBER");
        sql.SELECT("KEY_ROTATION_MAX_PAGE_NUMBER");
        sql.SELECT("CURRENT_KEY_ID");
        sql.SELECT("ROTATING_OR_FLUSHING");
        sql.FROM("INNODB_TABLESPACES_ENCRYPTION");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbTablespacesEncryption record = (InnodbTablespacesEncryption) parameter.get("record");
        InnodbTablespacesEncryptionExample example = (InnodbTablespacesEncryptionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TABLESPACES_ENCRYPTION");
        
        if (record.getSpace() != null) {
            sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getEncryptionScheme() != null) {
            sql.SET("ENCRYPTION_SCHEME = #{record.encryptionScheme,jdbcType=INTEGER}");
        }
        
        if (record.getKeyserverRequests() != null) {
            sql.SET("KEYSERVER_REQUESTS = #{record.keyserverRequests,jdbcType=INTEGER}");
        }
        
        if (record.getMinKeyVersion() != null) {
            sql.SET("MIN_KEY_VERSION = #{record.minKeyVersion,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentKeyVersion() != null) {
            sql.SET("CURRENT_KEY_VERSION = #{record.currentKeyVersion,jdbcType=INTEGER}");
        }
        
        if (record.getKeyRotationPageNumber() != null) {
            sql.SET("KEY_ROTATION_PAGE_NUMBER = #{record.keyRotationPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getKeyRotationMaxPageNumber() != null) {
            sql.SET("KEY_ROTATION_MAX_PAGE_NUMBER = #{record.keyRotationMaxPageNumber,jdbcType=BIGINT}");
        }
        
        if (record.getCurrentKeyId() != null) {
            sql.SET("CURRENT_KEY_ID = #{record.currentKeyId,jdbcType=INTEGER}");
        }
        
        if (record.getRotatingOrFlushing() != null) {
            sql.SET("ROTATING_OR_FLUSHING = #{record.rotatingOrFlushing,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_TABLESPACES_ENCRYPTION");
        
        sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("ENCRYPTION_SCHEME = #{record.encryptionScheme,jdbcType=INTEGER}");
        sql.SET("KEYSERVER_REQUESTS = #{record.keyserverRequests,jdbcType=INTEGER}");
        sql.SET("MIN_KEY_VERSION = #{record.minKeyVersion,jdbcType=INTEGER}");
        sql.SET("CURRENT_KEY_VERSION = #{record.currentKeyVersion,jdbcType=INTEGER}");
        sql.SET("KEY_ROTATION_PAGE_NUMBER = #{record.keyRotationPageNumber,jdbcType=BIGINT}");
        sql.SET("KEY_ROTATION_MAX_PAGE_NUMBER = #{record.keyRotationMaxPageNumber,jdbcType=BIGINT}");
        sql.SET("CURRENT_KEY_ID = #{record.currentKeyId,jdbcType=INTEGER}");
        sql.SET("ROTATING_OR_FLUSHING = #{record.rotatingOrFlushing,jdbcType=INTEGER}");
        
        InnodbTablespacesEncryptionExample example = (InnodbTablespacesEncryptionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbTablespacesEncryptionExample example, boolean includeExamplePhrase) {
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