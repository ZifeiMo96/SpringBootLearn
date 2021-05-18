package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysIndexes;
import com.example.demo.data.model.InnodbSysIndexesExample;
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

public interface InnodbSysIndexesMapper {
    @SelectProvider(type=InnodbSysIndexesSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysIndexesExample example);

    @DeleteProvider(type=InnodbSysIndexesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysIndexesExample example);

    @Insert({
        "insert into INNODB_SYS_INDEXES (INDEX_ID, NAME, ",
        "TABLE_ID, TYPE, N_FIELDS, ",
        "PAGE_NO, SPACE, MERGE_THRESHOLD)",
        "values (#{indexId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{tableId,jdbcType=BIGINT}, #{type,jdbcType=INTEGER}, #{nFields,jdbcType=INTEGER}, ",
        "#{pageNo,jdbcType=INTEGER}, #{space,jdbcType=INTEGER}, #{mergeThreshold,jdbcType=INTEGER})"
    })
    int insert(InnodbSysIndexes record);

    @InsertProvider(type=InnodbSysIndexesSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysIndexes record);

    @SelectProvider(type=InnodbSysIndexesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="N_FIELDS", property="nFields", jdbcType=JdbcType.INTEGER),
        @Result(column="PAGE_NO", property="pageNo", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="MERGE_THRESHOLD", property="mergeThreshold", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysIndexes> selectByExampleWithRowbounds(InnodbSysIndexesExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysIndexesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="N_FIELDS", property="nFields", jdbcType=JdbcType.INTEGER),
        @Result(column="PAGE_NO", property="pageNo", jdbcType=JdbcType.INTEGER),
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="MERGE_THRESHOLD", property="mergeThreshold", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysIndexes> selectByExample(InnodbSysIndexesExample example);

    @UpdateProvider(type=InnodbSysIndexesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysIndexes record, @Param("example") InnodbSysIndexesExample example);

    @UpdateProvider(type=InnodbSysIndexesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysIndexes record, @Param("example") InnodbSysIndexesExample example);
}