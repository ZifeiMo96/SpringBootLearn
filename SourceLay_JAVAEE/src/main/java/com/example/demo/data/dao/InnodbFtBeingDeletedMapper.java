package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtBeingDeleted;
import com.example.demo.data.model.InnodbFtBeingDeletedExample;
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

public interface InnodbFtBeingDeletedMapper {
    @SelectProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtBeingDeletedExample example);

    @DeleteProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtBeingDeletedExample example);

    @Insert({
        "insert into INNODB_FT_BEING_DELETED (DOC_ID)",
        "values (#{docId,jdbcType=BIGINT})"
    })
    int insert(InnodbFtBeingDeleted record);

    @InsertProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtBeingDeleted record);

    @SelectProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtBeingDeleted> selectByExampleWithRowbounds(InnodbFtBeingDeletedExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DOC_ID", property="docId", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbFtBeingDeleted> selectByExample(InnodbFtBeingDeletedExample example);

    @UpdateProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);

    @UpdateProvider(type=InnodbFtBeingDeletedSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtBeingDeleted record, @Param("example") InnodbFtBeingDeletedExample example);
}