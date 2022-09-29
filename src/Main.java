import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         //We need to type our Radius in order to get a result from our calculator
        System.out.print("Enter your radius:");
         //In here we are going to type our radius
        Scanner input = new Scanner(System.in);
        double Radius = input.nextDouble();
          //This section is made by constant numbers and Pi is not a certain data. You can check more in here
          //https://tr.wikipedia.org/wiki/Pi_sayısı
          double Pi = 3.14159;
          double Area = (Pi*Radius*Radius);

       double Circumference = (2*Pi*Radius);

       System.out.println("According to the given radius, area of the circle is"+" "+ Area+" "+ "and circumference of the circle is"+" "+ Circumference);
    }
}