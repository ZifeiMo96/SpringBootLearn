package com.example.demo.data.dao;

import com.example.demo.data.model.MobileCodes;
import com.example.demo.data.model.MobileCodesExample;
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

public interface MobileCodesMapper {
    @SelectProvider(type=MobileCodesSqlProvider.class, method="countByExample")
    long countByExample(MobileCodesExample example);

    @DeleteProvider(type=MobileCodesSqlProvider.class, method="deleteByExample")
    int deleteByExample(MobileCodesExample example);

    @Delete({
        "delete from mobile_codes",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into mobile_codes (id, mobile, ",
        "code, type, state, ",
        "ip, expired_at, ",
        "created_at, updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{mobile,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{state,jdbcType=TINYINT}, ",
        "#{ip,jdbcType=VARCHAR}, #{expiredAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(MobileCodes record);

    @InsertProvider(type=MobileCodesSqlProvider.class, method="insertSelective")
    int insertSelective(MobileCodes record);

    @SelectProvider(type=MobileCodesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.TINYINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MobileCodes> selectByExampleWithRowbounds(MobileCodesExample example, RowBounds rowBounds);

    @SelectProvider(type=MobileCodesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.TINYINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<MobileCodes> selectByExample(MobileCodesExample example);

    @Select({
        "select",
        "id, mobile, code, type, state, ip, expired_at, created_at, updated_at",
        "from mobile_codes",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.TINYINT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="expired_at", property="expiredAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    MobileCodes selectByPrimaryKey(Long id);

    @UpdateProvider(type=MobileCodesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MobileCodes record, @Param("example") MobileCodesExample example);

    @UpdateProvider(type=MobileCodesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MobileCodes record, @Param("example") MobileCodesExample example);

    @UpdateProvider(type=MobileCodesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MobileCodes record);

    @Update({
        "update mobile_codes",
        "set mobile = #{mobile,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "state = #{state,jdbcType=TINYINT},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "expired_at = #{expiredAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MobileCodes record);
}