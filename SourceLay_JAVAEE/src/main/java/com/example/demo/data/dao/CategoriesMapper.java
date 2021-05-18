package com.example.demo.data.dao;

import com.example.demo.data.model.Categories;
import com.example.demo.data.model.CategoriesExample;
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

public interface CategoriesMapper {
    @SelectProvider(type=CategoriesSqlProvider.class, method="countByExample")
    long countByExample(CategoriesExample example);

    @DeleteProvider(type=CategoriesSqlProvider.class, method="deleteByExample")
    int deleteByExample(CategoriesExample example);

    @Delete({
        "delete from categories",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into categories (id, name, ",
        "icon, sort, property, ",
        "thread_count, moderators, ",
        "ip, created_at, ",
        "updated_at, description)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{icon,jdbcType=VARCHAR}, #{sort,jdbcType=SMALLINT}, #{property,jdbcType=TINYINT}, ",
        "#{threadCount,jdbcType=INTEGER}, #{moderators,jdbcType=VARCHAR}, ",
        "#{ip,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(Categories record);

    @InsertProvider(type=CategoriesSqlProvider.class, method="insertSelective")
    int insertSelective(Categories record);

    @SelectProvider(type=CategoriesSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.TINYINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="moderators", property="moderators", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Categories> selectByExampleWithBLOBsWithRowbounds(CategoriesExample example, RowBounds rowBounds);

    @SelectProvider(type=CategoriesSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.TINYINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="moderators", property="moderators", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Categories> selectByExampleWithBLOBs(CategoriesExample example);

    @SelectProvider(type=CategoriesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.TINYINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="moderators", property="moderators", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Categories> selectByExampleWithRowbounds(CategoriesExample example, RowBounds rowBounds);

    @SelectProvider(type=CategoriesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.TINYINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="moderators", property="moderators", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Categories> selectByExample(CategoriesExample example);

    @Select({
        "select",
        "id, name, icon, sort, property, thread_count, moderators, ip, created_at, updated_at, ",
        "description",
        "from categories",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="property", property="property", jdbcType=JdbcType.TINYINT),
        @Result(column="thread_count", property="threadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="moderators", property="moderators", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    Categories selectByPrimaryKey(Long id);

    @UpdateProvider(type=CategoriesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    @UpdateProvider(type=CategoriesSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Categories record, @Param("example") CategoriesExample example);

    @UpdateProvider(type=CategoriesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);

    @UpdateProvider(type=CategoriesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Categories record);

    @Update({
        "update categories",
        "set name = #{name,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=SMALLINT},",
          "property = #{property,jdbcType=TINYINT},",
          "thread_count = #{threadCount,jdbcType=INTEGER},",
          "moderators = #{moderators,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Categories record);

    @Update({
        "update categories",
        "set name = #{name,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=SMALLINT},",
          "property = #{property,jdbcType=TINYINT},",
          "thread_count = #{threadCount,jdbcType=INTEGER},",
          "moderators = #{moderators,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Categories record);
}