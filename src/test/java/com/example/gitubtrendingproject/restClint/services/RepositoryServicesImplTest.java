package com.example.gitubtrendingproject.restClint.services;

import com.example.gitubtrendingproject.Domain.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryServicesImplTest {
    @Autowired
    RepositoryService repositoryService;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRepo() throws Exception {
    List<Item> itemList=repositoryService.getRepo();
    assertEquals(100,itemList.size());
    }
}