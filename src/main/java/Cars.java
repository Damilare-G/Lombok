import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "brand")
public class Cars {

    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int quantity;

    public static void main(String[] args) {

        Cars car1 = new Cars("GLE", "Mercedes", "white", 2020, 350000, 5);
        Cars car2 = new Cars("C-Class", "Mercedes", "black", 2023, 200000, 3);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The price of the first car: " + car1.getPrice());
        System.out.println("The price of the second car: " + car2.getPrice());
        System.out.println("HashCode car1: " + car1.hashCode());
        System.out.println("HashCode car2: " + car2.hashCode());
    }
}
