
import java.io.Serializable;
import javax.faces.bean.ManagedBean;



@ManagedBean
public class ScheduleBean implements Serializable{
    
    
    public String scheduleInit()
    {
        return "/schedule.xhtml?faces-redirect=true";
        
    }
    
}
