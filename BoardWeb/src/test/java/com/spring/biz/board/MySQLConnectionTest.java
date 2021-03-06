package com.spring.biz.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
 
public class MySQLConnectionTest {
 
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://127.0.0.1:3307/board?useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "password";
 
    @Test
    public void getMySQLConnectionTest() {
        
        Connection conn = null;
        Statement stmt = null;
        
        try {
            
            System.out.println("==================== MySQL Connection START ====================");
            
            Class.forName(DRIVER);
            
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            stmt = conn.createStatement();
 
            String sql = "SELECT * FROM BOARD";
 
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                
                String boardTitle = rs.getString("TITLE");
                String boardContent = rs.getString("CONTENT");
                String boardWriter = rs.getString("WRITER");
 
                System.out.print("boardTitle : " + boardTitle + ", ");
                System.out.print("boardContent: " + boardContent + ", ");
                System.out.println("boardWriter: " + boardWriter);
            }
 
            rs.close();
            stmt.close();
            conn.close();
 
        } catch (SQLException se1) {
            se1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        
        System.out.println("==================== MySQL Connection END ====================");
    }
}
 