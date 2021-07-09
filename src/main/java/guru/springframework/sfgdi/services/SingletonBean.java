package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean(){
        System.out.print("Initiating Singleton Bean");
    }
    public String getMyScope()
    {
        return "I am a Singleton set";
    }
}
