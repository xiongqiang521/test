package test;

import com.qs.bean.Users;
import com.qs.dao.impl.DaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {
    @Autowired
    ApplicationContext app;

    @Test
    public void test(){
        DaoImpl dao = app.getBean("dao", DaoImpl.class);
        List<Users> usersList = dao.getAll();
        for (Users users : usersList) {
            System.out.println(users);
        }
    }

}
