package webRecipeService;

import java.util.ArrayList;
import java.util.Iterator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding (style=Style.RPC)







public class WebRecipe {
		
	
	@WebMethod
	public String displayAllRecipes() {

 ArrayList<Recipe> RecipeList = new ArrayList<Recipe>();
	
 RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));	
 RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));	
 RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));	
 RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));

 String body = "";

 for (Recipe x : RecipeList) 
 			
 body += x.getRecipeName() + x.getRecipeDesc();

 return body;
}	
	
	@WebMethod
	public String removeRecipe(String recipeName) {

		
		
 ArrayList<Recipe> RecipeList = new ArrayList<Recipe>();
	
 RecipeList.add(new Recipe("PB&J", "Requires 2 slices of bread, apply peanut butter to one and jam to the other. Put them on top of eachother and voila!" ));	
 RecipeList.add(new Recipe("Tomato Soup", "Purchase canned tomato soup from the grocery store. Heat to desired temperature and serve in a bowl. Enjoy!" ));	
 RecipeList.add(new Recipe("Mac and Cheese", "Acquire Kraft Dinner. Follow instructions on box and serve. You can even eat it out of the pot! Bon appetit!" ));	
 RecipeList.add(new Recipe("Homemade Spaghetti", "Bother the mother-figure in your life to craft you the finest italian cuisine. Wait, have a glass of wine, then enjoy the fruits of your non-labour!" ));
 
Iterator<Recipe> itr = RecipeList.iterator();

while (itr.hasNext()) {
	
	Recipe recipe = itr.next();
	
	if (recipe.getRecipeName().equals(recipeName)) {
		
		itr.remove();
	}
}
 

/* for (Recipe x : RecipeList) {
	 
	 if(x.getRecipeName().equals(recipeName)) {
		 
		 RecipeList.remove(x); }
		 
  } */
 
 return RecipeList.toString();
 



}	

}
