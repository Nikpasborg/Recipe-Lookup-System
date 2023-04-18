package webRecipeService;

public class Recipe {

	private String recipeName;
	private String recipeDesc;
	


public Recipe(String recipeName, String recipeDesc) {
		
this.recipeName = recipeName;
this.recipeDesc = recipeDesc;
		
		
	}
	


public String getRecipeName() {
		return recipeName;
	}




	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}



	public String getRecipeDesc() {
		return recipeDesc;
	}



	public void setRecipeDesc(String recipeDesc) {
		this.recipeDesc = recipeDesc;
	}



	@Override
	public String toString() {
		return "Recipe Name: " + this.getRecipeName() + " Recipe Description: " + this.getRecipeDesc();
	}
	

	
	
	

	

	
}