package com.ProjectNull.practice0725.Animals;

public class Application {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.eat("참치");


        Animal cat = new Cat();
        cat.eat("참치");
        cat.sleep(15);


        Animal dog = new Dog();
        dog.eat("고기");
        dog.sleep(10);

        ((Cat)cat).ggukgguk();
        cat.feelHappy("꾹꾹이");
        ((Dog)dog).shakeTail();
        dog.feelHappy("꼬리흔들기");
    }
}
