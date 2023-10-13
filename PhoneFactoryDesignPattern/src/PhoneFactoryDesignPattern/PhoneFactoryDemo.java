/*
 * 
 * 
 * 
 */
package PhoneFactoryDesignPattern;

import PhoneFactoryDesignPattern.PhoneFactory;

/**
 *
 * @author arich
 */
public class PhoneFactoryDemo extends PhoneFactory {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
         Phone phone1 = phoneFactory.getPhone("android");
         Phone phone2 = phoneFactory.getPhone("iphone");
         Phone phone3 = phoneFactory.getPhone("symbian");
         
        phone1.ring();
        phone2.ring();
        phone3.ring();
       
        
        
        
    }



}
