public class Main {
    public static void main(String[] args) {
        frame frame = new frame(frameType.VIBRANIUM,"Eco","Corel 12","Optical");
        System.out.println(frame.getInfo());
        mustang.makeVoice("GRRRR");

        mustang mustang = new mustang(frameType.DIAMOND,"Eletro","Hilfiger 2.0","Kseon",colorCar.WHITE,"Tulpar",2021);
        System.out.println(mustang.getInfo());
        mustang.makeVoice("GGGGGG");

        mustang mustang1 = new mustang(frameType.COPPER,"GTR",1999);
        System.out.println(mustang1.getInfo());
        mustang.makeVoice("TRRR");
    }
}