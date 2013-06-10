<div id="${storyId}" class="existingStory storyBlock">
	<div class="storyText" contenteditable="true">
		${storyText}
	</div>
	<ul class="storySharedList">
		<#list friends as friend>
			<li class="friendItem attached" id="${friend["friendId"]}">
				<img class="friendImage" src="https://graph.facebook.com/${friend["friendId"]}/picture" />
			</li>			
		</#list>						
	</ul>
	<div class="storeStoryChooser"><a class="cancel">Cancel</a> | <a class="store">Store</a></div>
		
</div>	