package com.systechafrica.part2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MysqlDataAccess implements DataAccess{
    public MysqlDataAccess(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            
        }
    }
        

   

  //  @Override
    //public Connection connect() {
        //Connection connection=DriverManager.getConnection(null, null, null)

    //}
  

    @Override
    public ResultSet executeQuery(String query) {
        
        return null;
    }

    @Override
    public int executeUpdate(String query) {

        return 0;
    }
     @Override
    public void close() {
        
        
    }




    @Override
    public Connection connect() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connect'");
    }
    
}
