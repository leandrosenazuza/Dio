package EstudoDeSobreCarga;


public class formaGeometrica {
    long baseMenor;
    long baseMaior;
    long altura;
    int tipoForma;


    public long calculoDaArea(long base) return baseMenor*2;
    public long calculoDaArea(long baseMenor, long baseMaior)  return baseMenor*baseMaior;
    public long calculoDaArea(long baseMenor, long baseMaior, long altura) return ((baseMenor+baseMaior)*altura)/2;


    public int getTipoDeForma() {
        return tipoDeForma;
    }

    public void setTipoDeForma(int tipoDeForma) {
        this.tipoDeForma = tipoDeForma;
    }

    int tipoDeForma;

    public long getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(long baseMenor) {
        this.baseMenor = baseMenor;
    }

    public long getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(long baseMaior) {
        this.baseMaior = baseMaior;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Figura de dimensoes " + baseMaior + " x " + baseMenor + " x " + altura + ".";
    }
}
