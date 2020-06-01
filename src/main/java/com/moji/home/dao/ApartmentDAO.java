package com.moji.home.dao;

import java.util.List;

import com.moji.home.dto.ApartmentDTO;

import org.apache.ibatis.annotations.Param;

public interface ApartmentDAO {
    List<ApartmentDTO> findApartment(@Param("keyword") String keyword) throws Exception;
}