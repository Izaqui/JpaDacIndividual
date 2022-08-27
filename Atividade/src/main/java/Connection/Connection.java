package Connection;

import java.sql.DriverManager;

public class Connection {
    //Ususario e senha do banco
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";


    private static final String DATABASE_URL = "jdbc:postgres://localhost:5432/";


    public static Connection createConnectionToMySQL() throws Exception {

        Class.forName("org.postgresql.Driver");
        Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }


    public static void main(String[] args) throws Exception {

        Connection con = createConnectionToMySQL();

        if (con != null) {
            System.out.println("Conexão obetida com sucesso!");
            con.close();
        }
    }

    public void close() {
    }

    public Object prepareStatement(String sql) {
        return null;
    }

}

