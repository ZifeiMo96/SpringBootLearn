package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTablespacesScrubbing;
import com.example.demo.data.model.InnodbTablespacesScrubbingExample;
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

public interface InnodbTablespacesScrubbingMapper {
    @SelectProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="countByExample")
    long countByExample(InnodbTablespacesScrubbingExample example);

    @DeleteProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbTablespacesScrubbingExample example);

    @Insert({
        "insert into INNODB_TABLESPACES_SCRUBBING (SPACE, NAME, ",
        "COMPRESSED, LAST_SCRUB_COMPLETED, ",
        "CURRENT_SCRUB_STARTED, CURRENT_SCRUB_ACTIVE_THREADS, ",
        "CURRENT_SCRUB_PAGE_NUMBER, CURRENT_SCRUB_MAX_PAGE_NUMBER)",
        "values (#{space,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{compressed,jdbcType=INTEGER}, #{lastScrubCompleted,jdbcType=TIMESTAMP}, ",
        "#{currentScrubStarted,jdbcType=TIMESTAMP}, #{currentScrubActiveThreads,jdbcType=INTEGER}, ",
        "#{currentScrubPageNumber,jdbcType=BIGINT}, #{currentScrubMaxPageNumber,jdbcType=BIGINT})"
    })
    int insert(InnodbTablespacesScrubbing record);

    @InsertProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbTablespacesScrubbing record);

    @SelectProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPRESSED", property="compressed", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_SCRUB_COMPLETED", property="lastScrubCompleted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CURRENT_SCRUB_STARTED", property="currentScrubStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CURRENT_SCRUB_ACTIVE_THREADS", property="currentScrubActiveThreads", jdbcType=JdbcType.INTEGER),
        @Result(column="CURRENT_SCRUB_PAGE_NUMBER", property="currentScrubPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_SCRUB_MAX_PAGE_NUMBER", property="currentScrubMaxPageNumber", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbTablespacesScrubbing> selectByExampleWithRowbounds(InnodbTablespacesScrubbingExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.BIGINT),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="COMPRESSED", property="compressed", jdbcType=JdbcType.INTEGER),
        @Result(column="LAST_SCRUB_COMPLETED", property="lastScrubCompleted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CURRENT_SCRUB_STARTED", property="currentScrubStarted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CURRENT_SCRUB_ACTIVE_THREADS", property="currentScrubActiveThreads", jdbcType=JdbcType.INTEGER),
        @Result(column="CURRENT_SCRUB_PAGE_NUMBER", property="currentScrubPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_SCRUB_MAX_PAGE_NUMBER", property="currentScrubMaxPageNumber", jdbcType=JdbcType.BIGINT)
    })
    List<InnodbTablespacesScrubbing> selectByExample(InnodbTablespacesScrubbingExample example);

    @UpdateProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbTablespacesScrubbing record, @Param("example") InnodbTablespacesScrubbingExample example);

    @UpdateProvider(type=InnodbTablespacesScrubbingSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbTablespacesScrubbing record, @Param("example") InnodbTablespacesScrubbingExample example);
}