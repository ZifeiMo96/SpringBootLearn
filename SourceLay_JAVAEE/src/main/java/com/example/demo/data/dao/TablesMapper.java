package com.example.demo.data.dao;

import com.example.demo.data.model.Tables;
import com.example.demo.data.model.TablesExample;
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

public interface TablesMapper {
    @SelectProvider(type=TablesSqlProvider.class, method="countByExample")
    long countByExample(TablesExample example);

    @DeleteProvider(type=TablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(TablesExample example);

    @Insert({
        "insert into TABLES (TABLE_CATALOG, TABLE_SCHEMA, ",
        "TABLE_NAME, TABLE_TYPE, ",
        "ENGINE, VERSION, ",
        "ROW_FORMAT, TABLE_ROWS, ",
        "AVG_ROW_LENGTH, DATA_LENGTH, ",
        "MAX_DATA_LENGTH, INDEX_LENGTH, ",
        "DATA_FREE, AUTO_INCREMENT, ",
        "CREATE_TIME, UPDATE_TIME, ",
        "CHECK_TIME, TABLE_COLLATION, ",
        "CHECKSUM, CREATE_OPTIONS, ",
        "TABLE_COMMENT, MAX_INDEX_LENGTH, ",
        "TEMPORARY)",
        "values (#{tableCatalog,jdbcType=VARCHAR}, #{tableSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{tableType,jdbcType=VARCHAR}, ",
        "#{engine,jdbcType=VARCHAR}, #{version,jdbcType=BIGINT}, ",
        "#{rowFormat,jdbcType=VARCHAR}, #{tableRows,jdbcType=BIGINT}, ",
        "#{avgRowLength,jdbcType=BIGINT}, #{dataLength,jdbcType=BIGINT}, ",
        "#{maxDataLength,jdbcType=BIGINT}, #{indexLength,jdbcType=BIGINT}, ",
        "#{dataFree,jdbcType=BIGINT}, #{autoIncrement,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{checkTime,jdbcType=TIMESTAMP}, #{tableCollation,jdbcType=VARCHAR}, ",
        "#{checksum,jdbcType=BIGINT}, #{createOptions,jdbcType=VARCHAR}, ",
        "#{tableComment,jdbcType=VARCHAR}, #{maxIndexLength,jdbcType=BIGINT}, ",
        "#{temporary,jdbcType=VARCHAR})"
    })
    int insert(Tables record);

    @InsertProvider(type=TablesSqlProvider.class, method="insertSelective")
    int insertSelective(Tables record);

    @SelectProvider(type=TablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_TYPE", property="tableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTO_INCREMENT", property="autoIncrement", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TABLE_COLLATION", property="tableCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_OPTIONS", property="createOptions", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_COMMENT", property="tableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAX_INDEX_LENGTH", property="maxIndexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="TEMPORARY", property="temporary", jdbcType=JdbcType.VARCHAR)
    })
    List<Tables> selectByExampleWithRowbounds(TablesExample example, RowBounds rowBounds);

    @SelectProvider(type=TablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_CATALOG", property="tableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_TYPE", property="tableType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENGINE", property="engine", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ROWS", property="tableRows", jdbcType=JdbcType.BIGINT),
        @Result(column="AVG_ROW_LENGTH", property="avgRowLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_LENGTH", property="dataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="MAX_DATA_LENGTH", property="maxDataLength", jdbcType=JdbcType.BIGINT),
        @Result(column="INDEX_LENGTH", property="indexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="DATA_FREE", property="dataFree", jdbcType=JdbcType.BIGINT),
        @Result(column="AUTO_INCREMENT", property="autoIncrement", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATE_TIME", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CHECK_TIME", property="checkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TABLE_COLLATION", property="tableCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECKSUM", property="checksum", jdbcType=JdbcType.BIGINT),
        @Result(column="CREATE_OPTIONS", property="createOptions", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_COMMENT", property="tableComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAX_INDEX_LENGTH", property="maxIndexLength", jdbcType=JdbcType.BIGINT),
        @Result(column="TEMPORARY", property="temporary", jdbcType=JdbcType.VARCHAR)
    })
    List<Tables> selectByExample(TablesExample example);

    @UpdateProvider(type=TablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tables record, @Param("example") TablesExample example);

    @UpdateProvider(type=TablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tables record, @Param("example") TablesExample example);
}