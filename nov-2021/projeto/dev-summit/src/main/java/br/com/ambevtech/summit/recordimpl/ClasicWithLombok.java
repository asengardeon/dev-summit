package br.com.ambevtech.summit.recordimpl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ClasicWithLombok {

    @Getter
    int id;

    @Getter
    String campo1;

}
