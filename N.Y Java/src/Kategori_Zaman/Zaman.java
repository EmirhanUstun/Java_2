package Kategori_Zaman;

public class Zaman {
    public int saat;
    public int dakika;
    public int saniye;
    
    //Her �a��rd���m�zda saniyeyi 1 artt�r.
    public void saatIlerlet() {
    	saniye++;
    	
    	if(saniye==60) {
    		saniye=0;
    		dakika++;
    		
    		if(dakika==60) {
    			dakika=0;
    			saat++;
    			
    			if(saat==24) {
    				saat=0;
    				
    			}
    		}
    	}
	

	}

}
