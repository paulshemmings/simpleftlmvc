package com.razor.viewmodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendMap {

	public static List<Map<String,Object>> build(){
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();

        Map<String,Object> item = new HashMap<String,Object>();
        item.put("friendId","10");
        item.put("name", "test friend");
        result.add(item);

		return result;
	}
}
