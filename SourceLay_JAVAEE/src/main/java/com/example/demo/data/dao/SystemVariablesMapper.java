package com.example.demo.data.dao;

import com.example.demo.data.model.SystemVariables;
import com.example.demo.data.model.SystemVariablesExample;
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

public interface SystemVariablesMapper {
    @SelectProvider(type=SystemVariablesSqlProvider.class, method="countByExample")
    long countByExample(SystemVariablesExample example);

    @DeleteProvider(type=SystemVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(SystemVariablesExample example);

    @Insert({
        "insert into SYSTEM_VARIABLES (VARIABLE_NAME, SESSION_VALUE, ",
        "GLOBAL_VALUE, GLOBAL_VALUE_ORIGIN, ",
        "DEFAULT_VALUE, VARIABLE_SCOPE, ",
        "VARIABLE_TYPE, VARIABLE_COMMENT, ",
        "NUMERIC_MIN_VALUE, NUMERIC_MAX_VALUE, ",
        "NUMERIC_BLOCK_SIZE, READ_ONLY, ",
        "COMMAND_LINE_ARGUMENT, ENUM_VALUE_LIST)",
        "values (#{variableName,jdbcType=VARCHAR}, #{sessionValue,jdbcType=VARCHAR}, ",
        "#{globalValue,jdbcType=VARCHAR}, #{globalValueOrigin,jdbcType=VARCHAR}, ",
        "#{defaultValue,jdbcType=VARCHAR}, #{variableScope,jdbcType=VARCHAR}, ",
        "#{variableType,jdbcType=VARCHAR}, #{variableComment,jdbcType=VARCHAR}, ",
        "#{numericMinValue,jdbcType=VARCHAR}, #{numericMaxValue,jdbcType=VARCHAR}, ",
        "#{numericBlockSize,jdbcType=VARCHAR}, #{readOnly,jdbcType=VARCHAR}, ",
        "#{commandLineArgument,jdbcType=VARCHAR}, #{enumValueList,jdbcType=LONGVARCHAR})"
    })
    int insert(SystemVariables record);

    @InsertProvider(type=SystemVariablesSqlProvider.class, method="insertSelective")
    int insertSelective(SystemVariables record);

    @SelectProvider(type=SystemVariablesSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SESSION_VALUE", property="sessionValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE", property="globalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE_ORIGIN", property="globalValueOrigin", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_VALUE", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_SCOPE", property="variableScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_COMMENT", property="variableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MIN_VALUE", property="numericMinValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MAX_VALUE", property="numericMaxValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_BLOCK_SIZE", property="numericBlockSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="READ_ONLY", property="readOnly", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND_LINE_ARGUMENT", property="commandLineArgument", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENUM_VALUE_LIST", property="enumValueList", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SystemVariables> selectByExampleWithBLOBsWithRowbounds(SystemVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=SystemVariablesSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SESSION_VALUE", property="sessionValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE", property="globalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE_ORIGIN", property="globalValueOrigin", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_VALUE", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_SCOPE", property="variableScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_COMMENT", property="variableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MIN_VALUE", property="numericMinValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MAX_VALUE", property="numericMaxValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_BLOCK_SIZE", property="numericBlockSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="READ_ONLY", property="readOnly", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND_LINE_ARGUMENT", property="commandLineArgument", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENUM_VALUE_LIST", property="enumValueList", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<SystemVariables> selectByExampleWithBLOBs(SystemVariablesExample example);

    @SelectProvider(type=SystemVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SESSION_VALUE", property="sessionValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE", property="globalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE_ORIGIN", property="globalValueOrigin", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_VALUE", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_SCOPE", property="variableScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_COMMENT", property="variableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MIN_VALUE", property="numericMinValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MAX_VALUE", property="numericMaxValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_BLOCK_SIZE", property="numericBlockSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="READ_ONLY", property="readOnly", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND_LINE_ARGUMENT", property="commandLineArgument", jdbcType=JdbcType.VARCHAR)
    })
    List<SystemVariables> selectByExampleWithRowbounds(SystemVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=SystemVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SESSION_VALUE", property="sessionValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE", property="globalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="GLOBAL_VALUE_ORIGIN", property="globalValueOrigin", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_VALUE", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_SCOPE", property="variableScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_COMMENT", property="variableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MIN_VALUE", property="numericMinValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_MAX_VALUE", property="numericMaxValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUMERIC_BLOCK_SIZE", property="numericBlockSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="READ_ONLY", property="readOnly", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMAND_LINE_ARGUMENT", property="commandLineArgument", jdbcType=JdbcType.VARCHAR)
    })
    List<SystemVariables> selectByExample(SystemVariablesExample example);

    @UpdateProvider(type=SystemVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SystemVariables record, @Param("example") SystemVariablesExample example);

    @UpdateProvider(type=SystemVariablesSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") SystemVariables record, @Param("example") SystemVariablesExample example);

    @UpdateProvider(type=SystemVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SystemVariables record, @Param("example") SystemVariablesExample example);
}