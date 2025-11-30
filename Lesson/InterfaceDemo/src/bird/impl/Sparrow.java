package bird.impl;

import bird.Flyable;
import bird.NestBuilder;
import bird.Singable;

public class Sparrow implements Flyable, NestBuilder, Singable {
    @Override
    public void fly() {
        System.out.println("麻雀飞");
    }

    @Override
    public void nestBuild() {
        System.out.println("麻雀筑巢");
    }

    @Override
    public void sing() {
        System.out.println("麻雀叫");
    }
}
