package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysDatafiles;
import com.example.demo.data.model.InnodbSysDatafilesExample;
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

public interface InnodbSysDatafilesMapper {
    @SelectProvider(type=InnodbSysDatafilesSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysDatafilesExample example);

    @DeleteProvider(type=InnodbSysDatafilesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysDatafilesExample example);

    @Insert({
        "insert into INNODB_SYS_DATAFILES (SPACE, PATH)",
        "values (#{space,jdbcType=INTEGER}, #{path,jdbcType=VARCHAR})"
    })
    int insert(InnodbSysDatafiles record);

    @InsertProvider(type=InnodbSysDatafilesSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysDatafiles record);

    @SelectProvider(type=InnodbSysDatafilesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbSysDatafiles> selectByExampleWithRowbounds(InnodbSysDatafilesExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysDatafilesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="PATH", property="path", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbSysDatafiles> selectByExample(InnodbSysDatafilesExample example);

    @UpdateProvider(type=InnodbSysDatafilesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);

    @UpdateProvider(type=InnodbSysDatafilesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysDatafiles record, @Param("example") InnodbSysDatafilesExample example);
}