package Question_1;

import java.lang.annotation.Annotation;

import javax.xml.soap.SAAJResult;

public class Demo {
    public Animal[] getAnimals(){
        Animal a1= new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Tiger();

        Animal[] arr = {a1,a2,a3};
        return arr;
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Animal[] finnalArr = d1.getAnimals();

        for(Animal a: finnalArr){
            if(a instanceof Dog){
                System.out.println("Dog==========");
                a.makenoise();
                a.eat();
                a.walk();

                ((Dog)a).handshake();
                System.out.println("-------------");
            }
            else if(a instanceof Cat){
                System.out.println("Cat________________");

                a.makenoise();
                a.eat();
                a.walk();


                System.out.println("-----------------");



            }
            else{
                System.out.println("Tiger--------------");
                a.makenoise();
                a.eat();
                a.walk();
                System.out.println("===========");
            }
        }
    }
}
