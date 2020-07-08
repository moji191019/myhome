package com.moji.home.controller.member;

import com.moji.home.dto.member.MemberDTO;
import com.moji.home.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = {"http://localhost:3001"})
@RestController
@RequestMapping("/service/member")
public class MemberController {

    // DB Connection Search
    @Autowired
    public MemberService memberService;

    //localhost:3000/member/find
    @RequestMapping(method = RequestMethod.POST, value = "/find")
    public @ResponseBody List<MemberDTO> getAllMember() throws Exception{
        return memberService.findAll();
    }

    //localhost:3000/member/find/{key1}
    @RequestMapping(method = RequestMethod.GET, value = "/find/{key1}")
    public @ResponseBody MemberDTO getMember(@PathVariable(value="key1") String key1) throws Exception {
        return memberService.findMember(key1);
    }

    @RequestMapping(method = RequestMethod.POST, value="/add")
    public void addMember(@RequestBody MemberDTO memberDTO) throws Exception {
        memberService.addMember(memberDTO);
    }
}
