package com.example.zerobase_wififree.util;

import java.sql.*;

/**
 * https://j2yes.tistory.com/entry/jdbc-dbutil-dao
 */
public class DBUtil {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //DB서버와 Connection을 맺는 작업은 매번 작업할 것이므로 메소드로 빼고
    //접속한 Connection객체를 전달할 수 있도록 리턴타입이 Connection이어야 한다.
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/zerobase?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "difud";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Connection 생성 실패");
            e.printStackTrace();
        }
        return conn;
    }
    //자원 반납 : ResultSet -> Statement -> Connection 순으로 자원반납
    public static void closeResource(ResultSet rs, Statement stmt, Connection conn){
        try {
            if(rs!=null)rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}