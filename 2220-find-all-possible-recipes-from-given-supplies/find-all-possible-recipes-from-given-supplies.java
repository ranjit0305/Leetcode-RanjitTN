import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> res = new ArrayList<>();
        Set<String> supplySet = new HashSet<>(Arrays.asList(supplies));
        boolean newRecipe = true; 
        while (newRecipe) { 
            newRecipe = false;
            for (int i = 0; i < recipes.length; i++) {
                if (res.contains(recipes[i])) continue;
                int cnt = 0;
                List<String> temp = ingredients.get(i);
                for (String ingredient : temp) {
                    if (supplySet.contains(ingredient)) {
                        cnt++;
                    }
                }
                if (cnt == temp.size()) {
                    res.add(recipes[i]);
                    supplySet.add(recipes[i]);
                    newRecipe = true;
                }
            }
        }
        return res;
    }
}
