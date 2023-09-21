package com.atlas.dynamodb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.atlas.dynamodb.entity.Person;

@Repository
public class PersonRepo {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public List<Person> findAll() {
        return dynamoDBMapper.scan(Person.class, new DynamoDBScanExpression());
    }

}
