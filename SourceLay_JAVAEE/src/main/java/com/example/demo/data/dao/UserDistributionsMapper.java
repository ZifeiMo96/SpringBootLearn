package com.example.demo.data.dao;

import com.example.demo.data.model.UserDistributions;
import com.example.demo.data.model.UserDistributionsExample;
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

public interface UserDistributionsMapper {
    @SelectProvider(type=UserDistributionsSqlProvider.class, method="countByExample")
    long countByExample(UserDistributionsExample example);

    @DeleteProvider(type=UserDistributionsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserDistributionsExample example);

    @Delete({
        "delete from user_distributions",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_distributions (id, pid, user_id, ",
        "be_scale, level, is_subordinate, ",
        "is_commission, updated_at, ",
        "created_at)",
        "values (#{id,jdbcType=BIGINT}, #{pid,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{beScale,jdbcType=DOUBLE}, #{level,jdbcType=TINYINT}, #{isSubordinate,jdbcType=TINYINT}, ",
        "#{isCommission,jdbcType=TINYINT}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserDistributions record);

    @InsertProvider(type=UserDistributionsSqlProvider.class, method="insertSelective")
    int insertSelective(UserDistributions record);

    @SelectProvider(type=UserDistributionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="level", property="level", jdbcType=JdbcType.TINYINT),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserDistributions> selectByExampleWithRowbounds(UserDistributionsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserDistributionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="level", property="level", jdbcType=JdbcType.TINYINT),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserDistributions> selectByExample(UserDistributionsExample example);

    @Select({
        "select",
        "id, pid, user_id, be_scale, level, is_subordinate, is_commission, updated_at, ",
        "created_at",
        "from user_distributions",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="pid", property="pid", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_scale", property="beScale", jdbcType=JdbcType.DOUBLE),
        @Result(column="level", property="level", jdbcType=JdbcType.TINYINT),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserDistributions selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserDistributionsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserDistributions record, @Param("example") UserDistributionsExample example);

    @UpdateProvider(type=UserDistributionsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserDistributions record, @Param("example") UserDistributionsExample example);

    @UpdateProvider(type=UserDistributionsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserDistributions record);

    @Update({
        "update user_distributions",
        "set pid = #{pid,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "be_scale = #{beScale,jdbcType=DOUBLE},",
          "level = #{level,jdbcType=TINYINT},",
          "is_subordinate = #{isSubordinate,jdbcType=TINYINT},",
          "is_commission = #{isCommission,jdbcType=TINYINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserDistributions record);
}