public abstract class Bike {
    abstract void Run();
}
class BWM extends Bike{
    void Run(){
        System.out.println("Run fast");
    }
    public static void main(String[] args) {
        Bike obj = new BWM();
        obj.Run();
    }
}