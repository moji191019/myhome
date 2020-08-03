package com.moji.home.service.apartment;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.moji.home.dao.apartment.ApartmentDAO;
import com.moji.home.dto.apartment.ApartmentDTO;
import com.moji.home.dto.apartment.ApartmentDTO2;
import com.moji.home.dto.request.ReqDTO;
import com.moji.home.dto.response.ResDTO;
import com.moji.home.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApartmentService {
    
    @Autowired
    public ApartmentDAO ApartmentDAO;

    public List<ApartmentDTO> findApartment(ReqDTO reqDTO) throws Exception {
        ResDTO resDTO = new ResDTO();
        List<ApartmentDTO> list = ApartmentDAO.findApartment(reqDTO);
        HashMap<String, Object> res = new HashMap<>();
        res.put("data", list);
        System.out.println(res.get("data"));
        // for(ApartmentDTO apt : list) {
        //     resDTO.setRes("data", apt);
        // }
        System.out.println("  ###### list: "+list.size());
        System.out.println(list.get(0));
        
        return list;
    }

	public void addApartments() throws Exception {
        ApartmentDTO apartmentDTO = new ApartmentDTO();
        ApartmentDTO2 apartmentDTO2 = new ApartmentDTO2();
        
        // json file을 읽어서 gson으로 객체변환하고 insert
        String filename = "C:\\Users\\tjdwh\\Downloads\\seoul_apt_info.json";

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(filename));
        System.out.println("######## JsonReader: " + reader.toString());
        Map<String, Object> apartmentMap = JsonUtil.createHashMapFromJsonString(reader.toString());

//        Type ApartmentDTOListType = new TypeToken<ArrayList<ApartmentDTO>>() {}.getType();
//        Type ApartmentDTOListType2 = new TypeToken<ArrayList<ApartmentDTO2>>() {}.getType();
//        ArrayList<ApartmentDTO> ApartmentArray= gson.fromJson(reader, ApartmentDTOListType);
//        ArrayList<ApartmentDTO2> ApartmentArray2= gson.fromJson(reader, ApartmentDTOListType2);
//
//        for (ApartmentDTO apartment : ApartmentArray) {
//            System.out.println(apartment);
//        }
//        for (ApartmentDTO2 apartment : ApartmentArray2) {
//            System.out.println(apartment);
//        }

        // List<ApartmentDTO> data = gson.fromJson(reader, ApartmentDTO.class);
        // List<ApartmentDTO2> data2 = gson.fromJson(reader, ApartmentDTO2.class);
        //ApartmentDAO.addApartments2(apartmentDTO2);
        //ApartmentDAO.addApartments(apartmentDTO);
	}
}