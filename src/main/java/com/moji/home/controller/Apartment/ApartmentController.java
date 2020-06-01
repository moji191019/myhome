package com.moji.home.controller.Apartment;

import java.util.HashMap;
import java.util.List;

import com.moji.home.dto.ApartmentDTO;
import com.moji.home.dto.KeywordDTO;
import com.moji.home.service.ApartmentService;

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

    @RequestMapping(value="/find", method=RequestMethod.POST)
    public @ResponseBody List<ApartmentDTO> requestMethodName(@RequestBody HashMap<String, String> key) throws Exception {
        return ApartmentService.findApartment(key.get("keyword"));
    }
    
}