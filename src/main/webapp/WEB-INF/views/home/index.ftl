<#import "/layout/homeLayout.ftl" as layout>

<@layout.mainLayout>

	<div id="mainPage">
	
		<div id="signed_request" style="display:none;">${signedrequest}</div>
		
		<div id="friendSection" class="docked">		
			<p id="friendHelp">
				Find your friends, click on them to add them
				to a story.
			</p>		
			<input type="text" id="friendFilter" />			
			<ul id="friendContainer">
				<li class="friendItem" data-name="paul" id="1">
					<img src="" id="" />
				</li>
				<li class="friendItem" data-name="ali" id="3">
					<img src="" id="" />
				</li>
				<li class="friendItem" data-name="tyler" id="4">
					<img src="" id="" />
				</li>
				<li class="friendItem" data-name="aiden" id="5">
					<img src="" id="" />
				</li>					
			</<ul>			
		</div>	

		<div id="mainStoryBlock">
				
			<div id="storyHelp">
				<p>
				    A simple MVC framework, using Freemarker to generate the dynamic HTML. This example has friends, and stories.
				</p>
			</div>
						
			<div class="storySection storyBlock newStory">		
				<div class="storyText readwrite" contenteditable="true" >
					Tell your story here...
				</div>
				<ul class="storySharedList">					
				</ul>
				<div class="storeStoryChooser newStoryIeHack"><a class="cancel">Cancel</a> | <a class="store">Store</a></div>
			</div>
			
			<div class="storySection existingStoriesSection">	
				
				<div id="yoursOrSharedChooser" class="yours">
					<a class="yours">Yours</a> | <a class="shared">Shared</a>
				</div>
				
				<div id="storyListContainer">					
					<div class="existingStory storyBlock">
						<div class="storyText" contenteditable="true">			
						</div>
						<ul class="storySharedList">					
						</ul>
						<div class="storeStoryChooser"><a class="cancel">Cancel</a> | <a class="store">Store</a></div>
						<ul class="storyDiscussionList">
							<li class="storyDiscussionItem">
							</li>
							<li class="storyDiscussionItem readwrite" contenteditable="true">
							</li>
						</ul>
					</div>						
				</div>
				
			</div>
			
		</div>
		
	</div>
	        
</@layout.mainLayout>