package Practice.src;

public class Audio implements RemoteControl {
    // 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        if (volume > MAX_VOLUMN) {
            volume = MAX_VOLUMN;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        } else {
            volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + volume);
    }
}
