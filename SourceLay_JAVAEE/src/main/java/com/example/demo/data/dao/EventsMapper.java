package com.example.demo.data.dao;

import com.example.demo.data.model.Events;
import com.example.demo.data.model.EventsExample;
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

public interface EventsMapper {
    @SelectProvider(type=EventsSqlProvider.class, method="countByExample")
    long countByExample(EventsExample example);

    @DeleteProvider(type=EventsSqlProvider.class, method="deleteByExample")
    int deleteByExample(EventsExample example);

    @Insert({
        "insert into EVENTS (EVENT_CATALOG, EVENT_SCHEMA, ",
        "EVENT_NAME, DEFINER, ",
        "TIME_ZONE, EVENT_BODY, ",
        "EVENT_TYPE, EXECUTE_AT, ",
        "INTERVAL_VALUE, INTERVAL_FIELD, ",
        "SQL_MODE, STARTS, ",
        "ENDS, STATUS, ",
        "ON_COMPLETION, CREATED, ",
        "LAST_ALTERED, LAST_EXECUTED, ",
        "EVENT_COMMENT, ORIGINATOR, ",
        "CHARACTER_SET_CLIENT, COLLATION_CONNECTION, ",
        "DATABASE_COLLATION, EVENT_DEFINITION)",
        "values (#{eventCatalog,jdbcType=VARCHAR}, #{eventSchema,jdbcType=VARCHAR}, ",
        "#{eventName,jdbcType=VARCHAR}, #{definer,jdbcType=VARCHAR}, ",
        "#{timeZone,jdbcType=VARCHAR}, #{eventBody,jdbcType=VARCHAR}, ",
        "#{eventType,jdbcType=VARCHAR}, #{executeAt,jdbcType=TIMESTAMP}, ",
        "#{intervalValue,jdbcType=VARCHAR}, #{intervalField,jdbcType=VARCHAR}, ",
        "#{sqlMode,jdbcType=VARCHAR}, #{starts,jdbcType=TIMESTAMP}, ",
        "#{ends,jdbcType=TIMESTAMP}, #{status,jdbcType=VARCHAR}, ",
        "#{onCompletion,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
        "#{lastAltered,jdbcType=TIMESTAMP}, #{lastExecuted,jdbcType=TIMESTAMP}, ",
        "#{eventComment,jdbcType=VARCHAR}, #{originator,jdbcType=BIGINT}, ",
        "#{characterSetClient,jdbcType=VARCHAR}, #{collationConnection,jdbcType=VARCHAR}, ",
        "#{databaseCollation,jdbcType=VARCHAR}, #{eventDefinition,jdbcType=LONGVARCHAR})"
    })
    int insert(Events record);

    @InsertProvider(type=EventsSqlProvider.class, method="insertSelective")
    int insertSelective(Events record);

    @SelectProvider(type=EventsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="EVENT_CATALOG", property="eventCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_SCHEMA", property="eventSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_ZONE", property="timeZone", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_BODY", property="eventBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_TYPE", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXECUTE_AT", property="executeAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INTERVAL_VALUE", property="intervalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTERVAL_FIELD", property="intervalField", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="STARTS", property="starts", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDS", property="ends", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ON_COMPLETION", property="onCompletion", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_EXECUTED", property="lastExecuted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EVENT_COMMENT", property="eventComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORIGINATOR", property="originator", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_DEFINITION", property="eventDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Events> selectByExampleWithBLOBsWithRowbounds(EventsExample example, RowBounds rowBounds);

    @SelectProvider(type=EventsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="EVENT_CATALOG", property="eventCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_SCHEMA", property="eventSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_ZONE", property="timeZone", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_BODY", property="eventBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_TYPE", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXECUTE_AT", property="executeAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INTERVAL_VALUE", property="intervalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTERVAL_FIELD", property="intervalField", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="STARTS", property="starts", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDS", property="ends", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ON_COMPLETION", property="onCompletion", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_EXECUTED", property="lastExecuted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EVENT_COMMENT", property="eventComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORIGINATOR", property="originator", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_DEFINITION", property="eventDefinition", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Events> selectByExampleWithBLOBs(EventsExample example);

    @SelectProvider(type=EventsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="EVENT_CATALOG", property="eventCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_SCHEMA", property="eventSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_ZONE", property="timeZone", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_BODY", property="eventBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_TYPE", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXECUTE_AT", property="executeAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INTERVAL_VALUE", property="intervalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTERVAL_FIELD", property="intervalField", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="STARTS", property="starts", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDS", property="ends", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ON_COMPLETION", property="onCompletion", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_EXECUTED", property="lastExecuted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EVENT_COMMENT", property="eventComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORIGINATOR", property="originator", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR)
    })
    List<Events> selectByExampleWithRowbounds(EventsExample example, RowBounds rowBounds);

    @SelectProvider(type=EventsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="EVENT_CATALOG", property="eventCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_SCHEMA", property="eventSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_NAME", property="eventName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIME_ZONE", property="timeZone", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_BODY", property="eventBody", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_TYPE", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXECUTE_AT", property="executeAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INTERVAL_VALUE", property="intervalValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="INTERVAL_FIELD", property="intervalField", jdbcType=JdbcType.VARCHAR),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="STARTS", property="starts", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ENDS", property="ends", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="ON_COMPLETION", property="onCompletion", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_ALTERED", property="lastAltered", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LAST_EXECUTED", property="lastExecuted", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EVENT_COMMENT", property="eventComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORIGINATOR", property="originator", jdbcType=JdbcType.BIGINT),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR)
    })
    List<Events> selectByExample(EventsExample example);

    @UpdateProvider(type=EventsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Events record, @Param("example") EventsExample example);

    @UpdateProvider(type=EventsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Events record, @Param("example") EventsExample example);

    @UpdateProvider(type=EventsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Events record, @Param("example") EventsExample example);
}