package circular_linkedlist.ticket_reservation;

class TicketReservationSystem {
    Ticket head;
    Ticket tail;

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(Ticket ticket) {
        if (head == null) {
            head = tail = ticket;
            tail.next = head; // Circular link
        } else {
            tail.next = ticket;
            tail = ticket;
            tail.next = head; // Update circular link
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }
        if (head.ticketID == ticketID) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Ticket removed.");
            return;
        }
        Ticket current = head;
        do {
            if (current.next.ticketID == ticketID) {
                current.next = current.next.next;
                if (current.next == head) {
                    tail = current;
                }
                System.out.println("Ticket removed.");
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Ticket not found.");
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }
        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID +
                    ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName +
                    ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }
        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Found Ticket: " + current.ticketID +
                        ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName +
                        ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tickets found with the given keyword.");
        }
    }

    // Calculate the total number of booked tickets
    public int countTickets() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}


