package br.com.ambevtech.summit.switchs.factories;

public class Factory1 implements IFactory{
    private final String name;

    private Boolean connected = true;

    public Factory1(String name) {
        this.name = name;
    }

    public Boolean testConnection(){
        return connected;
    }

    @Override
    public Boolean reconnect() {
        return connected;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
