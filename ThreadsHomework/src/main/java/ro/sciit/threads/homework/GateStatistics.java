package ro.sciit.threads.homework;

import java.util.Map;

public class GateStatistics extends Thread {
    private FestivalGate gate;
    private boolean running = true;

    /**
     * @param gate represents the gate used at the festival through which the attendees pass
     */
    public GateStatistics(FestivalGate gate) {
        this.gate = gate;
    }

    public void terminate() {
        this.running = false;
    }

    /**
     * Gathers the values from the gate at the required moment and prints them to the frame
     */
    public void getStats() {
        int sum = 0;
        sum = 0;
        String nl = System.getProperty("line.separator");
        if (!gate.getGateRegistry().isEmpty()) {
            for (Map.Entry<Ticket, FestivalAttendee> entry : this.gate.getGateRegistry().entrySet()) {
                sum += entry.getValue().getIndex();
            }
            String out;
            out = nl + "------------------------------";
            out += nl + sum + " people entered! " + nl;
            for (Map.Entry<Ticket, FestivalAttendee> entry : this.gate.getGateRegistry().entrySet()) {
                sum += entry.getValue().getIndex();
                out += entry.getValue() + " have " + entry.getKey() + " passes " + nl;
            }
            out += nl + "------------------------------" + nl;
            System.out.println(out);
        }
    }
}
