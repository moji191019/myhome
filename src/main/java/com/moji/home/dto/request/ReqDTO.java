package com.moji.home.dto.request;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReqDTO {
    String serviceID;
    HashMap<String, Object> req;
    HashMap<String, Object> res;
}