package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysTables;
import com.example.demo.data.model.InnodbSysTablesExample;
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

public interface InnodbSysTablesMapper {
    @SelectProvider(type=InnodbSysTablesSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysTablesExample example);

    @DeleteProvider(type=InnodbSysTablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysTablesExample example);

    @Insert({
        "insert into INNODB_SYS_TABLES (TABLE_ID, NAME, ",
        "FLAG, N_COLS, SPACE, ",
        "ROW_FORMAT, ZIP_PAGE_SIZE, ",
        "SPACE_TYPE)",
        "values (#{tableId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=INTEGER}, #{nCols,jdbcType=INTEGER}, #{space,jdbcType=INTEGER}, ",
        "#{rowFormat,jdbcType=VARCHAR}, #{zipPageSize,jdbcType=INTEGER}, ",
        "#{spaceType,jdbcType=VARCHAR})"
    })
    int insert(InnodbSysTables record);

    @InsertProvider(type=InnodbSysTablesSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysTables record);

    @SelectProvider(type=InnodbSysTablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbSysTables> selectByExampleWithRowbounds(InnodbSysTablesExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysTablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="ROW_FORMAT", property="rowFormat", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZIP_PAGE_SIZE", property="zipPageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE_TYPE", property="spaceType", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbSysTables> selectByExample(InnodbSysTablesExample example);

    @UpdateProvider(type=InnodbSysTablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysTables record, @Param("example") InnodbSysTablesExample example);

    @UpdateProvider(type=InnodbSysTablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysTables record, @Param("example") InnodbSysTablesExample example);
}