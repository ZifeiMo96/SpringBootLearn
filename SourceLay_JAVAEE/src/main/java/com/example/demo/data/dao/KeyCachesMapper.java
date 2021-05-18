package com.example.demo.data.dao;

import com.example.demo.data.model.KeyCaches;
import com.example.demo.data.model.KeyCachesExample;
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

public interface KeyCachesMapper {
    @SelectProvider(type=KeyCachesSqlProvider.class, method="countByExample")
    long countByExample(KeyCachesExample example);

    @DeleteProvider(type=KeyCachesSqlProvider.class, method="deleteByExample")
    int deleteByExample(KeyCachesExample example);

    @Insert({
        "insert into KEY_CACHES (KEY_CACHE_NAME, SEGMENTS, ",
        "SEGMENT_NUMBER, FULL_SIZE, ",
        "BLOCK_SIZE, USED_BLOCKS, ",
        "UNUSED_BLOCKS, DIRTY_BLOCKS, ",
        "READ_REQUESTS, READS, ",
        "WRITE_REQUESTS, WRITES)",
        "values (#{keyCacheName,jdbcType=VARCHAR}, #{segments,jdbcType=INTEGER}, ",
        "#{segmentNumber,jdbcType=INTEGER}, #{fullSize,jdbcType=BIGINT}, ",
        "#{blockSize,jdbcType=BIGINT}, #{usedBlocks,jdbcType=BIGINT}, ",
        "#{unusedBlocks,jdbcType=BIGINT}, #{dirtyBlocks,jdbcType=BIGINT}, ",
        "#{readRequests,jdbcType=BIGINT}, #{reads,jdbcType=BIGINT}, ",
        "#{writeRequests,jdbcType=BIGINT}, #{writes,jdbcType=BIGINT})"
    })
    int insert(KeyCaches record);

    @InsertProvider(type=KeyCachesSqlProvider.class, method="insertSelective")
    int insertSelective(KeyCaches record);

    @SelectProvider(type=KeyCachesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="KEY_CACHE_NAME", property="keyCacheName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEGMENTS", property="segments", jdbcType=JdbcType.INTEGER),
        @Result(column="SEGMENT_NUMBER", property="segmentNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="FULL_SIZE", property="fullSize", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCK_SIZE", property="blockSize", jdbcType=JdbcType.BIGINT),
        @Result(column="USED_BLOCKS", property="usedBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="UNUSED_BLOCKS", property="unusedBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="DIRTY_BLOCKS", property="dirtyBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="READ_REQUESTS", property="readRequests", jdbcType=JdbcType.BIGINT),
        @Result(column="READS", property="reads", jdbcType=JdbcType.BIGINT),
        @Result(column="WRITE_REQUESTS", property="writeRequests", jdbcType=JdbcType.BIGINT),
        @Result(column="WRITES", property="writes", jdbcType=JdbcType.BIGINT)
    })
    List<KeyCaches> selectByExampleWithRowbounds(KeyCachesExample example, RowBounds rowBounds);

    @SelectProvider(type=KeyCachesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="KEY_CACHE_NAME", property="keyCacheName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEGMENTS", property="segments", jdbcType=JdbcType.INTEGER),
        @Result(column="SEGMENT_NUMBER", property="segmentNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="FULL_SIZE", property="fullSize", jdbcType=JdbcType.BIGINT),
        @Result(column="BLOCK_SIZE", property="blockSize", jdbcType=JdbcType.BIGINT),
        @Result(column="USED_BLOCKS", property="usedBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="UNUSED_BLOCKS", property="unusedBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="DIRTY_BLOCKS", property="dirtyBlocks", jdbcType=JdbcType.BIGINT),
        @Result(column="READ_REQUESTS", property="readRequests", jdbcType=JdbcType.BIGINT),
        @Result(column="READS", property="reads", jdbcType=JdbcType.BIGINT),
        @Result(column="WRITE_REQUESTS", property="writeRequests", jdbcType=JdbcType.BIGINT),
        @Result(column="WRITES", property="writes", jdbcType=JdbcType.BIGINT)
    })
    List<KeyCaches> selectByExample(KeyCachesExample example);

    @UpdateProvider(type=KeyCachesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") KeyCaches record, @Param("example") KeyCachesExample example);

    @UpdateProvider(type=KeyCachesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") KeyCaches record, @Param("example") KeyCachesExample example);
}