package br.com.ambevtech.summit.switchs;

import br.com.ambevtech.summit.switchs.factories.Factory1;
import br.com.ambevtech.summit.switchs.factories.IFactory;

public class NewSwitch {
    public IFactory getFromFactory(int type) {
        IFactory x;
        switch (type) {
            case 1 -> x = new Factory1("Tipo 1");
            case 2 -> x = new Factory1("Tipo 2");
            default -> x = new Factory1("Tipo Default");
        }
        if (!x.testConnection())
            x.reconnect();
        return x;
    }

    public IFactory getFromFactory2(int type) {
        IFactory x = switch (type) {
            case 1 -> new Factory1("Tipo 1");
            case 2 -> new Factory1("Tipo 2");
            default -> new Factory1("Tipo Default");
        };
        if (!x.testConnection())
            x.reconnect();
        return x;
    }
}
