package cn.alphahub.builder;

public class AirshipDirectorImpl implements AirshipDirector {
    private AirshipBuilder builder;

    public AirshipDirectorImpl(AirshipBuilder builder) {
        this.builder = builder;
    }

    public AirshipBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(AirshipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Airship directAirship() {
        Engine engine = builder.buildEngine();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        EscapeTower escapeTower = builder.buildEscapeTower();
        return new Airship(orbitalModule, engine, escapeTower);
    }
}
