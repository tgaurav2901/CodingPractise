package model.jsonProcessing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Projections {

    @JsonProperty("table")
    private String table;
    @JsonProperty("column")
    private String column;

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


}

