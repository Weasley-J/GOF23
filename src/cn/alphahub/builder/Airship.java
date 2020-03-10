package cn.alphahub.builder;

public class Airship {
    private OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔

    public Airship(Airship directAirship) {
    }


    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public Airship() {
    }

    public Airship(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public void luanch(){
        System.out.println("发射...");
    }

}
