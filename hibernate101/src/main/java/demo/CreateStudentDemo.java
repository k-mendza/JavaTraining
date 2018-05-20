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
        List<Student> myStudents = getStudentsFromDBbyQuery("FROM Student");
        printList(myStudents);
        myStudents = getStudentsFromDBbyQuery("FROM Student s WHERE s.email like '%@test.com'");
        printList(myStudents);
        updateStudentNameFromDB(1, "Paul");
        myStudents = getStudentsFromDBbyQuery("FROM Student");
        printList(myStudents);
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

    private static Student getStudentFromDBbyId(int studentId){
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

    private static List<Student> getStudentsFromDBbyQuery(String query){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        List<Student> studentsList = new ArrayList<>();
        try {
            session.beginTransaction();
            studentsList = session.createQuery(query).getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return studentsList;
    }

    private static void updateStudentNameFromDB(int studentId, String name){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Student student = new Student();
        try {
            session.beginTransaction();
            student = session.get(Student.class, studentId);
            student.setFirstName(name);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }

    private static void printList(List<Student> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
