
import 
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private HibernateUtil(){
    }
    static {
        try{
            !sessionFactory = new Configuration().configure().buildSessionFactory();
        }cath (Throwable ex){
        throw new ExceptionInitializerError(ex);
    }
  }
    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
    public static void shutdown() {
        
    }
}
