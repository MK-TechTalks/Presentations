package com.company.Factory;

interface Dog {

    public void bark();
}

class Chihuahua implements Dog{

    public void bark(){
        System.out.println("I bark like a Chihuahua");
    }
}


class GermanShepherd implements Dog{

    public void bark(){
        System.out.println("I bark like a German Shepherd");
    }
}

class Pug implements Dog{

    public void bark(){
        System.out.println("I bark like a Pug");
    }
}

 class DogFactory {

     public Dog getInstance(String dog) {

         if (dog.equals("german")) {
             return new GermanShepherd();
         } else if (dog.equals("chihuahua")) {
             return new Chihuahua();
         } else {
             return new Pug();
         }
     }
 }

 class DogClient{

     public static void main(String[] args) {

         DogFactory type =new DogFactory();

         Dog dog = type.getInstance("german");

         dog.bark();
     }
 }