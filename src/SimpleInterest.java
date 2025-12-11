public class SimpleInterest {
    public static void main(String[] args) {
        float p = 10000;
        float t = 5;
        float r = 5;

        calculateSimpleInterest(p,t,r);

    }

    public static void calculateSimpleInterest(float p, float t, float r){
        float si = (p*t*r)/100;
        System.out.println("The simple interest is: " + si);
    }
}
