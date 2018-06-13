/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renee
 */
import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageStudentRoster {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        ManageStudentRoster ME = new ManageStudentRoster();

        /* Add student records in database */
        Integer studentID1 = ME.addStudent("Lanhi", "Jung", 1378);
        Integer studentID2 = ME.addStudent("Yara", "Khalani", 2432);
        Integer studentID3 = ME.addStudent("Malek", "Mahammad", 1871);

        /* List down all the students */
        ME.listStudents();

        /* Update student's records */
        ME.updateStudent(studentID1, 1378);
        ME.updateStudent(studentID2, 2432);
        ME.updateStudent(studentID3, 1871);

        /* Delete an student from the database */
        ME.deleteStudent(studentID2);

        /* List down new list of the students */
        ME.listStudents();
    }

    /* Method to CREATE an student in the database */
    public Integer addStudent(String firstname, String lastname, int studentid, int busnumber, int seatnumber) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer studentID = null;

        try {
            tx = session.beginTransaction();
            Student student = new Student(firstname, lastname, studentid, busnumber, seatnumber);
            studentID = (Integer) session.save(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return studentID;
    }

    /* Method to  READ all the students */
    public void listStudents() {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List students = session.createQuery("FROM StudentRoster").list();
            for (Iterator iterator = students.iterator(); iterator.hasNext();) {
                Student student = (Student) iterator.next();
                System.out.print("First Name: " + student.getFirstName());
                System.out.print("Last Name: " + student.getLastName());
                System.out.println("Student Id: " + student.getStudentId());
                System.out.println("Bus Number: " + student.getBusNumber());
                System.out.println("Seat Number: " + student.getSeatNumber());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    /* Method to UPDATE busnumber for an student */
    public void updateStudentRoster(Integer StudentID, int busNumber) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = (Student) session.get(Student.class, StudentID);
            student.setStudentId(student);
            session.update(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    /* Method to DELETE a student from the records */
    public void deleteStudentRoster(Integer StudentID) {
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Student student = (Student) session.get(Student.class, StudentID);
            session.delete(student);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }
//Add generated methods for the student.

    private Integer addStudent(String Lanhi, String jung, int i) {
        throw new UnsupportedOperationException("Lanhi Jung" + "Yara Kalani" + "Malek Mah");
    }
//Update methods for the student.

    private void updateStudent(Integer studentID1, int i) {
        throw new UnsupportedOperationException("Student ID" + 1378);
    }
//Delete methods for the student.

    private void deleteStudent(Integer studentID2) {
        throw new UnsupportedOperationException("Yara Khalani");
    }
}
