package com.trendogram.DataCollectionMicroService.Repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.trendogram.DataCollectionMicroService.Entities.User;

@FeignClient(name = "user-access-management") // Replace with the actual service name
public interface UserFeignClient {

    @GetMapping("/users/{username}")
    User getUserByUsername(@PathVariable String username);
}
