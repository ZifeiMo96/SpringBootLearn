package com.example.demo.data.dao;

import com.example.demo.data.model.AllPlugins;
import com.example.demo.data.model.AllPluginsExample;
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

public interface AllPluginsMapper {
    @SelectProvider(type=AllPluginsSqlProvider.class, method="countByExample")
    long countByExample(AllPluginsExample example);

    @DeleteProvider(type=AllPluginsSqlProvider.class, method="deleteByExample")
    int deleteByExample(AllPluginsExample example);

    @Insert({
        "insert into ALL_PLUGINS (PLUGIN_NAME, PLUGIN_VERSION, ",
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
    int insert(AllPlugins record);

    @InsertProvider(type=AllPluginsSqlProvider.class, method="insertSelective")
    int insertSelective(AllPlugins record);

    @SelectProvider(type=AllPluginsSqlProvider.class, method="selectByExampleWithBLOBs")
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
    List<AllPlugins> selectByExampleWithBLOBsWithRowbounds(AllPluginsExample example, RowBounds rowBounds);

    @SelectProvider(type=AllPluginsSqlProvider.class, method="selectByExampleWithBLOBs")
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
    List<AllPlugins> selectByExampleWithBLOBs(AllPluginsExample example);

    @SelectProvider(type=AllPluginsSqlProvider.class, method="selectByExample")
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
    List<AllPlugins> selectByExampleWithRowbounds(AllPluginsExample example, RowBounds rowBounds);

    @SelectProvider(type=AllPluginsSqlProvider.class, method="selectByExample")
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
    List<AllPlugins> selectByExample(AllPluginsExample example);

    @UpdateProvider(type=AllPluginsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AllPlugins record, @Param("example") AllPluginsExample example);

    @UpdateProvider(type=AllPluginsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") AllPlugins record, @Param("example") AllPluginsExample example);

    @UpdateProvider(type=AllPluginsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AllPlugins record, @Param("example") AllPluginsExample example);
}