import com.yang.mapper.UserMapper;
import com.yang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = context.getBean("userMapper", UserMapper.class);
        List<User> userList = bean.selectUser();
            System.out.println(userList);

    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
