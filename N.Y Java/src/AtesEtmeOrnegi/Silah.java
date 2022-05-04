package AtesEtmeOrnegi;

public class Silah {
	
	int etkinMenzil;
	Sarjor sarjor;
	
	public Silah(int etkinMenzil) {
		this.etkinMenzil = etkinMenzil;
		this.sarjor = sarjor;
	}
	
	void setSarjor(Sarjor sarjor) {
		this.sarjor = sarjor;		
	}
	
	void doldur() {
	//	if(sarjor != null) {
		sarjor.doldur();
	//	}
	}
	
	boolean atesEt(int hedefMenzil) {
		if(sarjor == null) {
			return false;
		}
		if(hedefMenzil <= etkinMenzil) {
			return sarjor.atesEt();
		}else {
			return false;
		}
	}

}
