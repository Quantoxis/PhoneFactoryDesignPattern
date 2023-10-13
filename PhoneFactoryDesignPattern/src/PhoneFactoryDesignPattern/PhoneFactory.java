/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneFactoryDesignPattern;

/**
 *
 * @author arich
 */
public class PhoneFactory {

    public interface Phone {

        void ring();
    }

    public class Android implements Phone {

        public void ring() {
            System.out.println("ring");
        }

    }

    public class Iphone implements Phone {

        public void ring() {
            System.out.println("ring but apple");
        }
    }

    public class Windows implements Phone {

        public void ring() {
            System.out.println("ring but windows");
        }
    }

    public class Symbian implements Phone {

        public void ring() {
            System.out.println("ring but symbian");
        }
    }

    public Phone getPhone(String phoneType) {

        if (phoneType == null) {
            return null;
        }

        if (phoneType.equalsIgnoreCase("android")) {
            return new Android();
        } else if (phoneType.contains("iphone")) {
            return new Iphone();
        } else if (phoneType.contains("windows")) {
            return new Windows();
        } else if (phoneType.contains("symbian")) {
            return new Symbian();
        }
        return null;
    }
}
