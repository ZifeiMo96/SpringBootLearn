package com.example.demo.data.dao;

import com.example.demo.data.model.Groups;
import com.example.demo.data.model.GroupsExample;
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

public interface GroupsMapper {
    @SelectProvider(type=GroupsSqlProvider.class, method="countByExample")
    long countByExample(GroupsExample example);

    @DeleteProvider(type=GroupsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GroupsExample example);

    @Delete({
        "delete from groups",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into groups (id, name, ",
        "type, color, icon, ",
        "default, is_display, ",
        "is_paid, fee, days, ",
        "scale, is_subordinate, ",
        "is_commission)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{color,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, ",
        "#{default,jdbcType=TINYINT}, #{isDisplay,jdbcType=TINYINT}, ",
        "#{isPaid,jdbcType=TINYINT}, #{fee,jdbcType=DECIMAL}, #{days,jdbcType=BIGINT}, ",
        "#{scale,jdbcType=DOUBLE}, #{isSubordinate,jdbcType=TINYINT}, ",
        "#{isCommission,jdbcType=TINYINT})"
    })
    int insert(Groups record);

    @InsertProvider(type=GroupsSqlProvider.class, method="insertSelective")
    int insertSelective(Groups record);

    @SelectProvider(type=GroupsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="default", property="default", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT),
        @Result(column="is_paid", property="isPaid", jdbcType=JdbcType.TINYINT),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="days", property="days", jdbcType=JdbcType.BIGINT),
        @Result(column="scale", property="scale", jdbcType=JdbcType.DOUBLE),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT)
    })
    List<Groups> selectByExampleWithRowbounds(GroupsExample example, RowBounds rowBounds);

    @SelectProvider(type=GroupsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="default", property="default", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT),
        @Result(column="is_paid", property="isPaid", jdbcType=JdbcType.TINYINT),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="days", property="days", jdbcType=JdbcType.BIGINT),
        @Result(column="scale", property="scale", jdbcType=JdbcType.DOUBLE),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT)
    })
    List<Groups> selectByExample(GroupsExample example);

    @Select({
        "select",
        "id, name, type, color, icon, default, is_display, is_paid, fee, days, scale, ",
        "is_subordinate, is_commission",
        "from groups",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="default", property="default", jdbcType=JdbcType.TINYINT),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.TINYINT),
        @Result(column="is_paid", property="isPaid", jdbcType=JdbcType.TINYINT),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="days", property="days", jdbcType=JdbcType.BIGINT),
        @Result(column="scale", property="scale", jdbcType=JdbcType.DOUBLE),
        @Result(column="is_subordinate", property="isSubordinate", jdbcType=JdbcType.TINYINT),
        @Result(column="is_commission", property="isCommission", jdbcType=JdbcType.TINYINT)
    })
    Groups selectByPrimaryKey(Long id);

    @UpdateProvider(type=GroupsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    @UpdateProvider(type=GroupsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    @UpdateProvider(type=GroupsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Groups record);

    @Update({
        "update groups",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "color = #{color,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "default = #{default,jdbcType=TINYINT},",
          "is_display = #{isDisplay,jdbcType=TINYINT},",
          "is_paid = #{isPaid,jdbcType=TINYINT},",
          "fee = #{fee,jdbcType=DECIMAL},",
          "days = #{days,jdbcType=BIGINT},",
          "scale = #{scale,jdbcType=DOUBLE},",
          "is_subordinate = #{isSubordinate,jdbcType=TINYINT},",
          "is_commission = #{isCommission,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Groups record);
}