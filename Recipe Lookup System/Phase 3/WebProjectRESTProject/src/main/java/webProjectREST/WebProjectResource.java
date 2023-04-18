package webProjectREST;

import java.util.ArrayList;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;



@Path("WebProject")



public class WebProjectResource {
	
	
	ArrayList<Recipe> RecipeList = new ArrayList<Recipe>(); 
	{
	RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));	
	RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));	
	RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));	
	RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));
	}
	
	
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
	
	@GET
	@Path("/searchRecipe/")
	@Produces(MediaType.TEXT_HTML) 
		
public String searchFormRecipe(@QueryParam("recipeName") String recipeName)	{
		
	
//	RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));	
//	RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));	
//	RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));	
//	RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));

		
	for (Recipe x: RecipeList)  	
	
		 if (x.getRecipeName().equals(recipeName)) //if the recipe is found
			 
			return 
					
	"<b><i><h1>" + x.getRecipeName() + "</h1></i></b>" + "\n<h2> " + x.getRecipeDesc() + "</h2>\n" + "<button><a style=\"text-decoration:none\" " +
	"href=\"http://localhost:8080/WebProjectRESTProject/RecipeSearchFormUsingGET.html\">Return</a></button>";

	
	
	//if recipe is not found
	
	 return "<h2><font size=+2\\>The recipe " + "<b><i>" + recipeName + "</i></b>" + " was not found!</font></h2>" + 
	 "<button><a style=\"text-decoration:none\" " + "href=\"http://localhost:8080/WebProjectRESTProject/RecipeAddFormUsingPOST.html\">Add Recipe</a></button>" +
	 "<button><a style=\"text-decoration:none\" " + "href=\"http://localhost:8080/WebProjectRESTProject/RecipeSearchFormUsingGET.html\">Return</a></button>";
		
		
}	
	
	@POST
	@Path("/addNewRecipe")
	@Produces(MediaType.TEXT_HTML) 
		
public String addFormRecipe(
		@FormParam("recipeName") String recipeName,
		@FormParam("recipeDesc") String recipeDesc)	{
		
	
		 RecipeList.add(new Recipe(recipeName, recipeDesc));

		 //loop to display recipe list .toString
		
		return 
				
"<b><i><h1>" + recipeName + "</h1></i></b>" + "\n<h2> " + recipeDesc + "</h2>\n" + RecipeList.toString() +
"<button><a style=\"text-decoration:none\" " + "href=\"http://localhost:8080/WebProjectRESTProject/RecipeSearchFormUsingGET.html\">Return</a></button>";

		
				
}
		
		
	
}
