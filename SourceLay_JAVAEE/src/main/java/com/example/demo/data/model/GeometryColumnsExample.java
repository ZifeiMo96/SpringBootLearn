package com.example.demo.data.model;

import java.util.ArrayList;
import java.util.List;

public class GeometryColumnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeometryColumnsExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFTableCatalogIsNull() {
            addCriterion("F_TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogIsNotNull() {
            addCriterion("F_TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogEqualTo(String value) {
            addCriterion("F_TABLE_CATALOG =", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogNotEqualTo(String value) {
            addCriterion("F_TABLE_CATALOG <>", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogGreaterThan(String value) {
            addCriterion("F_TABLE_CATALOG >", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("F_TABLE_CATALOG >=", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogLessThan(String value) {
            addCriterion("F_TABLE_CATALOG <", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("F_TABLE_CATALOG <=", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogLike(String value) {
            addCriterion("F_TABLE_CATALOG like", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogNotLike(String value) {
            addCriterion("F_TABLE_CATALOG not like", value, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogIn(List<String> values) {
            addCriterion("F_TABLE_CATALOG in", values, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogNotIn(List<String> values) {
            addCriterion("F_TABLE_CATALOG not in", values, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogBetween(String value1, String value2) {
            addCriterion("F_TABLE_CATALOG between", value1, value2, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableCatalogNotBetween(String value1, String value2) {
            addCriterion("F_TABLE_CATALOG not between", value1, value2, "fTableCatalog");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaIsNull() {
            addCriterion("F_TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaIsNotNull() {
            addCriterion("F_TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaEqualTo(String value) {
            addCriterion("F_TABLE_SCHEMA =", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaNotEqualTo(String value) {
            addCriterion("F_TABLE_SCHEMA <>", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaGreaterThan(String value) {
            addCriterion("F_TABLE_SCHEMA >", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("F_TABLE_SCHEMA >=", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaLessThan(String value) {
            addCriterion("F_TABLE_SCHEMA <", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("F_TABLE_SCHEMA <=", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaLike(String value) {
            addCriterion("F_TABLE_SCHEMA like", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaNotLike(String value) {
            addCriterion("F_TABLE_SCHEMA not like", value, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaIn(List<String> values) {
            addCriterion("F_TABLE_SCHEMA in", values, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaNotIn(List<String> values) {
            addCriterion("F_TABLE_SCHEMA not in", values, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaBetween(String value1, String value2) {
            addCriterion("F_TABLE_SCHEMA between", value1, value2, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableSchemaNotBetween(String value1, String value2) {
            addCriterion("F_TABLE_SCHEMA not between", value1, value2, "fTableSchema");
            return (Criteria) this;
        }

        public Criteria andFTableNameIsNull() {
            addCriterion("F_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFTableNameIsNotNull() {
            addCriterion("F_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFTableNameEqualTo(String value) {
            addCriterion("F_TABLE_NAME =", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameNotEqualTo(String value) {
            addCriterion("F_TABLE_NAME <>", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameGreaterThan(String value) {
            addCriterion("F_TABLE_NAME >", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_TABLE_NAME >=", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameLessThan(String value) {
            addCriterion("F_TABLE_NAME <", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameLessThanOrEqualTo(String value) {
            addCriterion("F_TABLE_NAME <=", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameLike(String value) {
            addCriterion("F_TABLE_NAME like", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameNotLike(String value) {
            addCriterion("F_TABLE_NAME not like", value, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameIn(List<String> values) {
            addCriterion("F_TABLE_NAME in", values, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameNotIn(List<String> values) {
            addCriterion("F_TABLE_NAME not in", values, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameBetween(String value1, String value2) {
            addCriterion("F_TABLE_NAME between", value1, value2, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFTableNameNotBetween(String value1, String value2) {
            addCriterion("F_TABLE_NAME not between", value1, value2, "fTableName");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnIsNull() {
            addCriterion("F_GEOMETRY_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnIsNotNull() {
            addCriterion("F_GEOMETRY_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnEqualTo(String value) {
            addCriterion("F_GEOMETRY_COLUMN =", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnNotEqualTo(String value) {
            addCriterion("F_GEOMETRY_COLUMN <>", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnGreaterThan(String value) {
            addCriterion("F_GEOMETRY_COLUMN >", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnGreaterThanOrEqualTo(String value) {
            addCriterion("F_GEOMETRY_COLUMN >=", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnLessThan(String value) {
            addCriterion("F_GEOMETRY_COLUMN <", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnLessThanOrEqualTo(String value) {
            addCriterion("F_GEOMETRY_COLUMN <=", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnLike(String value) {
            addCriterion("F_GEOMETRY_COLUMN like", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnNotLike(String value) {
            addCriterion("F_GEOMETRY_COLUMN not like", value, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnIn(List<String> values) {
            addCriterion("F_GEOMETRY_COLUMN in", values, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnNotIn(List<String> values) {
            addCriterion("F_GEOMETRY_COLUMN not in", values, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnBetween(String value1, String value2) {
            addCriterion("F_GEOMETRY_COLUMN between", value1, value2, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andFGeometryColumnNotBetween(String value1, String value2) {
            addCriterion("F_GEOMETRY_COLUMN not between", value1, value2, "fGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogIsNull() {
            addCriterion("G_TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogIsNotNull() {
            addCriterion("G_TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogEqualTo(String value) {
            addCriterion("G_TABLE_CATALOG =", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogNotEqualTo(String value) {
            addCriterion("G_TABLE_CATALOG <>", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogGreaterThan(String value) {
            addCriterion("G_TABLE_CATALOG >", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("G_TABLE_CATALOG >=", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogLessThan(String value) {
            addCriterion("G_TABLE_CATALOG <", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("G_TABLE_CATALOG <=", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogLike(String value) {
            addCriterion("G_TABLE_CATALOG like", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogNotLike(String value) {
            addCriterion("G_TABLE_CATALOG not like", value, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogIn(List<String> values) {
            addCriterion("G_TABLE_CATALOG in", values, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogNotIn(List<String> values) {
            addCriterion("G_TABLE_CATALOG not in", values, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogBetween(String value1, String value2) {
            addCriterion("G_TABLE_CATALOG between", value1, value2, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableCatalogNotBetween(String value1, String value2) {
            addCriterion("G_TABLE_CATALOG not between", value1, value2, "gTableCatalog");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaIsNull() {
            addCriterion("G_TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaIsNotNull() {
            addCriterion("G_TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaEqualTo(String value) {
            addCriterion("G_TABLE_SCHEMA =", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaNotEqualTo(String value) {
            addCriterion("G_TABLE_SCHEMA <>", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaGreaterThan(String value) {
            addCriterion("G_TABLE_SCHEMA >", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("G_TABLE_SCHEMA >=", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaLessThan(String value) {
            addCriterion("G_TABLE_SCHEMA <", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("G_TABLE_SCHEMA <=", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaLike(String value) {
            addCriterion("G_TABLE_SCHEMA like", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaNotLike(String value) {
            addCriterion("G_TABLE_SCHEMA not like", value, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaIn(List<String> values) {
            addCriterion("G_TABLE_SCHEMA in", values, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaNotIn(List<String> values) {
            addCriterion("G_TABLE_SCHEMA not in", values, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaBetween(String value1, String value2) {
            addCriterion("G_TABLE_SCHEMA between", value1, value2, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableSchemaNotBetween(String value1, String value2) {
            addCriterion("G_TABLE_SCHEMA not between", value1, value2, "gTableSchema");
            return (Criteria) this;
        }

        public Criteria andGTableNameIsNull() {
            addCriterion("G_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGTableNameIsNotNull() {
            addCriterion("G_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGTableNameEqualTo(String value) {
            addCriterion("G_TABLE_NAME =", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameNotEqualTo(String value) {
            addCriterion("G_TABLE_NAME <>", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameGreaterThan(String value) {
            addCriterion("G_TABLE_NAME >", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("G_TABLE_NAME >=", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameLessThan(String value) {
            addCriterion("G_TABLE_NAME <", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameLessThanOrEqualTo(String value) {
            addCriterion("G_TABLE_NAME <=", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameLike(String value) {
            addCriterion("G_TABLE_NAME like", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameNotLike(String value) {
            addCriterion("G_TABLE_NAME not like", value, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameIn(List<String> values) {
            addCriterion("G_TABLE_NAME in", values, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameNotIn(List<String> values) {
            addCriterion("G_TABLE_NAME not in", values, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameBetween(String value1, String value2) {
            addCriterion("G_TABLE_NAME between", value1, value2, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGTableNameNotBetween(String value1, String value2) {
            addCriterion("G_TABLE_NAME not between", value1, value2, "gTableName");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnIsNull() {
            addCriterion("G_GEOMETRY_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnIsNotNull() {
            addCriterion("G_GEOMETRY_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnEqualTo(String value) {
            addCriterion("G_GEOMETRY_COLUMN =", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnNotEqualTo(String value) {
            addCriterion("G_GEOMETRY_COLUMN <>", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnGreaterThan(String value) {
            addCriterion("G_GEOMETRY_COLUMN >", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnGreaterThanOrEqualTo(String value) {
            addCriterion("G_GEOMETRY_COLUMN >=", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnLessThan(String value) {
            addCriterion("G_GEOMETRY_COLUMN <", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnLessThanOrEqualTo(String value) {
            addCriterion("G_GEOMETRY_COLUMN <=", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnLike(String value) {
            addCriterion("G_GEOMETRY_COLUMN like", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnNotLike(String value) {
            addCriterion("G_GEOMETRY_COLUMN not like", value, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnIn(List<String> values) {
            addCriterion("G_GEOMETRY_COLUMN in", values, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnNotIn(List<String> values) {
            addCriterion("G_GEOMETRY_COLUMN not in", values, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnBetween(String value1, String value2) {
            addCriterion("G_GEOMETRY_COLUMN between", value1, value2, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andGGeometryColumnNotBetween(String value1, String value2) {
            addCriterion("G_GEOMETRY_COLUMN not between", value1, value2, "gGeometryColumn");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("STORAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("STORAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(Byte value) {
            addCriterion("STORAGE_TYPE =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(Byte value) {
            addCriterion("STORAGE_TYPE <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(Byte value) {
            addCriterion("STORAGE_TYPE >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("STORAGE_TYPE >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(Byte value) {
            addCriterion("STORAGE_TYPE <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(Byte value) {
            addCriterion("STORAGE_TYPE <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<Byte> values) {
            addCriterion("STORAGE_TYPE in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<Byte> values) {
            addCriterion("STORAGE_TYPE not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(Byte value1, Byte value2) {
            addCriterion("STORAGE_TYPE between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("STORAGE_TYPE not between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeIsNull() {
            addCriterion("GEOMETRY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeIsNotNull() {
            addCriterion("GEOMETRY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeEqualTo(Integer value) {
            addCriterion("GEOMETRY_TYPE =", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeNotEqualTo(Integer value) {
            addCriterion("GEOMETRY_TYPE <>", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeGreaterThan(Integer value) {
            addCriterion("GEOMETRY_TYPE >", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GEOMETRY_TYPE >=", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeLessThan(Integer value) {
            addCriterion("GEOMETRY_TYPE <", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("GEOMETRY_TYPE <=", value, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeIn(List<Integer> values) {
            addCriterion("GEOMETRY_TYPE in", values, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeNotIn(List<Integer> values) {
            addCriterion("GEOMETRY_TYPE not in", values, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeBetween(Integer value1, Integer value2) {
            addCriterion("GEOMETRY_TYPE between", value1, value2, "geometryType");
            return (Criteria) this;
        }

        public Criteria andGeometryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("GEOMETRY_TYPE not between", value1, value2, "geometryType");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionIsNull() {
            addCriterion("COORD_DIMENSION is null");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionIsNotNull() {
            addCriterion("COORD_DIMENSION is not null");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionEqualTo(Byte value) {
            addCriterion("COORD_DIMENSION =", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionNotEqualTo(Byte value) {
            addCriterion("COORD_DIMENSION <>", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionGreaterThan(Byte value) {
            addCriterion("COORD_DIMENSION >", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionGreaterThanOrEqualTo(Byte value) {
            addCriterion("COORD_DIMENSION >=", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionLessThan(Byte value) {
            addCriterion("COORD_DIMENSION <", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionLessThanOrEqualTo(Byte value) {
            addCriterion("COORD_DIMENSION <=", value, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionIn(List<Byte> values) {
            addCriterion("COORD_DIMENSION in", values, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionNotIn(List<Byte> values) {
            addCriterion("COORD_DIMENSION not in", values, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionBetween(Byte value1, Byte value2) {
            addCriterion("COORD_DIMENSION between", value1, value2, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andCoordDimensionNotBetween(Byte value1, Byte value2) {
            addCriterion("COORD_DIMENSION not between", value1, value2, "coordDimension");
            return (Criteria) this;
        }

        public Criteria andMaxPprIsNull() {
            addCriterion("MAX_PPR is null");
            return (Criteria) this;
        }

        public Criteria andMaxPprIsNotNull() {
            addCriterion("MAX_PPR is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPprEqualTo(Byte value) {
            addCriterion("MAX_PPR =", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprNotEqualTo(Byte value) {
            addCriterion("MAX_PPR <>", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprGreaterThan(Byte value) {
            addCriterion("MAX_PPR >", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprGreaterThanOrEqualTo(Byte value) {
            addCriterion("MAX_PPR >=", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprLessThan(Byte value) {
            addCriterion("MAX_PPR <", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprLessThanOrEqualTo(Byte value) {
            addCriterion("MAX_PPR <=", value, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprIn(List<Byte> values) {
            addCriterion("MAX_PPR in", values, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprNotIn(List<Byte> values) {
            addCriterion("MAX_PPR not in", values, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprBetween(Byte value1, Byte value2) {
            addCriterion("MAX_PPR between", value1, value2, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andMaxPprNotBetween(Byte value1, Byte value2) {
            addCriterion("MAX_PPR not between", value1, value2, "maxPpr");
            return (Criteria) this;
        }

        public Criteria andSridIsNull() {
            addCriterion("SRID is null");
            return (Criteria) this;
        }

        public Criteria andSridIsNotNull() {
            addCriterion("SRID is not null");
            return (Criteria) this;
        }

        public Criteria andSridEqualTo(Short value) {
            addCriterion("SRID =", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotEqualTo(Short value) {
            addCriterion("SRID <>", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridGreaterThan(Short value) {
            addCriterion("SRID >", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridGreaterThanOrEqualTo(Short value) {
            addCriterion("SRID >=", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridLessThan(Short value) {
            addCriterion("SRID <", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridLessThanOrEqualTo(Short value) {
            addCriterion("SRID <=", value, "srid");
            return (Criteria) this;
        }

        public Criteria andSridIn(List<Short> values) {
            addCriterion("SRID in", values, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotIn(List<Short> values) {
            addCriterion("SRID not in", values, "srid");
            return (Criteria) this;
        }

        public Criteria andSridBetween(Short value1, Short value2) {
            addCriterion("SRID between", value1, value2, "srid");
            return (Criteria) this;
        }

        public Criteria andSridNotBetween(Short value1, Short value2) {
            addCriterion("SRID not between", value1, value2, "srid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}