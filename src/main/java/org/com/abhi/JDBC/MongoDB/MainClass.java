package org.com.abhi.JDBC.MongoDB;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        CodecRegistry pojoCodecRegistry = CodecRegistries.
                fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = CodecRegistries.
                fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),pojoCodecRegistry);
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString).codecRegistry(codecRegistry).build();
        
        try(MongoClient mongoClient = MongoClients.create(clientSettings)){
            MongoDatabase database = mongoClient.getDatabase("Students");
            MongoCollection<Student> productsMongoCollection = database.getCollection("student",Student.class);

            List<Student> productsList = productsMongoCollection.find().into(new ArrayList<>());
            productsList.forEach(System.out::println);

            Student student = new Student();
            student.setId("Naruto");
            student.setName("Uzumaki");
            System.out.println("--------------");
            productsMongoCollection.insertOne(student);
            productsList = productsMongoCollection.find().into(new ArrayList<>());
            productsList.forEach(System.out::println);
        }
    }
}
