package com.moji.home;

import com.moji.home.model.Member;
import com.moji.home.service.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /* get all member list. 2020.04.10 / mosj */
    @Autowired
    MemberMapper memberMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/test3")
    @ResponseBody
    public List<Member> getAllMember() {
        return memberMapper.findAll();
    }
    /* get all member list end. */

    @RequestMapping(method = RequestMethod.GET, value = "/test4")
    @ResponseBody
    public Member getMember() {
        /*requestBody.*/
        /*requestbody나 requestparam을 받아서 할 수 있지 않을까? */
        //String req = requestParam.value();
        //System.out.println("#### req: "+req);
        return memberMapper.findMember("mo1");
    }


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