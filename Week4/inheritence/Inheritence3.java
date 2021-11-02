package Week4.inheritence;

public class Inheritence3 {
    public static void main(String args[]){
        IPhone13Pro iPhone13 = new IPhone13Pro();
        iPhone13.voiceCall();
        iPhone13.camera();
        iPhone13.processor();

        Pixel5a pixel5a = new Pixel5a();
        pixel5a.voiceCall();
        pixel5a.camera();
        pixel5a.processor();
    }
}

class SmartPhone{
    void voiceCall(){
        System.out.println("callling...");
    }
    void textMessage(){
        System.out.println("messaging...");
    }
    void camera(){
        System.out.println("5mp..");
    }
    void processor(){
        System.out.println("basic processor");
    }
}

class IPhone13Pro extends SmartPhone{
    void camera(){
        System.out.println("15mp..");
        System.out.println("potrait");
        System.out.println("cinematic video..");
    }
    void processor(){
        System.out.println("A15 Bionic chip");
    }
}
class Pixel5a extends SmartPhone{
    void camera(){
        System.out.println("12mp");
        System.out.println("potrait");
    }
    void processor(){
        System.out.println("SD730g");
    }
}

