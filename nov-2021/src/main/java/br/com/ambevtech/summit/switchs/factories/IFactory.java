package br.com.ambevtech.summit.switchs.factories;

public interface IFactory {

    Boolean testConnection();

    Boolean reconnect();

    String getName();
}


