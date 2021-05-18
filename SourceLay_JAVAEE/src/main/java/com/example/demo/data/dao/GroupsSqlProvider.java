package com.example.demo.data.dao;

import com.example.demo.data.model.Groups;
import com.example.demo.data.model.GroupsExample.Criteria;
import com.example.demo.data.model.GroupsExample.Criterion;
import com.example.demo.data.model.GroupsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GroupsSqlProvider {
    public String countByExample(GroupsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("groups");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GroupsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("groups");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Groups record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("groups");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getColor() != null) {
            sql.VALUES("color", "#{color,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.VALUES("icon", "#{icon,jdbcType=VARCHAR}");
        }
        
        if (record.getDefault() != null) {
            sql.VALUES("default", "#{default,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.VALUES("is_display", "#{isDisplay,jdbcType=TINYINT}");
        }
        
        if (record.getIsPaid() != null) {
            sql.VALUES("is_paid", "#{isPaid,jdbcType=TINYINT}");
        }
        
        if (record.getFee() != null) {
            sql.VALUES("fee", "#{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getDays() != null) {
            sql.VALUES("days", "#{days,jdbcType=BIGINT}");
        }
        
        if (record.getScale() != null) {
            sql.VALUES("scale", "#{scale,jdbcType=DOUBLE}");
        }
        
        if (record.getIsSubordinate() != null) {
            sql.VALUES("is_subordinate", "#{isSubordinate,jdbcType=TINYINT}");
        }
        
        if (record.getIsCommission() != null) {
            sql.VALUES("is_commission", "#{isCommission,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(GroupsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("type");
        sql.SELECT("color");
        sql.SELECT("icon");
        sql.SELECT("default");
        sql.SELECT("is_display");
        sql.SELECT("is_paid");
        sql.SELECT("fee");
        sql.SELECT("days");
        sql.SELECT("scale");
        sql.SELECT("is_subordinate");
        sql.SELECT("is_commission");
        sql.FROM("groups");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Groups record = (Groups) parameter.get("record");
        GroupsExample example = (GroupsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getColor() != null) {
            sql.SET("color = #{record.color,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.SET("icon = #{record.icon,jdbcType=VARCHAR}");
        }
        
        if (record.getDefault() != null) {
            sql.SET("default = #{record.default,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.SET("is_display = #{record.isDisplay,jdbcType=TINYINT}");
        }
        
        if (record.getIsPaid() != null) {
            sql.SET("is_paid = #{record.isPaid,jdbcType=TINYINT}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{record.fee,jdbcType=DECIMAL}");
        }
        
        if (record.getDays() != null) {
            sql.SET("days = #{record.days,jdbcType=BIGINT}");
        }
        
        if (record.getScale() != null) {
            sql.SET("scale = #{record.scale,jdbcType=DOUBLE}");
        }
        
        if (record.getIsSubordinate() != null) {
            sql.SET("is_subordinate = #{record.isSubordinate,jdbcType=TINYINT}");
        }
        
        if (record.getIsCommission() != null) {
            sql.SET("is_commission = #{record.isCommission,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        sql.SET("color = #{record.color,jdbcType=VARCHAR}");
        sql.SET("icon = #{record.icon,jdbcType=VARCHAR}");
        sql.SET("default = #{record.default,jdbcType=TINYINT}");
        sql.SET("is_display = #{record.isDisplay,jdbcType=TINYINT}");
        sql.SET("is_paid = #{record.isPaid,jdbcType=TINYINT}");
        sql.SET("fee = #{record.fee,jdbcType=DECIMAL}");
        sql.SET("days = #{record.days,jdbcType=BIGINT}");
        sql.SET("scale = #{record.scale,jdbcType=DOUBLE}");
        sql.SET("is_subordinate = #{record.isSubordinate,jdbcType=TINYINT}");
        sql.SET("is_commission = #{record.isCommission,jdbcType=TINYINT}");
        
        GroupsExample example = (GroupsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Groups record) {
        SQL sql = new SQL();
        sql.UPDATE("groups");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getColor() != null) {
            sql.SET("color = #{color,jdbcType=VARCHAR}");
        }
        
        if (record.getIcon() != null) {
            sql.SET("icon = #{icon,jdbcType=VARCHAR}");
        }
        
        if (record.getDefault() != null) {
            sql.SET("default = #{default,jdbcType=TINYINT}");
        }
        
        if (record.getIsDisplay() != null) {
            sql.SET("is_display = #{isDisplay,jdbcType=TINYINT}");
        }
        
        if (record.getIsPaid() != null) {
            sql.SET("is_paid = #{isPaid,jdbcType=TINYINT}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getDays() != null) {
            sql.SET("days = #{days,jdbcType=BIGINT}");
        }
        
        if (record.getScale() != null) {
            sql.SET("scale = #{scale,jdbcType=DOUBLE}");
        }
        
        if (record.getIsSubordinate() != null) {
            sql.SET("is_subordinate = #{isSubordinate,jdbcType=TINYINT}");
        }
        
        if (record.getIsCommission() != null) {
            sql.SET("is_commission = #{isCommission,jdbcType=TINYINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GroupsExample example, boolean includeExamplePhrase) {
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