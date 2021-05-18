package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmp;
import com.example.demo.data.model.InnodbCmpExample;
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

public interface InnodbCmpMapper {
    @SelectProvider(type=InnodbCmpSqlProvider.class, method="countByExample")
    long countByExample(InnodbCmpExample example);

    @DeleteProvider(type=InnodbCmpSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbCmpExample example);

    @Insert({
        "insert into INNODB_CMP (page_size, compress_ops, ",
        "compress_ops_ok, compress_time, ",
        "uncompress_ops, uncompress_time)",
        "values (#{pageSize,jdbcType=INTEGER}, #{compressOps,jdbcType=INTEGER}, ",
        "#{compressOpsOk,jdbcType=INTEGER}, #{compressTime,jdbcType=INTEGER}, ",
        "#{uncompressOps,jdbcType=INTEGER}, #{uncompressTime,jdbcType=INTEGER})"
    })
    int insert(InnodbCmp record);

    @InsertProvider(type=InnodbCmpSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbCmp record);

    @SelectProvider(type=InnodbCmpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmp> selectByExampleWithRowbounds(InnodbCmpExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbCmpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmp> selectByExample(InnodbCmpExample example);

    @UpdateProvider(type=InnodbCmpSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);

    @UpdateProvider(type=InnodbCmpSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbCmp record, @Param("example") InnodbCmpExample example);
}