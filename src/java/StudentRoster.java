/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentroster;

/**
 *
 * @author Renee
 */

//Step 1: Define the POJO studentroster class
public class StudentRoster {
    public static void Main(String args[]){ 
    }  
    
//Define the attributes of a studentroster
    private int studentId;
    private String firstName;
    private String lastName;
    private int busNumber;

//Constructor of a new studentroster; setting the attributes)
    public StudentRoster(String firstName, String lastName, int studentId, int busNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.busNumber = busNumber;
    }

//Declare the setters to change the attributes of the studentroster 
    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public void setStudentId(int student_id) {
        this.studentId = student_id;
    }

    public void setBusNumber(int bus_number) {
        this.busNumber = bus_number;
    }

//Declare the getter for the attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getstudentId() {
        return studentId;
    }

    public int getBusNumber() {
        return busNumber;
    }
}
