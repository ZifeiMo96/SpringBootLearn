package com.example.demo.data.dao;

import com.example.demo.data.model.Parameters;
import com.example.demo.data.model.ParametersExample;
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

public interface ParametersMapper {
    @SelectProvider(type=ParametersSqlProvider.class, method="countByExample")
    long countByExample(ParametersExample example);

    @DeleteProvider(type=ParametersSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParametersExample example);

    @Insert({
        "insert into PARAMETERS (SPECIFIC_CATALOG, SPECIFIC_SCHEMA, ",
        "SPECIFIC_NAME, ORDINAL_POSITION, ",
        "PARAMETER_MODE, PARAMETER_NAME, ",
        "DATA_TYPE, CHARACTER_MAXIMUM_LENGTH, ",
        "CHARACTER_OCTET_LENGTH, NUMERIC_PRECISION, ",
        "NUMERIC_SCALE, DATETIME_PRECISION, ",
        "CHARACTER_SET_NAME, COLLATION_NAME, ",
        "ROUTINE_TYPE, DTD_IDENTIFIER)",
        "values (#{specificCatalog,jdbcType=VARCHAR}, #{specificSchema,jdbcType=VARCHAR}, ",
        "#{specificName,jdbcType=VARCHAR}, #{ordinalPosition,jdbcType=INTEGER}, ",
        "#{parameterMode,jdbcType=VARCHAR}, #{parameterName,jdbcType=VARCHAR}, ",
        "#{dataType,jdbcType=VARCHAR}, #{characterMaximumLength,jdbcType=INTEGER}, ",
        "#{characterOctetLength,jdbcType=INTEGER}, #{numericPrecision,jdbcType=INTEGER}, ",
        "#{numericScale,jdbcType=INTEGER}, #{datetimePrecision,jdbcType=BIGINT}, ",
        "#{characterSetName,jdbcType=VARCHAR}, #{collationName,jdbcType=VARCHAR}, ",
        "#{routineType,jdbcType=VARCHAR}, #{dtdIdentifier,jdbcType=LONGVARCHAR})"
    })
    int insert(Parameters record);

    @InsertProvider(type=ParametersSqlProvider.class, method="insertSelective")
    int insertSelective(Parameters record);

    @SelectProvider(type=ParametersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="PARAMETER_MODE", property="parameterMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_NAME", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.INTEGER),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DTD_IDENTIFIER", property="dtdIdentifier", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Parameters> selectByExampleWithBLOBsWithRowbounds(ParametersExample example, RowBounds rowBounds);

    @SelectProvider(type=ParametersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="PARAMETER_MODE", property="parameterMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_NAME", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.INTEGER),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.VARCHAR),
        @Result(column="DTD_IDENTIFIER", property="dtdIdentifier", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Parameters> selectByExampleWithBLOBs(ParametersExample example);

    @SelectProvider(type=ParametersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="PARAMETER_MODE", property="parameterMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_NAME", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.INTEGER),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.VARCHAR)
    })
    List<Parameters> selectByExampleWithRowbounds(ParametersExample example, RowBounds rowBounds);

    @SelectProvider(type=ParametersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPECIFIC_CATALOG", property="specificCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_SCHEMA", property="specificSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="SPECIFIC_NAME", property="specificName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORDINAL_POSITION", property="ordinalPosition", jdbcType=JdbcType.INTEGER),
        @Result(column="PARAMETER_MODE", property="parameterMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARAMETER_NAME", property="parameterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_TYPE", property="dataType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_MAXIMUM_LENGTH", property="characterMaximumLength", jdbcType=JdbcType.INTEGER),
        @Result(column="CHARACTER_OCTET_LENGTH", property="characterOctetLength", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_PRECISION", property="numericPrecision", jdbcType=JdbcType.INTEGER),
        @Result(column="NUMERIC_SCALE", property="numericScale", jdbcType=JdbcType.INTEGER),
        @Result(column="DATETIME_PRECISION", property="datetimePrecision", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROUTINE_TYPE", property="routineType", jdbcType=JdbcType.VARCHAR)
    })
    List<Parameters> selectByExample(ParametersExample example);

    @UpdateProvider(type=ParametersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Parameters record, @Param("example") ParametersExample example);

    @UpdateProvider(type=ParametersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Parameters record, @Param("example") ParametersExample example);

    @UpdateProvider(type=ParametersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Parameters record, @Param("example") ParametersExample example);
}