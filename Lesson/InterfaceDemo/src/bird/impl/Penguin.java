package bird.impl;

import bird.Flyable;
import bird.NestBuilder;
import bird.Singable;

public class Penguin implements Flyable, NestBuilder, Singable {
    @Override
    public void fly() {
        System.out.println("企鹅飞");
    }

    @Override
    public void nestBuild() {
        System.out.println("企鹅筑巢");
    }

    @Override
    public void sing() {
        System.out.println("企鹅叫");
    }
}
