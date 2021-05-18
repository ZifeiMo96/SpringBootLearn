package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbCmpmem;
import com.example.demo.data.model.InnodbCmpmemExample;
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

public interface InnodbCmpmemMapper {
    @SelectProvider(type=InnodbCmpmemSqlProvider.class, method="countByExample")
    long countByExample(InnodbCmpmemExample example);

    @DeleteProvider(type=InnodbCmpmemSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbCmpmemExample example);

    @Insert({
        "insert into INNODB_CMPMEM (page_size, buffer_pool_instance, ",
        "pages_used, pages_free, ",
        "relocation_ops, relocation_time)",
        "values (#{pageSize,jdbcType=INTEGER}, #{bufferPoolInstance,jdbcType=INTEGER}, ",
        "#{pagesUsed,jdbcType=INTEGER}, #{pagesFree,jdbcType=INTEGER}, ",
        "#{relocationOps,jdbcType=BIGINT}, #{relocationTime,jdbcType=INTEGER})"
    })
    int insert(InnodbCmpmem record);

    @InsertProvider(type=InnodbCmpmemSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbCmpmem record);

    @SelectProvider(type=InnodbCmpmemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="buffer_pool_instance", property="bufferPoolInstance", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_used", property="pagesUsed", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_free", property="pagesFree", jdbcType=JdbcType.INTEGER),
        @Result(column="relocation_ops", property="relocationOps", jdbcType=JdbcType.BIGINT),
        @Result(column="relocation_time", property="relocationTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpmem> selectByExampleWithRowbounds(InnodbCmpmemExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbCmpmemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="page_size", property="pageSize", jdbcType=JdbcType.INTEGER),
        @Result(column="buffer_pool_instance", property="bufferPoolInstance", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_used", property="pagesUsed", jdbcType=JdbcType.INTEGER),
        @Result(column="pages_free", property="pagesFree", jdbcType=JdbcType.INTEGER),
        @Result(column="relocation_ops", property="relocationOps", jdbcType=JdbcType.BIGINT),
        @Result(column="relocation_time", property="relocationTime", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbCmpmem> selectByExample(InnodbCmpmemExample example);

    @UpdateProvider(type=InnodbCmpmemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);

    @UpdateProvider(type=InnodbCmpmemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);
}