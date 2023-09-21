package com.social.socialattributes.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.social.socialattributes.entity.Actions;

@Repository
public class SocialRepo {
    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Actions save(Actions social) {
        dynamoDBMapper.save(social);
        return social;
    }

    public Actions getpostbyId(String postId) {
        return dynamoDBMapper.load(Actions.class, postId);
    }

    public String delete(String postId) {
        Actions act = dynamoDBMapper.load(Actions.class, postId);
        dynamoDBMapper.delete(act);
        return "Post Deleted!";
    }

    public String update(String postId, Actions social) {
        dynamoDBMapper.save(social,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("postId",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(postId))));
        return postId;
    }

}
