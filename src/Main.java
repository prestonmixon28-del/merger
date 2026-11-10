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

        int totalMergers = 0;
        Company titan = null;

        System.out.println("Starting Corporate Merger Simulation!");

        while (market.size() >= 2) {

            Company companyA = market.poll();
            Company companyB = market.poll();

            int newSize = (int) ((companyA.getSize()
                    + companyB.getSize()) * 1.1);

            String newName = companyA.getName()
                    + "-" + companyB.getName();

            Company mergedCompany = new Company(newName, newSize);

            totalMergers++;

            System.out.println("\nMERGER: " + companyA.getName()
                    + " and " + companyB.getName()
                    + " have merged into " + newName
                    + " with size " + newSize + "!");

            if (newSize >= 500000) {
                titan = mergedCompany;
                break;
            }

            market.add(mergedCompany);
        }

        System.out.println("\n===== FINAL REPORT =====");

        if (titan != null) {
            System.out.println("Industry Titan: " + titan);
        } else {
            System.out.println("No titan has emerged.");

            if (!market.isEmpty()) {
System.out.println("Remaining Company: " + market.peek());

            }

        }

        System.out.println("Total Mergers: " + totalMergers);

    }

}
