package com.example.demo.data.dao;

import com.example.demo.data.model.SourcelayFileSharedorder;
import com.example.demo.data.model.SourcelayFileSharedorderExample;
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

public interface SourcelayFileSharedorderMapper {
    @SelectProvider(type=SourcelayFileSharedorderSqlProvider.class, method="countByExample")
    long countByExample(SourcelayFileSharedorderExample example);

    @DeleteProvider(type=SourcelayFileSharedorderSqlProvider.class, method="deleteByExample")
    int deleteByExample(SourcelayFileSharedorderExample example);

    @Delete({
        "delete from sourcelay_file_sharedorder",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long orderId);

    @Insert({
        "insert into sourcelay_file_sharedorder (order_id, fileshared_id, ",
        "created_at, updated_at)",
        "values (#{orderId,jdbcType=BIGINT}, #{filesharedId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(SourcelayFileSharedorder record);

    @InsertProvider(type=SourcelayFileSharedorderSqlProvider.class, method="insertSelective")
    int insertSelective(SourcelayFileSharedorder record);

    @SelectProvider(type=SourcelayFileSharedorderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="fileshared_id", property="filesharedId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileSharedorder> selectByExampleWithRowbounds(SourcelayFileSharedorderExample example, RowBounds rowBounds);

    @SelectProvider(type=SourcelayFileSharedorderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="fileshared_id", property="filesharedId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SourcelayFileSharedorder> selectByExample(SourcelayFileSharedorderExample example);

    @Select({
        "select",
        "order_id, fileshared_id, created_at, updated_at",
        "from sourcelay_file_sharedorder",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="fileshared_id", property="filesharedId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    SourcelayFileSharedorder selectByPrimaryKey(Long orderId);

    @UpdateProvider(type=SourcelayFileSharedorderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SourcelayFileSharedorder record, @Param("example") SourcelayFileSharedorderExample example);

    @UpdateProvider(type=SourcelayFileSharedorderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SourcelayFileSharedorder record, @Param("example") SourcelayFileSharedorderExample example);

    @UpdateProvider(type=SourcelayFileSharedorderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SourcelayFileSharedorder record);

    @Update({
        "update sourcelay_file_sharedorder",
        "set fileshared_id = #{filesharedId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where order_id = #{orderId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SourcelayFileSharedorder record);
}