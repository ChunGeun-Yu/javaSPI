package hello.world.myapp;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanRunner implements ApplicationRunner {

    @Autowired
    private TargetService targetService;

    @Autowired
    private GenericApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("targetService: {}, {}", targetService.getClass(), System.identityHashCode(targetService));
        TargetService bean = applicationContext.getBean(TargetService.class);
        log.info("bean: {}, {}", bean.getClass(), System.identityHashCode(bean));
    }
}
