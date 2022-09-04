import java.lang.reflect.Array;

public final class mustang extends frame {
    public mustang(frameType frameType) {
        super(frameType);
    }

    public mustang(frameType frameType, String motor, String securitySystem, String lights) {
        super(frameType, motor, securitySystem, lights);
    }
    private colorCar color;
    private String brand;
    private int age;

    public mustang(frameType frameType, colorCar color, String brand, int age) {
        super(frameType);
        this.color = color;
        this.brand = brand;
        this.age = age;
    }

    public mustang(frameType frameType, String motor, String securitySystem, String lights, colorCar color, String brand, int age) {
        super(frameType, motor, securitySystem, lights);
        this.color = color;
        this.brand = brand;
        this.age = age;
    }

    public mustang(frameType frameType, String brand, int age) {
        super(frameType);
        this.brand = brand;
        this.age = age;
    }

    public mustang(frameType frameType, String motor, String lights, colorCar color, String brand, int age) {
        super(frameType, motor, lights);
        this.color = color;
        this.brand = brand;
        this.age = age;
    }

    public colorCar getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public static void makeVoice(String voice){
        System.out.println(voice);
    }
    public  String getInfo(){
        return super.getInfo() +
                "\n" + "Color:" + color +
                "\n" + "Brand:" + brand +
                "\n" + "Age:" + age;
    }
}
