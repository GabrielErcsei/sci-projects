package ro.sciit.jdbc.homework;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DBUtil.getConnection(DBType.POSTGRESQL);

            if (connection == null) {
                System.out.print("No connection");
            } else {
                /*Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("select * from employees");*/
                AccomodationDAO accomodationDAO = new AccomodationDAO(connection);
                List<Booking> results = accomodationDAO.getAccomodations();
                System.out.println(results);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

