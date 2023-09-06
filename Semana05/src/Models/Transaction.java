package Models;

import java.util.Date;
import java.util.UUID;

public class Transaction {
    public Transaction(UUID id, Date data, Tipo tipoTransacao, double valor){
        this.id = UUID.randomUUID();
        this.data = new Date();
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
    }
    
    private UUID id;
    private Date data;
    private Tipo tipoTransacao;
    private double valor;
    
    public enum Tipo  {
    Depóstito, Saque, Envio, Recebimento;
}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tipo getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(Tipo tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }    
    
}
