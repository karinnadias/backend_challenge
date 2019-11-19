package com.backend_challenge.services.impl;


import com.backend_challenge.model.Campain;
import com.backend_challenge.repository.CampainRepository;
import com.backend_challenge.services.CampainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CampainServiceImpl implements CampainService {

    @Autowired
    private CampainRepository campainRespository;


    @Override
    public List<Campain> listAll() {
        return this.campainRespository.findAll();

    }

    @Override
    public Optional<Campain> listById(String id) {
        return this.campainRespository.findById(id);
    }


    @Override
    public Campain create(Campain complain) {
        return this.campainRespository.save(complain);
    }

    @Override
    public Campain update(Campain complain) {
        return this.campainRespository.save(complain);
    }

    @Override
    public void remove(String id) {
        this.campainRespository.deleteById(id);
    }

    @Override
    public List<Campain> findEndDate(Date endDate){
        return this.campainRespository.findCampainByDateEnd(endDate);
    }
}

