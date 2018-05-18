package demo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CreateStudentDemo {

    public static void main(String[] args) {
//        Student myStudent = new Student("Carlos", "Santana", "carlos@test.com");
//        insertStudentIntoDB(myStudent);
        List<Student> allStudents = getAllStudentsFromDB();

        for (Object obj : allStudents) {
            System.out.println(obj);
        }
    }

    private static void insertStudentIntoDB(Student student){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }

    private static Student getStudentFromDB(int studentId){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Student student = new Student();
        try {
            session.beginTransaction();
            student = session.get(Student.class, studentId);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return student;
    }

    private static List<Student> getAllStudentsFromDB(){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        List<Student> studentsList = new ArrayList<>();
        try {
            session.beginTransaction();
            studentsList = session.createQuery("from Student").getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return studentsList;
    }
}
