package com.jetbrains.jamie.photoz.clone;/*
//Jamie Doyle
//20:49:07/12/2023
//Project : 
*/

import com.sun.net.httpserver.HttpsServer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DownloadController {

    private final PhotosService photosService;

    public PhotosController(PhotosService photosService) {
        this.photosService = photosService;
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> download(@PathVariable id){

        byte[] data;
        HttpHeaders header = new HttpHeaders();
        return new ResponseEntity<>(data, headers, HttpsStatus.OK);
    }

}//class
