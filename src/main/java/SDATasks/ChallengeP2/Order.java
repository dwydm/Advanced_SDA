package SDATasks.ChallengeP2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private LocalDateTime orderTime = LocalDateTime.now();

    public Order(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderTime=" + orderTime +
                '}';
    }
}

