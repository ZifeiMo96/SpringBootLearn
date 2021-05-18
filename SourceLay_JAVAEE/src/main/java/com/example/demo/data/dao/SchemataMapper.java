package com.example.demo.data.dao;

import com.example.demo.data.model.Schemata;
import com.example.demo.data.model.SchemataExample;
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

public interface SchemataMapper {
    @SelectProvider(type=SchemataSqlProvider.class, method="countByExample")
    long countByExample(SchemataExample example);

    @DeleteProvider(type=SchemataSqlProvider.class, method="deleteByExample")
    int deleteByExample(SchemataExample example);

    @Insert({
        "insert into SCHEMATA (CATALOG_NAME, SCHEMA_NAME, ",
        "DEFAULT_CHARACTER_SET_NAME, DEFAULT_COLLATION_NAME, ",
        "SQL_PATH)",
        "values (#{catalogName,jdbcType=VARCHAR}, #{schemaName,jdbcType=VARCHAR}, ",
        "#{defaultCharacterSetName,jdbcType=VARCHAR}, #{defaultCollationName,jdbcType=VARCHAR}, ",
        "#{sqlPath,jdbcType=VARCHAR})"
    })
    int insert(Schemata record);

    @InsertProvider(type=SchemataSqlProvider.class, method="insertSelective")
    int insertSelective(Schemata record);

    @SelectProvider(type=SchemataSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CATALOG_NAME", property="catalogName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_CHARACTER_SET_NAME", property="defaultCharacterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATION_NAME", property="defaultCollationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_PATH", property="sqlPath", jdbcType=JdbcType.VARCHAR)
    })
    List<Schemata> selectByExampleWithRowbounds(SchemataExample example, RowBounds rowBounds);

    @SelectProvider(type=SchemataSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CATALOG_NAME", property="catalogName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCHEMA_NAME", property="schemaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_CHARACTER_SET_NAME", property="defaultCharacterSetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFAULT_COLLATION_NAME", property="defaultCollationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_PATH", property="sqlPath", jdbcType=JdbcType.VARCHAR)
    })
    List<Schemata> selectByExample(SchemataExample example);

    @UpdateProvider(type=SchemataSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Schemata record, @Param("example") SchemataExample example);

    @UpdateProvider(type=SchemataSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Schemata record, @Param("example") SchemataExample example);
}