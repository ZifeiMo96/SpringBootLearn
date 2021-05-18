package com.example.demo.data.dao;

import com.example.demo.data.model.StopWords;
import com.example.demo.data.model.StopWordsExample;
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

public interface StopWordsMapper {
    @SelectProvider(type=StopWordsSqlProvider.class, method="countByExample")
    long countByExample(StopWordsExample example);

    @DeleteProvider(type=StopWordsSqlProvider.class, method="deleteByExample")
    int deleteByExample(StopWordsExample example);

    @Delete({
        "delete from stop_words",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into stop_words (id, user_id, ",
        "ugc, username, signature, ",
        "dialog, find, replacement, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{ugc,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, #{signature,jdbcType=VARCHAR}, ",
        "#{dialog,jdbcType=VARCHAR}, #{find,jdbcType=VARCHAR}, #{replacement,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(StopWords record);

    @InsertProvider(type=StopWordsSqlProvider.class, method="insertSelective")
    int insertSelective(StopWords record);

    @SelectProvider(type=StopWordsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="ugc", property="ugc", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="dialog", property="dialog", jdbcType=JdbcType.VARCHAR),
        @Result(column="find", property="find", jdbcType=JdbcType.VARCHAR),
        @Result(column="replacement", property="replacement", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<StopWords> selectByExampleWithRowbounds(StopWordsExample example, RowBounds rowBounds);

    @SelectProvider(type=StopWordsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="ugc", property="ugc", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="dialog", property="dialog", jdbcType=JdbcType.VARCHAR),
        @Result(column="find", property="find", jdbcType=JdbcType.VARCHAR),
        @Result(column="replacement", property="replacement", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<StopWords> selectByExample(StopWordsExample example);

    @Select({
        "select",
        "id, user_id, ugc, username, signature, dialog, find, replacement, created_at, ",
        "updated_at",
        "from stop_words",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="ugc", property="ugc", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="dialog", property="dialog", jdbcType=JdbcType.VARCHAR),
        @Result(column="find", property="find", jdbcType=JdbcType.VARCHAR),
        @Result(column="replacement", property="replacement", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    StopWords selectByPrimaryKey(Long id);

    @UpdateProvider(type=StopWordsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") StopWords record, @Param("example") StopWordsExample example);

    @UpdateProvider(type=StopWordsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") StopWords record, @Param("example") StopWordsExample example);

    @UpdateProvider(type=StopWordsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(StopWords record);

    @Update({
        "update stop_words",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "ugc = #{ugc,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "signature = #{signature,jdbcType=VARCHAR},",
          "dialog = #{dialog,jdbcType=VARCHAR},",
          "find = #{find,jdbcType=VARCHAR},",
          "replacement = #{replacement,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(StopWords record);
}