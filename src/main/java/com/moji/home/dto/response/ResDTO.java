package com.moji.home.dto.response;

import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResDTO {
    String serviceID;
    HashMap<String, Object> req;
    HashMap<String, Object> res;
	public void setRes(String string, HashMap<String, Object> res2) {
        this.res.put(string, res2);
	}
	public Object getRes(String string) {
		return this.res.get(string);
	}
}