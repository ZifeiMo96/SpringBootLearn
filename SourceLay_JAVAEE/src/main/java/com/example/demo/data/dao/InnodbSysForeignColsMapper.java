package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysForeignCols;
import com.example.demo.data.model.InnodbSysForeignColsExample;
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

public interface InnodbSysForeignColsMapper {
    @SelectProvider(type=InnodbSysForeignColsSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysForeignColsExample example);

    @DeleteProvider(type=InnodbSysForeignColsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysForeignColsExample example);

    @Insert({
        "insert into INNODB_SYS_FOREIGN_COLS (ID, FOR_COL_NAME, ",
        "REF_COL_NAME, POS)",
        "values (#{id,jdbcType=VARCHAR}, #{forColName,jdbcType=VARCHAR}, ",
        "#{refColName,jdbcType=VARCHAR}, #{pos,jdbcType=INTEGER})"
    })
    int insert(InnodbSysForeignCols record);

    @InsertProvider(type=InnodbSysForeignColsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysForeignCols record);

    @SelectProvider(type=InnodbSysForeignColsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_COL_NAME", property="forColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_COL_NAME", property="refColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysForeignCols> selectByExampleWithRowbounds(InnodbSysForeignColsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysForeignColsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_COL_NAME", property="forColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_COL_NAME", property="refColName", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysForeignCols> selectByExample(InnodbSysForeignColsExample example);

    @UpdateProvider(type=InnodbSysForeignColsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysForeignCols record, @Param("example") InnodbSysForeignColsExample example);

    @UpdateProvider(type=InnodbSysForeignColsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysForeignCols record, @Param("example") InnodbSysForeignColsExample example);
}