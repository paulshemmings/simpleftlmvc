package com.razor.builders;

import java.util.Date;
import com.razor.models.Story;

public class StoryBuilder {

	/**
	 * Build a story from the creator, list of shared friends, and the text of the story
	 * @param creatorId
	 * @param friendCsv
	 * @param storyText
	 * @return
	 */
	
	public Story build(Long creatorId, String friendCsv, String storyText){
		return this.build(null, creatorId, friendCsv, storyText);
	}
	
	/**
	 * Build a story from the creator, list of shared friends, and the text of the story
	 * @param story
	 * @param creatorId
	 * @param friendCsv
	 * @param storyText
	 * @return
	 */	
	
	public Story build(Story story, Long creatorId, String friendCsv, String storyText){
		
		if(storyText!=null && !storyText.trim().isEmpty()){
			
			try{
				
				// create story if necessary
				if(story==null){
					story = new Story();
					story.setDateCreated(new Date());	
				} 
				
				// set the details
				
				story.setText(storyText);
				story.setCreatorId(creatorId);
				
				// get the list of friend Ids selected
				if(friendCsv!=null && !friendCsv.trim().isEmpty() ){
					String[] friendList = friendCsv.contains(",") ? friendCsv.split(",") : new String[]{friendCsv};
				}
								
			}catch(Exception ignore){}
		}
		return story;
	}
}
