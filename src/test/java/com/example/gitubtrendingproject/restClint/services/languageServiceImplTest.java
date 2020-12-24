package com.example.gitubtrendingproject.restClint.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class languageServiceImplTest {
    @Autowired
languageService languageService;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getLang() {
        Map<String, List<String>>stringListMap=languageService.languageMap();
        assertEquals(10,stringListMap.size());
    }
    @Test
    public void getRepoByLang() {
        List<String> stringListMap=languageService.languageMap("python");
        assertEquals(4,stringListMap.size());
    }


}