package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmpPerIndex;
import com.example.demo.data.model.InnodbCmpPerIndexExample;
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

public interface InnodbCmpPerIndexMapper {
    @SelectProvider(type=InnodbCmpPerIndexSqlProvider.class, method="countByExample")
    long countByExample(InnodbCmpPerIndexExample example);

    @DeleteProvider(type=InnodbCmpPerIndexSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbCmpPerIndexExample example);

    @Insert({
        "insert into INNODB_CMP_PER_INDEX (database_name, table_name, ",
        "index_name, compress_ops, ",
        "compress_ops_ok, compress_time, ",
        "uncompress_ops, uncompress_time)",
        "values (#{databaseName,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{indexName,jdbcType=VARCHAR}, #{compressOps,jdbcType=INTEGER}, ",
        "#{compressOpsOk,jdbcType=INTEGER}, #{compressTime,jdbcType=INTEGER}, ",
        "#{uncompressOps,jdbcType=INTEGER}, #{uncompressTime,jdbcType=INTEGER})"
    })
    int insert(InnodbCmpPerIndex record);

    @InsertProvider(type=InnodbCmpPerIndexSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbCmpPerIndex record);

    @SelectProvider(type=InnodbCmpPerIndexSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="database_name", property="databaseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpPerIndex> selectByExampleWithRowbounds(InnodbCmpPerIndexExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbCmpPerIndexSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="database_name", property="databaseName", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="index_name", property="indexName", jdbcType=JdbcType.VARCHAR),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpPerIndex> selectByExample(InnodbCmpPerIndexExample example);

    @UpdateProvider(type=InnodbCmpPerIndexSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);

    @UpdateProvider(type=InnodbCmpPerIndexSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);
}