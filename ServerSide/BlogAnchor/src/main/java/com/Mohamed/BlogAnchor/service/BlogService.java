package com.Mohamed.BlogAnchor.service;

import com.Mohamed.BlogAnchor.dao.BlogRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    BlogRepositiory blogRepositiory;
}
