package com.moji.home.service;

import com.moji.home.dao.MemberDAO;
import com.moji.home.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    public MemberDAO memberDAO;

    public List<MemberDTO> findAll() throws Exception {
        return memberDAO.findAll();
    };

    public MemberDTO findMember(String key) throws  Exception {
        return memberDAO.findMember(key);
    };
}
