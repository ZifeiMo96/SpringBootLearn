package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbSysFields;
import com.example.demo.data.model.InnodbSysFieldsExample;
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

public interface InnodbSysFieldsMapper {
    @SelectProvider(type=InnodbSysFieldsSqlProvider.class, method="countByExample")
    long countByExample(InnodbSysFieldsExample example);

    @DeleteProvider(type=InnodbSysFieldsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbSysFieldsExample example);

    @Insert({
        "insert into INNODB_SYS_FIELDS (INDEX_ID, NAME, ",
        "POS)",
        "values (#{indexId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{pos,jdbcType=INTEGER})"
    })
    int insert(InnodbSysFields record);

    @InsertProvider(type=InnodbSysFieldsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbSysFields record);

    @SelectProvider(type=InnodbSysFieldsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysFields> selectByExampleWithRowbounds(InnodbSysFieldsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbSysFieldsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INDEX_ID", property="indexId", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="POS", property="pos", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbSysFields> selectByExample(InnodbSysFieldsExample example);

    @UpdateProvider(type=InnodbSysFieldsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbSysFields record, @Param("example") InnodbSysFieldsExample example);

    @UpdateProvider(type=InnodbSysFieldsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbSysFields record, @Param("example") InnodbSysFieldsExample example);
}