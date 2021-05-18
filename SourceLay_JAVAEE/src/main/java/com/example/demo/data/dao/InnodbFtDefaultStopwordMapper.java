package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtDefaultStopword;
import com.example.demo.data.model.InnodbFtDefaultStopwordExample;
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

public interface InnodbFtDefaultStopwordMapper {
    @SelectProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtDefaultStopwordExample example);

    @DeleteProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtDefaultStopwordExample example);

    @Insert({
        "insert into INNODB_FT_DEFAULT_STOPWORD (value)",
        "values (#{value,jdbcType=VARCHAR})"
    })
    int insert(InnodbFtDefaultStopword record);

    @InsertProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtDefaultStopword record);

    @SelectProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtDefaultStopword> selectByExampleWithRowbounds(InnodbFtDefaultStopwordExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtDefaultStopword> selectByExample(InnodbFtDefaultStopwordExample example);

    @UpdateProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtDefaultStopword record, @Param("example") InnodbFtDefaultStopwordExample example);

    @UpdateProvider(type=InnodbFtDefaultStopwordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtDefaultStopword record, @Param("example") InnodbFtDefaultStopwordExample example);
}