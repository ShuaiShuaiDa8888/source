package mqDemoSpring;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.*;


/**
 * Created by WS on 2018/6/24.
 * 同一个配置文件下应该不能既设置成queue又设置成topic，
 * 如果想使用点对点，就在此类中使用：Queue queue = (Queue) applicationContext.getBean("queueDestination");
 *      配置文件中使用：<property name="destination" ref="queueDestination" />
 * 如果想使用发布订阅，就在此类中使用：Topic queue = (Topic) applicationContext.getBean("topicDestination");
 *      配置文件中使用：<property name="destination" ref="topicDestination" />
 */
public class QueueProducer {
    public static void main(String[] args) {
//        第一步：初始化一个Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext-activemq.xml");
//        第二步：从容器中获得JMSTemplate对象
        JmsTemplate jmsTemplate = applicationContext.getBean(JmsTemplate.class);
//        第三步：从容器中获得一个Destination对象
        Queue queue = (Queue) applicationContext.getBean("queueDestination");
//        Topic queue = (Topic) applicationContext.getBean("topicDestination");
//        第四步：使用JMSTemplate对象发送消息，需要知道Destination.
        jmsTemplate.send(queue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage("spring text activeMQ");
                return textMessage;
            }
        });
    }
}
