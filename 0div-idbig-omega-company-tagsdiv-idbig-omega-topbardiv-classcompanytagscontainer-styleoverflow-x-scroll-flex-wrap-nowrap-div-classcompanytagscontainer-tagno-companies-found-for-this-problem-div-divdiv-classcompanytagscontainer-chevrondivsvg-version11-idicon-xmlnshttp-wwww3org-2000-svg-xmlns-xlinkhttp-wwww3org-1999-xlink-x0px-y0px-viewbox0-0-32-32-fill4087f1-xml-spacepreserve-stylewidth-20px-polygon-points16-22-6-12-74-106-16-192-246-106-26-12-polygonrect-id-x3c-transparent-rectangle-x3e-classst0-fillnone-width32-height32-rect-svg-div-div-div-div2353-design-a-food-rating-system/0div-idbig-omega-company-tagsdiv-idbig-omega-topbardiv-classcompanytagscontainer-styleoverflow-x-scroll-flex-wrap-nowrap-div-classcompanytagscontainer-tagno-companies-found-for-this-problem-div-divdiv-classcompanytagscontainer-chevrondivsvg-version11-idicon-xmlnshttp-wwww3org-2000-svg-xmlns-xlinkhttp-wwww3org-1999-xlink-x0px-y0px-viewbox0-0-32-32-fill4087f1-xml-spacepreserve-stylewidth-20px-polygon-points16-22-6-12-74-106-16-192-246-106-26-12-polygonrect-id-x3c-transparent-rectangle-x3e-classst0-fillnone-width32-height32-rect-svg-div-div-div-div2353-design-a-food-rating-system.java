class FoodRatings {
    Map<String, PriorityQueue<Food>> cuisineMap = new HashMap<>(); 
    Map<String, Food> foodMap = new HashMap<>(); 

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        
        for(int i=0; i<foods.length; i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            if(!cuisineMap.containsKey(cuisine)){
                cuisineMap.put(cuisine, new PriorityQueue<Food>());
            }
            PriorityQueue<Food> q = cuisineMap.get(cuisine);
            Food item = new Food(food, rating, cuisine);
            q.offer(item);

            foodMap.put(food, item);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food item = foodMap.get(food);
        String cuisine = item.cuisine; 
        PriorityQueue<Food> q = cuisineMap.get(cuisine);
        q.remove(item);
        item.rating = newRating; 
        q.offer(item);
    }
    
    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).peek().name; 
    }

    class Food implements Comparable<Food>{
        String name; 
        int rating; 
        String cuisine; 

        public Food(String n, int r, String c){
            name = n; 
            rating = r; 
            cuisine = c; 
        }

        @Override
        public int compareTo(Food that){
            if(this.rating == that.rating){
                return this.name.compareTo(that.name);
            }
            return Integer.compare(that.rating, this.rating);
        }

        public String toString(){
            return "[" + name + "," + rating + "," + cuisine + "]";
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */