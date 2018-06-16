package demo;

import entity.Instructor;
import entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetInstructorDetailDemo {

    public static void main(String[] args) {
        Instructor myInstructor = new Instructor("Chad", "Darby", "darby@luv2code.com");
        InstructorDetail myInstructorDetail = new InstructorDetail("http://webside.com", "luv 2 code");
        myInstructor.setInstructorDetail(myInstructorDetail);
    }

    private static void getInstructorFromDB(Instructor instructor) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            int myId = 1;
            InstructorDetail tempInstDet = session.get(InstructorDetail.class, myId);
            System.out.println(tempInstDet);
            System.out.println("Associated Instructor: " + tempInstDet.getInstructor());
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
