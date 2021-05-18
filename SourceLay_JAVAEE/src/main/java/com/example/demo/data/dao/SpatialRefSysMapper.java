package com.example.demo.data.dao;

import com.example.demo.data.model.SpatialRefSys;
import com.example.demo.data.model.SpatialRefSysExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface SpatialRefSysMapper {
    @SelectProvider(type=SpatialRefSysSqlProvider.class, method="countByExample")
    long countByExample(SpatialRefSysExample example);

    @DeleteProvider(type=SpatialRefSysSqlProvider.class, method="deleteByExample")
    int deleteByExample(SpatialRefSysExample example);

    @Insert({
        "insert into SPATIAL_REF_SYS (SRID, AUTH_NAME, ",
        "AUTH_SRID, SRTEXT)",
        "values (#{srid,jdbcType=SMALLINT}, #{authName,jdbcType=VARCHAR}, ",
        "#{authSrid,jdbcType=INTEGER}, #{srtext,jdbcType=VARCHAR})"
    })
    int insert(SpatialRefSys record);

    @InsertProvider(type=SpatialRefSysSqlProvider.class, method="insertSelective")
    int insertSelective(SpatialRefSys record);

    @SelectProvider(type=SpatialRefSysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SRID", property="srid", jdbcType=JdbcType.SMALLINT),
        @Result(column="AUTH_NAME", property="authName", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTH_SRID", property="authSrid", jdbcType=JdbcType.INTEGER),
        @Result(column="SRTEXT", property="srtext", jdbcType=JdbcType.VARCHAR)
    })
    List<SpatialRefSys> selectByExampleWithRowbounds(SpatialRefSysExample example, RowBounds rowBounds);

    @SelectProvider(type=SpatialRefSysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SRID", property="srid", jdbcType=JdbcType.SMALLINT),
        @Result(column="AUTH_NAME", property="authName", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTH_SRID", property="authSrid", jdbcType=JdbcType.INTEGER),
        @Result(column="SRTEXT", property="srtext", jdbcType=JdbcType.VARCHAR)
    })
    List<SpatialRefSys> selectByExample(SpatialRefSysExample example);

    @UpdateProvider(type=SpatialRefSysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SpatialRefSys record, @Param("example") SpatialRefSysExample example);

    @UpdateProvider(type=SpatialRefSysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SpatialRefSys record, @Param("example") SpatialRefSysExample example);
}