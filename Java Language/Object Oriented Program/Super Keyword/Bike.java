package Super_Keyword;

public class Bike extends Vehicle {

    double gear;

    Bike(String c, int w, double g) {
        super(c, w);
        gear = g;
    }
    
    @Override
    void display(){
      super.display(); 
      System.out.println("Gear= "+gear);
    }
    
    public static void main(String[] args) {
        
        Bike R15=new Bike("Black",126,4);
        R15.display();
    }

}
