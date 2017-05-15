public class Benutzerprofil implements ComparableContent<Benutzerprofil>{
    private String benutzername;
    private String passwort;
    public Benutzerprofil(String login, String pPasswort){
        benutzername = login;
        passwort = pPasswort;
        
    }
    public String getBenutzername(){
        return benutzername;
    }
    public boolean isLess(Benutzerprofil pProfil){
        return(pProfil.compareTo(benutzername)<pProfil);
    }
    public boolean isEqual(Benutzerprofil pProfil){
        
    }
    public boolean isGreater(Benutzerprofil pProfil){
        
    }
}
