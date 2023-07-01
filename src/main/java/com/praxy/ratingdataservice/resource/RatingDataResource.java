package com.praxy.ratingdataservice.resource;

import com.praxy.ratingdataservice.model.Rating;
import com.praxy.ratingdataservice.model.UserRating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratings")
public class RatingDataResource {

    Logger log = LoggerFactory.getLogger(RatingDataResource.class);

    @GetMapping("/{userId}")
    public UserRating getRating(@PathVariable("userId") String userID){
        log.info("Rating data service called for {}", userID);
        return new UserRating(Arrays.asList(new Rating("1234", 3), new Rating("4567", 4)));
    }
}
