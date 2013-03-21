
import java.io.Serializable;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class InsertingBean implements Serializable{
    
    
    
    
    public String evKayit()
    {
        return "/insertProperty.xhtml?faces-redirect=true";
    }
    
    public String arsaKayit()
    {
        return "/insertLand.xhtml?faces-redirect=true";
    }
    
    public String isyeriKayit()
    {
        return "/insertWorkPlace.xhtml?faces-redirect=true";
    }
    
}
