package com.example.demo.data.model;

public class GeometryColumns {
    private String fTableCatalog;

    private String fTableSchema;

    private String fTableName;

    private String fGeometryColumn;

    private String gTableCatalog;

    private String gTableSchema;

    private String gTableName;

    private String gGeometryColumn;

    private Byte storageType;

    private Integer geometryType;

    private Byte coordDimension;

    private Byte maxPpr;

    private Short srid;

    public String getfTableCatalog() {
        return fTableCatalog;
    }

    public void setfTableCatalog(String fTableCatalog) {
        this.fTableCatalog = fTableCatalog == null ? null : fTableCatalog.trim();
    }

    public String getfTableSchema() {
        return fTableSchema;
    }

    public void setfTableSchema(String fTableSchema) {
        this.fTableSchema = fTableSchema == null ? null : fTableSchema.trim();
    }

    public String getfTableName() {
        return fTableName;
    }

    public void setfTableName(String fTableName) {
        this.fTableName = fTableName == null ? null : fTableName.trim();
    }

    public String getfGeometryColumn() {
        return fGeometryColumn;
    }

    public void setfGeometryColumn(String fGeometryColumn) {
        this.fGeometryColumn = fGeometryColumn == null ? null : fGeometryColumn.trim();
    }

    public String getgTableCatalog() {
        return gTableCatalog;
    }

    public void setgTableCatalog(String gTableCatalog) {
        this.gTableCatalog = gTableCatalog == null ? null : gTableCatalog.trim();
    }

    public String getgTableSchema() {
        return gTableSchema;
    }

    public void setgTableSchema(String gTableSchema) {
        this.gTableSchema = gTableSchema == null ? null : gTableSchema.trim();
    }

    public String getgTableName() {
        return gTableName;
    }

    public void setgTableName(String gTableName) {
        this.gTableName = gTableName == null ? null : gTableName.trim();
    }

    public String getgGeometryColumn() {
        return gGeometryColumn;
    }

    public void setgGeometryColumn(String gGeometryColumn) {
        this.gGeometryColumn = gGeometryColumn == null ? null : gGeometryColumn.trim();
    }

    public Byte getStorageType() {
        return storageType;
    }

    public void setStorageType(Byte storageType) {
        this.storageType = storageType;
    }

    public Integer getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(Integer geometryType) {
        this.geometryType = geometryType;
    }

    public Byte getCoordDimension() {
        return coordDimension;
    }

    public void setCoordDimension(Byte coordDimension) {
        this.coordDimension = coordDimension;
    }

    public Byte getMaxPpr() {
        return maxPpr;
    }

    public void setMaxPpr(Byte maxPpr) {
        this.maxPpr = maxPpr;
    }

    public Short getSrid() {
        return srid;
    }

    public void setSrid(Short srid) {
        this.srid = srid;
    }
}