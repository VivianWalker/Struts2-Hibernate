package util;

import java.util.Iterator;
import java.util.List;

import model.Users;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Login {

	public static boolean validate(String username,String password){
		boolean flag=false;
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		//session.clear();
		session.beginTransaction();
		String hql="from Users where username=? and password=? ";
		Query query=session.createQuery(hql);
		query.setString(0,username);
		query.setString(1,password);
		List<Users> list=query.list();
		Iterator iter=list.iterator();
		if(iter.hasNext()){
			flag=true;
		}
		session.getTransaction().commit();
		session.close();
		sf.close();
		return flag;

	}
}
