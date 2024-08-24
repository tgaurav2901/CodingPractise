package com.gaurav.CodingPractical;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.jsonProcessing.QueryBulider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingPracticalApplication {

	public static void main(String[] args) throws JsonProcessingException {
		String jsonInput = """
                {
                  "tables": [
                    "user"
                  ],
                  "projections": [
                    {
                      "table": "user",
                      "column": "name"
                    }
                  ],
                  "filters": [
                    {
                      "table": "user",
                      "column": "age",
                      "value": 30
                    }
                  ]
                }
                """;
		ObjectMapper mapper = new ObjectMapper();
		QueryBulider query = mapper.readValue(jsonInput, QueryBulider.class);
		System.out.println(query.getProjections().get(0).getTable()+" " +query.getFilters().get(0).getTable()+" "+ query.getTables().get(0)+" "+ query.getFilters().get(0).getValue());
		SpringApplication.run(CodingPracticalApplication.class, args);
	}

}
