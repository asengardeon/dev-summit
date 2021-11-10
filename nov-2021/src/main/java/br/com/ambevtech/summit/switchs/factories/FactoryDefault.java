package br.com.ambevtech.summit.switchs.factories;

public class FactoryDefault implements IFactory{
    private final String name;

    private Boolean connected = false;

    public FactoryDefault(String name) {
        this.name = name;
    }

    public Boolean testConnection(){
        return connected;
    }

    public Boolean reconnect(){
        connected = !connected;
        return connected;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
