package br.com.ambevtech.summit.switchs;

import br.com.ambevtech.summit.switchs.factories.Factory1;
import br.com.ambevtech.summit.switchs.factories.Factory2;
import br.com.ambevtech.summit.switchs.factories.FactoryDefault;
import br.com.ambevtech.summit.switchs.factories.IFactory;

public class Classic {

    public IFactory getFromFactory(int type){
        IFactory x;
        switch (type){
            case 1:{
                x = new Factory1("Tipo 1");
                break;
            }
            case 2:{
                x = new Factory2("Tipo 2");
                break;
            }
            default:
                x = new FactoryDefault("Tipo padrão");
                break;
        }
        if (!x.testConnection()){
            x.reconnect();
        }
        return x;
    }
}
