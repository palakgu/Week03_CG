package circular_linkedlist.ticket_reservation;

public class TicketReservationSystemDemo {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(new Ticket(1, "John Doe", "Movie A", "A1", "2025-01-29 20:00"));
        system.addTicket(new Ticket(2, "Jane Smith", "Movie B", "B2", "2025-01-29 21:00"));
        system.addTicket(new Ticket(3, "Alice Brown", "Movie A", "A3", "2025-01-29 22:00"));

        system.displayTickets();

        system.searchTicket("John Doe");
        system.searchTicket("Movie B");

        system.removeTicket(2);
        system.displayTickets();

        int totalTickets = system.countTickets();
        System.out.println("Total number of booked tickets: " + totalTickets);
    }
}
