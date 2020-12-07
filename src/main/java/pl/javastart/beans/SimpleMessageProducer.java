package pl.javastart.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer {
    @Override
    public String getMsg() {
        return "Simple msg" + System.currentTimeMillis();
    }
}
