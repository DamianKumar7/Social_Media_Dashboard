package com.trendogram.DataCollectionMicroService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trendogram.DataCollectionMicroService.Entities.SocialMediaPostEntity;

@Repository
public interface SocialMediaPostRepository extends JpaRepository<SocialMediaPostEntity , Long> {
    
}
