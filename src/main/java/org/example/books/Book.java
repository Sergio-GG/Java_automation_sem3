package org.example.books;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "bibleId",
        "abbreviation",
        "name",
        "nameLong"
})

public class Book {

    @JsonProperty("id")
    private String id;
    @JsonProperty("bibleId")
    private String bibleId;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameLong")
    private String nameLong;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("bibleId")
    public String getBibleId() {
        return bibleId;
    }

    @JsonProperty("bibleId")
    public void setBibleId(String bibleId) {
        this.bibleId = bibleId;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameLong")
    public String getNameLong() {
        return nameLong;
    }

    @JsonProperty("nameLong")
    public void setNameLong(String nameLong) {
        this.nameLong = nameLong;
    }


}
