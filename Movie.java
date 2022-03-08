
package moviestore;

/**
 *
 * @Nada
 */
public class Movie {
  
     private String name;
     private String format;
     private double rating;
     private double sellingPrice;
     private double rentalPrice;
     private boolean isAvailable = true;
     
     public Movie(String name, String format, double rating){
         if(name == null || name.isEmpty()){
             throw new IllegalArgumentException("Name can not be null/empty");   
         }
         if((format.equalsIgnoreCase("DVD")) == false && (format.equalsIgnoreCase("Blue-Ray"))== false){
             throw new IllegalArgumentException("Invalid format");  
         }
         if( rating >  10  || rating < 0){
             throw new IllegalArgumentException("Invalid rating");
         }
    
         this.name = name;
         this.format = format;
         this. rating = rating;
         
       
          setSellingPrice(format);
          setRentalPrice(format);
     }
     
     public Movie(Movie source){
         this.name = source.name;
         this.format = source.format;
         this. rating = source.rating;
         this. sellingPrice = source.sellingPrice;
         this.rentalPrice = source.rentalPrice;
         this.isAvailable = source.isAvailable;
         
     }
     
     //getters 
     public String getName(){
         
         return this.name;
     }
     
     public String getFormat(){
         
         return this.format;
     }
     
     
      public double getRating(){
         
         return this.rating;
     }
      
       public double getSellingPrice(){
         
         return this.sellingPrice;
     }
       
        public double getRentalPrice(){
         
         return this.rentalPrice;
     }
        
        public String isAvailable(){
         
         if(isAvailable){
             return "in-stock";
         }else{
             return "rented";
         }
     }
    
    //setters
        
        public void setName(String name){
            if(name == null || name.isEmpty()){
             throw new IllegalArgumentException("Name can not be null/empty");   
         }
            this.name = name;
        }
        
         public void setFormat(String format){
            if(format == null || format.isEmpty()){
             throw new IllegalArgumentException("Format can not be null/empty");  
         }
            if((format.equalsIgnoreCase("DVD")) == false && (format.equalsIgnoreCase("Blue-Ray"))== false){
             throw new IllegalArgumentException("Invalid format");  
         }
             setSellingPrice(format);
             setRentalPrice(format);
            this.format = format;
           
        }
         
          public void setRating(double rating){
            if( rating >  10  || rating < 0){
             throw new IllegalArgumentException("Invalid rating");
         }
            this.rating = rating;
        }
          
           private void setSellingPrice(String format){
            //The format should determine the rentalPrice.  Blue-Ray
          if(format.equalsIgnoreCase("DVD")){
                this.sellingPrice = 11.5;
            }else if(format.equalsIgnoreCase("Blue-Ray")){
                  this.sellingPrice = 21.5;

            }
                
        }
           
            private void setRentalPrice(String format){
            //The format should determine the rentalPrice.
            if(format.equalsIgnoreCase("DVD")){
                this.rentalPrice = 6.5;
            }else if(format.equalsIgnoreCase("Blue-Ray")){
                  this.rentalPrice = 7.5;

            }
            
            
            
        }
            
            public  void setIsAvailable(boolean value){
            
            this.isAvailable = value;
        }
            
            public String toString(){
                return "\t Name: " + this.name + "\n" +

                "\t Format: " + this.format + "\n" +

                "\t Rating: " + this.rating + "\n" +

                "\t Selling Price: " + this.getSellingPrice() + "\n" +

                 "\t Rental Price: " + this.getRentalPrice() + "\n" +

                 "\t Availability: " + this.isAvailable() + "\n";
            }
     
}
