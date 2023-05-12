package Bodega;

	public class ardoa extends artikuloa{
	    private String kolorea;
	    private String jatorria;
	    private int urtea;
	    private String mahatsa;
	    
	    public ardoa() {
	        super();
	        this.kolorea="";
	        this.jatorria="";
	        this.urtea=0;
	        this.mahatsa="";
	    }
	    
	    public ardoa(String k, String iz, String m, double sa, int s, String ko, String j, int u, String ma) {
	        super(k, iz, m, sa, s);
	        this.kolorea=ko;
	        this.jatorria=j;
	        this.urtea=u;
	        this.mahatsa=ma;
	    }

	    public String getKolorea() {
	        return kolorea;
	    }

	    public void setKolorea(String kolorea) {
	        this.kolorea = kolorea;
	    }

	    public String getJatorria() {
	        return jatorria;
	    }

	    public void setJatorria(String jatorria) {
	        this.jatorria = jatorria;
	    }

	    public int getUrtea() {
	        return urtea;
	    }

	    public void setUrtea(int urtea) {
	        this.urtea = urtea;
	    }

	    public String getMahatsa() {
	        return mahatsa;
	    }

	    public void setMahatsa(String mahatsa) {
	        this.mahatsa = mahatsa;
	    }

	    @Override
	    public void printEzaugarriak() {
	    	System.out.println("_________________________");
	    	System.out.println("***Kodea: "+super.kodea);
	        System.out.println(" -Izena: "+super.izena);
	        System.out.println(" -Marka: "+super.marka);
	        System.out.println(" -Salneurria: "+super.salneurria);
	        System.out.println(" -Stock: "+super.stock);
	        System.out.println(" -Kolorea: "+this.kolorea);
	        System.out.println(" -Jatorria: "+this.jatorria);
	        System.out.println(" -Urtea: "+this.urtea);
	        System.out.println(" -Mahatsa: "+this.mahatsa);
	    }
	    
	    /*
	     * String testua = "Kodea: "+super.kodea+" Izena: "+super.izena+" Marka: "+super.marka+" Salneurria: "+super.salneurria+" Stock: "+super.stock+" Kolorea: "+this.kolorea+" Jatorria: "+this.jatorria+" Urtea: "+this.urtea+" Mahatsa: "+this.mahatsa;
			return testua;
	     */

	    @Override
	    public boolean osasungarriak() {
	        // TODO Auto-generated method stub
	    	if(this.jatorria.equalsIgnoreCase("Errioxa")) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }
}