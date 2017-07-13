import com.entity.User;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Created by Han on 2017/07/13.
 */
public class UnitTest {

    SqlSession session=null;
    UserService userService=null;
    @Before
    public void setUp() throws Exception {




    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void unitTest(){

        User user=session.selectOne("UserDao.getUser",1 );
        System.out.println(user);

    }
}
