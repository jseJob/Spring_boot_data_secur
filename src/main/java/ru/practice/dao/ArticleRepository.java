package ru.practice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.practice.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}