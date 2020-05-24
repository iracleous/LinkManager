package gr.codehub.linkmanager.entities;

import java.util.Date;
import java.util.List;

public class Link {
    private String url;
    private String description;
    private List<String> keywords;
    private Date creationDate;
    private String author;
    private boolean  visited;
    private int visitTimes;
    private String category;

    public Link(String url, String description, List<String> keywords, Date creationDate, String author, boolean visited, int visitTimes) {
        this.url = url;
        this.description = description;
        this.keywords = keywords;
        this.creationDate = creationDate;
        this.author = author;
        this.visited = visited;
        this.visitTimes = visitTimes;
    }

    public Link() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(int visitTimes) {
        this.visitTimes = visitTimes;
    }
}

