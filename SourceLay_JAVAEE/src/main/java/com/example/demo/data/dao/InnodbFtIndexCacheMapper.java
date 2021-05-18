package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtIndexCache;
import com.example.demo.data.model.InnodbFtIndexCacheExample;
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

public interface InnodbFtIndexCacheMapper {
    @SelectProvider(type=InnodbFtIndexCacheSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtIndexCacheExample example);

    @DeleteProvider(type=InnodbFtIndexCacheSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtIndexCacheExample example);

    @Insert({
        "insert into INNODB_FT_INDEX_CACHE (WORD, FIRST_DOC_ID, ",
        "LAST_DOC_ID, DOC_COUNT, ",
        "DOC_ID, POSITION)",
        "values (#{word,jdbcType=VARCHAR}, #{firstDocId,jdbcType=BIGINT}, ",
        "#{lastDocId,jdbcType=BIGINT}, #{docCount,jdbcType=BIGINT}, ",
        "#{docId,jdbcType=BIGINT}, #{position,jdbcType=BIGINT})"
    })
    int insert(InnodbFtIndexCache record);

    @InsertProvider(type=InnodbFtIndexCacheSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtIndexCache record);

    @SelectProvider(type=InnodbFtIndexCacheSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_DOC_ID", property="firstDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_DOC_ID", property="lastDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_COUNT", property="docCount", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtIndexCache> selectByExampleWithRowbounds(InnodbFtIndexCacheExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtIndexCacheSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WORD", property="word", jdbcType=JdbcType.VARCHAR),
        @Result(column="FIRST_DOC_ID", property="firstDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="LAST_DOC_ID", property="lastDocId", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_COUNT", property="docCount", jdbcType=JdbcType.BIGINT),
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT),
        @Result(column="POSITION", property="position", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtIndexCache> selectByExample(InnodbFtIndexCacheExample example);

    @UpdateProvider(type=InnodbFtIndexCacheSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);

    @UpdateProvider(type=InnodbFtIndexCacheSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);
}