package com.example.demo.data.dao;

import com.example.demo.data.model.UserWechats;
import com.example.demo.data.model.UserWechatsExample;
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

public interface UserWechatsMapper {
    @SelectProvider(type=UserWechatsSqlProvider.class, method="countByExample")
    long countByExample(UserWechatsExample example);

    @DeleteProvider(type=UserWechatsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserWechatsExample example);

    @Delete({
        "delete from user_wechats",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_wechats (id, user_id, ",
        "mp_openid, dev_openid, ",
        "min_openid, nickname, ",
        "sex, province, city, ",
        "country, headimgurl, ",
        "privilege, unionid, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{mpOpenid,jdbcType=VARCHAR}, #{devOpenid,jdbcType=VARCHAR}, ",
        "#{minOpenid,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=TINYINT}, #{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{country,jdbcType=VARCHAR}, #{headimgurl,jdbcType=VARCHAR}, ",
        "#{privilege,jdbcType=VARCHAR}, #{unionid,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserWechats record);

    @InsertProvider(type=UserWechatsSqlProvider.class, method="insertSelective")
    int insertSelective(UserWechats record);

    @SelectProvider(type=UserWechatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="mp_openid", property="mpOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="dev_openid", property="devOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="min_openid", property="minOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="privilege", property="privilege", jdbcType=JdbcType.VARCHAR),
        @Result(column="unionid", property="unionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWechats> selectByExampleWithRowbounds(UserWechatsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserWechatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="mp_openid", property="mpOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="dev_openid", property="devOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="min_openid", property="minOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="privilege", property="privilege", jdbcType=JdbcType.VARCHAR),
        @Result(column="unionid", property="unionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWechats> selectByExample(UserWechatsExample example);

    @Select({
        "select",
        "id, user_id, mp_openid, dev_openid, min_openid, nickname, sex, province, city, ",
        "country, headimgurl, privilege, unionid, created_at, updated_at",
        "from user_wechats",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="mp_openid", property="mpOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="dev_openid", property="devOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="min_openid", property="minOpenid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="privilege", property="privilege", jdbcType=JdbcType.VARCHAR),
        @Result(column="unionid", property="unionid", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserWechats selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserWechatsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserWechats record, @Param("example") UserWechatsExample example);

    @UpdateProvider(type=UserWechatsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserWechats record, @Param("example") UserWechatsExample example);

    @UpdateProvider(type=UserWechatsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserWechats record);

    @Update({
        "update user_wechats",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "mp_openid = #{mpOpenid,jdbcType=VARCHAR},",
          "dev_openid = #{devOpenid,jdbcType=VARCHAR},",
          "min_openid = #{minOpenid,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=TINYINT},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "country = #{country,jdbcType=VARCHAR},",
          "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
          "privilege = #{privilege,jdbcType=VARCHAR},",
          "unionid = #{unionid,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserWechats record);
}