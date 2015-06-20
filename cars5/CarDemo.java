public class CarDemo
{
    public static void main(String[] args)
    {
        Car car = new Car(5);
        car.addGas(50);
        car.drive(5);
        
        Car car1 = new Car(10, "green-convertible.jpg");
        car1.addGas(20);
        car1.drive(20); 
        
        Car car2 = new Car(50, "motorcycle_DR.png");
        car2.addGas(50);
        car2.drive(25);
        
        Car car3 = new Car(50, "motorcycle_HD.png");
        car3.addGas(50);
        car3.drive(30);
        
        Car car4 = new Car(50, "motorcycle_Yamaha.png");
        car4.addGas(50);
        car4.drive(35); 
        
        Car car7 = new Car(50, "helicopter.png");
        car7.addGas(500);
        car7.drive(80);        
        //new Text(200, 120, "Gas left: " + car1.getGasInTank()).draw();
        //new Text(800, 120, "Gas left: " + car2.getGasInTank()).draw();
    }
}
