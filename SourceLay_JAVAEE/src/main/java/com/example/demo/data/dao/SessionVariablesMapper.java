package com.example.demo.data.dao;

import com.example.demo.data.model.SessionVariables;
import com.example.demo.data.model.SessionVariablesExample;
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

public interface SessionVariablesMapper {
    @SelectProvider(type=SessionVariablesSqlProvider.class, method="countByExample")
    long countByExample(SessionVariablesExample example);

    @DeleteProvider(type=SessionVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(SessionVariablesExample example);

    @Insert({
        "insert into SESSION_VARIABLES (VARIABLE_NAME, VARIABLE_VALUE)",
        "values (#{variableName,jdbcType=VARCHAR}, #{variableValue,jdbcType=VARCHAR})"
    })
    int insert(SessionVariables record);

    @InsertProvider(type=SessionVariablesSqlProvider.class, method="insertSelective")
    int insertSelective(SessionVariables record);

    @SelectProvider(type=SessionVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionVariables> selectByExampleWithRowbounds(SessionVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=SessionVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionVariables> selectByExample(SessionVariablesExample example);

    @UpdateProvider(type=SessionVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    @UpdateProvider(type=SessionVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);
}