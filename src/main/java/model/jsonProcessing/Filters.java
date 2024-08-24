package model.jsonProcessing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Filters {

    @JsonProperty("table")
    private String table;
    @JsonProperty("column")
    private String column;
    @JsonProperty("value")
    private int value;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }




}
