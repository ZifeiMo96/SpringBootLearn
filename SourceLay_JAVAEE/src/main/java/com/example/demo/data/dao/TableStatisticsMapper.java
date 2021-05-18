package com.example.demo.data.dao;

import com.example.demo.data.model.TableStatistics;
import com.example.demo.data.model.TableStatisticsExample;
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

public interface TableStatisticsMapper {
    @SelectProvider(type=TableStatisticsSqlProvider.class, method="countByExample")
    long countByExample(TableStatisticsExample example);

    @DeleteProvider(type=TableStatisticsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TableStatisticsExample example);

    @Insert({
        "insert into TABLE_STATISTICS (TABLE_SCHEMA, TABLE_NAME, ",
        "ROWS_READ, ROWS_CHANGED, ",
        "ROWS_CHANGED_X_INDEXES)",
        "values (#{tableSchema,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{rowsRead,jdbcType=BIGINT}, #{rowsChanged,jdbcType=BIGINT}, ",
        "#{rowsChangedXIndexes,jdbcType=BIGINT})"
    })
    int insert(TableStatistics record);

    @InsertProvider(type=TableStatisticsSqlProvider.class, method="insertSelective")
    int insertSelective(TableStatistics record);

    @SelectProvider(type=TableStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_CHANGED", property="rowsChanged", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_CHANGED_X_INDEXES", property="rowsChangedXIndexes", jdbcType=JdbcType.BIGINT)
    })
    List<TableStatistics> selectByExampleWithRowbounds(TableStatisticsExample example, RowBounds rowBounds);

    @SelectProvider(type=TableStatisticsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ROWS_READ", property="rowsRead", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_CHANGED", property="rowsChanged", jdbcType=JdbcType.BIGINT),
        @Result(column="ROWS_CHANGED_X_INDEXES", property="rowsChangedXIndexes", jdbcType=JdbcType.BIGINT)
    })
    List<TableStatistics> selectByExample(TableStatisticsExample example);

    @UpdateProvider(type=TableStatisticsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TableStatistics record, @Param("example") TableStatisticsExample example);

    @UpdateProvider(type=TableStatisticsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TableStatistics record, @Param("example") TableStatisticsExample example);
}