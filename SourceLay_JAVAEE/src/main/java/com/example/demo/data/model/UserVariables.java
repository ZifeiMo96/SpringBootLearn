package com.example.demo.data.model;

public class UserVariables {
    private String variableName;

    private String variableValue;

    private String variableType;

    private String characterSetName;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue == null ? null : variableValue.trim();
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType == null ? null : variableType.trim();
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName == null ? null : characterSetName.trim();
    }
}