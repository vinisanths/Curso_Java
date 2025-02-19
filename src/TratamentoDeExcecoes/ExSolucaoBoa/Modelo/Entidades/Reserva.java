package TratamentoDeExcecoes.ExSolucaoBoa.Modelo.Entidades;


import TratamentoDeExcecoes.ExSolucaoBoa.Modelo.Excecoes.ExcecaoDeDominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numQuarto, Date checkIn, Date checkOut) throws ExcecaoDeDominio {
        if (!checkOut.after(checkIn)) {
            throw new ExcecaoDeDominio("Data de CheckOut deve ser depois da Data de CheckIn");
        }
        this.numQuarto = numQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        numQuarto = numQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizaData(Date checkIn, Date checkOut) throws ExcecaoDeDominio{
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new ExcecaoDeDominio("Atualizações em datas de Reservas devem ser datas Futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw new ExcecaoDeDominio("Data de CheckOut deve ser depois da Data de CheckIn");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Quarto "
                + numQuarto
                + " , Check-in: "
                + sdf.format(checkIn)
                + ", Check-out: "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " Noites";
    }
}

