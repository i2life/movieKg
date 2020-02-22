package com.zhiying.moviekg.service;

import org.springframework.stereotype.Service;

@Service
public interface KnowledgeStoreService {

    void createCollection(String collectionName, String collectionType);
}
