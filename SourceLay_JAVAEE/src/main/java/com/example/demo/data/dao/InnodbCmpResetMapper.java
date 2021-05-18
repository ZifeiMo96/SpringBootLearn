package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmpReset;
import com.example.demo.data.model.InnodbCmpResetExample;
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

public interface InnodbCmpResetMapper {
    @SelectProvider(type=InnodbCmpResetSqlProvider.class, method="countByExample")
    long countByExample(InnodbCmpResetExample example);

    @DeleteProvider(type=InnodbCmpResetSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbCmpResetExample example);

    @Insert({
        "insert into INNODB_CMP_RESET (page_size, compress_ops, ",
        "compress_ops_ok, compress_time, ",
        "uncompress_ops, uncompress_time)",
        "values (#{pageSize,jdbcType=INTEGER}, #{compressOps,jdbcType=INTEGER}, ",
        "#{compressOpsOk,jdbcType=INTEGER}, #{compressTime,jdbcType=INTEGER}, ",
        "#{uncompressOps,jdbcType=INTEGER}, #{uncompressTime,jdbcType=INTEGER})"
    })
    int insert(InnodbCmpReset record);

    @InsertProvider(type=InnodbCmpResetSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbCmpReset record);

    @SelectProvider(type=InnodbCmpResetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpReset> selectByExampleWithRowbounds(InnodbCmpResetExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbCmpResetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops", property="compressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_ops_ok", property="compressOpsOk", jdbcType=JdbcType.INTEGER),
        @Result(column="compress_time", property="compressTime", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_ops", property="uncompressOps", jdbcType=JdbcType.INTEGER),
        @Result(column="uncompress_time", property="uncompressTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpReset> selectByExample(InnodbCmpResetExample example);

    @UpdateProvider(type=InnodbCmpResetSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);

    @UpdateProvider(type=InnodbCmpResetSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbCmpReset record, @Param("example") InnodbCmpResetExample example);
}