package com.example.demo.data.dao;

import com.example.demo.data.model.Migrations;
import com.example.demo.data.model.MigrationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface MigrationsMapper {
    @SelectProvider(type=MigrationsSqlProvider.class, method="countByExample")
    long countByExample(MigrationsExample example);

    @DeleteProvider(type=MigrationsSqlProvider.class, method="deleteByExample")
    int deleteByExample(MigrationsExample example);

    @Delete({
        "delete from migrations",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into migrations (id, migration, ",
        "batch)",
        "values (#{id,jdbcType=INTEGER}, #{migration,jdbcType=VARCHAR}, ",
        "#{batch,jdbcType=INTEGER})"
    })
    int insert(Migrations record);

    @InsertProvider(type=MigrationsSqlProvider.class, method="insertSelective")
    int insertSelective(Migrations record);

    @SelectProvider(type=MigrationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="migration", property="migration", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch", property="batch", jdbcType=JdbcType.INTEGER)
    })
    List<Migrations> selectByExampleWithRowbounds(MigrationsExample example, RowBounds rowBounds);

    @SelectProvider(type=MigrationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="migration", property="migration", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch", property="batch", jdbcType=JdbcType.INTEGER)
    })
    List<Migrations> selectByExample(MigrationsExample example);

    @Select({
        "select",
        "id, migration, batch",
        "from migrations",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="migration", property="migration", jdbcType=JdbcType.VARCHAR),
        @Result(column="batch", property="batch", jdbcType=JdbcType.INTEGER)
    })
    Migrations selectByPrimaryKey(Integer id);

    @UpdateProvider(type=MigrationsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Migrations record, @Param("example") MigrationsExample example);

    @UpdateProvider(type=MigrationsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Migrations record, @Param("example") MigrationsExample example);

    @UpdateProvider(type=MigrationsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Migrations record);

    @Update({
        "update migrations",
        "set migration = #{migration,jdbcType=VARCHAR},",
          "batch = #{batch,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Migrations record);
}