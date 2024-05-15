package hello.world.provider;

import hello.world.spi.MessageSender;

public class EmailMessageSender implements MessageSender {
    @Override
    public void send(String target, String message) {
        System.out.println("email message sender");
    }
}
