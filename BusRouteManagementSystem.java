import java.util.*;

public class BusRouteManagementSystem {

    static Scanner sc = new Scanner(System.in);

    // Bus Data
    static ArrayList<String> busNames = new ArrayList<>();
    static ArrayList<String> busNumbers = new ArrayList<>();
    static ArrayList<Integer> capacities = new ArrayList<>();

    // Route Data
    static ArrayList<String> routeIds = new ArrayList<>();
    static ArrayList<String> sources = new ArrayList<>();
    static ArrayList<String> destinations = new ArrayList<>();
    static ArrayList<Integer> distances = new ArrayList<>();

    // Passenger Data
    static ArrayList<String> passengerNames = new ArrayList<>();
    static ArrayList<String> passengerPhones = new ArrayList<>();

    // Booking Data
    static ArrayList<String> bookingPassengers = new ArrayList<>();
    static ArrayList<String> bookingBuses = new ArrayList<>();
    static ArrayList<Integer> seatNumbers = new ArrayList<>();
    static ArrayList<String> journeyDates = new ArrayList<>();

    // Schedule Data
    static ArrayList<String> scheduleBus = new ArrayList<>();
    static ArrayList<String> departures = new ArrayList<>();
    static ArrayList<String> arrivals = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== BUS ROUTE MANAGEMENT SYSTEM =====");
            System.out.println("1. Bus Management");
            System.out.println("2. Route Management");
            System.out.println("3. Schedule Management");
            System.out.println("4. Passenger Management");
            System.out.println("5. Ticket Booking");
            System.out.println("6. Reports");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    busManagement();
                    break;
                case 2:
                    routeManagement();
                    break;
                case 3:
                    scheduleManagement();
                    break;
                case 4:
                    passengerManagement();
                    break;
                case 5:
                    ticketBooking();
                    break;
                case 6:
                    reports();
                    break;
                case 7:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);
    }

    // BUS MANAGEMENT
    static void busManagement() {
        System.out.println("\n1.Add Bus");
        System.out.println("2.Update Bus");
        System.out.println("3.Delete Bus");
        System.out.println("4.View Bus List");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Bus Name: ");
                busNames.add(sc.nextLine());

                System.out.print("Bus Number: ");
                busNumbers.add(sc.nextLine());

                System.out.print("Capacity: ");
                capacities.add(sc.nextInt());

                System.out.println("Bus Added Successfully!");
                break;

            case 2:
                viewBuses();
                System.out.print("Enter Bus Index: ");
                int u = sc.nextInt();
                sc.nextLine();

                if (u >= 0 && u < busNames.size()) {
                    System.out.print("New Bus Name: ");
                    busNames.set(u, sc.nextLine());
                    System.out.println("Updated Successfully!");
                }
                break;

            case 3:
                viewBuses();
                System.out.print("Enter Bus Index: ");
                int d = sc.nextInt();

                if (d >= 0 && d < busNames.size()) {
                    busNames.remove(d);
                    busNumbers.remove(d);
                    capacities.remove(d);
                    System.out.println("Deleted Successfully!");
                }
                break;

            case 4:
                viewBuses();
                break;
        }
    }

    static void viewBuses() {
        System.out.println("\n--- BUS LIST ---");
        for (int i = 0; i < busNames.size(); i++) {
            System.out.println(i + " | " + busNames.get(i)
                    + " | " + busNumbers.get(i)
                    + " | Capacity: " + capacities.get(i));
        }
    }

    // ROUTE MANAGEMENT
    static void routeManagement() {
        System.out.println("\n1.Add Route");
        System.out.println("2.Update Route");
        System.out.println("3.Delete Route");
        System.out.println("4.View Routes");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Route ID: ");
                routeIds.add(sc.nextLine());

                System.out.print("Source: ");
                sources.add(sc.nextLine());

                System.out.print("Destination: ");
                destinations.add(sc.nextLine());

                System.out.print("Distance: ");
                distances.add(sc.nextInt());

                System.out.println("Route Added!");
                break;

            case 4:
                System.out.println("\n--- ROUTES ---");
                for (int i = 0; i < routeIds.size(); i++) {
                    System.out.println(routeIds.get(i) + " | "
                            + sources.get(i) + " -> "
                            + destinations.get(i)
                            + " | " + distances.get(i) + " KM");
                }
                break;
        }
    }

    // SCHEDULE MANAGEMENT
    static void scheduleManagement() {
        System.out.println("\n1.Add Schedule");
        System.out.println("2.View Schedule");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Bus Name: ");
                scheduleBus.add(sc.nextLine());

                System.out.print("Departure Time: ");
                departures.add(sc.nextLine());

                System.out.print("Arrival Time: ");
                arrivals.add(sc.nextLine());

                System.out.println("Schedule Added!");
                break;

            case 2:
                for (int i = 0; i < scheduleBus.size(); i++) {
                    System.out.println(scheduleBus.get(i)
                            + " | Departure: "
                            + departures.get(i)
                            + " | Arrival: "
                            + arrivals.get(i));
                }
                break;
        }
    }

    // PASSENGER MANAGEMENT
    static void passengerManagement() {
        System.out.println("\n1.Register Passenger");
        System.out.println("2.View Passenger Details");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Passenger Name: ");
                passengerNames.add(sc.nextLine());

                System.out.print("Phone Number: ");
                passengerPhones.add(sc.nextLine());

                System.out.println("Passenger Registered!");
                break;

            case 2:
                for (int i = 0; i < passengerNames.size(); i++) {
                    System.out.println("ID: " + (i + 1)
                            + " | Name: "
                            + passengerNames.get(i)
                            + " | Phone: "
                            + passengerPhones.get(i));
                }
                break;
        }
    }

    // TICKET BOOKING
    static void ticketBooking() {
        System.out.println("\n1.Book Ticket");
        System.out.println("2.Cancel Ticket");
        System.out.println("3.Check Seat Availability");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                System.out.print("Passenger Name: ");
                bookingPassengers.add(sc.nextLine());

                System.out.print("Bus Name: ");
                bookingBuses.add(sc.nextLine());

                System.out.print("Seat Number: ");
                seatNumbers.add(sc.nextInt());
                sc.nextLine();

                System.out.print("Journey Date: ");
                journeyDates.add(sc.nextLine());

                System.out.println("Ticket Booked Successfully!");
                break;

            case 2:
                for (int i = 0; i < bookingPassengers.size(); i++) {
                    System.out.println(i + " | "
                            + bookingPassengers.get(i));
                }

                System.out.print("Enter Booking Index: ");
                int del = sc.nextInt();

                if (del >= 0 && del < bookingPassengers.size()) {
                    bookingPassengers.remove(del);
                    bookingBuses.remove(del);
                    seatNumbers.remove(del);
                    journeyDates.remove(del);
                    System.out.println("Booking Cancelled!");
                }
                break;

            case 3:
                System.out.println("Booked Seats: "
                        + seatNumbers.size());
                break;
        }
    }

    // REPORTS
    static void reports() {
        System.out.println("\n===== REPORTS =====");
        System.out.println("Total Buses: " + busNames.size());
        System.out.println("Total Routes: " + routeIds.size());
        System.out.println("Total Bookings: " + bookingPassengers.size());

        int totalSeats = 0;

        for (int cap : capacities) {
            totalSeats += cap;
        }

        int availableSeats = totalSeats - bookingPassengers.size();

        System.out.println("Available Seats: " + availableSeats);
    }
}