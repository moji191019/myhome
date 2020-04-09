package com.moji.home.service;

import com.moji.home.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberMapper {

    @Select("select * from test2")
    List<Member> findAll();

    @Select("select * from test2 where key1 = #{key1}")
    Member findMember(@Param("key1") String key1);

}
