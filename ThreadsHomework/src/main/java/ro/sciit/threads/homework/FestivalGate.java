package ro.sciit.threads.homework;

import java.util.HashMap;

public class FestivalGate {
    private HashMap<Ticket, FestivalAttendee> gateRegistry = new HashMap<>();

    public FestivalGate() {
    }

    /**
     * @param attendee The thread which represent the attendee
     *                 that has to pass through the gate
     *                 Method has a synchronized sequence that allow only one attendee(thread) to pass through the gate
     */
    public void validateTicket(AttendeeThread attendee) {
        String nl = System.getProperty("line.separator");
        //only one person can pass through
        synchronized (this) {
            try {
                //Using sleep for the  FestivalAttendeeThread to simulate gate passage
                Thread.currentThread().sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (gateRegistry.containsKey(attendee.getTicketType())) {
                gateRegistry.get(attendee.getTicketType()).increment();
            } else {
                gateRegistry.put(attendee.getTicketType(), new FestivalAttendee());
            }
            //usage of static reference in Main
            System.out.println("Attendee with ticket type " + attendee.getTicketType() + "  passed through the gate from " +
                    Thread.currentThread().getName() + nl);
        }
    }

    /**
     * @return a HashMap containing the info of the persons that passed through the gate
     */
    public HashMap<Ticket, FestivalAttendee> getGateRegistry() {
        return gateRegistry;
    }
}
