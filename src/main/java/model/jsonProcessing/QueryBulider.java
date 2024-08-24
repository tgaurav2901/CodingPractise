package model.jsonProcessing;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class QueryBulider {

    @JsonProperty("tables")
    private List<String>tables;
    @JsonProperty("projections")
    private List<Projections>projections;
    @JsonProperty("filters")
    private List<Filters> filters;

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    public List<Projections> getProjections() {
        return projections;
    }

    public void setProjections(List<Projections> projections) {
        this.projections = projections;
    }

    public List<Filters> getFilters() {
        return filters;
    }

    public void setFilters(List<Filters> filters) {
        this.filters = filters;
    }
}

