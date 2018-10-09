package ro.sciit.threads.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Ticket {
    Full, FullVip, FreePass, OneDay, OneDayVip;

    private static Ticket randomTicket;

    /**
     *
     * @return a random type of ticket
     */
    public static Ticket getTicket() {
        List<Ticket> values = Collections.unmodifiableList(Arrays.asList(values()));
        final int SIZE = values.size();
        Random random = new Random();
        randomTicket = values.get(random.nextInt(SIZE));
        return randomTicket;
    }
}
