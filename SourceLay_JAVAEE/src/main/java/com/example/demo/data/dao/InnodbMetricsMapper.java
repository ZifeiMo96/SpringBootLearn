package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbMetrics;
import com.example.demo.data.model.InnodbMetricsExample;
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

public interface InnodbMetricsMapper {
    @SelectProvider(type=InnodbMetricsSqlProvider.class, method="countByExample")
    long countByExample(InnodbMetricsExample example);

    @DeleteProvider(type=InnodbMetricsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbMetricsExample example);

    @Insert({
        "insert into INNODB_METRICS (NAME, SUBSYSTEM, ",
        "COUNT, MAX_COUNT, MIN_COUNT, ",
        "AVG_COUNT, COUNT_RESET, ",
        "MAX_COUNT_RESET, MIN_COUNT_RESET, ",
        "AVG_COUNT_RESET, TIME_ENABLED, ",
        "TIME_DISABLED, TIME_ELAPSED, ",
        "TIME_RESET, STATUS, ",
        "TYPE, COMMENT)",
        "values (#{name,jdbcType=VARCHAR}, #{subsystem,jdbcType=VARCHAR}, ",
        "#{count,jdbcType=BIGINT}, #{maxCount,jdbcType=BIGINT}, #{minCount,jdbcType=BIGINT}, ",
        "#{avgCount,jdbcType=DOUBLE}, #{countReset,jdbcType=BIGINT}, ",
        "#{maxCountReset,jdbcType=BIGINT}, #{minCountReset,jdbcType=BIGINT}, ",
        "#{avgCountReset,jdbcType=DOUBLE}, #{timeEnabled,jdbcType=TIMESTAMP}, ",
        "#{timeDisabled,jdbcType=TIMESTAMP}, #{timeElapsed,jdbcType=BIGINT}, ",
        "#{timeReset,jdbcType=TIMESTAMP}, #{status,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{comment,jdbcType=VARCHAR})"
    })
    int insert(InnodbMetrics record);

    @InsertProvider(type=InnodbMetricsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbMetrics record);

    @SelectProvider(type=InnodbMetricsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBSYSTEM", property="subsystem", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT", property="maxCount", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT", property="minCount", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT", property="avgCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="COUNT_RESET", property="countReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT_RESET", property="maxCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT_RESET", property="minCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT_RESET", property="avgCountReset", jdbcType=JdbcType.DOUBLE),
        @Result(column="TIME_ENABLED", property="timeEnabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_DISABLED", property="timeDisabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_ELAPSED", property="timeElapsed", jdbcType=JdbcType.BIGINT),
        @Result(column="TIME_RESET", property="timeReset", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbMetrics> selectByExampleWithRowbounds(InnodbMetricsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbMetricsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBSYSTEM", property="subsystem", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT", property="maxCount", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT", property="minCount", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT", property="avgCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="COUNT_RESET", property="countReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_COUNT_RESET", property="maxCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="MIN_COUNT_RESET", property="minCountReset", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_COUNT_RESET", property="avgCountReset", jdbcType=JdbcType.DOUBLE),
        @Result(column="TIME_ENABLED", property="timeEnabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_DISABLED", property="timeDisabled", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIME_ELAPSED", property="timeElapsed", jdbcType=JdbcType.BIGINT),
        @Result(column="TIME_RESET", property="timeReset", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMMENT", property="comment", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbMetrics> selectByExample(InnodbMetricsExample example);

    @UpdateProvider(type=InnodbMetricsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbMetrics record, @Param("example") InnodbMetricsExample example);

    @UpdateProvider(type=InnodbMetricsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbMetrics record, @Param("example") InnodbMetricsExample example);
}