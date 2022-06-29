class BankTester{


    public static void main(String a[]){
	
	  Bank kotak = new Kotak();
	  kotak.getInterest(5.0);
	  
	   Bank cb = new CanaraBank();
	  cb.getInterest(5.0);
	  
	  Bank pkgb = new PkgbBank();
	  pkgb.getInterest(5.0);
	  
	  Bank hdfc = new HdfcBank();
	  hdfc.getInterest(5.0);
	 
	  
	  Bank icici = new IciciBank();
	  icici.getInterest(5.0);
	  
	  Bank kgb = new KarnatakaGraminBank();
	  kgb.getInterest(5.0);
	  
	  Bank vv = new VishnuVillasBank();
	  vv.getInterest(5.0);
	  
	  Bank boi = new BankOfIndiaBank();
	  boi.getInterest(5.0);
	  
	  Bank baroda = new BankOfBarodaBank();
	  baroda.getInterest(5.0);
	}


}