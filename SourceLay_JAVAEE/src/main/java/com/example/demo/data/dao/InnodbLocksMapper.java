package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbLocks;
import com.example.demo.data.model.InnodbLocksExample;
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

public interface InnodbLocksMapper {
    @SelectProvider(type=InnodbLocksSqlProvider.class, method="countByExample")
    long countByExample(InnodbLocksExample example);

    @DeleteProvider(type=InnodbLocksSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbLocksExample example);

    @Insert({
        "insert into INNODB_LOCKS (lock_id, lock_trx_id, ",
        "lock_mode, lock_type, ",
        "lock_table, lock_index, ",
        "lock_space, lock_page, ",
        "lock_rec, lock_data)",
        "values (#{lockId,jdbcType=VARCHAR}, #{lockTrxId,jdbcType=VARCHAR}, ",
        "#{lockMode,jdbcType=VARCHAR}, #{lockType,jdbcType=VARCHAR}, ",
        "#{lockTable,jdbcType=VARCHAR}, #{lockIndex,jdbcType=VARCHAR}, ",
        "#{lockSpace,jdbcType=BIGINT}, #{lockPage,jdbcType=BIGINT}, ",
        "#{lockRec,jdbcType=BIGINT}, #{lockData,jdbcType=VARCHAR})"
    })
    int insert(InnodbLocks record);

    @InsertProvider(type=InnodbLocksSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbLocks record);

    @SelectProvider(type=InnodbLocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="lock_id", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_trx_id", property="lockTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_mode", property="lockMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_type", property="lockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_table", property="lockTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_index", property="lockIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_space", property="lockSpace", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_page", property="lockPage", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_rec", property="lockRec", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_data", property="lockData", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbLocks> selectByExampleWithRowbounds(InnodbLocksExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbLocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="lock_id", property="lockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_trx_id", property="lockTrxId", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_mode", property="lockMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_type", property="lockType", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_table", property="lockTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_index", property="lockIndex", jdbcType=JdbcType.VARCHAR),
        @Result(column="lock_space", property="lockSpace", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_page", property="lockPage", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_rec", property="lockRec", jdbcType=JdbcType.BIGINT),
        @Result(column="lock_data", property="lockData", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbLocks> selectByExample(InnodbLocksExample example);

    @UpdateProvider(type=InnodbLocksSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbLocks record, @Param("example") InnodbLocksExample example);

    @UpdateProvider(type=InnodbLocksSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbLocks record, @Param("example") InnodbLocksExample example);
}