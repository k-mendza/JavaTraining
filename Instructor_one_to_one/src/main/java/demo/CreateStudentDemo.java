package demo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CreateStudentDemo {

    public static void main(String[] args) {
//        Student myStudent = new Student("Carlos", "Santana", "carlos@test.com");
//        insertStudentIntoDB(myStudent);
    }

    private static void insertStudentIntoDB(Student student) {
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

    private static void printList(List<Student> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
