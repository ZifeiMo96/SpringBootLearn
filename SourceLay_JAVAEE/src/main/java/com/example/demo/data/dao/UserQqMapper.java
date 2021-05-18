package com.example.demo.data.dao;

import com.example.demo.data.model.UserQq;
import com.example.demo.data.model.UserQqExample;
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

public interface UserQqMapper {
    @SelectProvider(type=UserQqSqlProvider.class, method="countByExample")
    long countByExample(UserQqExample example);

    @DeleteProvider(type=UserQqSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserQqExample example);

    @Delete({
        "delete from user_qq",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_qq (id, user_id, ",
        "openid, nickname, ",
        "sex, province, city, ",
        "headimgurl, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=INTEGER}, ",
        "#{openid,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=TINYINT}, #{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{headimgurl,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserQq record);

    @InsertProvider(type=UserQqSqlProvider.class, method="insertSelective")
    int insertSelective(UserQq record);

    @SelectProvider(type=UserQqSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserQq> selectByExampleWithRowbounds(UserQqExample example, RowBounds rowBounds);

    @SelectProvider(type=UserQqSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserQq> selectByExample(UserQqExample example);

    @Select({
        "select",
        "id, user_id, openid, nickname, sex, province, city, headimgurl, created_at, ",
        "updated_at",
        "from user_qq",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="openid", property="openid", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="headimgurl", property="headimgurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserQq selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserQqSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserQq record, @Param("example") UserQqExample example);

    @UpdateProvider(type=UserQqSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserQq record, @Param("example") UserQqExample example);

    @UpdateProvider(type=UserQqSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserQq record);

    @Update({
        "update user_qq",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "openid = #{openid,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=TINYINT},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "headimgurl = #{headimgurl,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserQq record);
}