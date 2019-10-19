package polymorphism;

public class SamsungTV implements TV {
    public SamsungTV() {
        System.out.println("====> Samsung TV 객체 생성 ##");
    }

    @Override
    public void powerOn() {
        System.out.println("## Samsung TV 전원 켜기 ##");
    }

    @Override
    public void powerOff() {
        System.out.println("## Samsung TV 전원 끄기 ##");
    }

    @Override
    public void volumeUp() {
        System.out.println("## Samsung TV 소리 올림 ##");
    }

    @Override
    public void volumeDown() {
        System.out.println("## Samsung TV 소리 내림 ##");
    }
}
