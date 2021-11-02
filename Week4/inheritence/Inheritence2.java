package Week4.inheritence;

// multi-level inheritence 
public class Inheritence2 {
    public static void main(String args[]){
        IPhone6 iPhone6 = new IPhone6();
        iPhone6.voiceCall();
        iPhone6.videoCall();
        iPhone6.screenUnLock();
        iPhone6.processor();

        IPhone13 iPhone13 = new IPhone13();
        iPhone13.voiceCall();
        iPhone13.videoCall();
        iPhone13.screenUnLock();
        iPhone13.processor();

    }    
}
class IPhone{
    void voiceCall(){
        System.out.println("calling...");
    }
    void textMessage(){
        System.out.println("sending message...");
    }
}
class IPhone6 extends IPhone{
    void videoCall(){
        System.out.println("video calling...");
    }
    void whatsappMessage(){
        System.out.println("sending message using whatsapp..");
    }
    void screenUnLock(){
        System.out.println("unlock with fingerPrintScanner..");
    }
    void processor(){
        System.out.println("A7 bionic chip");
    }
}
class IPhone13 extends IPhone6{
    void videoCall(){
        System.out.println("hd video calling..");
    }
    void screenUnLock(){
        System.out.println("unlock with faceId..");
    }
    void processor(){
        System.out.println("A15 bionic chip");;
    }
}
