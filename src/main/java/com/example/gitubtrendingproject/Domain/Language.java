package com.example.gitubtrendingproject.Domain;

import java.util.Dictionary;
import java.util.List;

public class Language {
    private Dictionary<String, List<String>> languageDictinary;

    public Dictionary<String, List<String>> getLanguageDictinary() {
        return languageDictinary;
    }

    public void setLanguageDictinary(Dictionary<String, List<String>> languageDictinary) {
        this.languageDictinary = languageDictinary;
    }
}
