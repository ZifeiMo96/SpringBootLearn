package com.example.demo.data.dao;

import com.example.demo.data.model.UserQyWechats;
import com.example.demo.data.model.UserQyWechatsExample;
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

public interface UserQyWechatsMapper {
    @SelectProvider(type=UserQyWechatsSqlProvider.class, method="countByExample")
    long countByExample(UserQyWechatsExample example);

    @DeleteProvider(type=UserQyWechatsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserQyWechatsExample example);

    @Delete({
        "delete from user_qy_wechats",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_qy_wechats (id, user_id, ",
        "qy_userid, nickname, ",
        "sex, email, mobile, ",
        "address, headimgurl, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=INTEGER}, ",
        "#{qyUserid,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=TINYINT}, #{email,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{headimgurl,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserQyWechats record);

    @InsertProvider(type=UserQyWechatsSqlProvider.class, method="insertSelective")
    int insertSelective(UserQyWechats record);

    @SelectProvider(type=UserQyWechatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="qy_userid", property="qyUserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserQyWechats> selectByExampleWithRowbounds(UserQyWechatsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserQyWechatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="qy_userid", property="qyUserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserQyWechats> selectByExample(UserQyWechatsExample example);

    @Select({
        "select",
        "id, user_id, qy_userid, nickname, sex, email, mobile, address, headimgurl, created_at, ",
        "updated_at",
        "from user_qy_wechats",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="qy_userid", property="qyUserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserQyWechats selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserQyWechatsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserQyWechats record, @Param("example") UserQyWechatsExample example);

    @UpdateProvider(type=UserQyWechatsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserQyWechats record, @Param("example") UserQyWechatsExample example);

    @UpdateProvider(type=UserQyWechatsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserQyWechats record);

    @Update({
        "update user_qy_wechats",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "qy_userid = #{qyUserid,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=TINYINT},",
          "email = #{email,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserQyWechats record);
}