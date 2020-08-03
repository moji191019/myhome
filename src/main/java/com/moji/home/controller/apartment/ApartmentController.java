package com.moji.home.controller.apartment;

import java.util.List;

import com.moji.home.dto.apartment.ApartmentDTO;
import com.moji.home.dto.request.ReqDTO;
import com.moji.home.service.apartment.ApartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/service/apart")
public class ApartmentController {

    @Autowired
    public ApartmentService ApartmentService;

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public @ResponseBody List<ApartmentDTO> getApartment(@RequestBody ReqDTO reqDTO) throws Exception {
        return ApartmentService.findApartment(reqDTO);
    }
    
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public void addApartment() throws Exception {
        ApartmentService.addApartments();
    }
}