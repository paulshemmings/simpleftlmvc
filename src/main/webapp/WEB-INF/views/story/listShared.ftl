<#list sharedStories as sharedStory>
	<div id="${sharedStory["storyId"]}" class="existingStory storyBlock">
		<div class="storyText">
			<div class="sharedStoryCreator" style="display:inline;padding-right:10px;float:left;">
				<img class="friendImage" src="https://graph.facebook.com/${sharedStory["creatorId"]}/picture" />
			</div>
			<div class="sharedStoryText" style="vertical-align:top;display:inline;">
				${sharedStory["storyText"]}
			</div>
		</div>
		
		<div class="commentDisplayChoose">
			<a class="showComments">show comments</a>
		</div>
						
	</div>	
</#list>
