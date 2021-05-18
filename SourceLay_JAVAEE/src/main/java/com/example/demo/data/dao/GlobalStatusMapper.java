package com.example.demo.data.dao;

import com.example.demo.data.model.GlobalStatus;
import com.example.demo.data.model.GlobalStatusExample;
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

public interface GlobalStatusMapper {
    @SelectProvider(type=GlobalStatusSqlProvider.class, method="countByExample")
    long countByExample(GlobalStatusExample example);

    @DeleteProvider(type=GlobalStatusSqlProvider.class, method="deleteByExample")
    int deleteByExample(GlobalStatusExample example);

    @Insert({
        "insert into GLOBAL_STATUS (VARIABLE_NAME, VARIABLE_VALUE)",
        "values (#{variableName,jdbcType=VARCHAR}, #{variableValue,jdbcType=VARCHAR})"
    })
    int insert(GlobalStatus record);

    @InsertProvider(type=GlobalStatusSqlProvider.class, method="insertSelective")
    int insertSelective(GlobalStatus record);

    @SelectProvider(type=GlobalStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<GlobalStatus> selectByExampleWithRowbounds(GlobalStatusExample example, RowBounds rowBounds);

    @SelectProvider(type=GlobalStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<GlobalStatus> selectByExample(GlobalStatusExample example);

    @UpdateProvider(type=GlobalStatusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);

    @UpdateProvider(type=GlobalStatusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);
}