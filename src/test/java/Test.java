import com.bdqn.entity.Emp;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
         //配置文件
        Configuration configure = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configure.buildSessionFactory();
        //获取会话
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // 添加数据

          Emp emp = new Emp();
          emp.setName("leilei");
          emp.setPassword("111222");
          emp.setUsername("蕾蕾");
          emp.setIsadmin("是");
          emp.setTelephone("189456789");
           session.save(emp);
          transaction.commit();
          session.close();
       /*  Emp emp = new Emp();
          emp.setName("yuzhiyuan");
          emp.setPassword("123456");
          emp.setIsadmin("否");
          emp.setTelephone("18967561234");
          emp.setUsername("余智渊");

          session.save(emp);
         transaction.commit();
        session.close();*/



       /* 删除数据
        Emp emp = new Emp();
        emp.setId(22);
        emp.setName("余智渊");
        session.delete(emp);

        transaction.commit();
        session.close();*/

       /*  Emp emp =(Emp) session.get(Emp.class,2);
        emp.setPassword("889900");
        transaction.commit();
         if(transaction !=null){
             transaction.commit();
         }
        transaction.rollback();*/

      /* 修改电话
       try {
            Emp emp =(Emp) session.get(Emp.class,1);
            emp.setTelephone("23456789");
            transaction.commit();
        }catch (HibernateException e){
            e.printStackTrace();
            if(transaction!=null)
                transaction.rollback();
        }*/

    //查询
      /*  Emp o =(Emp) session.get(Emp.class, 1);
        o.setUsername("蕾蕾");
        System.out.println(o);

        transaction.commit();
        session.close();*/

     //删除

        //上机四 saveOrUpdate方法

      /*  Emp emp = new Emp();

        emp.setName("yuzhiyuan");
        emp.setPassword("8888888");
        emp.setIsadmin("否");
        emp.setTelephone("18967561234");
        emp.setUsername("余智渊");
        session.saveOrUpdate(emp);

        transaction.commit();
        session.close();
*/
        //merge方法
      /* Emp emp = new Emp();
       emp.setId(21);
        emp.setName("yuzhiyuan");
        emp.setPassword("66666666");
        emp.setIsadmin("是");
        emp.setTelephone("18967561234");
        emp.setUsername("余智渊");

        session.merge(emp);
        transaction.commit();
        session.close();*/




    }
}
