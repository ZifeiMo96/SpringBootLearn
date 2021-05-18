package com.example.demo.data.model;

public class CheckConstraints {
    private String constraintCatalog;

    private String constraintSchema;

    private String tableName;

    private String constraintName;

    private String checkClause;

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog == null ? null : constraintCatalog.trim();
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema == null ? null : constraintSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    public String getCheckClause() {
        return checkClause;
    }

    public void setCheckClause(String checkClause) {
        this.checkClause = checkClause == null ? null : checkClause.trim();
    }
}