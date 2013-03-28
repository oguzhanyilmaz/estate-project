
import com.xml.parse.Currency;
import com.xml.parse.TCMBReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CurrencyBean implements Serializable{
    
    private List<Currency> kurlar = new ArrayList<Currency>();

    public List<Currency> getKurlar() {
        return kurlar;
    }

    public void setKurlar(List<Currency> kurlar) {
        this.kurlar = kurlar;
    }
    
    public String currencyInit()
    {
        return "/currency.xhtml?faces-redirect=true";
    }
    
    public void bringCurrency()
    {
        TCMBReader reader = new TCMBReader();
        
        ArrayList<Currency> gelenKurlar = reader.getCurrencies(); 
        
        for (int i = 0; i < gelenKurlar.size(); i++) {
            
            if(gelenKurlar.get(i).getKod().equals("USD") || gelenKurlar.get(i).getKod().equals("EUR") || gelenKurlar.get(i).getKod().equals("GBP"))
            {
                this.kurlar.add(gelenKurlar.get(i));
            }
  
        }
        
        
    }
    
}
