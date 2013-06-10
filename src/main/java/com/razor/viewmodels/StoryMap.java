package com.razor.viewmodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.razor.handlers.StoryHandler;
import com.razor.models.Story;

public class StoryMap {

	public static List<Map<String,Object>> build(List<Story> stories) throws Exception{
		StoryHandler handler = new StoryHandler();
		List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
		return result;
	}
	
	public static Map<String,Object> build(Story story){
		Map<String,Object> item = new HashMap<String,Object>();
		item.put("creatorId", story.getCreatorId());
		item.put("storyText",story.getText());
        item.put("storyId","dummy-value");
        item.put("friends", FriendMap.build());
		return item;
	}	
	
}
