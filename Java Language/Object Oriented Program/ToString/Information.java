package ToString;


public class Information {

   String name;
   int age;
   String home_town;
   
   Information(String name,int age,String home_town) {
      this.name=name;
      this.age=age;
      this.home_town=home_town;
   }
   
   @Override
   public String toString (){
    return "name: "+name+"\nage: "+age+"\nhome_town: "+home_town;   
   }
    
}
