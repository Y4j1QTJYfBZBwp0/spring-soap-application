package com.example.soapcrud.service;

import com.example.soapcrud.entity.Article;
import com.example.soapcrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService implements IArticleService{

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public List<Article> getAllArticles() {
        List<Article> list = new ArrayList<>();
        articleRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Article getArticleById(long articleId) {
        return articleRepository.findByArticleId(articleId);
    }

    @Override
    public synchronized boolean addArticle(Article article) {
        List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory());
        if (!list.isEmpty()) {
            return false;
        } else {
            articleRepository.save(article);
            return true;
        }
    }

    @Override
    public void updateArticle(Article article) {
        this.articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Article article) {
        this.articleRepository.delete(article);
    }
}
