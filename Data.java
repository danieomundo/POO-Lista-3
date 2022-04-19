package poo.lista3.Ex4;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    private String mes2;
    private int dias_ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data (String mes2, int dia, int ano) {
        this.mes2 = mes2;
        this.dia = dia;
        this.ano = ano;
    }
    
    public Data (int dias_ano, int ano) {
        this.dias_ano = dias_ano;
        this.ano = ano;
    }        
    
    public String primeiroCaso(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
    
    public String segundoCaso(){
        return this.mes2+this.dia+","+this.ano;
    }
    
    public String terceiroCaso(){
        return this.dias_ano +""+ this.ano;
    }
    
}
