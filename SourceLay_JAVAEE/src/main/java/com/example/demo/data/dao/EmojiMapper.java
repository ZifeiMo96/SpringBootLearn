package com.example.demo.data.dao;

import com.example.demo.data.model.Emoji;
import com.example.demo.data.model.EmojiExample;
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

public interface EmojiMapper {
    @SelectProvider(type=EmojiSqlProvider.class, method="countByExample")
    long countByExample(EmojiExample example);

    @DeleteProvider(type=EmojiSqlProvider.class, method="deleteByExample")
    int deleteByExample(EmojiExample example);

    @Delete({
        "delete from emoji",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into emoji (id, category, ",
        "url, code, order, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{category,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, #{order,jdbcType=SMALLINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Emoji record);

    @InsertProvider(type=EmojiSqlProvider.class, method="insertSelective")
    int insertSelective(Emoji record);

    @SelectProvider(type=EmojiSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order", property="order", jdbcType=JdbcType.SMALLINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Emoji> selectByExampleWithRowbounds(EmojiExample example, RowBounds rowBounds);

    @SelectProvider(type=EmojiSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order", property="order", jdbcType=JdbcType.SMALLINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Emoji> selectByExample(EmojiExample example);

    @Select({
        "select",
        "id, category, url, code, order, created_at, updated_at",
        "from emoji",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="order", property="order", jdbcType=JdbcType.SMALLINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Emoji selectByPrimaryKey(Long id);

    @UpdateProvider(type=EmojiSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Emoji record, @Param("example") EmojiExample example);

    @UpdateProvider(type=EmojiSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Emoji record, @Param("example") EmojiExample example);

    @UpdateProvider(type=EmojiSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Emoji record);

    @Update({
        "update emoji",
        "set category = #{category,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "order = #{order,jdbcType=SMALLINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Emoji record);
}