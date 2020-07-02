/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce.DAO;

import ecommerce.models.User;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hungv
 */
public class UserDAO {

    public DatabaseConnection dbConnector;

    public UserDAO() {
        try {
            dbConnector = DatabaseConnection.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateUserDAO(User user) throws SQLException {
        String sql = "UPDATE tbl_user "
                + "SET [address_id] = ? "
                + ",[user_fullname] = ? "
                + ",[user_email] = ? "
                + ",[user_phone] = ? "
                + ",[user_gender] = ? "
                + ",[user_dateOfBirth] = ? "
                + "WHERE user_id = ?";
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setLong(1, user.getAddress_id());
        ps.setString(2, user.getUser_fullName());
        ps.setString(3, user.getUser_email());
        ps.setString(4, user.getUser_phone());
        ps.setInt(5, 0);
        if (user.getUser_gender()) {
            ps.setInt(5, 1);
        }
        ps.setDate(6, Date.valueOf(user.getUser_dateOfBirth()));
        ps.setLong(7, user.getUser_id());

        ps.executeUpdate();
        System.out.println("Cập nhật thành công !");

    }

    public void insertUserDAO(long address_id, String user_fullname, String user_password, String user_email, String user_phone, boolean user_gender, LocalDate user_dateOfBirth) throws SQLException {
        String sqlq = "INSERT INTO tbl_user (address_id, user_fullname, user_password, user_email, user_phone, user_gender, user_dateOfBirth) "
                + "VALUES (?,?,?,?,?,?,?)";

        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1, address_id);
        ps.setString(2, user_fullname);
        ps.setString(3, user_password);
        ps.setString(4, user_email);
        ps.setString(5, user_phone);
        ps.setBoolean(6, user_gender);

        ps.setDate(7, Date.valueOf(user_dateOfBirth));

        ps.execute();
        System.out.println("Thêm tài khoản user thành công !");
    }

public void deleteUserDAO(long user_id) throws SQLException{
        String sqlq = "DELETE FROM tbl_user WHERE user_id = ?";
        
        Connection conn = dbConnector.getConnection();
        PreparedStatement ps = conn.prepareStatement(sqlq);
        ps.setLong(1,user_id);
        ps.execute();
        System.out.println("Xóa tài khoản user thành công !");
        
    }
}
