package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooksDatabaseAuthorReader {

    public static void main(String[] args) {
            String connectionString =
                    "jdbc:mysql://localhost:3306/books?serverTimezone=UTC&characterEncoding=utf-8";
            String username = "root";
            String password = "jin58801699";
            Connection connection = null;
            PreparedStatement statement = null;
            ResultSet resultset = null;
            try{
                connection =
                        DriverManager.getConnection(connectionString, username, password);
                statement = connection.prepareStatement(
                        "SELECT AuthorID, FirstName, LastName FROM Authors ORDER BY AuthorID");
                resultset = statement.executeQuery();
                while(resultset.next()){
                    System.out.printf("%d %s %s%n", // %n is platform appropriate new-line
                            resultset.getInt("AuthorID"),
                            resultset.getString("FirstName"),
                            resultset.getString("LastName"));
                }
            }
            catch(SQLException e){
                System.err.println("Problem accessing database");
                System.err.println(e.getMessage());
            }
            finally{ // most important lines in this entire program!!!
                try{if(resultset != null){resultset.close();}}
                catch(SQLException e){System.err.println(e.getMessage());}
                try{if(statement != null){statement.close();}}
                catch(SQLException e){System.err.println(e.getMessage());}
                try{if(connection != null){connection.close();}}
                catch(SQLException e){System.err.println(e.getMessage());}
            } // close try-catch
        } // close main
    } // close class

