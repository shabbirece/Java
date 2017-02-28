public class Car
{
//variables for the car

String nameOfCar = "Toyota";
String model = "Corolla";
int maxSpeed = 100;
int minSpeed = 0;
boolean isTheCarOn = false;
double weight =4079.00;
char condition = 'A';
// My car's information method

public void carInformation()
{
System.out.println("The name of the car is " + nameOfCar);
System.out.println("The model of the car is " +model);
System.out.println("The maximum speed is " + maxSpeed);
System.out.println("The minimum speed is " + minSpeed);
System.out.println("Is the car on ? " + isTheCarOn);
System.out.println("The weight of the car " + weight);
System.out.println("The condition of the car " +condition);
}
//Change for the family car
public void changedCar()
{
nameOfCar = "Bugati";
model = "32A";
maxSpeed = 300;

}
//main method
public static void main(String[] args){
System.out.println("Welcome to my and my family cars information");
//object creation

Car mycar = new Car();
mycar.carInformation();
Car familycar = mycar;
familycar.carInformation();
familycar.changedCar();

}
}
