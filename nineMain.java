import java.awt.Rectangle;

public class nineMain {
    public static void main(String[] args) {

        nine s1 = new Circle (4);
        nine s2 = new Rectangle(5 , 4);
        nine larger = getLargenine (s1, s2);

        System.out.println("The area of the larger shape is: " +larger.area());
    }

     public static nine getLargenine (nine s1, nine s2){
        if (s1.area() > s2.area())
            return s1;
         else
            return s2;
        }
     }

