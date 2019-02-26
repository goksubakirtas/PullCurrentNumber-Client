package com.CurrentNumberClient.PullCurrentNumber;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created on Jan.2019
 *
 * @author Goksu
 */
@Service
@RequiredArgsConstructor
public class PullNumberService {
     private RestTemplate restTemplate;

     public ResponseEntity<Integer> getPullNumber(){
         restTemplate = new RestTemplate();
         return  restTemplate.getForEntity("http://localhost:8080/createNumber",Integer.class);
     }
}

