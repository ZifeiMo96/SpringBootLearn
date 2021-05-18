package com.example.demo.data.dao;

import com.example.demo.data.model.UserUcenters;
import com.example.demo.data.model.UserUcentersExample;
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

public interface UserUcentersMapper {
    @SelectProvider(type=UserUcentersSqlProvider.class, method="countByExample")
    long countByExample(UserUcentersExample example);

    @DeleteProvider(type=UserUcentersSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserUcentersExample example);

    @Delete({
        "delete from user_ucenters",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_ucenters (id, user_id, ",
        "ucenter_id, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=INTEGER}, ",
        "#{ucenterId,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserUcenters record);

    @InsertProvider(type=UserUcentersSqlProvider.class, method="insertSelective")
    int insertSelective(UserUcenters record);

    @SelectProvider(type=UserUcentersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="ucenter_id", property="ucenterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserUcenters> selectByExampleWithRowbounds(UserUcentersExample example, RowBounds rowBounds);

    @SelectProvider(type=UserUcentersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="ucenter_id", property="ucenterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserUcenters> selectByExample(UserUcentersExample example);

    @Select({
        "select",
        "id, user_id, ucenter_id, created_at, updated_at",
        "from user_ucenters",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="ucenter_id", property="ucenterId", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserUcenters selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserUcentersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserUcenters record, @Param("example") UserUcentersExample example);

    @UpdateProvider(type=UserUcentersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserUcenters record, @Param("example") UserUcentersExample example);

    @UpdateProvider(type=UserUcentersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserUcenters record);

    @Update({
        "update user_ucenters",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "ucenter_id = #{ucenterId,jdbcType=INTEGER},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserUcenters record);
}