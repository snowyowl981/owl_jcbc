package com.owl.jdbc.raw;

import java.util.List;

public interface ArticleDao {
	/**  목록 **/
	List<Article> listArticles();
	
	/** 조회 **/
	Article getArticle(String articleId);
	
	void updateArticle(Article article);

	void addArticle(Article article);

	void deleteArticle(String articleId);

}
