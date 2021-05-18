package com.example.demo.data.dao;

import com.example.demo.data.model.ParapartyReference;
import com.example.demo.data.model.ParapartyReferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface ParapartyReferenceMapper {
    @SelectProvider(type=ParapartyReferenceSqlProvider.class, method="countByExample")
    long countByExample(ParapartyReferenceExample example);

    @DeleteProvider(type=ParapartyReferenceSqlProvider.class, method="deleteByExample")
    int deleteByExample(ParapartyReferenceExample example);

    @Delete({
        "delete from paraparty_reference",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into paraparty_reference (id, post_id, ",
        "target_tid, target_pid)",
        "values (#{id,jdbcType=BIGINT}, #{postId,jdbcType=BIGINT}, ",
        "#{targetTid,jdbcType=BIGINT}, #{targetPid,jdbcType=BIGINT})"
    })
    int insert(ParapartyReference record);

    @InsertProvider(type=ParapartyReferenceSqlProvider.class, method="insertSelective")
    int insertSelective(ParapartyReference record);

    @SelectProvider(type=ParapartyReferenceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="target_tid", property="targetTid", jdbcType=JdbcType.BIGINT),
        @Result(column="target_pid", property="targetPid", jdbcType=JdbcType.BIGINT)
    })
    List<ParapartyReference> selectByExampleWithRowbounds(ParapartyReferenceExample example, RowBounds rowBounds);

    @SelectProvider(type=ParapartyReferenceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="target_tid", property="targetTid", jdbcType=JdbcType.BIGINT),
        @Result(column="target_pid", property="targetPid", jdbcType=JdbcType.BIGINT)
    })
    List<ParapartyReference> selectByExample(ParapartyReferenceExample example);

    @Select({
        "select",
        "id, post_id, target_tid, target_pid",
        "from paraparty_reference",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="post_id", property="postId", jdbcType=JdbcType.BIGINT),
        @Result(column="target_tid", property="targetTid", jdbcType=JdbcType.BIGINT),
        @Result(column="target_pid", property="targetPid", jdbcType=JdbcType.BIGINT)
    })
    ParapartyReference selectByPrimaryKey(Long id);

    @UpdateProvider(type=ParapartyReferenceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ParapartyReference record, @Param("example") ParapartyReferenceExample example);

    @UpdateProvider(type=ParapartyReferenceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ParapartyReference record, @Param("example") ParapartyReferenceExample example);

    @UpdateProvider(type=ParapartyReferenceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ParapartyReference record);

    @Update({
        "update paraparty_reference",
        "set post_id = #{postId,jdbcType=BIGINT},",
          "target_tid = #{targetTid,jdbcType=BIGINT},",
          "target_pid = #{targetPid,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ParapartyReference record);
}