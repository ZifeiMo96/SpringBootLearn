package com.example.demo.data.dao;

import com.example.demo.data.model.SessionStatus;
import com.example.demo.data.model.SessionStatusExample;
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

public interface SessionStatusMapper {
    @SelectProvider(type=SessionStatusSqlProvider.class, method="countByExample")
    long countByExample(SessionStatusExample example);

    @DeleteProvider(type=SessionStatusSqlProvider.class, method="deleteByExample")
    int deleteByExample(SessionStatusExample example);

    @Insert({
        "insert into SESSION_STATUS (VARIABLE_NAME, VARIABLE_VALUE)",
        "values (#{variableName,jdbcType=VARCHAR}, #{variableValue,jdbcType=VARCHAR})"
    })
    int insert(SessionStatus record);

    @InsertProvider(type=SessionStatusSqlProvider.class, method="insertSelective")
    int insertSelective(SessionStatus record);

    @SelectProvider(type=SessionStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionStatus> selectByExampleWithRowbounds(SessionStatusExample example, RowBounds rowBounds);

    @SelectProvider(type=SessionStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="VARIABLE_NAME", property="variableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="VARIABLE_VALUE", property="variableValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SessionStatus> selectByExample(SessionStatusExample example);

    @UpdateProvider(type=SessionStatusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SessionStatus record, @Param("example") SessionStatusExample example);

    @UpdateProvider(type=SessionStatusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SessionStatus record, @Param("example") SessionStatusExample example);
}