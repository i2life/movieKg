package com.zhiying.moviekg.impl;

import com.arangodb.ArangoCollection;
import com.arangodb.ArangoDatabase;
import com.arangodb.entity.CollectionType;
import com.arangodb.model.CollectionCreateOptions;
import com.zhiying.moviekg.service.KnowledgeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KnowledgeStoreImpl implements KnowledgeStoreService {
    @Autowired
    private ArangoDatabase arangodb;

    @Override
    public void createCollection(String collectionName, String collectionType) {

        ArangoCollection collection = arangodb.collection(collectionName);
        CollectionCreateOptions options = new CollectionCreateOptions();
        if (collectionType.equals("document")) {

            collection.create(options.type(CollectionType.DOCUMENT));
        } else {
            collection.create(options.type(CollectionType.EDGES));
        }
    }
}
