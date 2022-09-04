import java.lang.reflect.Array;
import java.util.ArrayList;

public class frame extends mustangFactory {
    public frame(frameType frameType) {
        super(frameType);
    }

    private String motor;
    private String securitySystem;
    private String lights;

    public frame(frameType frameType, String motor, String securitySystem, String lights) {
        super(frameType);
        this.motor = motor;
        this.securitySystem = securitySystem;
        this.lights = lights;
    }
    public final ArrayList frame ( String motor){
        this.motor = motor;
        return null;
    }

    public frame (frameType frameType, String motor, String lights){
        super(frameType);
        this.motor = motor;
        this.lights= lights;

    }
    public String getMotor() {
        return motor;
    }

    public String getSecuritySystem() {
        return securitySystem;
    }

    public String getLights() {
        return lights;
    }

    public String getInfo(){
        return "Introducing a new car!!!"+
                "\n"+"Motor:"+motor+
                "\n"+"Security System was implemented:"+securitySystem+
                "\n"+"Lights:"+lights+
                "\n"+"Frame:"+ getFrame();
    }
}
