package Practice.src.c20250430.basic.ch15.sec06.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    public String command;
    public String to;
}
