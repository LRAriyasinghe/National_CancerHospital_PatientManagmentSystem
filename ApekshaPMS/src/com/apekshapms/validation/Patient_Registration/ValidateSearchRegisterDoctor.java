package com.apekshapms.validation.Patient_Registration;

import com.apekshapms.database.Connector;

import java.sql.*;

/**
 * Created by Thilina on 9/8/2017.
 * Univercity of Colombo School of Computing
 */
public class ValidateSearchRegisterDoctor {
    public static boolean validate_registerDoc(String emp_id){ //Validate Register Doctor ID in the registerdoctor Table
        try {
            Connection connection = new Connector().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from RegisterDoctor where emp_Id=?");
            preparedStatement.setString(1,emp_id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()){
                return  true;
            }else {
                return false;
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }



    }
}
