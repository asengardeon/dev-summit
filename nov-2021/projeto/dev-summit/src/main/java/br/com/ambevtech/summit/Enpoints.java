package br.com.ambevtech.summit;

import br.com.ambevtech.summit.recordimpl.ClasicWithLombok;
import br.com.ambevtech.summit.recordimpl.ClassicDTO;
import br.com.ambevtech.summit.recordimpl.RecordDTO;
import br.com.ambevtech.summit.recordimpl.RecordDTO2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enpoints {

    @PostMapping(value = "/classic-dto")
    public String classicDTO(@RequestBody ClassicDTO dto){
        return dto.toString();
    }

    @PostMapping(value = "/lombok-dto")
    public String recordDTO(@RequestBody ClasicWithLombok dto){
        return dto.toString();
    }

    @PostMapping(value = "/record-dto")
    public String recordDTO(@RequestBody RecordDTO dto){
        return dto.toString();
    }

    @PostMapping(value = "/record-dto-2")
    public String recordDTO(@RequestBody RecordDTO2 dto){
        return dto.toString();
    }
}
