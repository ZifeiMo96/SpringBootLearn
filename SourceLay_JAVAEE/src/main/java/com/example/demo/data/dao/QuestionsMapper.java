package com.example.demo.data.dao;

import com.example.demo.data.model.Questions;
import com.example.demo.data.model.QuestionsExample;
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

public interface QuestionsMapper {
    @SelectProvider(type=QuestionsSqlProvider.class, method="countByExample")
    long countByExample(QuestionsExample example);

    @DeleteProvider(type=QuestionsSqlProvider.class, method="deleteByExample")
    int deleteByExample(QuestionsExample example);

    @Delete({
        "delete from questions",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into questions (id, thread_id, ",
        "user_id, be_user_id, ",
        "ip, port, price, ",
        "onlooker_unit_price, onlooker_price, ",
        "onlooker_number, is_onlooker, ",
        "is_answer, is_approved, ",
        "updated_at, created_at, ",
        "expired_at, answered_at, ",
        "content)",
        "values (#{id,jdbcType=BIGINT}, #{threadId,jdbcType=BIGINT}, ",
        "#{userId,jdbcType=BIGINT}, #{beUserId,jdbcType=BIGINT}, ",
        "#{ip,jdbcType=VARCHAR}, #{port,jdbcType=INTEGER}, #{price,jdbcType=DECIMAL}, ",
        "#{onlookerUnitPrice,jdbcType=DECIMAL}, #{onlookerPrice,jdbcType=DECIMAL}, ",
        "#{onlookerNumber,jdbcType=BIGINT}, #{isOnlooker,jdbcType=TINYINT}, ",
        "#{isAnswer,jdbcType=TINYINT}, #{isApproved,jdbcType=TINYINT}, ",
        "#{updatedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{expiredAt,jdbcType=TIMESTAMP}, #{answeredAt,jdbcType=TIMESTAMP}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Questions record);

    @InsertProvider(type=QuestionsSqlProvider.class, method="insertSelective")
    int insertSelective(Questions record);

    @SelectProvider(type=QuestionsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_user_id", property="beUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_unit_price", property="onlookerUnitPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_price", property="onlookerPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_number", property="onlookerNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="is_onlooker", property="isOnlooker", jdbcType=JdbcType.TINYINT),
        @Result(column="is_answer", property="isAnswer", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answered_at", property="answeredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Questions> selectByExampleWithBLOBsWithRowbounds(QuestionsExample example, RowBounds rowBounds);

    @SelectProvider(type=QuestionsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_user_id", property="beUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_unit_price", property="onlookerUnitPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_price", property="onlookerPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_number", property="onlookerNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="is_onlooker", property="isOnlooker", jdbcType=JdbcType.TINYINT),
        @Result(column="is_answer", property="isAnswer", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answered_at", property="answeredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Questions> selectByExampleWithBLOBs(QuestionsExample example);

    @SelectProvider(type=QuestionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_user_id", property="beUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_unit_price", property="onlookerUnitPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_price", property="onlookerPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_number", property="onlookerNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="is_onlooker", property="isOnlooker", jdbcType=JdbcType.TINYINT),
        @Result(column="is_answer", property="isAnswer", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answered_at", property="answeredAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Questions> selectByExampleWithRowbounds(QuestionsExample example, RowBounds rowBounds);

    @SelectProvider(type=QuestionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_user_id", property="beUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_unit_price", property="onlookerUnitPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_price", property="onlookerPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_number", property="onlookerNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="is_onlooker", property="isOnlooker", jdbcType=JdbcType.TINYINT),
        @Result(column="is_answer", property="isAnswer", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answered_at", property="answeredAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Questions> selectByExample(QuestionsExample example);

    @Select({
        "select",
        "id, thread_id, user_id, be_user_id, ip, port, price, onlooker_unit_price, onlooker_price, ",
        "onlooker_number, is_onlooker, is_answer, is_approved, updated_at, created_at, ",
        "expired_at, answered_at, content",
        "from questions",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="be_user_id", property="beUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_unit_price", property="onlookerUnitPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_price", property="onlookerPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="onlooker_number", property="onlookerNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="is_onlooker", property="isOnlooker", jdbcType=JdbcType.TINYINT),
        @Result(column="is_answer", property="isAnswer", jdbcType=JdbcType.TINYINT),
        @Result(column="is_approved", property="isApproved", jdbcType=JdbcType.TINYINT),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answered_at", property="answeredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    Questions selectByPrimaryKey(Long id);

    @UpdateProvider(type=QuestionsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Questions record, @Param("example") QuestionsExample example);

    @UpdateProvider(type=QuestionsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Questions record, @Param("example") QuestionsExample example);

    @UpdateProvider(type=QuestionsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    @UpdateProvider(type=QuestionsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Questions record);

    @Update({
        "update questions",
        "set thread_id = #{threadId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "be_user_id = #{beUserId,jdbcType=BIGINT},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "port = #{port,jdbcType=INTEGER},",
          "price = #{price,jdbcType=DECIMAL},",
          "onlooker_unit_price = #{onlookerUnitPrice,jdbcType=DECIMAL},",
          "onlooker_price = #{onlookerPrice,jdbcType=DECIMAL},",
          "onlooker_number = #{onlookerNumber,jdbcType=BIGINT},",
          "is_onlooker = #{isOnlooker,jdbcType=TINYINT},",
          "is_answer = #{isAnswer,jdbcType=TINYINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "expired_at = #{expiredAt,jdbcType=TIMESTAMP},",
          "answered_at = #{answeredAt,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Questions record);

    @Update({
        "update questions",
        "set thread_id = #{threadId,jdbcType=BIGINT},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "be_user_id = #{beUserId,jdbcType=BIGINT},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "port = #{port,jdbcType=INTEGER},",
          "price = #{price,jdbcType=DECIMAL},",
          "onlooker_unit_price = #{onlookerUnitPrice,jdbcType=DECIMAL},",
          "onlooker_price = #{onlookerPrice,jdbcType=DECIMAL},",
          "onlooker_number = #{onlookerNumber,jdbcType=BIGINT},",
          "is_onlooker = #{isOnlooker,jdbcType=TINYINT},",
          "is_answer = #{isAnswer,jdbcType=TINYINT},",
          "is_approved = #{isApproved,jdbcType=TINYINT},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "expired_at = #{expiredAt,jdbcType=TIMESTAMP},",
          "answered_at = #{answeredAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Questions record);
}