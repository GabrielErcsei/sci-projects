package ro.sciit.jdbc.homework;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AccomodationDAO {

    Connection connection;

    public AccomodationDAO(Connection connection) {
        this.connection = connection;
    }


    public List<Booking> getAccomodations() throws SQLException {
        List<Booking> results = new ArrayList<>();
        Statement st =connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT type,room_fair.value FROM accomodation " +
                "INNER JOIN accomodation_fair_relation on accomodation_fair_relation.id_accomodation=accomodation.id " +
                        "INNER JOIN room_fair on room_fair.id=accomodation_fair_relation.id_room_fair;");

        while (rs.next()) {
            Booking booking = new Booking();
            booking.setType(rs.getString("type"));
            booking.setValue(rs.getDouble("value"));

            results.add(booking);
        }
        return results;
    }
}
