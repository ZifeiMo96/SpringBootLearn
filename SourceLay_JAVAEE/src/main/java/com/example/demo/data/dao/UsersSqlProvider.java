package com.example.demo.data.dao;

import com.example.demo.data.model.Users;
import com.example.demo.data.model.UsersExample.Criteria;
import com.example.demo.data.model.UsersExample.Criterion;
import com.example.demo.data.model.UsersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UsersSqlProvider {
    public String countByExample(UsersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("users");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("users");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Users record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("users");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPayPassword() != null) {
            sql.VALUES("pay_password", "#{payPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            sql.VALUES("signature", "#{signature,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.VALUES("last_login_ip", "#{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginPort() != null) {
            sql.VALUES("last_login_port", "#{lastLoginPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterIp() != null) {
            sql.VALUES("register_ip", "#{registerIp,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterPort() != null) {
            sql.VALUES("register_port", "#{registerPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterReason() != null) {
            sql.VALUES("register_reason", "#{registerReason,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getUsernameBout() != null) {
            sql.VALUES("username_bout", "#{usernameBout,jdbcType=INTEGER}");
        }
        
        if (record.getThreadCount() != null) {
            sql.VALUES("thread_count", "#{threadCount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowCount() != null) {
            sql.VALUES("follow_count", "#{followCount,jdbcType=INTEGER}");
        }
        
        if (record.getFansCount() != null) {
            sql.VALUES("fans_count", "#{fansCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikedCount() != null) {
            sql.VALUES("liked_count", "#{likedCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionCount() != null) {
            sql.VALUES("question_count", "#{questionCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getAvatar() != null) {
            sql.VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdentity() != null) {
            sql.VALUES("identity", "#{identity,jdbcType=CHAR}");
        }
        
        if (record.getRealname() != null) {
            sql.VALUES("realname", "#{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarAt() != null) {
            sql.VALUES("avatar_at", "#{avatarAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoginAt() != null) {
            sql.VALUES("login_at", "#{loginAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJoinedAt() != null) {
            sql.VALUES("joined_at", "#{joinedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.VALUES("expired_at", "#{expiredAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("username");
        sql.SELECT("password");
        sql.SELECT("pay_password");
        sql.SELECT("mobile");
        sql.SELECT("signature");
        sql.SELECT("last_login_ip");
        sql.SELECT("last_login_port");
        sql.SELECT("register_ip");
        sql.SELECT("register_port");
        sql.SELECT("register_reason");
        sql.SELECT("email");
        sql.SELECT("username_bout");
        sql.SELECT("thread_count");
        sql.SELECT("follow_count");
        sql.SELECT("fans_count");
        sql.SELECT("liked_count");
        sql.SELECT("question_count");
        sql.SELECT("status");
        sql.SELECT("avatar");
        sql.SELECT("identity");
        sql.SELECT("realname");
        sql.SELECT("avatar_at");
        sql.SELECT("login_at");
        sql.SELECT("joined_at");
        sql.SELECT("expired_at");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.FROM("users");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Users record = (Users) parameter.get("record");
        UsersExample example = (UsersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("users");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getPayPassword() != null) {
            sql.SET("pay_password = #{record.payPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            sql.SET("signature = #{record.signature,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginPort() != null) {
            sql.SET("last_login_port = #{record.lastLoginPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterIp() != null) {
            sql.SET("register_ip = #{record.registerIp,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterPort() != null) {
            sql.SET("register_port = #{record.registerPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterReason() != null) {
            sql.SET("register_reason = #{record.registerReason,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getUsernameBout() != null) {
            sql.SET("username_bout = #{record.usernameBout,jdbcType=INTEGER}");
        }
        
        if (record.getThreadCount() != null) {
            sql.SET("thread_count = #{record.threadCount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowCount() != null) {
            sql.SET("follow_count = #{record.followCount,jdbcType=INTEGER}");
        }
        
        if (record.getFansCount() != null) {
            sql.SET("fans_count = #{record.fansCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikedCount() != null) {
            sql.SET("liked_count = #{record.likedCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionCount() != null) {
            sql.SET("question_count = #{record.questionCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdentity() != null) {
            sql.SET("identity = #{record.identity,jdbcType=CHAR}");
        }
        
        if (record.getRealname() != null) {
            sql.SET("realname = #{record.realname,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarAt() != null) {
            sql.SET("avatar_at = #{record.avatarAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoginAt() != null) {
            sql.SET("login_at = #{record.loginAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJoinedAt() != null) {
            sql.SET("joined_at = #{record.joinedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("users");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        sql.SET("pay_password = #{record.payPassword,jdbcType=VARCHAR}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("signature = #{record.signature,jdbcType=VARCHAR}");
        sql.SET("last_login_ip = #{record.lastLoginIp,jdbcType=VARCHAR}");
        sql.SET("last_login_port = #{record.lastLoginPort,jdbcType=INTEGER}");
        sql.SET("register_ip = #{record.registerIp,jdbcType=VARCHAR}");
        sql.SET("register_port = #{record.registerPort,jdbcType=INTEGER}");
        sql.SET("register_reason = #{record.registerReason,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("username_bout = #{record.usernameBout,jdbcType=INTEGER}");
        sql.SET("thread_count = #{record.threadCount,jdbcType=INTEGER}");
        sql.SET("follow_count = #{record.followCount,jdbcType=INTEGER}");
        sql.SET("fans_count = #{record.fansCount,jdbcType=INTEGER}");
        sql.SET("liked_count = #{record.likedCount,jdbcType=INTEGER}");
        sql.SET("question_count = #{record.questionCount,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("avatar = #{record.avatar,jdbcType=VARCHAR}");
        sql.SET("identity = #{record.identity,jdbcType=CHAR}");
        sql.SET("realname = #{record.realname,jdbcType=VARCHAR}");
        sql.SET("avatar_at = #{record.avatarAt,jdbcType=TIMESTAMP}");
        sql.SET("login_at = #{record.loginAt,jdbcType=TIMESTAMP}");
        sql.SET("joined_at = #{record.joinedAt,jdbcType=TIMESTAMP}");
        sql.SET("expired_at = #{record.expiredAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        UsersExample example = (UsersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Users record) {
        SQL sql = new SQL();
        sql.UPDATE("users");
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPayPassword() != null) {
            sql.SET("pay_password = #{payPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSignature() != null) {
            sql.SET("signature = #{signature,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginIp() != null) {
            sql.SET("last_login_ip = #{lastLoginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginPort() != null) {
            sql.SET("last_login_port = #{lastLoginPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterIp() != null) {
            sql.SET("register_ip = #{registerIp,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterPort() != null) {
            sql.SET("register_port = #{registerPort,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterReason() != null) {
            sql.SET("register_reason = #{registerReason,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getUsernameBout() != null) {
            sql.SET("username_bout = #{usernameBout,jdbcType=INTEGER}");
        }
        
        if (record.getThreadCount() != null) {
            sql.SET("thread_count = #{threadCount,jdbcType=INTEGER}");
        }
        
        if (record.getFollowCount() != null) {
            sql.SET("follow_count = #{followCount,jdbcType=INTEGER}");
        }
        
        if (record.getFansCount() != null) {
            sql.SET("fans_count = #{fansCount,jdbcType=INTEGER}");
        }
        
        if (record.getLikedCount() != null) {
            sql.SET("liked_count = #{likedCount,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionCount() != null) {
            sql.SET("question_count = #{questionCount,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getIdentity() != null) {
            sql.SET("identity = #{identity,jdbcType=CHAR}");
        }
        
        if (record.getRealname() != null) {
            sql.SET("realname = #{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatarAt() != null) {
            sql.SET("avatar_at = #{avatarAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoginAt() != null) {
            sql.SET("login_at = #{loginAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getJoinedAt() != null) {
            sql.SET("joined_at = #{joinedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getExpiredAt() != null) {
            sql.SET("expired_at = #{expiredAt,jdbcType=TIMESTAMP}");
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

    protected void applyWhere(SQL sql, UsersExample example, boolean includeExamplePhrase) {
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