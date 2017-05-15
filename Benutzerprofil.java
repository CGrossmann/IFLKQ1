public class Benutzerprofil implements ComparableContent<Benutzerprofil>{

    private String benutzername, pw;
    
    public Benutzerprofil(String pBenutzername, String pPw){
        this.benutzername = pBenutzername;
        this.pw = pPw;
    }

    public String getBenutzername(){
        return benutzername;
    }
    
    public boolean isGreater(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())>0);
    }
    
    
    public boolean isEqual(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())==0);
    }
    
    
    public boolean isLess(Benutzerprofil pBenutzer){
        return (this.benutzername.compareTo(pBenutzer.getBenutzername())<0);
    }    
    
}
