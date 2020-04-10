package com.moji.home.controller;

import com.moji.home.dao.MemberDAO;
import com.moji.home.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3001"})
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "hi intelliJ spring boot!";
    }

    // DB Connection Search
    @Autowired
    public MemberDAO memberDAO;

    @RequestMapping(method = RequestMethod.GET, value = "/test3")
    @ResponseBody
    public List<MemberDTO> getAllMember() throws Exception{
        return memberDAO.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test4")
    @ResponseBody
    public MemberDTO getMember() throws Exception {
        return memberDAO.findMember("mo1");
    }

    // Test Code
    @RequestMapping("test1")
    @ResponseBody
    public Map<String, Object> test1() {
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("key1", "value1");
        ret.put("key2", "value2");

        return ret;
    }

    @RequestMapping("test2")
    @ResponseBody
    public Map<String, Object> test2() {
        Map<String, Object> result = new HashMap<>();
        List<Object> list = new ArrayList<>();

        Map<String, Object> ret1 = new HashMap<String, Object>();
        ret1.put("key1", "value1");
        ret1.put("key2", "value2");
        list.add(ret1);

        Map<String, Object> ret2 = new HashMap<String, Object>();
        ret2.put("key3", "value3");
        ret2.put("key4", "value4");
        list.add(ret2);

        result.put("data",list);

        return result;
    }
}