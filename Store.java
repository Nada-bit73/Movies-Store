
package moviestore;

import java.util.ArrayList;

/**
 *
 * @Nada
 */
public class Store {
     ArrayList <Movie> movies;
     
    public Store(){
        this.movies = new ArrayList <Movie>();
    }
    
    public Movie getMovies(int index){
        return new Movie(movies.get(index));
    }
    
    public void setMovies(int index , Movie element){
       movies.set(index, new Movie(element) );
    }
    
    public void addMovie(Movie movie){
        movies.add(new Movie(movie));
    }
    
    public void action(String movieName,String action){
        if(movies.isEmpty()){
            throw new IllegalStateException("cannot remove item from empty list !");
        }
        for(int i = 0 ; i < movies.size() ; i++){
            if(movies.get(i).getName().equals(movieName)){
               switch(action){
                   case "sell" : this.movies.remove(i);
                   break;
                   case "rent" : movies.get(i).setIsAvailable(false);
                   break;
                   case "return" : movies.get(i).setIsAvailable(true);
                   break;
                   default:
                       System.out.println("INVALID ACTION...");
               }

            }
        }
        
    }
    
   public String toString(){
  
       String temp = "";
       for(int i = 0 ; i < movies.size() ; i++){
          temp += "\n\nMovie Name: ";
          temp += movies.get(i).getName();
          temp += "\n\nFormat: ";
          temp += movies.get(i).getFormat();
          temp += "\n\nSelling price: ";
          temp += movies.get(i).getSellingPrice();
          temp += "\n\nRating price: ";
          temp += movies.get(i).getRentalPrice();
          temp += "\n\nRating: ";
          temp += movies.get(i).getRating();
          temp += "\n\nits me here: ";
          temp += movies.get(i).isAvailable();
           

          temp += "\n\n";
      }
       
       return temp;
       
   } 
    
}
