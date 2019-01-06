import bean.Student;
import bean.Teacher;
import ioc.BeanDifined;
import ioc.BeanFactory;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = loadConfig();
        Teacher teacher = (Teacher)beanFactory.getBean("teacher");
        Student student = (Student)beanFactory.getBean("student");
        System.out.println(teacher);
    }

    /**
     * 模拟加载配置文件
     */
    private static BeanFactory loadConfig() {
        BeanFactory factory = new BeanFactory();
        List<BeanDifined> beanDifineds = new ArrayList<BeanDifined>();
        String beanid = "teacher";
        String beanClass = "bean.Teacher";
        BeanDifined item = new BeanDifined();
        item.setBeanId(beanid);
        item.setBeanClassPath(beanClass);
        beanDifineds.add(item);
        factory.setBeanDifineds(beanDifineds);
        return  factory;
    }
}
