package com.soft1851.files;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
/**
 * @author wususu
 * @date 2020/11/23 23:10
 */
@Component
public class GridConfig {
    @Value("${spring.data.mongodb.database}")
    private String mongodb;

    /**
     *
     * @param mongoClient
     * @return
     */
    @Bean
    public GridFSBucket gridFSBucket(MongoClient mongoClient) {
        System.out.println(mongodb);
        System.out.println(mongodb);
        System.out.println(mongodb);
        System.out.println(mongodb);
        System.out.println(mongodb);
        MongoDatabase mongoDatabase = mongoClient.getDatabase(mongodb);
        return GridFSBuckets.create(mongoDatabase);
    }
}