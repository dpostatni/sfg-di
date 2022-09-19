package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Danillo Postatni Moreno on 19/09/2022
 */
@Primary // Serviço padrão - Se nenhum serviço especifico for atribuido (@Qualifier)
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From PRIMARY Bean";
    }
}
