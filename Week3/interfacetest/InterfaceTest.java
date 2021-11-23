package Week3.interfacetest;

public class InterfaceTest 
{
    public static void main(String args[])
    {
        Tesla tesla = new Tesla();
        System.out.println("Tesla car: ");
        tesla.speed();
        tesla.runsOn();
        tesla.turnOnAutoPilot();
        System.out.println();
        
        BMW bmw = new BMW();
        System.out.println("BMW car: ");
        bmw.speed();
        bmw.runsOn();
        bmw.turnOnDrivingAssistent();
    }
}

interface Car
{
    int noOfWhells = 4; 
    void speed();
    void runsOn();    
}

class Tesla implements Car
{
    public void speed()
    {
        System.out.println("tesla can go from 0 to 60mph in 1.99 seconds..");
        System.out.println("tesla has top speed of 200mph..");
    }

    public void runsOn()
    {
        System.out.println("tesla cars runs on electricity.");
    }

    public void turnOnAutoPilot()
    {
        System.out.println("your car will drive automatically now...");
    }

}

class BMW implements Car
{
    public void speed()
    {
        System.out.println("bwm can go from 0 to 60mph in 3.1 seconds..");
        System.out.println("bmw has top speed of 250mph..");
    }
    public void runsOn()
    {
        System.out.println("BMW cars runs on petrol and diesel.");
    }
    public void turnOnDrivingAssistent()
    {
        System.out.println("your car will be parked automatically..");
    }
}


