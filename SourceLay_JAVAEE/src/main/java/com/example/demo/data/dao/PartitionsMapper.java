package com.example.demo.data.dao;

import com.example.demo.data.model.Partitions;
import com.example.demo.data.model.PartitionsExample;
import com.example.demo.data.model.PartitionsWithBLOBs;
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

public interface PartitionsMapper {
    @SelectProvider(type=PartitionsSqlProvider.class, method="countByExample")
    long countByExample(PartitionsExample example);

    @DeleteProvider(type=PartitionsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PartitionsExample example);

    @Insert({
        "insert into PARTITIONS (TABLE_CATALOG, TABLE_SCHEMA, ",
        "TABLE_NAME, PARTITION_NAME, ",
        "SUBPARTITION_NAME, PARTITION_ORDINAL_POSITION, ",
        "SUBPARTITION_ORDINAL_POSITION, PARTITION_METHOD, ",
        "SUBPARTITION_METHOD, TABLE_ROWS, ",
        "AVG_ROW_LENGTH, DATA_LENGTH, ",
        "MAX_DATA_LENGTH, INDEX_LENGTH, ",
        "DATA_FREE, CREATE_TIME, ",
        "UPDATE_TIME, CHECK_TIME, ",
        "CHECKSUM, PARTITION_COMMENT, ",
        "NODEGROUP, TABLESPACE_NAME, ",
        "PARTITION_EXPRESSION, SUBPARTITION_EXPRESSION, ",
        "PARTITION_DESCRIPTION)",
        "values (#{tableCatalog,jdbcType=VARCHAR}, #{tableSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{partitionName,jdbcType=VARCHAR}, ",
        "#{subpartitionName,jdbcType=VARCHAR}, #{partitionOrdinalPosition,jdbcType=BIGINT}, ",
        "#{subpartitionOrdinalPosition,jdbcType=BIGINT}, #{partitionMethod,jdbcType=VARCHAR}, ",
        "#{subpartitionMethod,jdbcType=VARCHAR}, #{tableRows,jdbcType=BIGINT}, ",
        "#{avgRowLength,jdbcType=BIGINT}, #{dataLength,jdbcType=BIGINT}, ",
        "#{maxDataLength,jdbcType=BIGINT}, #{indexLength,jdbcType=BIGINT}, ",
        "#{dataFree,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{checkTime,jdbcType=TIMESTAMP}, ",
        "#{checksum,jdbcType=BIGINT}, #{partitionComment,jdbcType=VARCHAR}, ",
        "#{nodegroup,jdbcType=VARCHAR}, #{tablespaceName,jdbcType=VARCHAR}, ",
        "#{partitionExpression,jdbcType=LONGVARCHAR}, #{subpartitionExpression,jdbcType=LONGVARCHAR}, ",
        "#{partitionDescription,jdbcType=LONGVARCHAR})"
    })
    int insert(PartitionsWithBLOBs record);

    @InsertProvider(type=PartitionsSqlProvider.class, method="insertSelective")
    int insertSelective(PartitionsWithBLOBs record);

    @SelectProvider(type=PartitionsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_ORDINAL_POSITION", property="partitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="SUBPARTITION_ORDINAL_POSITION", property="subpartitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_METHOD", property="partitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_METHOD", property="subpartitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_COMMENT", property="partitionComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NODEGROUP", property="nodegroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_EXPRESSION", property="partitionExpression", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="SUBPARTITION_EXPRESSION", property="subpartitionExpression", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PARTITION_DESCRIPTION", property="partitionDescription", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PartitionsWithBLOBs> selectByExampleWithBLOBsWithRowbounds(PartitionsExample example, RowBounds rowBounds);

    @SelectProvider(type=PartitionsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_ORDINAL_POSITION", property="partitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="SUBPARTITION_ORDINAL_POSITION", property="subpartitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_METHOD", property="partitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_METHOD", property="subpartitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_COMMENT", property="partitionComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NODEGROUP", property="nodegroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_EXPRESSION", property="partitionExpression", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="SUBPARTITION_EXPRESSION", property="subpartitionExpression", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PARTITION_DESCRIPTION", property="partitionDescription", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PartitionsWithBLOBs> selectByExampleWithBLOBs(PartitionsExample example);

    @SelectProvider(type=PartitionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_ORDINAL_POSITION", property="partitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="SUBPARTITION_ORDINAL_POSITION", property="subpartitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_METHOD", property="partitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_METHOD", property="subpartitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_COMMENT", property="partitionComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NODEGROUP", property="nodegroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR)
    })
    List<Partitions> selectByExampleWithRowbounds(PartitionsExample example, RowBounds rowBounds);

    @SelectProvider(type=PartitionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_NAME", property="partitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_NAME", property="subpartitionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PARTITION_ORDINAL_POSITION", property="partitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="SUBPARTITION_ORDINAL_POSITION", property="subpartitionOrdinalPosition", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_METHOD", property="partitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="SUBPARTITION_METHOD", property="subpartitionMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="PARTITION_COMMENT", property="partitionComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="NODEGROUP", property="nodegroup", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLESPACE_NAME", property="tablespaceName", jdbcType=JdbcType.VARCHAR)
    })
    List<Partitions> selectByExample(PartitionsExample example);

    @UpdateProvider(type=PartitionsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    @UpdateProvider(type=PartitionsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PartitionsWithBLOBs record, @Param("example") PartitionsExample example);

    @UpdateProvider(type=PartitionsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Partitions record, @Param("example") PartitionsExample example);
}