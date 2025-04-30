package Study.src.ch15.sec06.exam03;

public class SendSMSCommand implements Command {
    @Override
    public void execute(Message message) {
        System.out.println(message.to + "님에게 SMS를 보냅니다.");
    }
}
