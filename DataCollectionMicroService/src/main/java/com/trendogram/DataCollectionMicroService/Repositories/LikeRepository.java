package com.trendogram.DataCollectionMicroService.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trendogram.DataCollectionMicroService.Entities.LikeEntity;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, Long>{
    
}
