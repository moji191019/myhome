package com.moji.home.dao;

import com.moji.home.dto.MemberDTO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface MemberDAO {
    List<MemberDTO> findAll() throws Exception;
    MemberDTO findMember(@Param("key1") String key1) throws Exception;

    void insertMember(MemberDTO memberDTO) throws Exception;
}