package com.example.demo.data.dao;

import com.example.demo.data.model.UserFollow;
import com.example.demo.data.model.UserFollowExample;
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

public interface UserFollowMapper {
    @SelectProvider(type=UserFollowSqlProvider.class, method="countByExample")
    long countByExample(UserFollowExample example);

    @DeleteProvider(type=UserFollowSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserFollowExample example);

    @Delete({
        "delete from user_follow",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_follow (id, from_user_id, ",
        "to_user_id, is_mutual, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{fromUserId,jdbcType=BIGINT}, ",
        "#{toUserId,jdbcType=BIGINT}, #{isMutual,jdbcType=TINYINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserFollow record);

    @InsertProvider(type=UserFollowSqlProvider.class, method="insertSelective")
    int insertSelective(UserFollow record);

    @SelectProvider(type=UserFollowSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="from_user_id", property="fromUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_mutual", property="isMutual", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserFollow> selectByExampleWithRowbounds(UserFollowExample example, RowBounds rowBounds);

    @SelectProvider(type=UserFollowSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="from_user_id", property="fromUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_mutual", property="isMutual", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserFollow> selectByExample(UserFollowExample example);

    @Select({
        "select",
        "id, from_user_id, to_user_id, is_mutual, created_at, updated_at",
        "from user_follow",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="from_user_id", property="fromUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="to_user_id", property="toUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="is_mutual", property="isMutual", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserFollow selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserFollowSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

    @UpdateProvider(type=UserFollowSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserFollow record, @Param("example") UserFollowExample example);

    @UpdateProvider(type=UserFollowSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserFollow record);

    @Update({
        "update user_follow",
        "set from_user_id = #{fromUserId,jdbcType=BIGINT},",
          "to_user_id = #{toUserId,jdbcType=BIGINT},",
          "is_mutual = #{isMutual,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserFollow record);
}