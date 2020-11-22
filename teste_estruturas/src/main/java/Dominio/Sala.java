package Dominio;

public class Sala extends EntidadeDominio{

    private int Codigo;
    private int Tipo;
    private int Capacidade;

    public Sala() {
	super();
	}

    public Sala(int Codigo, int Tipo, int Capadidade){
        super();
        this.Codigo = Codigo;
        this.Tipo = Tipo;
        this.Capacidade = Capacidade;
        
    }

    public int getCodigo(){
        return Codigo;
    }
    
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }

    public int getTipo(){
        return Tipo;
    }

    public void setTipo(int Tipo){
        this.Tipo = Tipo;
    }

    public int getCapacidade(){
        return Capacidade;
    }
    
    public void setCapacidade(int Capacidade){
        this.Capacidade = Capacidade;
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}