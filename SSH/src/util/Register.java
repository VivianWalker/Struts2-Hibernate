package util;

import java.util.Iterator;
import java.util.List;

import model.Users;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Register {

	public static boolean val(String username){
		boolean flag=false;
		Configuration config=new Configuration().configure();
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		//session.clear();
		session.beginTransaction();
		String hql="from Users where username=?";
		Query query=session.createQuery(hql);
		query.setString(0,username);
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
	public static boolean reg(String username,String password){
		boolean flag=false;
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		Users s=new Users();
		s.setUsername(username);
		s.setPassword(password);
		session.save(s);
		session.getTransaction().commit();
		sf.close();
		return flag;
	}
}
