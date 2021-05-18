package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysVirtual;
import com.example.demo.data.model.InnodbSysVirtualExample;
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

public interface InnodbSysVirtualMapper {
    @SelectProvider(type=InnodbSysVirtualSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysVirtualExample example);

    @DeleteProvider(type=InnodbSysVirtualSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysVirtualExample example);

    @Insert({
        "insert into INNODB_SYS_VIRTUAL (TABLE_ID, POS, ",
        "BASE_POS)",
        "values (#{tableId,jdbcType=BIGINT}, #{pos,jdbcType=INTEGER}, ",
        "#{basePos,jdbcType=INTEGER})"
    })
    int insert(InnodbSysVirtual record);

    @InsertProvider(type=InnodbSysVirtualSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysVirtual record);

    @SelectProvider(type=InnodbSysVirtualSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER),
        @Result(column="BASE_POS", property="basePos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysVirtual> selectByExampleWithRowbounds(InnodbSysVirtualExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysVirtualSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TABLE_ID", property="tableId", jdbcType=JdbcType.BIGINT),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER),
        @Result(column="BASE_POS", property="basePos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysVirtual> selectByExample(InnodbSysVirtualExample example);

    @UpdateProvider(type=InnodbSysVirtualSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysVirtual record, @Param("example") InnodbSysVirtualExample example);

    @UpdateProvider(type=InnodbSysVirtualSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysVirtual record, @Param("example") InnodbSysVirtualExample example);
}