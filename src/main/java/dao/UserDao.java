package dao;

import models.Auto;
import models.Friend;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

public class UserDao {

    public Friend findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Friend.class, id);
    }

    public void save(Friend friend) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(friend);
        tx1.commit();
        session.close();
    }

    public void update(Friend friend) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(friend);
        tx1.commit();
        session.close();
    }

    public void delete(Friend friend) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(friend);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<Friend> findAll() {
        List<Friend> friends = (List<Friend>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Friend").list();
        return friends;
    }
}
