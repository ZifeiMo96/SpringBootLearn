package com.example.demo.data.dao;

import com.example.demo.data.model.CollationCharacterSetApplicability;
import com.example.demo.data.model.CollationCharacterSetApplicabilityExample;
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

public interface CollationCharacterSetApplicabilityMapper {
    @SelectProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="countByExample")
    long countByExample(CollationCharacterSetApplicabilityExample example);

    @DeleteProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="deleteByExample")
    int deleteByExample(CollationCharacterSetApplicabilityExample example);

    @Insert({
        "insert into COLLATION_CHARACTER_SET_APPLICABILITY (COLLATION_NAME, CHARACTER_SET_NAME)",
        "values (#{collationName,jdbcType=VARCHAR}, #{characterSetName,jdbcType=VARCHAR})"
    })
    int insert(CollationCharacterSetApplicability record);

    @InsertProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="insertSelective")
    int insertSelective(CollationCharacterSetApplicability record);

    @SelectProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR)
    })
    List<CollationCharacterSetApplicability> selectByExampleWithRowbounds(CollationCharacterSetApplicabilityExample example, RowBounds rowBounds);

    @SelectProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="COLLATION_NAME", property="collationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_NAME", property="characterSetName", jdbcType=JdbcType.VARCHAR)
    })
    List<CollationCharacterSetApplicability> selectByExample(CollationCharacterSetApplicabilityExample example);

    @UpdateProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);

    @UpdateProvider(type=CollationCharacterSetApplicabilitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CollationCharacterSetApplicability record, @Param("example") CollationCharacterSetApplicabilityExample example);
}