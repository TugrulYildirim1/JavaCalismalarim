public class Car extends Vehicle{
    public void m1() {
        System.out.println("Car 1");
    }

    public void m3() {
        System.out.print("Car 3");
        super.m1();
    }
}
