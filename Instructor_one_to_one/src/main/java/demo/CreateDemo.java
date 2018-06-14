package demo;

import entity.Instructor;
import entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CreateDemo {

    public static void main(String[] args) {
        Instructor myInstructor = new Instructor("Chad", "Darby", "darby@luv2code.com");
        InstructorDetail myInstructorDetail = new InstructorDetail("http://webside.com", "luv 2 code");
        myInstructor.setInstructorDetail(myInstructorDetail);
        insertInstructorIntoDB(myInstructor);
    }

    private static void insertInstructorIntoDB(Instructor instructor) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }

    private static void printList(List<Instructor> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
