import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Company> market = new PriorityQueue<>();

        market.add(new Company("Disney", 25000));
        market.add(new Company("GE", 18000));
        market.add(new Company("Wayland-Yutani", 45000));
        market.add(new Company("ACME Corp", 12000));
        market.add(new Company("Stark Industries", 50000));
        market.add(new Company("Umbrella Corp", 8000));
        market.add(new Company("Cyberdyne", 15000));
        market.add(new Company("Wonka Industries", 30000));
        market.add(new Company("Oscorp", 10000));
        market.add(new Company("Aperture Science", 20000));

        System.out.println("Corporate Merger Market:");
        System.out.println(market);

        Company smallest = market.poll();

        System.out.println("\nSmallest company:");
        System.out.println(smallest);

        market.add(smallest);

        System.out.println("\nCompany added back to market:");
        System.out.println(market);
    }
}
