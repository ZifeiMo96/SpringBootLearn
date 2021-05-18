package com.example.demo.data.dao;

import com.example.demo.data.model.UserVariables;
import com.example.demo.data.model.UserVariablesExample;
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

public interface UserVariablesMapper {
    @SelectProvider(type=UserVariablesSqlProvider.class, method="countByExample")
    long countByExample(UserVariablesExample example);

    @DeleteProvider(type=UserVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserVariablesExample example);

    @Insert({
        "insert into user_variables (VARIABLE_NAME, VARIABLE_VALUE, ",
        "VARIABLE_TYPE, CHARACTER_SET_NAME)",
        "values (#{variableName,jdbcType=VARCHAR}, #{variableValue,jdbcType=VARCHAR}, ",
        "#{variableType,jdbcType=VARCHAR}, #{characterSetName,jdbcType=VARCHAR})"
    })
    int insert(UserVariables record);

    @InsertProvider(type=UserVariablesSqlProvider.class, method="insertSelective")
    int insertSelective(UserVariables record);

    @SelectProvider(type=UserVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR)
    })
    List<UserVariables> selectByExampleWithRowbounds(UserVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=UserVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_TYPE", property="variableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR)
    })
    List<UserVariables> selectByExample(UserVariablesExample example);

    @UpdateProvider(type=UserVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserVariables record, @Param("example") UserVariablesExample example);

    @UpdateProvider(type=UserVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserVariables record, @Param("example") UserVariablesExample example);
}