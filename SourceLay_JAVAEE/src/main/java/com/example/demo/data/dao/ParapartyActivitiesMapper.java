package com.example.demo.data.dao;

import com.example.demo.data.model.ParapartyActivities;
import com.example.demo.data.model.ParapartyActivitiesExample;
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

public interface ParapartyActivitiesMapper {
    @SelectProvider(type=ParapartyActivitiesSqlProvider.class, method="countByExample")
    long countByExample(ParapartyActivitiesExample example);

    @DeleteProvider(type=ParapartyActivitiesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParapartyActivitiesExample example);

    @Delete({
        "delete from paraparty_activities",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into paraparty_activities (id, thread_id, ",
        "is_first, category_id, ",
        "created_at)",
        "values (#{id,jdbcType=BIGINT}, #{threadId,jdbcType=BIGINT}, ",
        "#{isFirst,jdbcType=TINYINT}, #{categoryId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(ParapartyActivities record);

    @InsertProvider(type=ParapartyActivitiesSqlProvider.class, method="insertSelective")
    int insertSelective(ParapartyActivities record);

    @SelectProvider(type=ParapartyActivitiesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ParapartyActivities> selectByExampleWithRowbounds(ParapartyActivitiesExample example, RowBounds rowBounds);

    @SelectProvider(type=ParapartyActivitiesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ParapartyActivities> selectByExample(ParapartyActivitiesExample example);

    @Select({
        "select",
        "id, thread_id, is_first, category_id, created_at",
        "from paraparty_activities",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="thread_id", property="threadId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_first", property="isFirst", jdbcType=JdbcType.TINYINT),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    ParapartyActivities selectByPrimaryKey(Long id);

    @UpdateProvider(type=ParapartyActivitiesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ParapartyActivities record, @Param("example") ParapartyActivitiesExample example);

    @UpdateProvider(type=ParapartyActivitiesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ParapartyActivities record, @Param("example") ParapartyActivitiesExample example);

    @UpdateProvider(type=ParapartyActivitiesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ParapartyActivities record);

    @Update({
        "update paraparty_activities",
        "set thread_id = #{threadId,jdbcType=BIGINT},",
          "is_first = #{isFirst,jdbcType=TINYINT},",
          "category_id = #{categoryId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ParapartyActivities record);
}