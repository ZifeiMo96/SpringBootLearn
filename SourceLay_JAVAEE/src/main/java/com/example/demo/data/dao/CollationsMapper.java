package com.example.demo.data.dao;

import com.example.demo.data.model.Collations;
import com.example.demo.data.model.CollationsExample;
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

public interface CollationsMapper {
    @SelectProvider(type=CollationsSqlProvider.class, method="countByExample")
    long countByExample(CollationsExample example);

    @DeleteProvider(type=CollationsSqlProvider.class, method="deleteByExample")
    int deleteByExample(CollationsExample example);

    @Insert({
        "insert into COLLATIONS (COLLATION_NAME, CHARACTER_SET_NAME, ",
        "ID, IS_DEFAULT, IS_COMPILED, ",
        "SORTLEN)",
        "values (#{collationName,jdbcType=VARCHAR}, #{characterSetName,jdbcType=VARCHAR}, ",
        "#{id,jdbcType=BIGINT}, #{isDefault,jdbcType=VARCHAR}, #{isCompiled,jdbcType=VARCHAR}, ",
        "#{sortlen,jdbcType=BIGINT})"
    })
    int insert(Collations record);

    @InsertProvider(type=CollationsSqlProvider.class, method="insertSelective")
    int insertSelective(Collations record);

    @SelectProvider(type=CollationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_COMPILED", property="isCompiled", jdbcType=JdbcType.VARCHAR),
        @Result(column="SORTLEN", property="sortlen", jdbcType=JdbcType.BIGINT)
    })
    List<Collations> selectByExampleWithRowbounds(CollationsExample example, RowBounds rowBounds);

    @SelectProvider(type=CollationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="IS_DEFAULT", property="isDefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="IS_COMPILED", property="isCompiled", jdbcType=JdbcType.VARCHAR),
        @Result(column="SORTLEN", property="sortlen", jdbcType=JdbcType.BIGINT)
    })
    List<Collations> selectByExample(CollationsExample example);

    @UpdateProvider(type=CollationsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Collations record, @Param("example") CollationsExample example);

    @UpdateProvider(type=CollationsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Collations record, @Param("example") CollationsExample example);
}