package com.yn.factory;

/**
 * @author yn
 * @class MyGithub
 * @describe
 * @date 2020/12/7-11:16
 */
public class FactoryTest {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(Bird.class);
        animal.eat();
    }
}
