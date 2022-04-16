package com.example.demo;
import com.alibaba.fastjson.JSON;
import com.example.demo.service.PersonService;
import com.example.demo.entity.Person;
import com.mongodb.client.ListIndexesIterable;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author panzhi
 * @Description
 * @since 2021-01-15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest2 {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 自定义集合，插入文档
     * @throws Exception
     */
    @Test
    public void insertCustomCollection() throws Exception {
        Person person =new Person();
        person.setId(1l);
        person.setUserName("张三");
        person.setPassWord("123456");
        person.setCreateTime(new Date());
        mongoTemplate.insert(person, "custom_person");
    }

 
}










}