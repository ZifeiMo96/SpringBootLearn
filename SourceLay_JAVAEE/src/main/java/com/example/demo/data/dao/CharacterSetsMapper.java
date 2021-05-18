package com.example.demo.data.dao;

import com.example.demo.data.model.CharacterSets;
import com.example.demo.data.model.CharacterSetsExample;
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

public interface CharacterSetsMapper {
    @SelectProvider(type=CharacterSetsSqlProvider.class, method="countByExample")
    long countByExample(CharacterSetsExample example);

    @DeleteProvider(type=CharacterSetsSqlProvider.class, method="deleteByExample")
    int deleteByExample(CharacterSetsExample example);

    @Insert({
        "insert into CHARACTER_SETS (CHARACTER_SET_NAME, DEFAULT_COLLATE_NAME, ",
        "DESCRIPTION, MAXLEN)",
        "values (#{characterSetName,jdbcType=VARCHAR}, #{defaultCollateName,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{maxlen,jdbcType=BIGINT})"
    })
    int insert(CharacterSets record);

    @InsertProvider(type=CharacterSetsSqlProvider.class, method="insertSelective")
    int insertSelective(CharacterSets record);

    @SelectProvider(type=CharacterSetsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATE_NAME", property="defaultCollateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAXLEN", property="maxlen", jdbcType=JdbcType.BIGINT)
    })
    List<CharacterSets> selectByExampleWithRowbounds(CharacterSetsExample example, RowBounds rowBounds);

    @SelectProvider(type=CharacterSetsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATE_NAME", property="defaultCollateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="MAXLEN", property="maxlen", jdbcType=JdbcType.BIGINT)
    })
    List<CharacterSets> selectByExample(CharacterSetsExample example);

    @UpdateProvider(type=CharacterSetsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CharacterSets record, @Param("example") CharacterSetsExample example);

    @UpdateProvider(type=CharacterSetsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CharacterSets record, @Param("example") CharacterSetsExample example);
}