package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp2 implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Привет, мир";
    }
}
