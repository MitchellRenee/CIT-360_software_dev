/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renee
 */
class Student {
//attributes of a student
    String name;
    String gender;
    Boolean enrolled;
    int number;

    
//Add GET methods for the class.
    String getFirstName() {
        throw new UnsupportedOperationException("Lanhi"); 
    }
//Add method for last name.    
    String getLastName() {
        throw new UnsupportedOperationException("Jung"); 
    }
  
     String getStudentId() {
        throw new UnsupportedOperationException("Student Id" + 1378);     
    }
   
    Student(String firstname, String lastname, int studentid, int busnumber, int seatnumber) {
        throw new UnsupportedOperationException("Lanhi" +"Jung" + 1378 + 27 + 12); 
    }
        
    java.lang.String getBusNumber() {
        throw new UnsupportedOperationException("Bus Number" + 27); 
    }
    
    String getSeatNumber() {
        throw new UnsupportedOperationException("Seat Number" + 12); 
    }
    
//ADD SET methods for the class.
    void setStudentId(Student student) {
        throw new UnsupportedOperationException("Student Id" + 1378); 
    }  

    
    
}
