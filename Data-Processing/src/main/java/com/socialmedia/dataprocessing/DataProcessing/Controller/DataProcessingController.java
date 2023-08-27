package com.socialmedia.dataprocessing.DataProcessing.Controller;


import com.socialmedia.dataprocessing.DataProcessing.DTO.Tweet;
import com.socialmedia.dataprocessing.DataProcessing.DTO.UserDetails;
import com.socialmedia.dataprocessing.DataProcessing.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metrics")
public class DataProcessingController {

    @Autowired
    DataService dataService;

    @GetMapping("/twitter/highest_likes")
    public ResponseEntity<?> getTweetWithHighestLikes(@RequestBody UserDetails userDetails){
        Tweet tweet = dataService.getTweetWithHighestLikes(userDetails);
        return new ResponseEntity<>(tweet,HttpStatus.OK);
    }

    @GetMapping("/twitter/highest_retweets")
    public ResponseEntity<?> getTweetWithHighestRetweets(@RequestBody UserDetails userDetails){
        Tweet tweet = dataService.getTweetWithHighestRetweets(userDetails);
        return new ResponseEntity<>(tweet,HttpStatus.OK);
    }
}
