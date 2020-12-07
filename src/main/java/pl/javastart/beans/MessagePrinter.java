package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    MessageProducer producer;

    public MessagePrinter() {
    }

    public MessagePrinter(MessageProducer messageProducer) {
        this.producer = messageProducer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print(){
        System.out.println(producer.getMsg());
    }
}
