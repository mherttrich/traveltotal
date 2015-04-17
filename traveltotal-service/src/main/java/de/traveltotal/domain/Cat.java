package de.traveltotal.domain;

/**
 * Created by micha on 19.03.15.
 */
public class Cat {

    private final String name;

    private final String color;

    private final int age;

    private Cat(CatBuilder b) {
        this.name = b.name;
        this.color = b.color;
        this.age = b.age;
    }

    public static class CatBuilder {
        private final String name;

        private String color;

        private int age;

        public CatBuilder(String name) {
            this.name = name;
        }

        public CatBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CatBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }

}
