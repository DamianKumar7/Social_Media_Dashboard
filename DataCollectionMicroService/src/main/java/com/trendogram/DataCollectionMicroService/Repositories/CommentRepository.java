package com.trendogram.DataCollectionMicroService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trendogram.DataCollectionMicroService.Entities.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
    
}
