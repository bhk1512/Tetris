

package regis;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main extends HttpServlet{
    
     static String fname,lname,email,mobile,add,city,state;
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        fname=request.getParameter("firstname");
        lname=request.getParameter("lastname");
        email=request.getParameter("email");
        mobile=request.getParameter("mobile");
        add=request.getParameter("address");
        city=request.getParameter("city");
        state=request.getParameter("state");
        
    }
   public static void main(String...args)
    {
        
       
        SessionFactory ssf= new Configuration().configure().buildSessionFactory();
        Session ssn= ssf.openSession();
       
        Transaction trx=ssn.beginTransaction();
         UserDetails u = new UserDetails("646", "bharat", "kaushik", "8564", "gug", "sss", "hhkb");
        
        
        ssn.save(u);
        trx.commit();
        
        
        ssn.close();
    
    }
    
}