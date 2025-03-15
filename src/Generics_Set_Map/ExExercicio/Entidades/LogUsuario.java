package Generics_Set_Map.ExExercicio.Entidades;

import java.util.Date;
import java.util.Objects;

public class LogUsuario {

    private String nomeUsuario;
    private Date momento;

    public LogUsuario(String nome, Date momento) {
        this.nomeUsuario = nome;
        this.momento = momento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogUsuario that = (LogUsuario) o;
        return Objects.equals(nomeUsuario, that.nomeUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeUsuario);
    }
}
