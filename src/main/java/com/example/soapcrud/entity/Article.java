package com.example.soapcrud.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="articles")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="article_id")
    private long articleId;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
