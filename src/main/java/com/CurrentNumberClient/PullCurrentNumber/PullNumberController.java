package com.CurrentNumberClient.PullCurrentNumber;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created on Jan.2019
 *
 * @author Goksu
 */
@RestController
@RequestMapping("/pullNumber")
@RequiredArgsConstructor
public class PullNumberController {

    private final PullNumberService pullNumberService;

    @GetMapping
    public ResponseEntity<Integer> getPullNumber(){
        return pullNumberService.getPullNumber();
    }

}
