package com.example.demo.data.dao;

import com.example.demo.data.model.ReferentialConstraints;
import com.example.demo.data.model.ReferentialConstraintsExample;
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

public interface ReferentialConstraintsMapper {
    @SelectProvider(type=ReferentialConstraintsSqlProvider.class, method="countByExample")
    long countByExample(ReferentialConstraintsExample example);

    @DeleteProvider(type=ReferentialConstraintsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ReferentialConstraintsExample example);

    @Insert({
        "insert into REFERENTIAL_CONSTRAINTS (CONSTRAINT_CATALOG, CONSTRAINT_SCHEMA, ",
        "CONSTRAINT_NAME, UNIQUE_CONSTRAINT_CATALOG, ",
        "UNIQUE_CONSTRAINT_SCHEMA, UNIQUE_CONSTRAINT_NAME, ",
        "MATCH_OPTION, UPDATE_RULE, ",
        "DELETE_RULE, TABLE_NAME, ",
        "REFERENCED_TABLE_NAME)",
        "values (#{constraintCatalog,jdbcType=VARCHAR}, #{constraintSchema,jdbcType=VARCHAR}, ",
        "#{constraintName,jdbcType=VARCHAR}, #{uniqueConstraintCatalog,jdbcType=VARCHAR}, ",
        "#{uniqueConstraintSchema,jdbcType=VARCHAR}, #{uniqueConstraintName,jdbcType=VARCHAR}, ",
        "#{matchOption,jdbcType=VARCHAR}, #{updateRule,jdbcType=VARCHAR}, ",
        "#{deleteRule,jdbcType=VARCHAR}, #{tableName,jdbcType=VARCHAR}, ",
        "#{referencedTableName,jdbcType=VARCHAR})"
    })
    int insert(ReferentialConstraints record);

    @InsertProvider(type=ReferentialConstraintsSqlProvider.class, method="insertSelective")
    int insertSelective(ReferentialConstraints record);

    @SelectProvider(type=ReferentialConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_CATALOG", property="uniqueConstraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_SCHEMA", property="uniqueConstraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_NAME", property="uniqueConstraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MATCH_OPTION", property="matchOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_RULE", property="updateRule", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_RULE", property="deleteRule", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REFERENCED_TABLE_NAME", property="referencedTableName", jdbcType=JdbcType.VARCHAR)
    })
    List<ReferentialConstraints> selectByExampleWithRowbounds(ReferentialConstraintsExample example, RowBounds rowBounds);

    @SelectProvider(type=ReferentialConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_CATALOG", property="uniqueConstraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_SCHEMA", property="uniqueConstraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNIQUE_CONSTRAINT_NAME", property="uniqueConstraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="MATCH_OPTION", property="matchOption", jdbcType=JdbcType.VARCHAR),
        @Result(column="UPDATE_RULE", property="updateRule", jdbcType=JdbcType.VARCHAR),
        @Result(column="DELETE_RULE", property="deleteRule", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REFERENCED_TABLE_NAME", property="referencedTableName", jdbcType=JdbcType.VARCHAR)
    })
    List<ReferentialConstraints> selectByExample(ReferentialConstraintsExample example);

    @UpdateProvider(type=ReferentialConstraintsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);

    @UpdateProvider(type=ReferentialConstraintsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ReferentialConstraints record, @Param("example") ReferentialConstraintsExample example);
}