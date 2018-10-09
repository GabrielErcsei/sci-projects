package ro.sciit.threads.homework;

public class AttendeeThread implements Runnable {

    private Ticket type;
    private FestivalGate festivalGate;

    /**
     * @return the TicketType of the attendee
     */
    public Ticket getTicketType() {
        return type;
    }

    /**
     * @param type the ticket which the attendee has been assigned
     * @param festivalGate the gate from which attendees enter
     */
    public AttendeeThread(Ticket type, FestivalGate festivalGate) {
        this.type = type;
        this.festivalGate = festivalGate;
    }

    /**
     * Method that validates the ticket
     * Calls a method from FestivalGate class
     */
    public void run() {
        this.festivalGate.validateTicket(this);
    }
}
