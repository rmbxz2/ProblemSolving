package testThread; // Generated package name

/** 
 * Describe class ProducerConsumer here.
 * 
 *
 * Created: Thu Jan 26 14:18:30 2017
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class ProducerConsumer {
    public static void main(String[] args) {
	DataC dataC = new DataC();
	Producer producer = new Producer(dataC,"producer");
	Consumer consumer = new Consumer(dataC,"consumer");
	producer.start();
	consumer.start();
    }
}
 
