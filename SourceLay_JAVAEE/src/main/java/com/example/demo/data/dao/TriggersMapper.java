package com.example.demo.data.dao;

import com.example.demo.data.model.Triggers;
import com.example.demo.data.model.TriggersExample;
import com.example.demo.data.model.TriggersWithBLOBs;
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

public interface TriggersMapper {
    @SelectProvider(type=TriggersSqlProvider.class, method="countByExample")
    long countByExample(TriggersExample example);

    @DeleteProvider(type=TriggersSqlProvider.class, method="deleteByExample")
    int deleteByExample(TriggersExample example);

    @Insert({
        "insert into TRIGGERS (TRIGGER_CATALOG, TRIGGER_SCHEMA, ",
        "TRIGGER_NAME, EVENT_MANIPULATION, ",
        "EVENT_OBJECT_CATALOG, EVENT_OBJECT_SCHEMA, ",
        "EVENT_OBJECT_TABLE, ACTION_ORDER, ",
        "ACTION_ORIENTATION, ACTION_TIMING, ",
        "ACTION_REFERENCE_OLD_TABLE, ACTION_REFERENCE_NEW_TABLE, ",
        "ACTION_REFERENCE_OLD_ROW, ACTION_REFERENCE_NEW_ROW, ",
        "CREATED, SQL_MODE, ",
        "DEFINER, CHARACTER_SET_CLIENT, ",
        "COLLATION_CONNECTION, DATABASE_COLLATION, ",
        "ACTION_CONDITION, ACTION_STATEMENT)",
        "values (#{triggerCatalog,jdbcType=VARCHAR}, #{triggerSchema,jdbcType=VARCHAR}, ",
        "#{triggerName,jdbcType=VARCHAR}, #{eventManipulation,jdbcType=VARCHAR}, ",
        "#{eventObjectCatalog,jdbcType=VARCHAR}, #{eventObjectSchema,jdbcType=VARCHAR}, ",
        "#{eventObjectTable,jdbcType=VARCHAR}, #{actionOrder,jdbcType=BIGINT}, ",
        "#{actionOrientation,jdbcType=VARCHAR}, #{actionTiming,jdbcType=VARCHAR}, ",
        "#{actionReferenceOldTable,jdbcType=VARCHAR}, #{actionReferenceNewTable,jdbcType=VARCHAR}, ",
        "#{actionReferenceOldRow,jdbcType=VARCHAR}, #{actionReferenceNewRow,jdbcType=VARCHAR}, ",
        "#{created,jdbcType=TIMESTAMP}, #{sqlMode,jdbcType=VARCHAR}, ",
        "#{definer,jdbcType=VARCHAR}, #{characterSetClient,jdbcType=VARCHAR}, ",
        "#{collationConnection,jdbcType=VARCHAR}, #{databaseCollation,jdbcType=VARCHAR}, ",
        "#{actionCondition,jdbcType=LONGVARCHAR}, #{actionStatement,jdbcType=LONGVARCHAR})"
    })
    int insert(TriggersWithBLOBs record);

    @InsertProvider(type=TriggersSqlProvider.class, method="insertSelective")
    int insertSelective(TriggersWithBLOBs record);

    @SelectProvider(type=TriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TRIGGER_CATALOG", property="triggerCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_SCHEMA", property="triggerSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_NAME", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_MANIPULATION", property="eventManipulation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_CATALOG", property="eventObjectCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_SCHEMA", property="eventObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_TABLE", property="eventObjectTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_ORDER", property="actionOrder", jdbcType=JdbcType.BIGINT),
        @Result(column="ACTION_ORIENTATION", property="actionOrientation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_TIMING", property="actionTiming", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_TABLE", property="actionReferenceOldTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_TABLE", property="actionReferenceNewTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_ROW", property="actionReferenceOldRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_ROW", property="actionReferenceNewRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_CONDITION", property="actionCondition", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="ACTION_STATEMENT", property="actionStatement", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TriggersWithBLOBs> selectByExampleWithBLOBsWithRowbounds(TriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=TriggersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="TRIGGER_CATALOG", property="triggerCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_SCHEMA", property="triggerSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_NAME", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_MANIPULATION", property="eventManipulation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_CATALOG", property="eventObjectCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_SCHEMA", property="eventObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_TABLE", property="eventObjectTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_ORDER", property="actionOrder", jdbcType=JdbcType.BIGINT),
        @Result(column="ACTION_ORIENTATION", property="actionOrientation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_TIMING", property="actionTiming", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_TABLE", property="actionReferenceOldTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_TABLE", property="actionReferenceNewTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_ROW", property="actionReferenceOldRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_ROW", property="actionReferenceNewRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_CONDITION", property="actionCondition", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="ACTION_STATEMENT", property="actionStatement", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TriggersWithBLOBs> selectByExampleWithBLOBs(TriggersExample example);

    @SelectProvider(type=TriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TRIGGER_CATALOG", property="triggerCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_SCHEMA", property="triggerSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_NAME", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_MANIPULATION", property="eventManipulation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_CATALOG", property="eventObjectCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_SCHEMA", property="eventObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_TABLE", property="eventObjectTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_ORDER", property="actionOrder", jdbcType=JdbcType.BIGINT),
        @Result(column="ACTION_ORIENTATION", property="actionOrientation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_TIMING", property="actionTiming", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_TABLE", property="actionReferenceOldTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_TABLE", property="actionReferenceNewTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_ROW", property="actionReferenceOldRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_ROW", property="actionReferenceNewRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR)
    })
    List<Triggers> selectByExampleWithRowbounds(TriggersExample example, RowBounds rowBounds);

    @SelectProvider(type=TriggersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TRIGGER_CATALOG", property="triggerCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_SCHEMA", property="triggerSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRIGGER_NAME", property="triggerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_MANIPULATION", property="eventManipulation", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_CATALOG", property="eventObjectCatalog", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_SCHEMA", property="eventObjectSchema", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVENT_OBJECT_TABLE", property="eventObjectTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_ORDER", property="actionOrder", jdbcType=JdbcType.BIGINT),
        @Result(column="ACTION_ORIENTATION", property="actionOrientation", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_TIMING", property="actionTiming", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_TABLE", property="actionReferenceOldTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_TABLE", property="actionReferenceNewTable", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_OLD_ROW", property="actionReferenceOldRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACTION_REFERENCE_NEW_ROW", property="actionReferenceNewRow", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SQL_MODE", property="sqlMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEFINER", property="definer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHARACTER_SET_CLIENT", property="characterSetClient", jdbcType=JdbcType.VARCHAR),
        @Result(column="COLLATION_CONNECTION", property="collationConnection", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATABASE_COLLATION", property="databaseCollation", jdbcType=JdbcType.VARCHAR)
    })
    List<Triggers> selectByExample(TriggersExample example);

    @UpdateProvider(type=TriggersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    @UpdateProvider(type=TriggersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    @UpdateProvider(type=TriggersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersExample example);
}