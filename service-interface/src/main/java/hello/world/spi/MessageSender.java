package hello.world.spi;

public interface MessageSender {
    void send(String target, String message);
}
