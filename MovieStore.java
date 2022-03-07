
package moviestore;

/**
 *
 * @Nada
 */
public class MovieStore {

    public static void main(String[] args) {
        System.out.println("************ WELCOME TO THE JAVA VIDEO STORE ************");
        Movie movie = new Movie("stars" , "dvd" , 1);
        Store store = new Store();
        movie.setName("second");
        movie.setFormat("Blue-Ray");
    
        store.addMovie(new Movie("The Shawshank Redemption","Blue-Ray",9.2)); 
        store.addMovie(new Movie("The Godfather","Blue-Ray",9.1)); 
        store.addMovie(new Movie("The Godfather: Part II","DVD",9.0));
       store.action("The Godfather: Part II", "return");
        System.out.println(store);
    }
    
}
