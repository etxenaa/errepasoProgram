package Bodega;

public class freskagarriak extends artikuloa{
    private String zaporea;
    private boolean zukua;
    private boolean gasa;
    private int azukrea;
    
    public freskagarriak() {
        super();
        this.zaporea="";
        this.zukua=false;
        this.gasa=false;
        this.azukrea=0;
    }
    
    public freskagarriak(String k, String iz, String m, double sa, int s, String z, boolean zu, boolean g, int a) {
        super(k, iz, m, sa, s);
        this.zaporea=z;
        this.zukua=zu;
        this.gasa=g;
        this.azukrea=a;
    }

    public String getZaporea() {
        return zaporea;
    }

    public void setZaporea(String zaporea) {
        this.zaporea = zaporea;
    }

    public boolean isZukua() {
        return zukua;
    }

    public void setZukua(boolean zukua) {
        this.zukua = zukua;
    }

    public boolean isGasa() {
        return gasa;
    }

    public void setGasa(boolean gasa) {
        this.gasa = gasa;
    }

    public int getAzukrea() {
        return azukrea;
    }

    public void setAzukrea(int azukrea) {
        this.azukrea = azukrea;
    }

    @Override
    public void printEzaugarriak() {
    	System.out.println("_________________________");
        System.out.println("***Kodea: "+super.kodea);
        System.out.println(" -Izena: "+super.izena);
        System.out.println(" -Marka: "+super.marka);
        System.out.println(" -Salneurria: "+super.salneurria);
        System.out.println(" -Stock: "+super.stock);
        System.out.println(" -Zaporea: "+this.zaporea);
        System.out.println(" -Zukua: "+this.zukua);
        System.out.println(" -Gasa: "+this.gasa);
        System.out.println(" -Azukrea: "+this.azukrea);
    }
    
    /*
     * String testua = "Kodea: "+super.kodea+" Izena: "+super.izena+" Marka: "+super.marka+" Salneurria: "+super.salneurria+" Stock: "+super.stock+" Zaporea: "+this.zaporea+" Zukua: "+this.zukua+" Gasa: "+this.gasa+" Azukrea: "+this.azukrea;
	   return testua;
     */

	@Override
	public boolean osasungarriak() {
		// TODO Auto-generated method stub
		if(this.azukrea<25) {
    		return true;
    	}else {
    		return false;
    	}
	}
    
}