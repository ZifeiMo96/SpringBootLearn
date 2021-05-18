package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysTablespaces;
import com.example.demo.data.model.InnodbSysTablespacesExample.Criteria;
import com.example.demo.data.model.InnodbSysTablespacesExample.Criterion;
import com.example.demo.data.model.InnodbSysTablespacesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InnodbSysTablespacesSqlProvider {
    public String countByExample(InnodbSysTablespacesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("INNODB_SYS_TABLESPACES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InnodbSysTablespacesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("INNODB_SYS_TABLESPACES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(InnodbSysTablespaces record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("INNODB_SYS_TABLESPACES");
        
        if (record.getSpace() != null) {
            sql.VALUES("SPACE", "#{space,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("FLAG", "#{flag,jdbcType=INTEGER}");
        }
        
        if (record.getRowFormat() != null) {
            sql.VALUES("ROW_FORMAT", "#{rowFormat,jdbcType=VARCHAR}");
        }
        
        if (record.getPageSize() != null) {
            sql.VALUES("PAGE_SIZE", "#{pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getZipPageSize() != null) {
            sql.VALUES("ZIP_PAGE_SIZE", "#{zipPageSize,jdbcType=INTEGER}");
        }
        
        if (record.getSpaceType() != null) {
            sql.VALUES("SPACE_TYPE", "#{spaceType,jdbcType=VARCHAR}");
        }
        
        if (record.getFsBlockSize() != null) {
            sql.VALUES("FS_BLOCK_SIZE", "#{fsBlockSize,jdbcType=INTEGER}");
        }
        
        if (record.getFileSize() != null) {
            sql.VALUES("FILE_SIZE", "#{fileSize,jdbcType=BIGINT}");
        }
        
        if (record.getAllocatedSize() != null) {
            sql.VALUES("ALLOCATED_SIZE", "#{allocatedSize,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InnodbSysTablespacesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SPACE");
        } else {
            sql.SELECT("SPACE");
        }
        sql.SELECT("NAME");
        sql.SELECT("FLAG");
        sql.SELECT("ROW_FORMAT");
        sql.SELECT("PAGE_SIZE");
        sql.SELECT("ZIP_PAGE_SIZE");
        sql.SELECT("SPACE_TYPE");
        sql.SELECT("FS_BLOCK_SIZE");
        sql.SELECT("FILE_SIZE");
        sql.SELECT("ALLOCATED_SIZE");
        sql.FROM("INNODB_SYS_TABLESPACES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        InnodbSysTablespaces record = (InnodbSysTablespaces) parameter.get("record");
        InnodbSysTablespacesExample example = (InnodbSysTablespacesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_TABLESPACES");
        
        if (record.getSpace() != null) {
            sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("FLAG = #{record.flag,jdbcType=INTEGER}");
        }
        
        if (record.getRowFormat() != null) {
            sql.SET("ROW_FORMAT = #{record.rowFormat,jdbcType=VARCHAR}");
        }
        
        if (record.getPageSize() != null) {
            sql.SET("PAGE_SIZE = #{record.pageSize,jdbcType=INTEGER}");
        }
        
        if (record.getZipPageSize() != null) {
            sql.SET("ZIP_PAGE_SIZE = #{record.zipPageSize,jdbcType=INTEGER}");
        }
        
        if (record.getSpaceType() != null) {
            sql.SET("SPACE_TYPE = #{record.spaceType,jdbcType=VARCHAR}");
        }
        
        if (record.getFsBlockSize() != null) {
            sql.SET("FS_BLOCK_SIZE = #{record.fsBlockSize,jdbcType=INTEGER}");
        }
        
        if (record.getFileSize() != null) {
            sql.SET("FILE_SIZE = #{record.fileSize,jdbcType=BIGINT}");
        }
        
        if (record.getAllocatedSize() != null) {
            sql.SET("ALLOCATED_SIZE = #{record.allocatedSize,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("INNODB_SYS_TABLESPACES");
        
        sql.SET("SPACE = #{record.space,jdbcType=INTEGER}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("FLAG = #{record.flag,jdbcType=INTEGER}");
        sql.SET("ROW_FORMAT = #{record.rowFormat,jdbcType=VARCHAR}");
        sql.SET("PAGE_SIZE = #{record.pageSize,jdbcType=INTEGER}");
        sql.SET("ZIP_PAGE_SIZE = #{record.zipPageSize,jdbcType=INTEGER}");
        sql.SET("SPACE_TYPE = #{record.spaceType,jdbcType=VARCHAR}");
        sql.SET("FS_BLOCK_SIZE = #{record.fsBlockSize,jdbcType=INTEGER}");
        sql.SET("FILE_SIZE = #{record.fileSize,jdbcType=BIGINT}");
        sql.SET("ALLOCATED_SIZE = #{record.allocatedSize,jdbcType=BIGINT}");
        
        InnodbSysTablespacesExample example = (InnodbSysTablespacesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InnodbSysTablespacesExample example, boolean includeExamplePhrase) {
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