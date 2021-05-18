package com.example.demo.data.dao;

import com.example.demo.data.model.GlobalVariables;
import com.example.demo.data.model.GlobalVariablesExample;
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

public interface GlobalVariablesMapper {
    @SelectProvider(type=GlobalVariablesSqlProvider.class, method="countByExample")
    long countByExample(GlobalVariablesExample example);

    @DeleteProvider(type=GlobalVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(GlobalVariablesExample example);

    @Insert({
        "insert into GLOBAL_VARIABLES (VARIABLE_NAME, VARIABLE_VALUE)",
        "values (#{variableName,jdbcType=VARCHAR}, #{variableValue,jdbcType=VARCHAR})"
    })
    int insert(GlobalVariables record);

    @InsertProvider(type=GlobalVariablesSqlProvider.class, method="insertSelective")
    int insertSelective(GlobalVariables record);

    @SelectProvider(type=GlobalVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<GlobalVariables> selectByExampleWithRowbounds(GlobalVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=GlobalVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<GlobalVariables> selectByExample(GlobalVariablesExample example);

    @UpdateProvider(type=GlobalVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GlobalVariables record, @Param("example") GlobalVariablesExample example);

    @UpdateProvider(type=GlobalVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GlobalVariables record, @Param("example") GlobalVariablesExample example);
}