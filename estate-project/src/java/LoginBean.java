
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class LoginBean implements Serializable{
    
    private String ad;
    private String sifre;

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    } 
    
    public String girisYap()
    {
        if (this.ad.equals("admin") && this.sifre.equals("admin")) {
            return "/index.xhtml";
        }
        else
            return null;
    }
    
}
