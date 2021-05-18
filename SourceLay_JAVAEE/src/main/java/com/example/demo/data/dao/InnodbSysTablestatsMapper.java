package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysTablestats;
import com.example.demo.data.model.InnodbSysTablestatsExample;
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

public interface InnodbSysTablestatsMapper {
    @SelectProvider(type=InnodbSysTablestatsSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysTablestatsExample example);

    @DeleteProvider(type=InnodbSysTablestatsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysTablestatsExample example);

    @Insert({
        "insert into INNODB_SYS_TABLESTATS (TABLE_ID, NAME, ",
        "STATS_INITIALIZED, NUM_ROWS, ",
        "CLUST_INDEX_SIZE, OTHER_INDEX_SIZE, ",
        "MODIFIED_COUNTER, AUTOINC, ",
        "REF_COUNT)",
        "values (#{tableId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{statsInitialized,jdbcType=VARCHAR}, #{numRows,jdbcType=BIGINT}, ",
        "#{clustIndexSize,jdbcType=BIGINT}, #{otherIndexSize,jdbcType=BIGINT}, ",
        "#{modifiedCounter,jdbcType=BIGINT}, #{autoinc,jdbcType=BIGINT}, ",
        "#{refCount,jdbcType=INTEGER})"
    })
    int insert(InnodbSysTablestats record);

    @InsertProvider(type=InnodbSysTablestatsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysTablestats record);

    @SelectProvider(type=InnodbSysTablestatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATS_INITIALIZED", property="statsInitialized", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUM_ROWS", property="numRows", jdbcType=JdbcType.BIGINT),
        @Result(column="CLUST_INDEX_SIZE", property="clustIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_INDEX_SIZE", property="otherIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MODIFIED_COUNTER", property="modifiedCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOINC", property="autoinc", jdbcType=JdbcType.BIGINT),
        @Result(column="REF_COUNT", property="refCount", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysTablestats> selectByExampleWithRowbounds(InnodbSysTablestatsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysTablestatsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATS_INITIALIZED", property="statsInitialized", jdbcType=JdbcType.VARCHAR),
        @Result(column="NUM_ROWS", property="numRows", jdbcType=JdbcType.BIGINT),
        @Result(column="CLUST_INDEX_SIZE", property="clustIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="OTHER_INDEX_SIZE", property="otherIndexSize", jdbcType=JdbcType.BIGINT),
        @Result(column="MODIFIED_COUNTER", property="modifiedCounter", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTOINC", property="autoinc", jdbcType=JdbcType.BIGINT),
        @Result(column="REF_COUNT", property="refCount", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysTablestats> selectByExample(InnodbSysTablestatsExample example);

    @UpdateProvider(type=InnodbSysTablestatsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysTablestats record, @Param("example") InnodbSysTablestatsExample example);

    @UpdateProvider(type=InnodbSysTablestatsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysTablestats record, @Param("example") InnodbSysTablestatsExample example);
}