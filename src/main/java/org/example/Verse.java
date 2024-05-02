package org.example;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "orgId",
        "bookId",
        "bibleId",
        "chapterId",
        "reference",
        "text"
})

public class Verse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("bookId")
    private String bookId;
    @JsonProperty("bibleId")
    private String bibleId;
    @JsonProperty("chapterId")
    private String chapterId;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("text")
    private String text;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("orgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("orgId")
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("bookId")
    public String getBookId() {
        return bookId;
    }

    @JsonProperty("bookId")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @JsonProperty("bibleId")
    public String getBibleId() {
        return bibleId;
    }

    @JsonProperty("bibleId")
    public void setBibleId(String bibleId) {
        this.bibleId = bibleId;
    }

    @JsonProperty("chapterId")
    public String getChapterId() {
        return chapterId;
    }

    @JsonProperty("chapterId")
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

}

