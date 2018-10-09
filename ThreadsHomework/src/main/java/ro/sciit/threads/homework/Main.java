package ro.sciit.threads.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FestivalGate gate = new FestivalGate();

        GateStatistics statThread = new GateStatistics(gate);
        statThread.start();

        List<Thread> attendees = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < 200) {
            attendees.add(new Thread(new AttendeeThread(Ticket.getTicket(), gate)));
            attendees.get(i).start();
            i++;
        }
        while (j < attendees.size()) {
            if (attendees.get(j).isAlive()) {
                try {
                    attendees.get(j).join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            j++;
        }
        statThread.terminate();
    }
}

