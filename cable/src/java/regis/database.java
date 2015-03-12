

package regis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class database 
{
    public static void main(String[] args) {
        SessionFactory ssf= new Configuration().configure().buildSessionFactory();
        Session ssn= ssf.openSession();
       
        Transaction trx=ssn.beginTransaction();
        UserDetails u=new UserDetails(null, null, null, null, null, null, null);
        ssn.save(u);
        trx.commit();
        
    }
    
}
