package airline;

import airline.DatabaseConnection;
import airline.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FlightDAO {

    public void getAllFlights() {
        String sql = "SELECT * FROM flights";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("flight_id") + " " +
                                rs.getString("flight_number") + " " +
                                rs.getString("origin") + " -> " +
                                rs.getString("destination")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
