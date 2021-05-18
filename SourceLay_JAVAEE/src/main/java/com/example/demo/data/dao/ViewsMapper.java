package com.example.demo.data.dao;

import com.example.demo.data.model.Views;
import com.example.demo.data.model.ViewsExample;
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

public interface ViewsMapper {
    @SelectProvider(type=ViewsSqlProvider.class, method="countByExample")
    long countByExample(ViewsExample example);

    @DeleteProvider(type=ViewsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ViewsExample example);

    @Insert({
        "insert into VIEWS (TABLE_CATALOG, TABLE_SCHEMA, ",
        "TABLE_NAME, CHECK_OPTION, ",
        "IS_UPDATABLE, DEFINER, ",
        "SECURITY_TYPE, CHARACTER_SET_CLIENT, ",
        "COLLATION_CONNECTION, ALGORITHM, ",
        "VIEW_DEFINITION)",
        "values (#{tableCatalog,jdbcType=VARCHAR}, #{tableSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{checkOption,jdbcType=VARCHAR}, ",
        "#{isUpdatable,jdbcType=VARCHAR}, #{definer,jdbcType=VARCHAR}, ",
        "#{securityType,jdbcType=VARCHAR}, #{characterSetClient,jdbcType=VARCHAR}, ",
        "#{collationConnection,jdbcType=VARCHAR}, #{algorithm,jdbcType=VARCHAR}, ",
        "#{viewDefinition,jdbcType=LONGVARCHAR})"
    })
    int insert(Views record);

    @InsertProvider(type=ViewsSqlProvider.class, method="insertSelective")
    int insertSelective(Views record);

    @SelectProvider(type=ViewsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_OPTION", property="checkOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_UPDATABLE", property="isUpdatable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALGORITHM", property="algorithm", jdbcType=JdbcType.VARCHAR),
        @Result(column="VIEW_DEFINITION", property="viewDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Views> selectByExampleWithBLOBsWithRowbounds(ViewsExample example, RowBounds rowBounds);

    @SelectProvider(type=ViewsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_OPTION", property="checkOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_UPDATABLE", property="isUpdatable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALGORITHM", property="algorithm", jdbcType=JdbcType.VARCHAR),
        @Result(column="VIEW_DEFINITION", property="viewDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Views> selectByExampleWithBLOBs(ViewsExample example);

    @SelectProvider(type=ViewsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_OPTION", property="checkOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_UPDATABLE", property="isUpdatable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALGORITHM", property="algorithm", jdbcType=JdbcType.VARCHAR)
    })
    List<Views> selectByExampleWithRowbounds(ViewsExample example, RowBounds rowBounds);

    @SelectProvider(type=ViewsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_OPTION", property="checkOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_UPDATABLE", property="isUpdatable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="ALGORITHM", property="algorithm", jdbcType=JdbcType.VARCHAR)
    })
    List<Views> selectByExample(ViewsExample example);

    @UpdateProvider(type=ViewsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Views record, @Param("example") ViewsExample example);

    @UpdateProvider(type=ViewsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Views record, @Param("example") ViewsExample example);

    @UpdateProvider(type=ViewsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Views record, @Param("example") ViewsExample example);
}