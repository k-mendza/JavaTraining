package demo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
//        Student myStudent = new Student("Carlos", "Santana", "carlos@test.com");
//        insertStudentIntoDB(myStudent);
        System.out.println(getStudentFromDB(1));
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
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return student;
    }
}
