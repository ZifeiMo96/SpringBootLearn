package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtIndexTable;
import com.example.demo.data.model.InnodbFtIndexTableExample;
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

public interface InnodbFtIndexTableMapper {
    @SelectProvider(type=InnodbFtIndexTableSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtIndexTableExample example);

    @DeleteProvider(type=InnodbFtIndexTableSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtIndexTableExample example);

    @Insert({
        "insert into INNODB_FT_INDEX_TABLE (WORD, FIRST_DOC_ID, ",
        "LAST_DOC_ID, DOC_COUNT, ",
        "DOC_ID, POSITION)",
        "values (#{word,jdbcType=VARCHAR}, #{firstDocId,jdbcType=BIGINT}, ",
        "#{lastDocId,jdbcType=BIGINT}, #{docCount,jdbcType=BIGINT}, ",
        "#{docId,jdbcType=BIGINT}, #{position,jdbcType=BIGINT})"
    })
    int insert(InnodbFtIndexTable record);

    @InsertProvider(type=InnodbFtIndexTableSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtIndexTable record);

    @SelectProvider(type=InnodbFtIndexTableSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_DOC_ID", property="firstDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_DOC_ID", property="lastDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_COUNT", property="docCount", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtIndexTable> selectByExampleWithRowbounds(InnodbFtIndexTableExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtIndexTableSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_DOC_ID", property="firstDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_DOC_ID", property="lastDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_COUNT", property="docCount", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtIndexTable> selectByExample(InnodbFtIndexTableExample example);

    @UpdateProvider(type=InnodbFtIndexTableSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);

    @UpdateProvider(type=InnodbFtIndexTableSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);
}