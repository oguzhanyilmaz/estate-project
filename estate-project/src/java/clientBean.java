

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import org.hibernate.validator.constraints.Email;


/**
 *
 * @author yavuz
 */
@ManagedBean

public class clientBean implements Serializable{

    @Email()
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String clientKayit()
    {
        return "/insertClient.xhtml?faces-redirect=true";
    }
}
