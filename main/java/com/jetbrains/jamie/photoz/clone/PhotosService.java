package com.jetbrains.jamie.photoz.clone;/*
//Jamie Doyle
//20:56:07/12/2023
//Project : 
*/

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PhotosService {

    private Map<String, Photo> db = new HashMap<>(){{
        put("1",new Photo("1","hello.jpeg"));
    }};

    public Collection<Photo> get() {
        return db.values();
    }

    public Photo get(String id) {
        return db.get(id);
    }

    public Photo remove(String id) {
        return db.remove();
    }

    public void put(String id, Photo photo) {
        return db.put();
    }
}//class
