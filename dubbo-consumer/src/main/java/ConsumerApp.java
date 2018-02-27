import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloService;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃  神兽保佑
 * 　　　　┃　　　┃  代码无bug
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 *
 * @Author Mr.Li
 * @Date 2018/1/29 10:52
 * @Description: TODO
 */

public class ConsumerApp {
    public static void main(String[] args) throws Exception {
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-consumer.xml"});
        //获取在zookeeper注册的服务接口
        HelloService helloService = (HelloService)context.getBean("helloService");
        //调用接口
        System.out.println("HelloService = " + helloService.sayHello("ant"));
        //不让控制台消失，按任意键结束
        System.in.read();
    }
}
