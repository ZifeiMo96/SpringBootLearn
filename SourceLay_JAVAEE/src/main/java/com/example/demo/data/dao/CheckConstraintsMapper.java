package com.example.demo.data.dao;

import com.example.demo.data.model.CheckConstraints;
import com.example.demo.data.model.CheckConstraintsExample;
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

public interface CheckConstraintsMapper {
    @SelectProvider(type=CheckConstraintsSqlProvider.class, method="countByExample")
    long countByExample(CheckConstraintsExample example);

    @DeleteProvider(type=CheckConstraintsSqlProvider.class, method="deleteByExample")
    int deleteByExample(CheckConstraintsExample example);

    @Insert({
        "insert into CHECK_CONSTRAINTS (CONSTRAINT_CATALOG, CONSTRAINT_SCHEMA, ",
        "TABLE_NAME, CONSTRAINT_NAME, ",
        "CHECK_CLAUSE)",
        "values (#{constraintCatalog,jdbcType=VARCHAR}, #{constraintSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{constraintName,jdbcType=VARCHAR}, ",
        "#{checkClause,jdbcType=VARCHAR})"
    })
    int insert(CheckConstraints record);

    @InsertProvider(type=CheckConstraintsSqlProvider.class, method="insertSelective")
    int insertSelective(CheckConstraints record);

    @SelectProvider(type=CheckConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_CLAUSE", property="checkClause", jdbcType=JdbcType.VARCHAR)
    })
    List<CheckConstraints> selectByExampleWithRowbounds(CheckConstraintsExample example, RowBounds rowBounds);

    @SelectProvider(type=CheckConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_CLAUSE", property="checkClause", jdbcType=JdbcType.VARCHAR)
    })
    List<CheckConstraints> selectByExample(CheckConstraintsExample example);

    @UpdateProvider(type=CheckConstraintsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CheckConstraints record, @Param("example") CheckConstraintsExample example);

    @UpdateProvider(type=CheckConstraintsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CheckConstraints record, @Param("example") CheckConstraintsExample example);
}