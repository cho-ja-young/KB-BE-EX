package Practice.src.c20250421.basic.ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUMN = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();

    void setVolume(int volume);
}
