package mqDemoSpring;

import org.apache.activemq.command.ActiveMQDestination;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by WS on 2018/6/24.
 */
public class QueueMyMessageListener implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
//            获取队列名
            ActiveMQDestination jmsDestination = (ActiveMQDestination) message.getJMSDestination();
            System.out.println("队列名：" + jmsDestination.getPhysicalName());
            TextMessage textMessage = (TextMessage) message;
//            取消息内容
            String text = textMessage.getText();
            System.out.println(text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
