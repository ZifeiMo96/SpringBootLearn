package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbLockWaits;
import com.example.demo.data.model.InnodbLockWaitsExample;
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

public interface InnodbLockWaitsMapper {
    @SelectProvider(type=InnodbLockWaitsSqlProvider.class, method="countByExample")
    long countByExample(InnodbLockWaitsExample example);

    @DeleteProvider(type=InnodbLockWaitsSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbLockWaitsExample example);

    @Insert({
        "insert into INNODB_LOCK_WAITS (requesting_trx_id, requested_lock_id, ",
        "blocking_trx_id, blocking_lock_id)",
        "values (#{requestingTrxId,jdbcType=VARCHAR}, #{requestedLockId,jdbcType=VARCHAR}, ",
        "#{blockingTrxId,jdbcType=VARCHAR}, #{blockingLockId,jdbcType=VARCHAR})"
    })
    int insert(InnodbLockWaits record);

    @InsertProvider(type=InnodbLockWaitsSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbLockWaits record);

    @SelectProvider(type=InnodbLockWaitsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="requesting_trx_id", property="requestingTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="requested_lock_id", property="requestedLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_trx_id", property="blockingTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_lock_id", property="blockingLockId", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbLockWaits> selectByExampleWithRowbounds(InnodbLockWaitsExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbLockWaitsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="requesting_trx_id", property="requestingTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="requested_lock_id", property="requestedLockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_trx_id", property="blockingTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="blocking_lock_id", property="blockingLockId", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbLockWaits> selectByExample(InnodbLockWaitsExample example);

    @UpdateProvider(type=InnodbLockWaitsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);

    @UpdateProvider(type=InnodbLockWaitsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);
}