package com.example.demo.data.dao;

import com.example.demo.data.model.GeometryColumns;
import com.example.demo.data.model.GeometryColumnsExample;
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

public interface GeometryColumnsMapper {
    @SelectProvider(type=GeometryColumnsSqlProvider.class, method="countByExample")
    long countByExample(GeometryColumnsExample example);

    @DeleteProvider(type=GeometryColumnsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GeometryColumnsExample example);

    @Insert({
        "insert into GEOMETRY_COLUMNS (F_TABLE_CATALOG, F_TABLE_SCHEMA, ",
        "F_TABLE_NAME, F_GEOMETRY_COLUMN, ",
        "G_TABLE_CATALOG, G_TABLE_SCHEMA, ",
        "G_TABLE_NAME, G_GEOMETRY_COLUMN, ",
        "STORAGE_TYPE, GEOMETRY_TYPE, ",
        "COORD_DIMENSION, MAX_PPR, ",
        "SRID)",
        "values (#{fTableCatalog,jdbcType=VARCHAR}, #{fTableSchema,jdbcType=VARCHAR}, ",
        "#{fTableName,jdbcType=VARCHAR}, #{fGeometryColumn,jdbcType=VARCHAR}, ",
        "#{gTableCatalog,jdbcType=VARCHAR}, #{gTableSchema,jdbcType=VARCHAR}, ",
        "#{gTableName,jdbcType=VARCHAR}, #{gGeometryColumn,jdbcType=VARCHAR}, ",
        "#{storageType,jdbcType=TINYINT}, #{geometryType,jdbcType=INTEGER}, ",
        "#{coordDimension,jdbcType=TINYINT}, #{maxPpr,jdbcType=TINYINT}, ",
        "#{srid,jdbcType=SMALLINT})"
    })
    int insert(GeometryColumns record);

    @InsertProvider(type=GeometryColumnsSqlProvider.class, method="insertSelective")
    int insertSelective(GeometryColumns record);

    @SelectProvider(type=GeometryColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="F_TABLE_CATALOG", property="fTableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_TABLE_SCHEMA", property="fTableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_TABLE_NAME", property="fTableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GEOMETRY_COLUMN", property="fGeometryColumn", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_CATALOG", property="gTableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_SCHEMA", property="gTableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_NAME", property="gTableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_GEOMETRY_COLUMN", property="gGeometryColumn", jdbcType=JdbcType.VARCHAR),
        @Result(column="STORAGE_TYPE", property="storageType", jdbcType=JdbcType.TINYINT),
        @Result(column="GEOMETRY_TYPE", property="geometryType", jdbcType=JdbcType.INTEGER),
        @Result(column="COORD_DIMENSION", property="coordDimension", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_PPR", property="maxPpr", jdbcType=JdbcType.TINYINT),
        @Result(column="SRID", property="srid", jdbcType=JdbcType.SMALLINT)
    })
    List<GeometryColumns> selectByExampleWithRowbounds(GeometryColumnsExample example, RowBounds rowBounds);

    @SelectProvider(type=GeometryColumnsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="F_TABLE_CATALOG", property="fTableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_TABLE_SCHEMA", property="fTableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_TABLE_NAME", property="fTableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="F_GEOMETRY_COLUMN", property="fGeometryColumn", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_CATALOG", property="gTableCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_SCHEMA", property="gTableSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_TABLE_NAME", property="gTableName", jdbcType=JdbcType.VARCHAR),
        @Result(column="G_GEOMETRY_COLUMN", property="gGeometryColumn", jdbcType=JdbcType.VARCHAR),
        @Result(column="STORAGE_TYPE", property="storageType", jdbcType=JdbcType.TINYINT),
        @Result(column="GEOMETRY_TYPE", property="geometryType", jdbcType=JdbcType.INTEGER),
        @Result(column="COORD_DIMENSION", property="coordDimension", jdbcType=JdbcType.TINYINT),
        @Result(column="MAX_PPR", property="maxPpr", jdbcType=JdbcType.TINYINT),
        @Result(column="SRID", property="srid", jdbcType=JdbcType.SMALLINT)
    })
    List<GeometryColumns> selectByExample(GeometryColumnsExample example);

    @UpdateProvider(type=GeometryColumnsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GeometryColumns record, @Param("example") GeometryColumnsExample example);

    @UpdateProvider(type=GeometryColumnsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GeometryColumns record, @Param("example") GeometryColumnsExample example);
}