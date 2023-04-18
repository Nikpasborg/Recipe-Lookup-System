package webProjectREST;

import java.util.ArrayList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("WebProject")

public class WebProjectResource {

	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public String displayHTMLRecipe() {

 ArrayList<Recipe> RecipeList = new ArrayList<Recipe>();
	
	RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));
	
	RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));
	
	RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));
	
	RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));
	
String body = "";

for (Recipe x : RecipeList) 
			
body += "<b><i><h2>" + x.getRecipeName() + "</h2></i></b>" + "\n " + x.getRecipeDesc() + "\n";

return body;
	
}
	
	@GET
	@Path("/searchRecipe/{recipeName}")
	@Produces(MediaType.APPLICATION_JSON) 
		
public Recipe searchRecipe(@PathParam("recipeName") String recipeName)	{
		
		ArrayList<Recipe> RecipeList = new ArrayList<Recipe>();
		
RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));
		
RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));
		
RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));
		
RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));
				

		
	for (Recipe x:RecipeList) 
		 if (x.getRecipeName().equals(recipeName)) 
			return x;
			
		 	
		 return null;			
		
		
}
		
	
}
