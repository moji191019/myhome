package com.moji.home.dao.apartment;

import com.moji.home.dto.apartment.ApartmentDTO;
import com.moji.home.dto.apartment.ApartmentDTO2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApartmentDAO {
    List<ApartmentDTO> findApartment(@Param("keyword") String keyword) throws Exception;

	void addApartments(ApartmentDTO apartmentDTO) throws Exception;
	void addApartments2(ApartmentDTO2 apartmentDTO2) throws Exception;
}