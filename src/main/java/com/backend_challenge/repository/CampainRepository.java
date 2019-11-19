package com.backend_challenge.repository;

import com.backend_challenge.model.Campain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface CampainRepository extends MongoRepository<Campain, String> {

    @Query("{ 'dateEnd': { $eq : ?0}}")
    List<Campain> findCampainByDateEnd(Date endDate);
}
