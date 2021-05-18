package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmpmemReset;
import com.example.demo.data.model.InnodbCmpmemResetExample;
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

public interface InnodbCmpmemResetMapper {
    @SelectProvider(type=InnodbCmpmemResetSqlProvider.class, method="countByExample")
    long countByExample(InnodbCmpmemResetExample example);

    @DeleteProvider(type=InnodbCmpmemResetSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbCmpmemResetExample example);

    @Insert({
        "insert into INNODB_CMPMEM_RESET (page_size, buffer_pool_instance, ",
        "pages_used, pages_free, ",
        "relocation_ops, relocation_time)",
        "values (#{pageSize,jdbcType=INTEGER}, #{bufferPoolInstance,jdbcType=INTEGER}, ",
        "#{pagesUsed,jdbcType=INTEGER}, #{pagesFree,jdbcType=INTEGER}, ",
        "#{relocationOps,jdbcType=BIGINT}, #{relocationTime,jdbcType=INTEGER})"
    })
    int insert(InnodbCmpmemReset record);

    @InsertProvider(type=InnodbCmpmemResetSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbCmpmemReset record);

    @SelectProvider(type=InnodbCmpmemResetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="buffer_pool_instance", property="bufferPoolInstance", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_used", property="pagesUsed", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_free", property="pagesFree", jdbcType=JdbcType.INTEGER),
        @Result(column="relocation_ops", property="relocationOps", jdbcType=JdbcType.BIGINT),
        @Result(column="relocation_time", property="relocationTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpmemReset> selectByExampleWithRowbounds(InnodbCmpmemResetExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbCmpmemResetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="buffer_pool_instance", property="bufferPoolInstance", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_used", property="pagesUsed", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_free", property="pagesFree", jdbcType=JdbcType.INTEGER),
        @Result(column="relocation_ops", property="relocationOps", jdbcType=JdbcType.BIGINT),
        @Result(column="relocation_time", property="relocationTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpmemReset> selectByExample(InnodbCmpmemResetExample example);

    @UpdateProvider(type=InnodbCmpmemResetSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);

    @UpdateProvider(type=InnodbCmpmemResetSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbCmpmemReset record, @Param("example") InnodbCmpmemResetExample example);
}