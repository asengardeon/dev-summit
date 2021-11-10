package br.com.ambevtech.summit.switchs.factories;

public class Factory2 implements IFactory{
    private final String name;

    private Boolean connected = false;

    public Factory2(String name) {
        this.name = name;
    }

    public Boolean testConnection(){
        return connected;
    }

    public Boolean reconnect(){
        connected = Boolean.TRUE;
        return connected;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
