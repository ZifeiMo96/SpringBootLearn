package com.example.demo.data.dao;

import com.example.demo.data.model.Users;
import com.example.demo.data.model.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UsersMapper {
    @SelectProvider(type=UsersSqlProvider.class, method="countByExample")
    long countByExample(UsersExample example);

    @DeleteProvider(type=UsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsersExample example);

    @Delete({
        "delete from users",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into users (id, username, ",
        "password, pay_password, ",
        "mobile, signature, ",
        "last_login_ip, last_login_port, ",
        "register_ip, register_port, ",
        "register_reason, email, ",
        "username_bout, thread_count, ",
        "follow_count, fans_count, ",
        "liked_count, question_count, ",
        "status, avatar, ",
        "identity, realname, ",
        "avatar_at, login_at, ",
        "joined_at, expired_at, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{payPassword,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{signature,jdbcType=VARCHAR}, ",
        "#{lastLoginIp,jdbcType=VARCHAR}, #{lastLoginPort,jdbcType=INTEGER}, ",
        "#{registerIp,jdbcType=VARCHAR}, #{registerPort,jdbcType=INTEGER}, ",
        "#{registerReason,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{usernameBout,jdbcType=INTEGER}, #{threadCount,jdbcType=INTEGER}, ",
        "#{followCount,jdbcType=INTEGER}, #{fansCount,jdbcType=INTEGER}, ",
        "#{likedCount,jdbcType=INTEGER}, #{questionCount,jdbcType=INTEGER}, ",
        "#{status,jdbcType=TINYINT}, #{avatar,jdbcType=VARCHAR}, ",
        "#{identity,jdbcType=CHAR}, #{realname,jdbcType=VARCHAR}, ",
        "#{avatarAt,jdbcType=TIMESTAMP}, #{loginAt,jdbcType=TIMESTAMP}, ",
        "#{joinedAt,jdbcType=TIMESTAMP}, #{expiredAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Users record);

    @InsertProvider(type=UsersSqlProvider.class, method="insertSelective")
    int insertSelective(Users record);

    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_password", property="payPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_port", property="lastLoginPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_ip", property="registerIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_port", property="registerPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_reason", property="registerReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="username_bout", property="usernameBout", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="follow_count", property="followCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fans_count", property="fansCount", jdbcType=JdbcType.INTEGER),
        @Result(column="liked_count", property="likedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="question_count", property="questionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity", property="identity", jdbcType=JdbcType.CHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar_at", property="avatarAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="login_at", property="loginAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="joined_at", property="joinedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Users> selectByExampleWithRowbounds(UsersExample example, RowBounds rowBounds);

    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_password", property="payPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_port", property="lastLoginPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_ip", property="registerIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_port", property="registerPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_reason", property="registerReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="username_bout", property="usernameBout", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="follow_count", property="followCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fans_count", property="fansCount", jdbcType=JdbcType.INTEGER),
        @Result(column="liked_count", property="likedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="question_count", property="questionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity", property="identity", jdbcType=JdbcType.CHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar_at", property="avatarAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="login_at", property="loginAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="joined_at", property="joinedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Users> selectByExample(UsersExample example);

    @Select({
        "select",
        "id, username, password, pay_password, mobile, signature, last_login_ip, last_login_port, ",
        "register_ip, register_port, register_reason, email, username_bout, thread_count, ",
        "follow_count, fans_count, liked_count, question_count, status, avatar, identity, ",
        "realname, avatar_at, login_at, joined_at, expired_at, created_at, updated_at",
        "from users",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_password", property="payPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_ip", property="lastLoginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_login_port", property="lastLoginPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_ip", property="registerIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_port", property="registerPort", jdbcType=JdbcType.INTEGER),
        @Result(column="register_reason", property="registerReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="username_bout", property="usernameBout", jdbcType=JdbcType.INTEGER),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="follow_count", property="followCount", jdbcType=JdbcType.INTEGER),
        @Result(column="fans_count", property="fansCount", jdbcType=JdbcType.INTEGER),
        @Result(column="liked_count", property="likedCount", jdbcType=JdbcType.INTEGER),
        @Result(column="question_count", property="questionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="identity", property="identity", jdbcType=JdbcType.CHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar_at", property="avatarAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="login_at", property="loginAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="joined_at", property="joinedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Users selectByPrimaryKey(Long id);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Users record);

    @Update({
        "update users",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "pay_password = #{payPassword,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "signature = #{signature,jdbcType=VARCHAR},",
          "last_login_ip = #{lastLoginIp,jdbcType=VARCHAR},",
          "last_login_port = #{lastLoginPort,jdbcType=INTEGER},",
          "register_ip = #{registerIp,jdbcType=VARCHAR},",
          "register_port = #{registerPort,jdbcType=INTEGER},",
          "register_reason = #{registerReason,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "username_bout = #{usernameBout,jdbcType=INTEGER},",
          "thread_count = #{threadCount,jdbcType=INTEGER},",
          "follow_count = #{followCount,jdbcType=INTEGER},",
          "fans_count = #{fansCount,jdbcType=INTEGER},",
          "liked_count = #{likedCount,jdbcType=INTEGER},",
          "question_count = #{questionCount,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "identity = #{identity,jdbcType=CHAR},",
          "realname = #{realname,jdbcType=VARCHAR},",
          "avatar_at = #{avatarAt,jdbcType=TIMESTAMP},",
          "login_at = #{loginAt,jdbcType=TIMESTAMP},",
          "joined_at = #{joinedAt,jdbcType=TIMESTAMP},",
          "expired_at = #{expiredAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Users record);
}