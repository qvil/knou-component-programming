package polymorphism;

public class LgTV implements TV {
    public LgTV() {
        System.out.println("====> Lg TV 객체 생성 ##");
    }

    @Override
    public void powerOn() {
        System.out.println("## Lg TV 전원 켜기 ##");
    }

    @Override
    public void powerOff() {
        System.out.println("## Lg TV 전원 끄기 ##");
    }

    @Override
    public void volumeUp() {
        System.out.println("## Lg TV 소리 올림 ##");
    }

    @Override
    public void volumeDown() {
        System.out.println("## Lg TV 소리 내림 ##");
    }
}
