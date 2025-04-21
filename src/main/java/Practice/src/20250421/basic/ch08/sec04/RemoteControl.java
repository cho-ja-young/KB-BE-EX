package Practice.src;

public interface RemoteControl {
    int MAX_VOLUMN = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();

    void setVolume(int volume);
}
