package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtDeleted;
import com.example.demo.data.model.InnodbFtDeletedExample;
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

public interface InnodbFtDeletedMapper {
    @SelectProvider(type=InnodbFtDeletedSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtDeletedExample example);

    @DeleteProvider(type=InnodbFtDeletedSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtDeletedExample example);

    @Insert({
        "insert into INNODB_FT_DELETED (DOC_ID)",
        "values (#{docId,jdbcType=BIGINT})"
    })
    int insert(InnodbFtDeleted record);

    @InsertProvider(type=InnodbFtDeletedSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtDeleted record);

    @SelectProvider(type=InnodbFtDeletedSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtDeleted> selectByExampleWithRowbounds(InnodbFtDeletedExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtDeletedSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtDeleted> selectByExample(InnodbFtDeletedExample example);

    @UpdateProvider(type=InnodbFtDeletedSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);

    @UpdateProvider(type=InnodbFtDeletedSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtDeleted record, @Param("example") InnodbFtDeletedExample example);
}