package com.example.demo.data.dao;

import com.example.demo.data.model.TriggersExample.Criteria;
import com.example.demo.data.model.TriggersExample.Criterion;
import com.example.demo.data.model.TriggersExample;
import com.example.demo.data.model.TriggersWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TriggersSqlProvider {
    public String countByExample(TriggersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TRIGGERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TriggersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TRIGGERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TriggersWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TRIGGERS");
        
        if (record.getTriggerCatalog() != null) {
            sql.VALUES("TRIGGER_CATALOG", "#{triggerCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerSchema() != null) {
            sql.VALUES("TRIGGER_SCHEMA", "#{triggerSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            sql.VALUES("TRIGGER_NAME", "#{triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getEventManipulation() != null) {
            sql.VALUES("EVENT_MANIPULATION", "#{eventManipulation,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectCatalog() != null) {
            sql.VALUES("EVENT_OBJECT_CATALOG", "#{eventObjectCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectSchema() != null) {
            sql.VALUES("EVENT_OBJECT_SCHEMA", "#{eventObjectSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectTable() != null) {
            sql.VALUES("EVENT_OBJECT_TABLE", "#{eventObjectTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionOrder() != null) {
            sql.VALUES("ACTION_ORDER", "#{actionOrder,jdbcType=BIGINT}");
        }
        
        if (record.getActionOrientation() != null) {
            sql.VALUES("ACTION_ORIENTATION", "#{actionOrientation,jdbcType=VARCHAR}");
        }
        
        if (record.getActionTiming() != null) {
            sql.VALUES("ACTION_TIMING", "#{actionTiming,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceOldTable() != null) {
            sql.VALUES("ACTION_REFERENCE_OLD_TABLE", "#{actionReferenceOldTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceNewTable() != null) {
            sql.VALUES("ACTION_REFERENCE_NEW_TABLE", "#{actionReferenceNewTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceOldRow() != null) {
            sql.VALUES("ACTION_REFERENCE_OLD_ROW", "#{actionReferenceOldRow,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceNewRow() != null) {
            sql.VALUES("ACTION_REFERENCE_NEW_ROW", "#{actionReferenceNewRow,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.VALUES("CREATED", "#{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSqlMode() != null) {
            sql.VALUES("SQL_MODE", "#{sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.VALUES("DEFINER", "#{definer,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.VALUES("CHARACTER_SET_CLIENT", "#{characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.VALUES("COLLATION_CONNECTION", "#{collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getDatabaseCollation() != null) {
            sql.VALUES("DATABASE_COLLATION", "#{databaseCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getActionCondition() != null) {
            sql.VALUES("ACTION_CONDITION", "#{actionCondition,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getActionStatement() != null) {
            sql.VALUES("ACTION_STATEMENT", "#{actionStatement,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(TriggersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TRIGGER_CATALOG");
        } else {
            sql.SELECT("TRIGGER_CATALOG");
        }
        sql.SELECT("TRIGGER_SCHEMA");
        sql.SELECT("TRIGGER_NAME");
        sql.SELECT("EVENT_MANIPULATION");
        sql.SELECT("EVENT_OBJECT_CATALOG");
        sql.SELECT("EVENT_OBJECT_SCHEMA");
        sql.SELECT("EVENT_OBJECT_TABLE");
        sql.SELECT("ACTION_ORDER");
        sql.SELECT("ACTION_ORIENTATION");
        sql.SELECT("ACTION_TIMING");
        sql.SELECT("ACTION_REFERENCE_OLD_TABLE");
        sql.SELECT("ACTION_REFERENCE_NEW_TABLE");
        sql.SELECT("ACTION_REFERENCE_OLD_ROW");
        sql.SELECT("ACTION_REFERENCE_NEW_ROW");
        sql.SELECT("CREATED");
        sql.SELECT("SQL_MODE");
        sql.SELECT("DEFINER");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.SELECT("ACTION_CONDITION");
        sql.SELECT("ACTION_STATEMENT");
        sql.FROM("TRIGGERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(TriggersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TRIGGER_CATALOG");
        } else {
            sql.SELECT("TRIGGER_CATALOG");
        }
        sql.SELECT("TRIGGER_SCHEMA");
        sql.SELECT("TRIGGER_NAME");
        sql.SELECT("EVENT_MANIPULATION");
        sql.SELECT("EVENT_OBJECT_CATALOG");
        sql.SELECT("EVENT_OBJECT_SCHEMA");
        sql.SELECT("EVENT_OBJECT_TABLE");
        sql.SELECT("ACTION_ORDER");
        sql.SELECT("ACTION_ORIENTATION");
        sql.SELECT("ACTION_TIMING");
        sql.SELECT("ACTION_REFERENCE_OLD_TABLE");
        sql.SELECT("ACTION_REFERENCE_NEW_TABLE");
        sql.SELECT("ACTION_REFERENCE_OLD_ROW");
        sql.SELECT("ACTION_REFERENCE_NEW_ROW");
        sql.SELECT("CREATED");
        sql.SELECT("SQL_MODE");
        sql.SELECT("DEFINER");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.FROM("TRIGGERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TriggersWithBLOBs record = (TriggersWithBLOBs) parameter.get("record");
        TriggersExample example = (TriggersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TRIGGERS");
        
        if (record.getTriggerCatalog() != null) {
            sql.SET("TRIGGER_CATALOG = #{record.triggerCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerSchema() != null) {
            sql.SET("TRIGGER_SCHEMA = #{record.triggerSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getTriggerName() != null) {
            sql.SET("TRIGGER_NAME = #{record.triggerName,jdbcType=VARCHAR}");
        }
        
        if (record.getEventManipulation() != null) {
            sql.SET("EVENT_MANIPULATION = #{record.eventManipulation,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectCatalog() != null) {
            sql.SET("EVENT_OBJECT_CATALOG = #{record.eventObjectCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectSchema() != null) {
            sql.SET("EVENT_OBJECT_SCHEMA = #{record.eventObjectSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getEventObjectTable() != null) {
            sql.SET("EVENT_OBJECT_TABLE = #{record.eventObjectTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionOrder() != null) {
            sql.SET("ACTION_ORDER = #{record.actionOrder,jdbcType=BIGINT}");
        }
        
        if (record.getActionOrientation() != null) {
            sql.SET("ACTION_ORIENTATION = #{record.actionOrientation,jdbcType=VARCHAR}");
        }
        
        if (record.getActionTiming() != null) {
            sql.SET("ACTION_TIMING = #{record.actionTiming,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceOldTable() != null) {
            sql.SET("ACTION_REFERENCE_OLD_TABLE = #{record.actionReferenceOldTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceNewTable() != null) {
            sql.SET("ACTION_REFERENCE_NEW_TABLE = #{record.actionReferenceNewTable,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceOldRow() != null) {
            sql.SET("ACTION_REFERENCE_OLD_ROW = #{record.actionReferenceOldRow,jdbcType=VARCHAR}");
        }
        
        if (record.getActionReferenceNewRow() != null) {
            sql.SET("ACTION_REFERENCE_NEW_ROW = #{record.actionReferenceNewRow,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSqlMode() != null) {
            sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        }
        
        if (record.getCharacterSetClient() != null) {
            sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        }
        
        if (record.getCollationConnection() != null) {
            sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        }
        
        if (record.getDatabaseCollation() != null) {
            sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        }
        
        if (record.getActionCondition() != null) {
            sql.SET("ACTION_CONDITION = #{record.actionCondition,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getActionStatement() != null) {
            sql.SET("ACTION_STATEMENT = #{record.actionStatement,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TRIGGERS");
        
        sql.SET("TRIGGER_CATALOG = #{record.triggerCatalog,jdbcType=VARCHAR}");
        sql.SET("TRIGGER_SCHEMA = #{record.triggerSchema,jdbcType=VARCHAR}");
        sql.SET("TRIGGER_NAME = #{record.triggerName,jdbcType=VARCHAR}");
        sql.SET("EVENT_MANIPULATION = #{record.eventManipulation,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_CATALOG = #{record.eventObjectCatalog,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_SCHEMA = #{record.eventObjectSchema,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_TABLE = #{record.eventObjectTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_ORDER = #{record.actionOrder,jdbcType=BIGINT}");
        sql.SET("ACTION_ORIENTATION = #{record.actionOrientation,jdbcType=VARCHAR}");
        sql.SET("ACTION_TIMING = #{record.actionTiming,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_OLD_TABLE = #{record.actionReferenceOldTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_NEW_TABLE = #{record.actionReferenceNewTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_OLD_ROW = #{record.actionReferenceOldRow,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_NEW_ROW = #{record.actionReferenceNewRow,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        sql.SET("ACTION_CONDITION = #{record.actionCondition,jdbcType=LONGVARCHAR}");
        sql.SET("ACTION_STATEMENT = #{record.actionStatement,jdbcType=LONGVARCHAR}");
        
        TriggersExample example = (TriggersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TRIGGERS");
        
        sql.SET("TRIGGER_CATALOG = #{record.triggerCatalog,jdbcType=VARCHAR}");
        sql.SET("TRIGGER_SCHEMA = #{record.triggerSchema,jdbcType=VARCHAR}");
        sql.SET("TRIGGER_NAME = #{record.triggerName,jdbcType=VARCHAR}");
        sql.SET("EVENT_MANIPULATION = #{record.eventManipulation,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_CATALOG = #{record.eventObjectCatalog,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_SCHEMA = #{record.eventObjectSchema,jdbcType=VARCHAR}");
        sql.SET("EVENT_OBJECT_TABLE = #{record.eventObjectTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_ORDER = #{record.actionOrder,jdbcType=BIGINT}");
        sql.SET("ACTION_ORIENTATION = #{record.actionOrientation,jdbcType=VARCHAR}");
        sql.SET("ACTION_TIMING = #{record.actionTiming,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_OLD_TABLE = #{record.actionReferenceOldTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_NEW_TABLE = #{record.actionReferenceNewTable,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_OLD_ROW = #{record.actionReferenceOldRow,jdbcType=VARCHAR}");
        sql.SET("ACTION_REFERENCE_NEW_ROW = #{record.actionReferenceNewRow,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        
        TriggersExample example = (TriggersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TriggersExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}