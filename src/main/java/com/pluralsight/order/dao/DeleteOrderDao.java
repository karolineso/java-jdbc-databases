package com.pluralsight.order.dao;

import com.pluralsight.order.dto.ParamsDto;
import com.pluralsight.order.util.Datebase;
import com.pluralsight.order.util.ExceptionHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.util.List;

/**
 * DAO to delete n order
 */
public class DeleterOrderDao {
    private Database database;
    
    /**
    * Constructor
    * @param database Database object
    */
    public DeleteOrderDao(Database database) {
        this.database = database;
    }
 
    /**
     * Delets one or more orders using their IDs
     * @param paramsDto Object with the paramenters for the operation
     * @return Number of orders deleted
     */
    public int deleteOrdersById(ParamsDto paramDto) {
        int numbersResults = 0;
        
        try (Connection con = null;
             PreparedStatement ps = createPreparedStatement(con, paramsDto.getOrderIds())
        ) {
            
        } catch (SQLException ex) {
            ExceptionHandler.handlerException(ex);
        }
        
        return numberResults;
    }
    
    /**
     * Method to build the delete SQL statement
     * @param orderIds IDs of the orders to delete 
     * @return Delete SQL statement 
     */ 
    private String buildDeleteSql(List<Long> orderIds) {
        String ids = null;
        
        return "DELETE FROM orders o WHERE o.order_id IN (" + ids + ")";
    }

    /**
     * Creates a PreparedStatement object to delete one or more orders
     * @param con Connection object 
     * @param orderIds Order IDs to set on the PreparedStatement
     * @return A PreparedStatement object 
     * @throws SQLException In case of an error 
     */
    private PreparedStatement createPreparedStatement(Connection con, List<Long> orderIds) throws SQLException {
        String sql = buildDeleteSql(ordersIds);
        PreparedStatement ps = null;
        
        return ps;
    }
}















  


 




 




  
















 
 



  
    
     
    
    
   
       
        

        
    

