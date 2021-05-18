package com.example.demo.data.dao;

import com.example.demo.data.model.TableConstraints;
import com.example.demo.data.model.TableConstraintsExample;
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

public interface TableConstraintsMapper {
    @SelectProvider(type=TableConstraintsSqlProvider.class, method="countByExample")
    long countByExample(TableConstraintsExample example);

    @DeleteProvider(type=TableConstraintsSqlProvider.class, method="deleteByExample")
    int deleteByExample(TableConstraintsExample example);

    @Insert({
        "insert into TABLE_CONSTRAINTS (CONSTRAINT_CATALOG, CONSTRAINT_SCHEMA, ",
        "CONSTRAINT_NAME, TABLE_SCHEMA, ",
        "TABLE_NAME, CONSTRAINT_TYPE)",
        "values (#{constraintCatalog,jdbcType=VARCHAR}, #{constraintSchema,jdbcType=VARCHAR}, ",
        "#{constraintName,jdbcType=VARCHAR}, #{tableSchema,jdbcType=VARCHAR}, ",
        "#{tableName,jdbcType=VARCHAR}, #{constraintType,jdbcType=VARCHAR})"
    })
    int insert(TableConstraints record);

    @InsertProvider(type=TableConstraintsSqlProvider.class, method="insertSelective")
    int insertSelective(TableConstraints record);

    @SelectProvider(type=TableConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_TYPE", property="constraintType", jdbcType=JdbcType.VARCHAR)
    })
    List<TableConstraints> selectByExampleWithRowbounds(TableConstraintsExample example, RowBounds rowBounds);

    @SelectProvider(type=TableConstraintsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CONSTRAINT_CATALOG", property="constraintCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_SCHEMA", property="constraintSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_NAME", property="constraintName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_SCHEMA", property="tableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TABLE_NAME", property="tableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CONSTRAINT_TYPE", property="constraintType", jdbcType=JdbcType.VARCHAR)
    })
    List<TableConstraints> selectByExample(TableConstraintsExample example);

    @UpdateProvider(type=TableConstraintsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);

    @UpdateProvider(type=TableConstraintsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TableConstraints record, @Param("example") TableConstraintsExample example);
}