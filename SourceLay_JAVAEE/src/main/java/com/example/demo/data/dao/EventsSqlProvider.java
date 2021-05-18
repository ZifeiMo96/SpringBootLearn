package com.example.demo.data.dao;

import com.example.demo.data.model.Events;
import com.example.demo.data.model.EventsExample.Criteria;
import com.example.demo.data.model.EventsExample.Criterion;
import com.example.demo.data.model.EventsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class EventsSqlProvider {
    public String countByExample(EventsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("EVENTS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(EventsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("EVENTS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Events record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("EVENTS");
        
        if (record.getEventCatalog() != null) {
            sql.VALUES("EVENT_CATALOG", "#{eventCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getEventSchema() != null) {
            sql.VALUES("EVENT_SCHEMA", "#{eventSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getEventName() != null) {
            sql.VALUES("EVENT_NAME", "#{eventName,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.VALUES("DEFINER", "#{definer,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeZone() != null) {
            sql.VALUES("TIME_ZONE", "#{timeZone,jdbcType=VARCHAR}");
        }
        
        if (record.getEventBody() != null) {
            sql.VALUES("EVENT_BODY", "#{eventBody,jdbcType=VARCHAR}");
        }
        
        if (record.getEventType() != null) {
            sql.VALUES("EVENT_TYPE", "#{eventType,jdbcType=VARCHAR}");
        }
        
        if (record.getExecuteAt() != null) {
            sql.VALUES("EXECUTE_AT", "#{executeAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIntervalValue() != null) {
            sql.VALUES("INTERVAL_VALUE", "#{intervalValue,jdbcType=VARCHAR}");
        }
        
        if (record.getIntervalField() != null) {
            sql.VALUES("INTERVAL_FIELD", "#{intervalField,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlMode() != null) {
            sql.VALUES("SQL_MODE", "#{sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getStarts() != null) {
            sql.VALUES("STARTS", "#{starts,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnds() != null) {
            sql.VALUES("ENDS", "#{ends,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getOnCompletion() != null) {
            sql.VALUES("ON_COMPLETION", "#{onCompletion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.VALUES("CREATED", "#{created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAltered() != null) {
            sql.VALUES("LAST_ALTERED", "#{lastAltered,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastExecuted() != null) {
            sql.VALUES("LAST_EXECUTED", "#{lastExecuted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventComment() != null) {
            sql.VALUES("EVENT_COMMENT", "#{eventComment,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginator() != null) {
            sql.VALUES("ORIGINATOR", "#{originator,jdbcType=BIGINT}");
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
        
        if (record.getEventDefinition() != null) {
            sql.VALUES("EVENT_DEFINITION", "#{eventDefinition,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(EventsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("EVENT_CATALOG");
        } else {
            sql.SELECT("EVENT_CATALOG");
        }
        sql.SELECT("EVENT_SCHEMA");
        sql.SELECT("EVENT_NAME");
        sql.SELECT("DEFINER");
        sql.SELECT("TIME_ZONE");
        sql.SELECT("EVENT_BODY");
        sql.SELECT("EVENT_TYPE");
        sql.SELECT("EXECUTE_AT");
        sql.SELECT("INTERVAL_VALUE");
        sql.SELECT("INTERVAL_FIELD");
        sql.SELECT("SQL_MODE");
        sql.SELECT("STARTS");
        sql.SELECT("ENDS");
        sql.SELECT("STATUS");
        sql.SELECT("ON_COMPLETION");
        sql.SELECT("CREATED");
        sql.SELECT("LAST_ALTERED");
        sql.SELECT("LAST_EXECUTED");
        sql.SELECT("EVENT_COMMENT");
        sql.SELECT("ORIGINATOR");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.SELECT("EVENT_DEFINITION");
        sql.FROM("EVENTS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(EventsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("EVENT_CATALOG");
        } else {
            sql.SELECT("EVENT_CATALOG");
        }
        sql.SELECT("EVENT_SCHEMA");
        sql.SELECT("EVENT_NAME");
        sql.SELECT("DEFINER");
        sql.SELECT("TIME_ZONE");
        sql.SELECT("EVENT_BODY");
        sql.SELECT("EVENT_TYPE");
        sql.SELECT("EXECUTE_AT");
        sql.SELECT("INTERVAL_VALUE");
        sql.SELECT("INTERVAL_FIELD");
        sql.SELECT("SQL_MODE");
        sql.SELECT("STARTS");
        sql.SELECT("ENDS");
        sql.SELECT("STATUS");
        sql.SELECT("ON_COMPLETION");
        sql.SELECT("CREATED");
        sql.SELECT("LAST_ALTERED");
        sql.SELECT("LAST_EXECUTED");
        sql.SELECT("EVENT_COMMENT");
        sql.SELECT("ORIGINATOR");
        sql.SELECT("CHARACTER_SET_CLIENT");
        sql.SELECT("COLLATION_CONNECTION");
        sql.SELECT("DATABASE_COLLATION");
        sql.FROM("EVENTS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Events record = (Events) parameter.get("record");
        EventsExample example = (EventsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("EVENTS");
        
        if (record.getEventCatalog() != null) {
            sql.SET("EVENT_CATALOG = #{record.eventCatalog,jdbcType=VARCHAR}");
        }
        
        if (record.getEventSchema() != null) {
            sql.SET("EVENT_SCHEMA = #{record.eventSchema,jdbcType=VARCHAR}");
        }
        
        if (record.getEventName() != null) {
            sql.SET("EVENT_NAME = #{record.eventName,jdbcType=VARCHAR}");
        }
        
        if (record.getDefiner() != null) {
            sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        }
        
        if (record.getTimeZone() != null) {
            sql.SET("TIME_ZONE = #{record.timeZone,jdbcType=VARCHAR}");
        }
        
        if (record.getEventBody() != null) {
            sql.SET("EVENT_BODY = #{record.eventBody,jdbcType=VARCHAR}");
        }
        
        if (record.getEventType() != null) {
            sql.SET("EVENT_TYPE = #{record.eventType,jdbcType=VARCHAR}");
        }
        
        if (record.getExecuteAt() != null) {
            sql.SET("EXECUTE_AT = #{record.executeAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIntervalValue() != null) {
            sql.SET("INTERVAL_VALUE = #{record.intervalValue,jdbcType=VARCHAR}");
        }
        
        if (record.getIntervalField() != null) {
            sql.SET("INTERVAL_FIELD = #{record.intervalField,jdbcType=VARCHAR}");
        }
        
        if (record.getSqlMode() != null) {
            sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        }
        
        if (record.getStarts() != null) {
            sql.SET("STARTS = #{record.starts,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEnds() != null) {
            sql.SET("ENDS = #{record.ends,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getOnCompletion() != null) {
            sql.SET("ON_COMPLETION = #{record.onCompletion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreated() != null) {
            sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastAltered() != null) {
            sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastExecuted() != null) {
            sql.SET("LAST_EXECUTED = #{record.lastExecuted,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEventComment() != null) {
            sql.SET("EVENT_COMMENT = #{record.eventComment,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginator() != null) {
            sql.SET("ORIGINATOR = #{record.originator,jdbcType=BIGINT}");
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
        
        if (record.getEventDefinition() != null) {
            sql.SET("EVENT_DEFINITION = #{record.eventDefinition,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("EVENTS");
        
        sql.SET("EVENT_CATALOG = #{record.eventCatalog,jdbcType=VARCHAR}");
        sql.SET("EVENT_SCHEMA = #{record.eventSchema,jdbcType=VARCHAR}");
        sql.SET("EVENT_NAME = #{record.eventName,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("TIME_ZONE = #{record.timeZone,jdbcType=VARCHAR}");
        sql.SET("EVENT_BODY = #{record.eventBody,jdbcType=VARCHAR}");
        sql.SET("EVENT_TYPE = #{record.eventType,jdbcType=VARCHAR}");
        sql.SET("EXECUTE_AT = #{record.executeAt,jdbcType=TIMESTAMP}");
        sql.SET("INTERVAL_VALUE = #{record.intervalValue,jdbcType=VARCHAR}");
        sql.SET("INTERVAL_FIELD = #{record.intervalField,jdbcType=VARCHAR}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("STARTS = #{record.starts,jdbcType=TIMESTAMP}");
        sql.SET("ENDS = #{record.ends,jdbcType=TIMESTAMP}");
        sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        sql.SET("ON_COMPLETION = #{record.onCompletion,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        sql.SET("LAST_EXECUTED = #{record.lastExecuted,jdbcType=TIMESTAMP}");
        sql.SET("EVENT_COMMENT = #{record.eventComment,jdbcType=VARCHAR}");
        sql.SET("ORIGINATOR = #{record.originator,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        sql.SET("EVENT_DEFINITION = #{record.eventDefinition,jdbcType=LONGVARCHAR}");
        
        EventsExample example = (EventsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("EVENTS");
        
        sql.SET("EVENT_CATALOG = #{record.eventCatalog,jdbcType=VARCHAR}");
        sql.SET("EVENT_SCHEMA = #{record.eventSchema,jdbcType=VARCHAR}");
        sql.SET("EVENT_NAME = #{record.eventName,jdbcType=VARCHAR}");
        sql.SET("DEFINER = #{record.definer,jdbcType=VARCHAR}");
        sql.SET("TIME_ZONE = #{record.timeZone,jdbcType=VARCHAR}");
        sql.SET("EVENT_BODY = #{record.eventBody,jdbcType=VARCHAR}");
        sql.SET("EVENT_TYPE = #{record.eventType,jdbcType=VARCHAR}");
        sql.SET("EXECUTE_AT = #{record.executeAt,jdbcType=TIMESTAMP}");
        sql.SET("INTERVAL_VALUE = #{record.intervalValue,jdbcType=VARCHAR}");
        sql.SET("INTERVAL_FIELD = #{record.intervalField,jdbcType=VARCHAR}");
        sql.SET("SQL_MODE = #{record.sqlMode,jdbcType=VARCHAR}");
        sql.SET("STARTS = #{record.starts,jdbcType=TIMESTAMP}");
        sql.SET("ENDS = #{record.ends,jdbcType=TIMESTAMP}");
        sql.SET("STATUS = #{record.status,jdbcType=VARCHAR}");
        sql.SET("ON_COMPLETION = #{record.onCompletion,jdbcType=VARCHAR}");
        sql.SET("CREATED = #{record.created,jdbcType=TIMESTAMP}");
        sql.SET("LAST_ALTERED = #{record.lastAltered,jdbcType=TIMESTAMP}");
        sql.SET("LAST_EXECUTED = #{record.lastExecuted,jdbcType=TIMESTAMP}");
        sql.SET("EVENT_COMMENT = #{record.eventComment,jdbcType=VARCHAR}");
        sql.SET("ORIGINATOR = #{record.originator,jdbcType=BIGINT}");
        sql.SET("CHARACTER_SET_CLIENT = #{record.characterSetClient,jdbcType=VARCHAR}");
        sql.SET("COLLATION_CONNECTION = #{record.collationConnection,jdbcType=VARCHAR}");
        sql.SET("DATABASE_COLLATION = #{record.databaseCollation,jdbcType=VARCHAR}");
        
        EventsExample example = (EventsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, EventsExample example, boolean includeExamplePhrase) {
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