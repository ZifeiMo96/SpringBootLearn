package com.example.demo.data.dao;

import com.example.demo.data.model.Tablespaces;
import com.example.demo.data.model.TablespacesExample.Criteria;
import com.example.demo.data.model.TablespacesExample.Criterion;
import com.example.demo.data.model.TablespacesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TablespacesSqlProvider {
    public String countByExample(TablespacesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TABLESPACES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TablespacesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TABLESPACES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Tablespaces record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TABLESPACES");
        
        if (record.getTablespaceName() != null) {
            sql.VALUES("TABLESPACE_NAME", "#{tablespaceName,jdbcType=VARCHAR}");
        }
        
        if (record.getEngine() != null) {
            sql.VALUES("ENGINE", "#{engine,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceType() != null) {
            sql.VALUES("TABLESPACE_TYPE", "#{tablespaceType,jdbcType=VARCHAR}");
        }
        
        if (record.getLogfileGroupName() != null) {
            sql.VALUES("LOGFILE_GROUP_NAME", "#{logfileGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentSize() != null) {
            sql.VALUES("EXTENT_SIZE", "#{extentSize,jdbcType=BIGINT}");
        }
        
        if (record.getAutoextendSize() != null) {
            sql.VALUES("AUTOEXTEND_SIZE", "#{autoextendSize,jdbcType=BIGINT}");
        }
        
        if (record.getMaximumSize() != null) {
            sql.VALUES("MAXIMUM_SIZE", "#{maximumSize,jdbcType=BIGINT}");
        }
        
        if (record.getNodegroupId() != null) {
            sql.VALUES("NODEGROUP_ID", "#{nodegroupId,jdbcType=BIGINT}");
        }
        
        if (record.getTablespaceComment() != null) {
            sql.VALUES("TABLESPACE_COMMENT", "#{tablespaceComment,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TablespacesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TABLESPACE_NAME");
        } else {
            sql.SELECT("TABLESPACE_NAME");
        }
        sql.SELECT("ENGINE");
        sql.SELECT("TABLESPACE_TYPE");
        sql.SELECT("LOGFILE_GROUP_NAME");
        sql.SELECT("EXTENT_SIZE");
        sql.SELECT("AUTOEXTEND_SIZE");
        sql.SELECT("MAXIMUM_SIZE");
        sql.SELECT("NODEGROUP_ID");
        sql.SELECT("TABLESPACE_COMMENT");
        sql.FROM("TABLESPACES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Tablespaces record = (Tablespaces) parameter.get("record");
        TablespacesExample example = (TablespacesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TABLESPACES");
        
        if (record.getTablespaceName() != null) {
            sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        }
        
        if (record.getEngine() != null) {
            sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        }
        
        if (record.getTablespaceType() != null) {
            sql.SET("TABLESPACE_TYPE = #{record.tablespaceType,jdbcType=VARCHAR}");
        }
        
        if (record.getLogfileGroupName() != null) {
            sql.SET("LOGFILE_GROUP_NAME = #{record.logfileGroupName,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentSize() != null) {
            sql.SET("EXTENT_SIZE = #{record.extentSize,jdbcType=BIGINT}");
        }
        
        if (record.getAutoextendSize() != null) {
            sql.SET("AUTOEXTEND_SIZE = #{record.autoextendSize,jdbcType=BIGINT}");
        }
        
        if (record.getMaximumSize() != null) {
            sql.SET("MAXIMUM_SIZE = #{record.maximumSize,jdbcType=BIGINT}");
        }
        
        if (record.getNodegroupId() != null) {
            sql.SET("NODEGROUP_ID = #{record.nodegroupId,jdbcType=BIGINT}");
        }
        
        if (record.getTablespaceComment() != null) {
            sql.SET("TABLESPACE_COMMENT = #{record.tablespaceComment,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TABLESPACES");
        
        sql.SET("TABLESPACE_NAME = #{record.tablespaceName,jdbcType=VARCHAR}");
        sql.SET("ENGINE = #{record.engine,jdbcType=VARCHAR}");
        sql.SET("TABLESPACE_TYPE = #{record.tablespaceType,jdbcType=VARCHAR}");
        sql.SET("LOGFILE_GROUP_NAME = #{record.logfileGroupName,jdbcType=VARCHAR}");
        sql.SET("EXTENT_SIZE = #{record.extentSize,jdbcType=BIGINT}");
        sql.SET("AUTOEXTEND_SIZE = #{record.autoextendSize,jdbcType=BIGINT}");
        sql.SET("MAXIMUM_SIZE = #{record.maximumSize,jdbcType=BIGINT}");
        sql.SET("NODEGROUP_ID = #{record.nodegroupId,jdbcType=BIGINT}");
        sql.SET("TABLESPACE_COMMENT = #{record.tablespaceComment,jdbcType=VARCHAR}");
        
        TablespacesExample example = (TablespacesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TablespacesExample example, boolean includeExamplePhrase) {
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