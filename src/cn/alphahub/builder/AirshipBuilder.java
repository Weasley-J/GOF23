package cn.alphahub.builder;

public interface AirshipBuilder {
    Engine buildEngine();

    OrbitalModule buildOrbitalModule();

    EscapeTower buildEscapeTower();
}
