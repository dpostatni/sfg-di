package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Danillo Postatni Moreno on 19/09/2022
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
