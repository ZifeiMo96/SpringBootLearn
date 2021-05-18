package com.example.demo.data.dao;

import com.example.demo.data.model.Engines;
import com.example.demo.data.model.EnginesExample;
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

public interface EnginesMapper {
    @SelectProvider(type=EnginesSqlProvider.class, method="countByExample")
    long countByExample(EnginesExample example);

    @DeleteProvider(type=EnginesSqlProvider.class, method="deleteByExample")
    int deleteByExample(EnginesExample example);

    @Insert({
        "insert into ENGINES (ENGINE, SUPPORT, ",
        "COMMENT, TRANSACTIONS, ",
        "XA, SAVEPOINTS)",
        "values (#{engine,jdbcType=VARCHAR}, #{support,jdbcType=VARCHAR}, ",
        "#{comment,jdbcType=VARCHAR}, #{transactions,jdbcType=VARCHAR}, ",
        "#{xa,jdbcType=VARCHAR}, #{savepoints,jdbcType=VARCHAR})"
    })
    int insert(Engines record);

    @InsertProvider(type=EnginesSqlProvider.class, method="insertSelective")
    int insertSelective(Engines record);

    @SelectProvider(type=EnginesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUPPORT", property="support", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANSACTIONS", property="transactions", jdbcType=JdbcType.VARCHAR),
        @Result(column="XA", property="xa", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVEPOINTS", property="savepoints", jdbcType=JdbcType.VARCHAR)
    })
    List<Engines> selectByExampleWithRowbounds(EnginesExample example, RowBounds rowBounds);

    @SelectProvider(type=EnginesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUPPORT", property="support", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRANSACTIONS", property="transactions", jdbcType=JdbcType.VARCHAR),
        @Result(column="XA", property="xa", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAVEPOINTS", property="savepoints", jdbcType=JdbcType.VARCHAR)
    })
    List<Engines> selectByExample(EnginesExample example);

    @UpdateProvider(type=EnginesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Engines record, @Param("example") EnginesExample example);

    @UpdateProvider(type=EnginesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Engines record, @Param("example") EnginesExample example);
}