package com.example.gitubtrendingproject.restClint.services;

import com.example.gitubtrendingproject.Domain.Item;
import org.apache.catalina.valves.rewrite.InternalRewriteMap;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class languageServiceImpl implements languageService {
    RepositoryServicesImpl repositoryServices;

    public languageServiceImpl(RepositoryServicesImpl repositoryServices) {
        this.repositoryServices = repositoryServices;
    }

    @Override
    public Map<String, List<String>> languageMap() {
        List<Item>items=repositoryServices.getRepo();
        Map<String, List<String>> langList = new HashMap<>();

        for(Item item:items)
        {
            if (item.getLanguage()!=null && langList.containsKey(item.getLanguage())) {
                langList.get(item.getLanguage()).add(item.getUrl());
            } else if (item.getLanguage()!=null && !langList.containsKey(item.getLanguage())) {

                langList.put(item.getLanguage().toString(), new ArrayList<String>());
                langList.get(item.getLanguage()).add(item.getUrl());
            }
        }
        return langList;
    }

    @Override
    public  List<String> languageMap(String language) {
        List<Item>items=repositoryServices.getRepo();
        List<String> langList=new ArrayList<>();
        for(Item item:items) {

            if (item.getLanguage()!=null && item.getLanguage().toString().toUpperCase().equals(language.toString().toUpperCase())) {
                langList.add(item.getUrl());
        }}
        return langList;    }
}
