package www.proxy.Cglib;

import www.proxy.jdk.UserService;
import www.proxy.jdk.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

public class Main2 {  
    public static void main(String[] args) {  
        CglibProxy cglibProxy = new CglibProxy();  
  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(UserServiceImpl.class);  
        enhancer.setCallback(cglibProxy);  
  
        UserService o = (UserService)enhancer.create();  
        o.getName(1);  
        o.getAge(1);  
    }  
}  
