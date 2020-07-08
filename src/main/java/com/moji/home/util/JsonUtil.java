package com.moji.home.util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class JsonUtil {
    public static HashMap readJsonFileToMap (String path) {
        HashMap<String, String> json = null;
        Gson gson = new Gson();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            json = gson.fromJson(bufferedReader, HashMap.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return json;
    };
}