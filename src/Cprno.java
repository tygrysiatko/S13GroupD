public class Cprno {
	
    private long cprno;
    
    public Cprno(Long cprno) throws Exception{
    	   if(checkCprno(cprno)){
    		   this.cprno = cprno;
    	   }else{
    		   throw new Exception("This is not a valid CPR number (" + cprno + ")\n");
    	   }
    }
    
    public long getCprno() {
        return this.cprno;
    }
    
    public String toString() {
        String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
        if (!checkCprno(this.getCprno()))
            aString += "(invalid)";
        return aString;
    }

    public boolean checkCprno(Long cprno) {
        long sum;
        long restcpr = cprno;
        sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;
     }

    public static void main(String[] args) {
    	/*
        Cprno c0 = new Cprno(2511450007L);
        //System.out.println(c0);
        Cprno c1 = new Cprno(702900020L);
        //System.out.println(c1);
        c1 = new Cprno(411940020L);
        //System.out.println(c1);
        Cprno c2 = new Cprno(1008884079L);
        //System.out.println(c2);
        Cprno c3 = new Cprno(1234567812L);
        */
    }
}