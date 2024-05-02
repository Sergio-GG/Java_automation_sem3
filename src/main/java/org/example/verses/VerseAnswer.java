package org.example.verses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "orgId",
        "bookId",
        "chapterId",
        "bibleId",
        "reference",
        "content",
        "verseCount",
        "copyright",
        "next",
        "previous"
})

public class VerseAnswer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("orgId")
    private String orgId;
    @JsonProperty("bookId")
    private String bookId;
    @JsonProperty("chapterId")
    private String chapterId;
    @JsonProperty("bibleId")
    private String bibleId;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("content")
    private String content;
    @JsonProperty("verseCount")
    private Integer verseCount;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("next")
    private Next next;
    @JsonProperty("previous")
    private Previous previous;

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

    @JsonProperty("chapterId")
    public String getChapterId() {
        return chapterId;
    }

    @JsonProperty("chapterId")
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    @JsonProperty("bibleId")
    public String getBibleId() {
        return bibleId;
    }

    @JsonProperty("bibleId")
    public void setBibleId(String bibleId) {
        this.bibleId = bibleId;
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

    @JsonProperty("next")
    public Next getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(Next next) {
        this.next = next;
    }

    @JsonProperty("previous")
    public Previous getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(Previous previous) {
        this.previous = previous;
    }

}

