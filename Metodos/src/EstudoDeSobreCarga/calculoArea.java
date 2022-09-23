package EstudoDeSobreCarga;

public class calculoArea {

    public long calculoDaArea(long base){
        return base*2;
    }
    public long calculoDaArea(long baseMenor, long baseMaior){
        return baseMenor*baseMaior;
    }
    public long calculoDaArea(long baseMenor, long baseMaior, long altura){
        return ((baseMenor+baseMaior)*altura)/2
    }


}
