package com.qs.dao.impl;

import com.qs.bean.Users;
import com.qs.dao.Dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "dao")
public class DaoImpl extends HibernateTemplate implements Dao {

    public List<Users> getAll(){
        Session session = getSessionFactory().openSession();
        try {
            Transaction transaction = session.beginTransaction();
            String hql = "from Users";
            Query query = session.createQuery(hql);

            List<Users> list = query.list();
            String comment = query.getComment();
            System.out.println(comment);
            transaction.commit();

            return list;
        } finally {
            session.close();
        }
    }
}
