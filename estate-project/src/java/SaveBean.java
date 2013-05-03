
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class SaveBean implements Serializable{
    
    
    public String kayitYonlendir(){
        return "/savePage.xhtml?faces-redirect=true";
    }
    
}
