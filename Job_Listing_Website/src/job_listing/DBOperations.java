package job_listing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperations {
    //establish a connection to the db
    //create an object of the DBConnection class
    DBConnection dbc = new DBConnection();

    //variable to hold the connection
    Connection conn = dbc.dbConnection();

    /*------------------method to insert data-------------------*/
    public void job_seeker_insert(String username, String password){
        String insertQuery = "INSERT INTO `job_seeker` (`username`, `password`) VALUES (?, ?)";

        //create a preparedStatement
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.executeUpdate();

            System.out.println("New user " + username + " has been added to the database");
        }catch (SQLException sqle){
            System.out.println("Could not insert new user " + sqle.getMessage());
        }

    }

    /*------------------method to select data-------------------*/
    public String job_seeker_select(){
        //query to select everything from the table users
        String selectQuery = "SELECT * FROM job_seeker";
        PreparedStatement pst;
        ResultSet rs = null;
        String username = "";
        String data = "";
        try {
            pst = conn.prepareStatement(selectQuery);
            rs = pst.executeQuery();

            while (rs.next()){
                username = rs.getString(1);
                data = (username);
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return data;
    }

    /*------------------method to delete data-------------------*/
    public void job_seeker_delete(String username) {
        PreparedStatement pst;
        String sqlquery = "delete from job_seeker where username = ?";
        try {
            pst = conn.prepareStatement(sqlquery);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("User: " + username + " has been deleted");
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    /*------------------method to update data-------------------*/
    public void job_seeker_update(String new_username, String old_username, String password){
        String sqlQuery = "UPDATE job_seeker SET username = ?, password = ? WHERE username = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setString(1, new_username);
            pstmt.setString(2, password);
            pstmt.setString(3, old_username);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully");
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
            System.out.println("Could not update the record");
        }
    }



    /*------------------method to insert data-------------------*/
    public void organization_insert(String username, String password){
        String insertQuery = "INSERT INTO `organization` (`username`, `password`) VALUES (?, ?)";

        //create a preparedStatement
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.executeUpdate();

            System.out.println("New user " + username + " has been added to the database");
        }catch (SQLException sqle){
            System.out.println("Could not insert new user " + sqle.getMessage());
        }

    }

    /*------------------method to select data-------------------*/
    public String organizaton_select(){
        //query to select everything from the table users
        String selectQuery = "SELECT * FROM organization";
        PreparedStatement pst;
        ResultSet rs = null;
        String username = "";
        String data = "";
        try {
            pst = conn.prepareStatement(selectQuery);
            rs = pst.executeQuery();

            while (rs.next()){
                username = rs.getString(1);
                data = (username);
            }
        }catch (SQLException sql){
            System.out.println(sqle.getMessage());
        }
        return data;
    }

    /*------------------method to delete data-------------------*/
    public void organization_delete(String username) {
        PreparedStatement pst;
        String sqlquery = "delete from organization where username = ?";
        try {
            pst = conn.prepareStatement(sqlquery);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("User: " + username + " has been deleted");
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    /*------------------method to update data-------------------*/
    public void organizaton_update(String new_username, String old_username, String password){
        String sqlQuery = "UPDATE organization SET username = ?, password = ? WHERE username = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setString(1, new_username);
            pstmt.setString(2, password);
            pstmt.setString(3, old_username);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully");
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
            System.out.println("Could not update the record");
        }
    }



    /*------------------method to insert data-------------------*/
    public void advertsement_insert(String title, String date, String content){
        String insertQuery = "INSERT INTO `advertisement` (`title`, `date`, `content`) VALUES (?, ?, ?)";

        //create a preparedStatement
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, title);
            pst.setString(2, date);
            pst.setString(3, content);
            pst.executeUpdate();

            System.out.println("New advert " + title + " has been added to the database");
        }catch (SQLException sqle){
            System.out.println("Could not insert new advert " + sqle.getMessage());
        }

    }

    /*------------------method to select data-------------------*/
    public String advertisement_select(){
        //query to select everything from the table users
        String selectQuery = "SELECT * FROM advertisement";
        PreparedStatement pst;
        ResultSet rs = null;
        String title = "";
        String date = "";
        String content = "";
        String data = "";
        try {
            pst = conn.prepareStatement(selectQuery);
            rs = pst.executeQuery();

            while (rs.next()){
                title = rs.getString(1);
                date = rs.getString(2);
                content = rs.getString(3);
                data = (title + " " + date + " " + content);
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return data;
    }

    /*------------------method to delete data-------------------*/
    public void advertisement_delete(String title) {
        PreparedStatement pst;
        String sqlquery = "delete from advertisement where title = ?";
        try {
            pst = conn.prepareStatement(sqlquery);
            pst.setString(1, title);
            pst.executeUpdate();
            System.out.println("Advert: " + title + " has been deleted");
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    /*------------------method to update data-------------------*/
    public void advertisement_update(String old_title, String new_title, String date, String content){
        String sqlQuery = "UPDATE advertisement SET title = ?, date = ?, content = ? WHERE title = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setString(1, new_title);
            pstmt.setString(2, date);
            pstmt.setString(3, content);
            pstmt.setString(4, old_title);
            pstmt.executeUpdate();
            System.out.println("Record updated successfully");
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
            System.out.println("Could not update the record");
        }
    }





    /*------------------method to insert data-------------------*/
    public void application_insert(String name, String email, int phone_number, String address, String dob, String gender, String nationality, String job_title, String work_experience, String education, String personal_skills, String other_skills){
        String insertQuery = "INSERT INTO `application` (`name`, `email`, `phone_number`, `address`, `dob`, `gender`, `nationality`, `job title`, `work_experience`, `education`, `personal_skills`, `other_skills`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        //create a preparedStatement
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setInt(3, phone_number);
            pst.setString(4, address);
            pst.setString(5, dob);
            pst.setString(6, gender);
            pst.setString(7, nationality);
            pst.setString(8, job_title);
            pst.setString(9, work_experience);
            pst.setString(10, education);
            pst.setString(11, personal_skills);
            pst.setString(12, other_skills);
            pst.executeUpdate();

            System.out.println("New application has been added to the database");
        }catch (SQLException sqle){
            System.out.println("Could not insert new application " + sqle.getMessage());
        }

    }

    /*------------------method to select data-------------------*/
    public String application_select(){
        //query to select everything from the table users
        String selectQuery = "SELECT * FROM application";
        PreparedStatement pst;
        ResultSet rs = null;
        String name = "";
        String email = "";
        int phone_number;
        String address = "";
        String dob = "";
        String gender = "";
        String nationality = "";
        String job_title = "";
        String work_experience = "";
        String education = "";
        String personal_skills = "";
        String other_skills = "";

        String data = "";
        try {
            pst = conn.prepareStatement(selectQuery);
            rs = pst.executeQuery();

            while (rs.next()){
                name = rs.getString(1);
                email = rs.getString(2);
                phone_number = rs.getInt(3);
                address = rs.getString(4);
                dob = rs.getString(5);
                gender = rs.getString(6);
                nationality = rs.getString(7);
                job_title = rs.getString(8);
                work_experience = rs.getString(9);
                education = rs.getString(10);
                personal_skills = rs.getString(11);
                other_skills = rs.getString(12);

                data = (name + " " + email + " " + phone_number + " " + address + " " + dob + " " + gender + " " + nationality + " " + job_title + " " + work_experience + " " + education + " " + personal_skills + " " + other_skills);
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return data;
    }

    /*------------------method to delete data-------------------*/
    public void application_delete(String email) {
        PreparedStatement pst;
        String sqlquery = "delete from application where email = ?";
        try {
            pst = conn.prepareStatement(sqlquery);
            pst.setString(1, email);
            pst.executeUpdate();
            System.out.println("Applicant: " + email + " has been deleted");
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    /*------------------method to update data-------------------*/
    public void application_update(String name, String old_email, String new_email, int phone_number, String address, String dob, String gender, String nationality, String job_title, String work_experience, String education, String personal_skills, String other_skills){
        String sqlQuery = "UPDATE application SET name = ?, email = ?, phone_number = ?, address = ?, dob = ?, gender = ?, nationality = ?, `job title` = ?, work_experience = ?, education = ?, personal_skills = ?, other_skills = ? WHERE email = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sqlQuery);
            pst.setString(1, name);
            pst.setString(2, new_email);
            pst.setInt(3, phone_number);
            pst.setString(4, address);
            pst.setString(5, dob);
            pst.setString(6, gender);
            pst.setString(7, nationality);
            pst.setString(8, job_title);
            pst.setString(9, work_experience);
            pst.setString(10, education);
            pst.setString(11, personal_skills);
            pst.setString(12, other_skills);
            pst.setString(13, old_email);
            pst.executeUpdate();
            System.out.println("Record updated successfully");
        }catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
            System.out.println("Could not update the record");
        }
    }
}
