package mqDemo;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by WS on 2018/6/24.
 *
 * 点对点Queue：先启动生产者还是消费者都没有关系
 * 发布订阅Topic：应该先启动消费者，再启动生产者
 */
public class QueueProducer {
    public static void main(String[] args) throws JMSException {
//        第一步：创建ConnectionFactory对象，需要指定服务端IP及端口号
//        brokerURL服务器的IP及端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.109.128:61616");
//        第二步：使用ConnectionFactory对象创建一个Connection对象。
        Connection connection = connectionFactory.createConnection();
//        第三步：开启连接，调用Connection对象的start方法
        connection.start();
//        第四步：使用Connection 对象创建session对象：
//        第一个参数：是否开启事务。true：开启事务，第二个参数忽略
//        第二个参数：当第一个参数为false时，才有意义。消息应答模式：1、自动应答；2、手动应答。一般为自动应答
//        Session.AUTO_ACKNOWLEDGE为自动确认，客户端发送或接收消息不需要做额外的工作。异常也会确认消息，应该是执行之前确认的。
//        Session.CLIENT_ACKNOWLEDGE为客户端确认。客户端接收到消息后，必须调用javax.jms.Message的acknowledge方法。jms服务器才会删除消息。
//        可以在失败的时候不确认消息，不确认的话不会移出队列，一直存在，下次启动继续接受。接收消息的链接不断开，其他消费者也不会接收（正常情况下队列模式不存在其他消费者）
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        第五步：使用Session对象创建一个Destination对象（topic, queue）,此处创建一个queue对象
//        参数：队列的名称
        Destination queue = session.createQueue("test-queue");
//        第六步：使用Session对象创建一个Producer对象
        MessageProducer producer = session.createProducer(queue);
//        设置生产者的模式，有两种可选：
//        DeliveryMode.PERSISTENT 当activemq关闭的时候，队列数据将会被保存（默认值）
//        DeliveryMode.NON_PERSISTENT 当activemq关闭的时候，队列里面的数据将会被清空
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
//        第七步：创建一个Message对象，创建一个TextMessage对象
        TextMessage textMessage = session.createTextMessage("hello activeMQ");
//        第八步：使用producer对象发送消息
        producer.send(textMessage);
//        第九步：关闭资源
        producer.close();
        session.close();
        connection.close();
    }
}
