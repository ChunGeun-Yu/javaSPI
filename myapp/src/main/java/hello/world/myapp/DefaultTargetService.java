package hello.world.myapp;

import org.springframework.stereotype.Component;

@Component
public class DefaultTargetService implements TargetService {
    @Override
    public String call() {
        return "default target service";
    }
}
