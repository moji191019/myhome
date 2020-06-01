package com.moji.home.service;

import java.util.List;

import com.moji.home.dao.ApartmentDAO;
import com.moji.home.dto.ApartmentDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    
    @Autowired
    public ApartmentDAO ApartmentDAO;

    public List<ApartmentDTO> findApartment(String keyword) throws Exception {
        return ApartmentDAO.findApartment(keyword);
    }
}