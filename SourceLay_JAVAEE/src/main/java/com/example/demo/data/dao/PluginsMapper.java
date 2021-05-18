package com.example.demo.data.dao;

import com.example.demo.data.model.Plugins;
import com.example.demo.data.model.PluginsExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PluginsMapper {
    @SelectProvider(type=PluginsSqlProvider.class, method="countByExample")
    long countByExample(PluginsExample example);

    @DeleteProvider(type=PluginsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PluginsExample example);

    @Insert({
        "insert into PLUGINS (PLUGIN_NAME, PLUGIN_VERSION, ",
        "PLUGIN_STATUS, PLUGIN_TYPE, ",
        "PLUGIN_TYPE_VERSION, PLUGIN_LIBRARY, ",
        "PLUGIN_LIBRARY_VERSION, PLUGIN_AUTHOR, ",
        "PLUGIN_LICENSE, LOAD_OPTION, ",
        "PLUGIN_MATURITY, PLUGIN_AUTH_VERSION, ",
        "PLUGIN_DESCRIPTION)",
        "values (#{pluginName,jdbcType=VARCHAR}, #{pluginVersion,jdbcType=VARCHAR}, ",
        "#{pluginStatus,jdbcType=VARCHAR}, #{pluginType,jdbcType=VARCHAR}, ",
        "#{pluginTypeVersion,jdbcType=VARCHAR}, #{pluginLibrary,jdbcType=VARCHAR}, ",
        "#{pluginLibraryVersion,jdbcType=VARCHAR}, #{pluginAuthor,jdbcType=VARCHAR}, ",
        "#{pluginLicense,jdbcType=VARCHAR}, #{loadOption,jdbcType=VARCHAR}, ",
        "#{pluginMaturity,jdbcType=VARCHAR}, #{pluginAuthVersion,jdbcType=VARCHAR}, ",
        "#{pluginDescription,jdbcType=LONGVARCHAR})"
    })
    int insert(Plugins record);

    @InsertProvider(type=PluginsSqlProvider.class, method="insertSelective")
    int insertSelective(Plugins record);

    @SelectProvider(type=PluginsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="PLUGIN_NAME", property="pluginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_VERSION", property="pluginVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_STATUS", property="pluginStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE", property="pluginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE_VERSION", property="pluginTypeVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY", property="pluginLibrary", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY_VERSION", property="pluginLibraryVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTHOR", property="pluginAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LICENSE", property="pluginLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOAD_OPTION", property="loadOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_MATURITY", property="pluginMaturity", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTH_VERSION", property="pluginAuthVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_DESCRIPTION", property="pluginDescription", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Plugins> selectByExampleWithBLOBsWithRowbounds(PluginsExample example, RowBounds rowBounds);

    @SelectProvider(type=PluginsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="PLUGIN_NAME", property="pluginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_VERSION", property="pluginVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_STATUS", property="pluginStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE", property="pluginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE_VERSION", property="pluginTypeVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY", property="pluginLibrary", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY_VERSION", property="pluginLibraryVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTHOR", property="pluginAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LICENSE", property="pluginLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOAD_OPTION", property="loadOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_MATURITY", property="pluginMaturity", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTH_VERSION", property="pluginAuthVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_DESCRIPTION", property="pluginDescription", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Plugins> selectByExampleWithBLOBs(PluginsExample example);

    @SelectProvider(type=PluginsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PLUGIN_NAME", property="pluginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_VERSION", property="pluginVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_STATUS", property="pluginStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE", property="pluginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE_VERSION", property="pluginTypeVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY", property="pluginLibrary", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY_VERSION", property="pluginLibraryVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTHOR", property="pluginAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LICENSE", property="pluginLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOAD_OPTION", property="loadOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_MATURITY", property="pluginMaturity", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTH_VERSION", property="pluginAuthVersion", jdbcType=JdbcType.VARCHAR)
    })
    List<Plugins> selectByExampleWithRowbounds(PluginsExample example, RowBounds rowBounds);

    @SelectProvider(type=PluginsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PLUGIN_NAME", property="pluginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_VERSION", property="pluginVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_STATUS", property="pluginStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE", property="pluginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_TYPE_VERSION", property="pluginTypeVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY", property="pluginLibrary", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LIBRARY_VERSION", property="pluginLibraryVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTHOR", property="pluginAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_LICENSE", property="pluginLicense", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOAD_OPTION", property="loadOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_MATURITY", property="pluginMaturity", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLUGIN_AUTH_VERSION", property="pluginAuthVersion", jdbcType=JdbcType.VARCHAR)
    })
    List<Plugins> selectByExample(PluginsExample example);

    @UpdateProvider(type=PluginsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Plugins record, @Param("example") PluginsExample example);

    @UpdateProvider(type=PluginsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Plugins record, @Param("example") PluginsExample example);

    @UpdateProvider(type=PluginsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Plugins record, @Param("example") PluginsExample example);
}