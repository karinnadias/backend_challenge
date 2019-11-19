package com.backend_challenge.services;

import com.backend_challenge.model.Campain;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface CampainService {

    List<Campain> listAll();

    Optional<Campain> listById(String id);

    List<Campain> findEndDate(Date endDate);

    Campain create(Campain complain);

    Campain update(Campain complain);

    void remove(String id);


}
