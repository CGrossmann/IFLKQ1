public class Zeichenzaehler{
    
    private BinarySearchTree<Zeichen> zeichenbaum;
    
    public Zeichenzaehler()    {
        zeichenbaum = new BinarySearchTree<Zeichen>();
    }

    public void textEinlesen(String s){
        while (s.length() > 0){
            Zeichen z = zeichenbaum.search(new Zeichen(s.charAt(0),0));
            if (z!=null){
                //Zeichen schon im Baum enthalten
                z.setAnzahl(z.getAnzahl()+1);
            }
            else{
                //neues Zeichen
                zeichenbaum.insert(new Zeichen(s.charAt(0),1));
            }
            if (s.length() > 1)
                s = s.substring(1);
            else
                s = "";
        }
    }
    
    public void starteAusgabe(){
        gibAus(zeichenbaum);
    }
    
    public void gibAus(BinarySearchTree<Zeichen> b){
        if (!b.getLeftTree().isEmpty())
            gibAus(b.getLeftTree());
        System.out.print(b.getContent().getZeichen() + "/" + b.getContent().getAnzahl() + " ");
        if (!b.getRightTree().isEmpty())
            gibAus(b.getRightTree());
    }
    
}
