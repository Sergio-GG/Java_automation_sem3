package org.example.passages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "orgId",
        "bibleId",
        "bookId",
        "chapterIds",
        "reference",
        "content",
        "verseCount",
        "copyright"
})

public class Passage {

    @JsonProperty("id")
    private String id;
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("bibleId")
    private String bibleId;
    @JsonProperty("bookId")
    private String bookId;
    @JsonProperty("chapterIds")
    private List<String> chapterIds;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("content")
    private String content;
    @JsonProperty("verseCount")
    private Integer verseCount;
    @JsonProperty("copyright")
    private String copyright;

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

    @JsonProperty("bibleId")
    public String getBibleId() {
        return bibleId;
    }

    @JsonProperty("bibleId")
    public void setBibleId(String bibleId) {
        this.bibleId = bibleId;
    }

    @JsonProperty("bookId")
    public String getBookId() {
        return bookId;
    }

    @JsonProperty("bookId")
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @JsonProperty("chapterIds")
    public List<String> getChapterIds() {
        return chapterIds;
    }

    @JsonProperty("chapterIds")
    public void setChapterIds(List<String> chapterIds) {
        this.chapterIds = chapterIds;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("verseCount")
    public Integer getVerseCount() {
        return verseCount;
    }

    @JsonProperty("verseCount")
    public void setVerseCount(Integer verseCount) {
        this.verseCount = verseCount;
    }

    @JsonProperty("copyright")
    public String getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

}