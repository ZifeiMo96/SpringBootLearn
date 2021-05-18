package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysColumns;
import com.example.demo.data.model.InnodbSysColumnsExample;
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

public interface InnodbSysColumnsMapper {
    @SelectProvider(type=InnodbSysColumnsSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysColumnsExample example);

    @DeleteProvider(type=InnodbSysColumnsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysColumnsExample example);

    @Insert({
        "insert into INNODB_SYS_COLUMNS (TABLE_ID, NAME, ",
        "POS, MTYPE, PRTYPE, ",
        "LEN)",
        "values (#{tableId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{pos,jdbcType=BIGINT}, #{mtype,jdbcType=INTEGER}, #{prtype,jdbcType=INTEGER}, ",
        "#{len,jdbcType=INTEGER})"
    })
    int insert(InnodbSysColumns record);

    @InsertProvider(type=InnodbSysColumnsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysColumns record);

    @SelectProvider(type=InnodbSysColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.BIGINT),
        @Result(column="MTYPE", property="mtype", jdbcType=JdbcType.INTEGER),
        @Result(column="PRTYPE", property="prtype", jdbcType=JdbcType.INTEGER),
        @Result(column="LEN", property="len", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysColumns> selectByExampleWithRowbounds(InnodbSysColumnsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.BIGINT),
        @Result(column="MTYPE", property="mtype", jdbcType=JdbcType.INTEGER),
        @Result(column="PRTYPE", property="prtype", jdbcType=JdbcType.INTEGER),
        @Result(column="LEN", property="len", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysColumns> selectByExample(InnodbSysColumnsExample example);

    @UpdateProvider(type=InnodbSysColumnsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);

    @UpdateProvider(type=InnodbSysColumnsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);
}