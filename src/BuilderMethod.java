final class phoneBuilder{
    private String os;
    private String brand;
    private int cost;
    private int battery;
    private Double size;

    public phoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public phoneBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }
    public phoneBuilder setCost(int cost){
        this.cost = cost;
        return this;
    }
    public phoneBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }
    public phoneBuilder setSize(Double size){
        this.size = size;
        return this;
    }

    @Override
    public String toString(){
        return "Os = "+ this.os + ", Brand = "+ this.brand + ", Cost = "+ this.cost + ", Battery = "+ this.battery + ", Size = "+ this.size;
    }

}

public class BuilderMethod {
    public static void main(String[] args){
        phoneBuilder p = new phoneBuilder()
                .setOs("Android")
                .setCost(12500)
                .setBrand("motorola");
        System.out.println(p);
    }
}
