package cn.alphahub.builder;

public class Client {
    public static void main(String[] args) {
        AirshipDirector director=new AirshipDirectorImpl(new AirshipBuilderImpl());
        Airship airship = new Airship( director.directAirship());
        airship.luanch();
    }
}
