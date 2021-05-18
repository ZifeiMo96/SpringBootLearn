package com.example.demo.data.dao;

import com.example.demo.data.model.UserWechats;
import com.example.demo.data.model.UserWechatsExample.Criteria;
import com.example.demo.data.model.UserWechatsExample.Criterion;
import com.example.demo.data.model.UserWechatsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserWechatsSqlProvider {
    public String countByExample(UserWechatsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_wechats");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserWechatsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_wechats");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserWechats record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_wechats");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getMpOpenid() != null) {
            sql.VALUES("mp_openid", "#{mpOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getDevOpenid() != null) {
            sql.VALUES("dev_openid", "#{devOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getMinOpenid() != null) {
            sql.VALUES("min_openid", "#{minOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=TINYINT}");
        }
        
        if (record.getProvince() != null) {
            sql.VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            sql.VALUES("headimgurl", "#{headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivilege() != null) {
            sql.VALUES("privilege", "#{privilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionid() != null) {
            sql.VALUES("unionid", "#{unionid,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserWechatsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("mp_openid");
        sql.SELECT("dev_openid");
        sql.SELECT("min_openid");
        sql.SELECT("nickname");
        sql.SELECT("sex");
        sql.SELECT("province");
        sql.SELECT("city");
        sql.SELECT("country");
        sql.SELECT("headimgurl");
        sql.SELECT("privilege");
        sql.SELECT("unionid");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("user_wechats");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserWechats record = (UserWechats) parameter.get("record");
        UserWechatsExample example = (UserWechatsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_wechats");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getMpOpenid() != null) {
            sql.SET("mp_openid = #{record.mpOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getDevOpenid() != null) {
            sql.SET("dev_openid = #{record.devOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getMinOpenid() != null) {
            sql.SET("min_openid = #{record.minOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{record.city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.SET("country = #{record.country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            sql.SET("headimgurl = #{record.headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivilege() != null) {
            sql.SET("privilege = #{record.privilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionid() != null) {
            sql.SET("unionid = #{record.unionid,jdbcType=VARCHAR}");
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
        sql.UPDATE("user_wechats");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_id = #{record.userId,jdbcType=BIGINT}");
        sql.SET("mp_openid = #{record.mpOpenid,jdbcType=VARCHAR}");
        sql.SET("dev_openid = #{record.devOpenid,jdbcType=VARCHAR}");
        sql.SET("min_openid = #{record.minOpenid,jdbcType=VARCHAR}");
        sql.SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        sql.SET("province = #{record.province,jdbcType=VARCHAR}");
        sql.SET("city = #{record.city,jdbcType=VARCHAR}");
        sql.SET("country = #{record.country,jdbcType=VARCHAR}");
        sql.SET("headimgurl = #{record.headimgurl,jdbcType=VARCHAR}");
        sql.SET("privilege = #{record.privilege,jdbcType=VARCHAR}");
        sql.SET("unionid = #{record.unionid,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        UserWechatsExample example = (UserWechatsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserWechats record) {
        SQL sql = new SQL();
        sql.UPDATE("user_wechats");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getMpOpenid() != null) {
            sql.SET("mp_openid = #{mpOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getDevOpenid() != null) {
            sql.SET("dev_openid = #{devOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getMinOpenid() != null) {
            sql.SET("min_openid = #{minOpenid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=TINYINT}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCountry() != null) {
            sql.SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadimgurl() != null) {
            sql.SET("headimgurl = #{headimgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivilege() != null) {
            sql.SET("privilege = #{privilege,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionid() != null) {
            sql.SET("unionid = #{unionid,jdbcType=VARCHAR}");
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

    protected void applyWhere(SQL sql, UserWechatsExample example, boolean includeExamplePhrase) {
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