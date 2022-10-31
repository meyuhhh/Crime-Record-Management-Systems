
package crime;


public class dets 
{
    private int uId,uage;
    private String uFname, uMname,uLname, ugender,uaddress,unationality, ucaseNumber, uTypeofOffense, ujailTerm, ustat;
    
    
    public dets(int Id, String Fname, String Mname, String Lname, String gender, int age, String address, String nationality, String caseNumber, String TypeofOffense, String jailTerm, String stat)
    {
        
        this.uId = Id;
        this.uFname = Fname;
        this.uMname = Mname;
        this.uLname = Lname;
        this.ugender = gender;
        this.uage = age;
        this.uaddress = address;
        this.unationality = nationality;
        this.ucaseNumber = caseNumber;
        this.uTypeofOffense = TypeofOffense;
        this.ujailTerm = jailTerm;
        this.ustat = stat;
    }

        public int getId()
        {
            return this.uId;
        }
        
        public void setId(int Id)
        {
            this.uId = Id;   
        }    
    
        public String getFname()
        {
            return this.uFname;
        }
        public void setFname(String Fname)
        {
            this.uFname = Fname;   
        }
        
          public String getMname()
        {
            return this.uMname;
        }
        public void setMname(String Mname)
        {
            this.uMname = Mname;   
        }
        
          public String getLname()
        {
            return this.uLname;
        }
        public void setLname(String Lname)
        {
            this.uLname = Lname;   
        }
        
        public String getgender()
        {
            return this.ugender;
        }
        public void setgender(String gender)
        {
            this.ugender = gender;   
        }
        
        public int getage()
        {
            return this.uage;
        }
        public void setage(int age)
        {
            this.uage = age;   
        }
         public String getaddress()
        {
            return this.uaddress;
        }
        public void setaddress(String address)
        {
            this.uaddress = address;   
        }
        
        public String getnationality()
        {
            return this.unationality;
        }
        public void setnationality(String nationality)
        {
            this.unationality = nationality;   
        }
        
        public String getcaseNumber()
        {
            return this.ucaseNumber;
        }
        public void setcaseNumber(String caseNumber)
        {
            this.ucaseNumber = caseNumber;   
        }
        
        public String getTypeOfOffense()
        {
            return this.uTypeofOffense;
        }
        public void settypeOfOffense(String TypeofOffense)
        {
            this.uTypeofOffense = TypeofOffense;   
        }
        
        public String getjailTerm()
        {
            return this.ujailTerm;
        }
        public void setjailTerm(String jailTerm)
        {
            this.ujailTerm = jailTerm;   
        }
         public String getstat()
        {
            return this.ustat;
        }
        public void setstat(String stat)
        {
            this.ustat= stat;   
        }
        
      
        
}
