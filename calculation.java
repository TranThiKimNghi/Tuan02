public class Calculation {
    private int a;
    private int b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int minus(){
        return a - b;
    }

    public int mul(){
        return a * b;
    }

    public int div(){
        return a / b;
    }

    public static void main(String[] args) {
        Calculation cal1 = new Calculation(6,2);
        System.out.println(cal1.sum());
        System.out.println(cal1.minus());
        System.out.println(cal1.mul());
        System.out.println(cal1.div());
    }
}