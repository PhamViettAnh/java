 interface Printable {
    void print();
} 
class A0 implements Printable{
    public void print(){
        System.out.print("Cristiano Ronaldo");
    }
    public static void main(String[] args) {
        A0 A = new A0(); 
        A.print();
    }
}