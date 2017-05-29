public class Zeichen implements ComparableContent<Zeichen>{
    
    private char zeichen;
    private int anzahl;
    
    public Zeichen(char c, int a){
        zeichen = c;
        anzahl = a;
    }

    public void setZeichen(char pZeichen){
        zeichen = pZeichen;
    }
    
    public void setAnzahl(int pAnzahl){
        anzahl = pAnzahl;
    }
    
    public char getZeichen(){
        return zeichen;
    }
    
    public int getAnzahl(){
        return anzahl;
    }
    
    public boolean isLess(Zeichen c){
        return (this.zeichen<c.getZeichen());
    }

    
    public boolean isEqual(Zeichen c){
        return (this.zeichen==c.getZeichen());
    }
    
    public boolean isGreater(Zeichen c){
        return (this.zeichen>c.getZeichen());
    }
}
