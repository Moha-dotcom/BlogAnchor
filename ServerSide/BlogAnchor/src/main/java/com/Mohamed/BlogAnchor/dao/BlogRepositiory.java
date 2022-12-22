package com.Mohamed.BlogAnchor.dao;

import com.Mohamed.BlogAnchor.Modal.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepositiory extends MongoRepository<String, Blog> {
}
