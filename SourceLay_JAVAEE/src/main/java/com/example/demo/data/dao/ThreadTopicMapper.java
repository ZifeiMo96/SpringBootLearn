package com.example.demo.data.dao;

import com.example.demo.data.model.ThreadTopic;
import com.example.demo.data.model.ThreadTopicExample;
import com.example.demo.data.model.ThreadTopicKey;
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

public interface ThreadTopicMapper {
    @SelectProvider(type=ThreadTopicSqlProvider.class, method="countByExample")
    long countByExample(ThreadTopicExample example);

    @DeleteProvider(type=ThreadTopicSqlProvider.class, method="deleteByExample")
    int deleteByExample(ThreadTopicExample example);

    @Delete({
        "delete from thread_topic",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and topic_id = #{topicId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(ThreadTopicKey key);

    @Insert({
        "insert into thread_topic (thread_id, topic_id, ",
        "created_at)",
        "values (#{threadId,jdbcType=BIGINT}, #{topicId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(ThreadTopic record);

    @InsertProvider(type=ThreadTopicSqlProvider.class, method="insertSelective")
    int insertSelective(ThreadTopic record);

    @SelectProvider(type=ThreadTopicSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="topic_id", property="topicId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadTopic> selectByExampleWithRowbounds(ThreadTopicExample example, RowBounds rowBounds);

    @SelectProvider(type=ThreadTopicSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="topic_id", property="topicId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ThreadTopic> selectByExample(ThreadTopicExample example);

    @Select({
        "select",
        "thread_id, topic_id, created_at",
        "from thread_topic",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and topic_id = #{topicId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="topic_id", property="topicId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    ThreadTopic selectByPrimaryKey(ThreadTopicKey key);

    @UpdateProvider(type=ThreadTopicSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ThreadTopic record, @Param("example") ThreadTopicExample example);

    @UpdateProvider(type=ThreadTopicSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ThreadTopic record, @Param("example") ThreadTopicExample example);

    @UpdateProvider(type=ThreadTopicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ThreadTopic record);

    @Update({
        "update thread_topic",
        "set created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where thread_id = #{threadId,jdbcType=BIGINT}",
          "and topic_id = #{topicId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ThreadTopic record);
}