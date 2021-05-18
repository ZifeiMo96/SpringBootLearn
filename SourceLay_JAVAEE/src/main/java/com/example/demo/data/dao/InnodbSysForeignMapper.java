package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysForeign;
import com.example.demo.data.model.InnodbSysForeignExample;
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

public interface InnodbSysForeignMapper {
    @SelectProvider(type=InnodbSysForeignSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysForeignExample example);

    @DeleteProvider(type=InnodbSysForeignSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysForeignExample example);

    @Insert({
        "insert into INNODB_SYS_FOREIGN (ID, FOR_NAME, ",
        "REF_NAME, N_COLS, ",
        "TYPE)",
        "values (#{id,jdbcType=VARCHAR}, #{forName,jdbcType=VARCHAR}, ",
        "#{refName,jdbcType=VARCHAR}, #{nCols,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER})"
    })
    int insert(InnodbSysForeign record);

    @InsertProvider(type=InnodbSysForeignSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysForeign record);

    @SelectProvider(type=InnodbSysForeignSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_NAME", property="forName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_NAME", property="refName", jdbcType=JdbcType.VARCHAR),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysForeign> selectByExampleWithRowbounds(InnodbSysForeignExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysForeignSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="FOR_NAME", property="forName", jdbcType=JdbcType.VARCHAR),
        @Result(column="REF_NAME", property="refName", jdbcType=JdbcType.VARCHAR),
        @Result(column="N_COLS", property="nCols", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysForeign> selectByExample(InnodbSysForeignExample example);

    @UpdateProvider(type=InnodbSysForeignSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);

    @UpdateProvider(type=InnodbSysForeignSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysForeign record, @Param("example") InnodbSysForeignExample example);
}