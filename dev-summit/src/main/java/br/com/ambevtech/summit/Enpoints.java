package br.com.ambevtech.summit;

import br.com.ambevtech.summit.recordimpl.ClasicWithLombok;
import br.com.ambevtech.summit.recordimpl.Classic;
import br.com.ambevtech.summit.recordimpl.Record;
import br.com.ambevtech.summit.recordimpl.Record2;
import br.com.ambevtech.summit.switchs.factories.IFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enpoints {

    @PostMapping(value = "/classic-dto")
    public String classicDTO(@RequestBody Classic dto){
        return dto.toString();
    }

    @PostMapping(value = "/lombok-dto")
    public String recordDTO(@RequestBody ClasicWithLombok dto){
        return dto.toString();
    }

    @PostMapping(value = "/record-dto")
    public String recordDTO(@RequestBody Record dto){
        return dto.toString();
    }

    @PostMapping(value = "/record-dto-2")
    public String recordDTO(@RequestBody Record2 dto){
        return dto.toString();
    }

    @PostMapping(value = "/switch-classic")
    public String switchClassic(int factory){
        br.com.ambevtech.summit.switchs.Classic classic = new br.com.ambevtech.summit.switchs.Classic();
        IFactory x = classic.getFromFactory(factory);
        return x.getName();
    }

    @PostMapping(value = "/switch-new")
    public String newSwitch(int factory){
        br.com.ambevtech.summit.switchs.NewSwitch newSwitch = new br.com.ambevtech.summit.switchs.NewSwitch();
        IFactory x1 = newSwitch.getFromFactory(factory);
        IFactory x2 = newSwitch.getFromFactory2(factory);
        return "Experimento1 = %s experimento2 = %s".formatted(x1.getName(), x2.getName());
    }
}
