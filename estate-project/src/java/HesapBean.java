
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class HesapBean implements Serializable{
    
    private Double miktar;
    private Double faiz;
    private Double taksit;
    private Double taksitTutari;
    private Double toplamMiktar;

    public Double getMiktar() {
        return miktar;
    }

    public void setMiktar(Double miktar) {
        this.miktar = miktar;
    }

    public Double getFaiz() {
        return faiz;
    }

    public void setFaiz(Double faiz) {
        this.faiz = faiz;
    }

    public Double getTaksit() {
        return taksit;
    }

    public void setTaksit(Double taksit) {
        this.taksit = taksit;
    }

    public Double getTaksitTutari() {
        return taksitTutari;
    }

    public void setTaksitTutari(Double taksitTutari) {
        this.taksitTutari = taksitTutari;
    }

    public Double getToplamMiktar() {
        return toplamMiktar;
    }

    public void setToplamMiktar(Double toplamMiktar) {
        this.toplamMiktar = toplamMiktar;
    }
    
    
    
    
    public void taksitTutariBul(){
    
        this.taksitTutari = (this.miktar * this.faiz) / (1.0 - (1.0/ Math.pow((1.0 + this.faiz), this.taksit) ));
        
        this.toplamMiktar = this.taksitTutari * this.taksit;
                
    }
    
    
    
    
}
