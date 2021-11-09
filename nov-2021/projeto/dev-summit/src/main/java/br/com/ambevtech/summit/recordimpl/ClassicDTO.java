package br.com.ambevtech.summit.recordimpl;

import java.util.Objects;

public class ClassicDTO {

    private int id;

    private String campo1;

    public int getId() {
        return id;
    }

    public String getCampo1() {
        return campo1;
    }

    public ClassicDTO(int id, String campo1) {
        this.id = id;
        this.campo1 = campo1;
    }

    @Override
    public String toString() {
        return "ClassicDTO{" +
                "id=" + id +
                ", campo1='" + campo1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassicDTO)) return false;
        ClassicDTO that = (ClassicDTO) o;
        return getId() == that.getId() && Objects.equals(getCampo1(), that.getCampo1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCampo1());
    }
}
