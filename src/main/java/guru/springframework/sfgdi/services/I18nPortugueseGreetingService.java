package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Danillo Postatni Moreno on 19/09/2022
 */
@Profile("PT")
@Service("i18nService")
public class I18nPortugueseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Olá Mundo - PT";
    }
}
