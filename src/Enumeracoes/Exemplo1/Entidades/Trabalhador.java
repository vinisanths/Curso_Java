package Enumeracoes.Exemplo1.Entidades;

import Enumeracoes.Exemplo1.Enum.NivelTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String name;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador(String name, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public void adicionaContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public double renda(int mes, int ano) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (HoraContrato c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = cal.get(Calendar.MONTH) + 1;
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
