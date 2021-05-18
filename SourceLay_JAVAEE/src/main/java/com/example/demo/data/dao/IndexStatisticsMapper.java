package com.example.demo.data.dao;

import com.example.demo.data.model.IndexStatistics;
import com.example.demo.data.model.IndexStatisticsExample;
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

public interface IndexStatisticsMapper {
    @SelectProvider(type=IndexStatisticsSqlProvider.class, method="countByExample")
    long countByExample(IndexStatisticsExample example);

    @DeleteProvider(type=IndexStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(IndexStatisticsExample example);

    @Insert({
        "insert into INDEX_STATISTICS (TABLE_SCHEMA, TABLE_NAME, ",
        "INDEX_NAME, ROWS_READ)",
        "values (#{tableSchema,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{indexName,jdbcType=VARCHAR}, #{rowsRead,jdbcType=BIGINT})"
    })
    int insert(IndexStatistics record);

    @InsertProvider(type=IndexStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(IndexStatistics record);

    @SelectProvider(type=IndexStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT)
    })
    List<IndexStatistics> selectByExampleWithRowbounds(IndexStatisticsExample example, RowBounds rowBounds);

    @SelectProvider(type=IndexStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEX_NAME", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT)
    })
    List<IndexStatistics> selectByExample(IndexStatisticsExample example);

    @UpdateProvider(type=IndexStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") IndexStatistics record, @Param("example") IndexStatisticsExample example);

    @UpdateProvider(type=IndexStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") IndexStatistics record, @Param("example") IndexStatisticsExample example);
}