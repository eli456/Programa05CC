/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elizabeth PG
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {
    @Override 
    public Empleado create(Empleado p){
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        
        session.save(p);
        t.commit();
        session.close();
        return p:
    }
    
    @Override
    public boolean delete(Long id) {
        throw new UnsupporteOperation
                
    }
}
