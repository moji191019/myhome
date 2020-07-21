package com.moji.home.dto.request;

import java.util.HashMap;

import lombok.Getter;

@Getter
public class ReqDTO {
    String serviceID;
    HashMap<String, Object> req;
    HashMap<String, Object> res;
}