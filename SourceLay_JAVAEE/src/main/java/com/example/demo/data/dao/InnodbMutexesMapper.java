package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbMutexes;
import com.example.demo.data.model.InnodbMutexesExample;
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

public interface InnodbMutexesMapper {
    @SelectProvider(type=InnodbMutexesSqlProvider.class, method="countByExample")
    long countByExample(InnodbMutexesExample example);

    @DeleteProvider(type=InnodbMutexesSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbMutexesExample example);

    @Insert({
        "insert into INNODB_MUTEXES (NAME, CREATE_FILE, ",
        "CREATE_LINE, OS_WAITS)",
        "values (#{name,jdbcType=VARCHAR}, #{createFile,jdbcType=VARCHAR}, ",
        "#{createLine,jdbcType=INTEGER}, #{osWaits,jdbcType=BIGINT})"
    })
    int insert(InnodbMutexes record);

    @InsertProvider(type=InnodbMutexesSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbMutexes record);

    @SelectProvider(type=InnodbMutexesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_FILE", property="createFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_LINE", property="createLine", jdbcType=JdbcType.INTEGER),
        @Result(column="OS_WAITS", property="osWaits", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbMutexes> selectByExampleWithRowbounds(InnodbMutexesExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbMutexesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_FILE", property="createFile", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_LINE", property="createLine", jdbcType=JdbcType.INTEGER),
        @Result(column="OS_WAITS", property="osWaits", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbMutexes> selectByExample(InnodbMutexesExample example);

    @UpdateProvider(type=InnodbMutexesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbMutexes record, @Param("example") InnodbMutexesExample example);

    @UpdateProvider(type=InnodbMutexesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbMutexes record, @Param("example") InnodbMutexesExample example);
}