import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBLibJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/LibraryDB";
    private static final String USER = "root";
    private static final String PASSWORD = "pwdxxxxx";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL insert statement
            String sql = "INSERT INTO Books (title, author, published_year) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Insert first book
            preparedStatement.setString(1, "To Kill a Mockingbird");
            preparedStatement.setString(2, "Harper Lee");
            preparedStatement.setInt(3, 1960);
            preparedStatement.executeUpdate();

            // Insert second book
            preparedStatement.setString(1, "1984");
            preparedStatement.setString(2, "George Orwell");
            preparedStatement.setInt(3, 1949);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
