/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlconnection;

import java.sql.*;

/**
 *
 * @author prakashchandraprasad
 */

class mySqlAccess{
    public void readDataBase() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"+"user=root&password=adminadmin");
        // Statements allow to issue SQL queries to the database
        Statement statement = connect.createStatement();
        // Result set get the result of the SQL query
        ResultSet resultSet = statement.executeQuery("select * from feedback.comments");
        displayResultSet(resultSet);
        // The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.
        PreparedStatement preparedStatement = connect.prepareStatement("insert into  feedback.comments values(default,?,?,?,?,?,?)");
                    // Parameters start with 1
            preparedStatement.setString(1, "Test");
            preparedStatement.setString(2, "TestEmail@gmail.com");
            preparedStatement.setString(3, "www.testWebpage.com");
            preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
            preparedStatement.setString(5, "TestSummary");
            preparedStatement.setString(6, "TestComment");
            preparedStatement.executeUpdate();
            
            preparedStatement = connect.prepareStatement("select myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            resultSet = preparedStatement.executeQuery();
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
            displayResultSet(resultSet);
            
            resultSet.close();
            statement.close();
            connect.close();
        
        
        
        }catch(Exception e){
            System.out.println(e);
        }finally{
            
        }
        
        
    
}
    private void displayResultSet(ResultSet resultSet) throws SQLException{
        while(resultSet.next()){
            String user = resultSet.getString("myuser");
            String website = resultSet.getString("webpage");
            String summary = resultSet.getString("summary");
            Date date = resultSet.getDate("datum");
            String comment = resultSet.getString("comments");
            System.out.println("User: " + user);
            System.out.println("Website: " + website);
            System.out.println("summary: " + summary);
            System.out.println("Date: " + date);
            System.out.println("Comment: " + comment);
            System.out.println("===============================================");
        }
    }

    
}
public class MySqlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       mySqlAccess mysql = new mySqlAccess();
       mysql.readDataBase();
        
    }
    
}
