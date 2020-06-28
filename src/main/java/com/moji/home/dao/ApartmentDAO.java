package com.moji.home.dao;

import java.util.List;

import com.moji.home.dto.ApartmentDTO;
import com.moji.home.dto.ApartmentDTO2;

import org.apache.ibatis.annotations.Param;

public interface ApartmentDAO {
    List<ApartmentDTO> findApartment(@Param("keyword") String keyword) throws Exception;

	void addApartments(ApartmentDTO apartmentDTO) throws Exception;
	void addApartments2(ApartmentDTO2 apartmentDTO2) throws Exception;
}