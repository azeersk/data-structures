interface functionalInter{
    public void ola();
}

interface funcInter{
    public void car(int max1, int min1);
}

public class lambdaClass {
    public lambdaClass(Object methodRef) {
    }


    public static void main(String[] args) {
        int a = 23;
        functionalInter OlaCar = () -> {
            System.out.println("Non-arguments lambda expression.");
        };
        OlaCar.ola();
        int max = 220;
        int min = 10;
        funcInter carSpeed = (max1, min1) -> {
            System.out.println("car maximum speed is: " + max + "\ncar minimum speed is: " + min);
        };
    }
}
