package com.example.demo.data.dao;

import com.example.demo.data.model.Settings;
import com.example.demo.data.model.SettingsExample;
import com.example.demo.data.model.SettingsKey;
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

public interface SettingsMapper {
    @SelectProvider(type=SettingsSqlProvider.class, method="countByExample")
    long countByExample(SettingsExample example);

    @DeleteProvider(type=SettingsSqlProvider.class, method="deleteByExample")
    int deleteByExample(SettingsExample example);

    @Delete({
        "delete from settings",
        "where key = #{key,jdbcType=VARCHAR}",
          "and tag = #{tag,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(SettingsKey key);

    @Insert({
        "insert into settings (key, tag, ",
        "value)",
        "values (#{key,jdbcType=VARCHAR}, #{tag,jdbcType=VARCHAR}, ",
        "#{value,jdbcType=LONGVARCHAR})"
    })
    int insert(Settings record);

    @InsertProvider(type=SettingsSqlProvider.class, method="insertSelective")
    int insertSelective(Settings record);

    @SelectProvider(type=SettingsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Settings> selectByExampleWithBLOBsWithRowbounds(SettingsExample example, RowBounds rowBounds);

    @SelectProvider(type=SettingsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Settings> selectByExampleWithBLOBs(SettingsExample example);

    @SelectProvider(type=SettingsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<Settings> selectByExampleWithRowbounds(SettingsExample example, RowBounds rowBounds);

    @SelectProvider(type=SettingsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR, id=true)
    })
    List<Settings> selectByExample(SettingsExample example);

    @Select({
        "select",
        "key, tag, value",
        "from settings",
        "where key = #{key,jdbcType=VARCHAR}",
          "and tag = #{tag,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="tag", property="tag", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    Settings selectByPrimaryKey(SettingsKey key);

    @UpdateProvider(type=SettingsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Settings record, @Param("example") SettingsExample example);

    @UpdateProvider(type=SettingsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Settings record, @Param("example") SettingsExample example);

    @UpdateProvider(type=SettingsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Settings record, @Param("example") SettingsExample example);

    @UpdateProvider(type=SettingsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Settings record);

    @Update({
        "update settings",
        "set value = #{value,jdbcType=LONGVARCHAR}",
        "where key = #{key,jdbcType=VARCHAR}",
          "and tag = #{tag,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Settings record);
}