package gymClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import GUI.Register;
import GUI.GUIInstructor;
import gymClass.Instructor;
import gymClass.Training;
import java.util.LinkedList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class Koneksi {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/gym";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public Koneksi() {
        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return conn;
    }
    public static String getSHA256Hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                hexString.append(String.format("%02x", b & 0xFF));
            }

            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertMember() {
        try {

            if (stmt == null) {
                stmt = conn.createStatement();
            }

            String nama = Register.nama;
            String email = Register.email;
            String password = Koneksi.getSHA256Hash(Register.password);
            // query simpan
            String sql = "INSERT INTO members (nama, email, password) VALUES('%s', '%s', '%s')";
            sql = String.format(sql, nama, email, password);

            // simpan 
            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean loginUser(String username, String password) {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
            }

            // Lakukan hash password yang dimasukkan oleh pengguna
            String hashedPassword = getSHA256Hash(password);

            // Query untuk memeriksa apakah username dan hashed password cocok
            String query = "SELECT * FROM members WHERE nama=? AND password=?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, hashedPassword);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Jika hasil query mengandung baris, maka login berhasil
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void insertInstructor(String name, int experience){
        
       String query = "INSERT INTO instructors (name, experience) VALUES (?, ?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, experience);

            // Menjalankan query
            preparedStatement.executeUpdate();
            System.out.println("Data Instructor berhasil disimpan ke dalam database.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Terjadi kesalahan: " + ex.getMessage());
        }
    }
//      public void displayDataInTable(DefaultTableModel tableModel, GUIInstructor guiInstance) {
//        if (tableModel == null) {
//            // Inisialisasi model default baru jika tableModel adalah null
//            tableModel = new DefaultTableModel();
//            guiInstance.setTableModel(tableModel);
//        } else {
//            // Bersihkan tabel sebelum menampilkan data baru
//            tableModel.setRowCount(0);
//        }
//
//        try {
//            // Ganti nama_tabel sesuai dengan nama tabel Anda
//            String query = "SELECT * FROM instructors";
//            try (PreparedStatement preparedStatement = conn.prepareStatement(query);
//                 ResultSet resultSet = preparedStatement.executeQuery()) {
//
//                int columnCount = resultSet.getMetaData().getColumnCount();
//
//                while (resultSet.next()) {
//                    Object[] row = new Object[columnCount];
//                    for (int i = 1; i <= columnCount; i++) {
//                        row[i - 1] = resultSet.getObject(i);
//                    }
//                    tableModel.addRow(row);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    

//    public class DatabaseManager {
//
//        private static final String JDBC_URL = "jdbc:mysql://localhost/gym";
//        private static final String USERNAME = "root";
//        private static final String PASSWORD = "";
//
//        public static void saveInstructors(List<Instructor> instructors) {
//            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
//                for (Instructor instructor : instructors) {
//                    saveInstructor(connection, instructor);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        public static void tambahInstructor(int id, List<Instructor> instructors) throws SQLException {
//            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
//                String insertInstructorQuery = "INSERT INTO instructors (id, name, experience) VALUES (?, ?, ?)";
//                for (Instructor instructor : instructors) {
//                    try (PreparedStatement pstmt = connection.prepareStatement(insertInstructorQuery)) {
//                        pstmt.setInt(1, id);
//                        pstmt.setString(2, instructor.getName());
//                        pstmt.setInt(3, instructor.getExperience());
//                        pstmt.executeUpdate();
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        private static void saveInstructor(Connection connection, Instructor instructor) throws SQLException {
//            String insertInstructorQuery = "INSERT INTO instructors (name, experience) VALUES (?, ?)";
//            try (PreparedStatement pstmt = connection.prepareStatement(insertInstructorQuery, PreparedStatement.RETURN_GENERATED_KEYS)) {
//                pstmt.setString(1, instructor.getName());
//                pstmt.setInt(2, instructor.getExperience());
//                pstmt.executeUpdate();
//
//                try (var generatedKeys = pstmt.getGeneratedKeys()) {
//                    if (generatedKeys.next()) {
//                        int instructorId = generatedKeys.getInt(1);
//
//                        // Save training data
//                        saveTrainings(connection, instructorId, instructor.getTrainings());
//                    }
//                }
//            }
//        }
//
//        private static void saveTrainings(Connection connection, int instructorId, List<Training> trainings) throws SQLException {
//            String insertTrainingQuery = "INSERT INTO training (instructor_id, training_name, start_date, end_date) VALUES (?, ?, ?, ?)";
//            for (Training training : trainings) {
//                try (PreparedStatement pstmt = connection.prepareStatement(insertTrainingQuery)) {
//                    pstmt.setInt(1, instructorId);
//                    pstmt.setString(2, training.getNameTrain());
//                    pstmt.setDate(3, java.sql.Date.valueOf(training.getDateStart()));
//                    pstmt.setDate(4, java.sql.Date.valueOf(training.getDateEnd()));
//                    pstmt.executeUpdate();
//                }
//            }
//        }
//
//    }
     
}
