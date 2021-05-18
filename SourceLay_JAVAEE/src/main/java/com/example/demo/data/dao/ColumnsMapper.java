package com.example.demo.data.dao;

import com.example.demo.data.model.Columns;
import com.example.demo.data.model.ColumnsExample;
import com.example.demo.data.model.ColumnsWithBLOBs;
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

public interface ColumnsMapper {
    @SelectProvider(type=ColumnsSqlProvider.class, method="countByExample")
    long countByExample(ColumnsExample example);

    @DeleteProvider(type=ColumnsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ColumnsExample example);

    @Insert({
        "insert into COLUMNS (TABLE_CATALOG, TABLE_SCHEMA, ",
        "TABLE_NAME, COLUMN_NAME, ",
        "ORDINAL_POSITION, IS_NULLABLE, ",
        "DATA_TYPE, CHARACTER_MAXIMUM_LENGTH, ",
        "CHARACTER_OCTET_LENGTH, NUMERIC_PRECISION, ",
        "NUMERIC_SCALE, DATETIME_PRECISION, ",
        "CHARACTER_SET_NAME, COLLATION_NAME, ",
        "COLUMN_KEY, EXTRA, ",
        "PRIVILEGES, COLUMN_COMMENT, ",
        "IS_GENERATED, COLUMN_DEFAULT, ",
        "COLUMN_TYPE, GENERATION_EXPRESSION)",
        "values (#{tableCatalog,jdbcType=VARCHAR}, #{tableSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{columnName,jdbcType=VARCHAR}, ",
        "#{ordinalPosition,jdbcType=BIGINT}, #{isNullable,jdbcType=VARCHAR}, ",
        "#{dataType,jdbcType=VARCHAR}, #{characterMaximumLength,jdbcType=BIGINT}, ",
        "#{characterOctetLength,jdbcType=BIGINT}, #{numericPrecision,jdbcType=BIGINT}, ",
        "#{numericScale,jdbcType=BIGINT}, #{datetimePrecision,jdbcType=BIGINT}, ",
        "#{characterSetName,jdbcType=VARCHAR}, #{collationName,jdbcType=VARCHAR}, ",
        "#{columnKey,jdbcType=VARCHAR}, #{extra,jdbcType=VARCHAR}, ",
        "#{privileges,jdbcType=VARCHAR}, #{columnComment,jdbcType=VARCHAR}, ",
        "#{isGenerated,jdbcType=VARCHAR}, #{columnDefault,jdbcType=LONGVARCHAR}, ",
        "#{columnType,jdbcType=LONGVARCHAR}, #{generationExpression,jdbcType=LONGVARCHAR})"
    })
    int insert(ColumnsWithBLOBs record);

    @InsertProvider(type=ColumnsSqlProvider.class, method="insertSelective")
    int insertSelective(ColumnsWithBLOBs record);

    @SelectProvider(type=ColumnsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_NULLABLE", property="isNullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_KEY", property="columnKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGES", property="privileges", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_COMMENT", property="columnComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GENERATED", property="isGenerated", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_DEFAULT", property="columnDefault", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="COLUMN_TYPE", property="columnType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="GENERATION_EXPRESSION", property="generationExpression", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ColumnsWithBLOBs> selectByExampleWithBLOBsWithRowbounds(ColumnsExample example, RowBounds rowBounds);

    @SelectProvider(type=ColumnsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_NULLABLE", property="isNullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_KEY", property="columnKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGES", property="privileges", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_COMMENT", property="columnComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GENERATED", property="isGenerated", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_DEFAULT", property="columnDefault", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="COLUMN_TYPE", property="columnType", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="GENERATION_EXPRESSION", property="generationExpression", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ColumnsWithBLOBs> selectByExampleWithBLOBs(ColumnsExample example);

    @SelectProvider(type=ColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_NULLABLE", property="isNullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_KEY", property="columnKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGES", property="privileges", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_COMMENT", property="columnComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GENERATED", property="isGenerated", jdbcType=JdbcType.VARCHAR)
    })
    List<Columns> selectByExampleWithRowbounds(ColumnsExample example, RowBounds rowBounds);

    @SelectProvider(type=ColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_NAME", property="columnName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_NULLABLE", property="isNullable", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.BIGINT),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_KEY", property="columnKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXTRA", property="extra", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVILEGES", property="privileges", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLUMN_COMMENT", property="columnComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_GENERATED", property="isGenerated", jdbcType=JdbcType.VARCHAR)
    })
    List<Columns> selectByExample(ColumnsExample example);

    @UpdateProvider(type=ColumnsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ColumnsWithBLOBs record, @Param("example") ColumnsExample example);

    @UpdateProvider(type=ColumnsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") ColumnsWithBLOBs record, @Param("example") ColumnsExample example);

    @UpdateProvider(type=ColumnsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Columns record, @Param("example") ColumnsExample example);
}