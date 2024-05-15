package hello.world.myapp;

import hello.world.spi.MessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ServiceLoader;

@Component
@Slf4j
public class ServiceRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        ServiceLoader<MessageSender> serviceLoader = ServiceLoader.load(MessageSender.class);
        log.info("spi first: {}", serviceLoader.findFirst());
        for (MessageSender messageSender : serviceLoader) {
            log.info("messageSender: {}", messageSender.getClass());
            messageSender.send("devOcean", "hello world!");
        }
    }
}
