import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import cn.bugstack.springframework.beans.factory.support.DefaultListableBeanFactory;

public class InstantiationStrategyTest {
    public static void main(String[] args) throws BeansException {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(User.class);

        factory.registerBeanDefinition("user", beanDefinition);

        User user = (User) factory.getBean("user", 20, true);

        System.out.println(user.toString());
    }
}
