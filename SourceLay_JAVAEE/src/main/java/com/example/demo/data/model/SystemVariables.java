package com.example.demo.data.model;

public class SystemVariables {
    private String variableName;

    private String sessionValue;

    private String globalValue;

    private String globalValueOrigin;

    private String defaultValue;

    private String variableScope;

    private String variableType;

    private String variableComment;

    private String numericMinValue;

    private String numericMaxValue;

    private String numericBlockSize;

    private String readOnly;

    private String commandLineArgument;

    private String enumValueList;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    public String getSessionValue() {
        return sessionValue;
    }

    public void setSessionValue(String sessionValue) {
        this.sessionValue = sessionValue == null ? null : sessionValue.trim();
    }

    public String getGlobalValue() {
        return globalValue;
    }

    public void setGlobalValue(String globalValue) {
        this.globalValue = globalValue == null ? null : globalValue.trim();
    }

    public String getGlobalValueOrigin() {
        return globalValueOrigin;
    }

    public void setGlobalValueOrigin(String globalValueOrigin) {
        this.globalValueOrigin = globalValueOrigin == null ? null : globalValueOrigin.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public String getVariableScope() {
        return variableScope;
    }

    public void setVariableScope(String variableScope) {
        this.variableScope = variableScope == null ? null : variableScope.trim();
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType == null ? null : variableType.trim();
    }

    public String getVariableComment() {
        return variableComment;
    }

    public void setVariableComment(String variableComment) {
        this.variableComment = variableComment == null ? null : variableComment.trim();
    }

    public String getNumericMinValue() {
        return numericMinValue;
    }

    public void setNumericMinValue(String numericMinValue) {
        this.numericMinValue = numericMinValue == null ? null : numericMinValue.trim();
    }

    public String getNumericMaxValue() {
        return numericMaxValue;
    }

    public void setNumericMaxValue(String numericMaxValue) {
        this.numericMaxValue = numericMaxValue == null ? null : numericMaxValue.trim();
    }

    public String getNumericBlockSize() {
        return numericBlockSize;
    }

    public void setNumericBlockSize(String numericBlockSize) {
        this.numericBlockSize = numericBlockSize == null ? null : numericBlockSize.trim();
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly == null ? null : readOnly.trim();
    }

    public String getCommandLineArgument() {
        return commandLineArgument;
    }

    public void setCommandLineArgument(String commandLineArgument) {
        this.commandLineArgument = commandLineArgument == null ? null : commandLineArgument.trim();
    }

    public String getEnumValueList() {
        return enumValueList;
    }

    public void setEnumValueList(String enumValueList) {
        this.enumValueList = enumValueList == null ? null : enumValueList.trim();
    }
}