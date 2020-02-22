package com.zhiying.moviekg.api;

import com.zhiying.moviekg.service.KnowledgeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/arango/collection")
public class CreateArangodbCollectionServlet {
    @Autowired
    private KnowledgeStoreService knowledgeStoreService;

    @RequestMapping(value = "/create")
    public void createArangoCollection(String collectionName, String collectionType) {
        knowledgeStoreService.createCollection(collectionName, collectionType);

    }
}
