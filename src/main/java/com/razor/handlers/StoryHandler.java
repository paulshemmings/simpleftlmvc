package com.razor.handlers;

import java.util.ArrayList;
import java.util.List;
import com.razor.models.Story;

/**
 * Recorded Story Handler 
 * @author paulhemmings
 */

public class StoryHandler {
	
	public static final String COMPLETED_SUCCESSFULLY = "Success";
	
	/**
	 * Get all storyFriend rows where you are the friend, thus getting
	 * all the stories that are shared with you.
	 * @param friendId
	 * @return
	 * @throws Exception 
	 */
	
	public List<Story> listSharedStories(long friendId) throws Exception{
		return new ArrayList<Story>();
	}
		
	/**
	 * Get all the users Stories
	 * @param creatorId
	 * @return
	 */
	
	public List<Story> listStoriesByCreatorId(long creatorId){
		List<Story> results = new ArrayList<Story>();

        Story story = new Story();
        story.setText("test story");
        results.add(story);

		return results;
	}
		
	/**
	 * Upsert Story
	 * @param recordedStory
	 */
	
	public String upsertRecordedStory(Story recordedStory){		
		String message = "";
        return message;
	}
	
	/**
	 * Get an individual story
	 * @param storyId
	 * @return
	 * @throws Exception 
	 */
	
	public Story getStory(String storyId) throws Exception{
		Story existingStory = null;
		return existingStory;
	}


	/**
	 * Delete Story
	 * @param storyId
	 */
	
	public void deleteRecordedStory(String storyId){
	}
	
	

}
