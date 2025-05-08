package Practice.src.c20250508.basic.ch17.sec04.exam01;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;
}
