package com.example.demo.data.model;

public class TableStatistics {
    private String tableSchema;

    private String tableName;

    private Long rowsRead;

    private Long rowsChanged;

    private Long rowsChangedXIndexes;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public Long getRowsRead() {
        return rowsRead;
    }

    public void setRowsRead(Long rowsRead) {
        this.rowsRead = rowsRead;
    }

    public Long getRowsChanged() {
        return rowsChanged;
    }

    public void setRowsChanged(Long rowsChanged) {
        this.rowsChanged = rowsChanged;
    }

    public Long getRowsChangedXIndexes() {
        return rowsChangedXIndexes;
    }

    public void setRowsChangedXIndexes(Long rowsChangedXIndexes) {
        this.rowsChangedXIndexes = rowsChangedXIndexes;
    }
}