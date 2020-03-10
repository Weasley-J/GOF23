package cn.alphahub.builder;

public class AirshipBuilderImpl implements AirshipBuilder {

    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机...");
        return new Engine("构建发动机.");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱...");
        return new OrbitalModule("构建轨道舱.");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建逃逸塔...");
        return new EscapeTower("构建逃逸塔.");
    }
}
