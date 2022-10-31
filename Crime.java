
package crime;

import java.util.*;

public class Crime 
{

    public static String Fname, Mname, Lname, gender, address, nationality, TypeofOffense, bailStatus,jailTerm, caseNumber, searchbyName,stat;
    public static int Id,age, choices, types, choose3;
    public static int option;
    public static boolean status = true;
    public static Scanner input = new Scanner(System.in);
    public static Set<UniqueID> uniqueid = new HashSet<>();
    
    
    private static List<dets> criminalList = new ArrayList<>();
  
    private void addNewCriminal(dets details)
    {
        
            criminalList.add(details);  
            
    }   
        
    private void searchByName(String firstname, String midname, String lastname)
            
    {
        
        for(dets details: criminalList)
            
        {
            
            if(details.getFname().equals(firstname))
                
            {
              
            System.out.println("\n--------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n------------------------"
                         +"\nID: "              + details.getId()
                         +"\nFIRSTNAME: "       + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
        
            }

               else if(details.getMname().equals(midname))
            {
              
            System.out.println("\n----------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nFIRSTNAME: "       + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
        
            }
         
                else if(details.getLname().equals(lastname))
                        
            {
              
            System.out.println("\n----------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nFIRSTNAME: "       + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
        
            }
         
            
        }
    }
    private void searchByNameToChangeStatus(String firstname, String midname, String lastname)
            
    {
        
        for(dets details: criminalList)
            
        {
           
                    if(details.getFname().equals(firstname))
                        
            {
                
                        System.out.println("\n\n");
                        System.out.println("RELEASED  ||  DECEASED");
                        System.out.println("\nNOTE: TYPE IT CORRECTLY");
                        System.out.print("\nENTER TO CHANGE STATUS: ");
                         stat = input.next().toUpperCase();
                         details.setstat(stat);
                         if (stat.equals ("RELEASED") && stat.equals("DECEASED"))
                             
                         {
                             
                             status = false;
                             
                         }
                         
                         else if (!stat.equals ("RELEASED") && !stat.equals("DECEASED"))
                             
                         {
                             
                             System.out.println("----------TYPE IT CORRECTLY----------");
                             System.out.println("----------  TYPE IT AGAIN  ----------");
                             searchByNameToChangeStatus(firstname,midname,lastname);
                             
                         }
                         
            System.out.println("\n----------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nNAME: "            + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
                    
            }
 
                    if(details.getMname().equals(midname))
                       
            {
                        System.out.println("\n\n");
                        System.out.println("RELEASED  ||  DECEASED");
                        System.out.println("\nNOTE: TYPE IT CORRECTLY");
                        System.out.print("ENTER TO CHANGE STATUS: ");
                         stat = input.next().toUpperCase();
                         details.setstat(stat);
                         if (stat.equals ("RELEASED") && stat.equals("DECEASED"))
                             
                         {
                             
                             status = false;
                             
                         }
                         
                         else if (!stat.equals ("RELEASED") && !stat.equals("DECEASED"))
                             
                         {
                             
                             System.out.println("----------TYPE IT CORRECTLY----------");
                             System.out.println("----------  TYPE IT AGAIN  ----------");
                             searchByNameToChangeStatus(firstname,midname,lastname);
                             
                         }
                         
            System.out.println("\n--------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nNAME: "            + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");   
                   
        
            }  

                    if(details.getLname().equals(lastname))
                      
            {
                        System.out.println("\n\n");
                        System.out.println("RELEASED  ||  DECEASED");
                        System.out.println("\nNOTE: TYPE IT CORRECTLY");
                        System.out.print("ENTER TO CHANGE STATUS: ");
                         stat = input.next().toUpperCase();
                         details.setstat(stat);
                         if (stat.equals ("RELEASED") && stat.equals("DECEASED"))
                             
                         {
                             
                             status = false;
                             
                         }
                         
                         else if (!stat.equals ("RELEASED") && !stat.equals("DECEASED"))
                             
                         {
                             
                             System.out.println("----------TYPE IT CORRECTLY----------");
                             System.out.println("----------  TYPE IT AGAIN  ----------");
                             searchByNameToChangeStatus(firstname,midname,lastname);
                             
                         }
                         
            System.out.println("\n--------------------------" 
                         +"\nSEARCH CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nNAME: "            + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
                   
            }
        }
    }
        
    
     
    private void showallCriminalRecord(String Fname, String Mname, String Lname)
    {
        for(dets details: criminalList)
            
        {

                        System.out.println("\n--------------------------"
                         +"\nSHOW ALL CRIMINAL DETAILS"
                         +"\n--------------------------"
                         +"\nID: "              + details.getId()
                         +"\nFIRST NAME: "      + details.getFname()
                         +"\nMIDDLE NAME: "     + details.getMname()
                         +"\nLAST NAME: "       + details.getLname()
                         +"\nGENDER: "          + details.getgender()
                         +"\nAGE: "             + details.getage()
                         +"\nADDRESS: "         + details.getaddress()
                         +"\nNATIONALITY: "     + details.getnationality()
                         +"\nCASE NUMBER: "     + details.getcaseNumber()
                         +"\nTYPE OF OFFENSE: " + details.getTypeOfOffense()
                         +"\nJAIL TERM: "       + details.getjailTerm()
                         +"\nSTATUS : "         + details.getstat()
                         +"\n");      
        
        }
        
            
    }
   
    private  void addid()
            
    {
    
          
            System.out.print("\n*******************************"
                + "\n*  INPUT CRIMINAL DETAILS:    *  "
                + "\n*******************************\n");

                System.out.print("_______________________________");
                System.out.print("\nCRIMINAL ID: ");
                Id = input.nextInt();
                     for(UniqueID cuid: uniqueid)
                         
                    {
                        
                        if(cuid.getuid() == Id)
                            
                        {
                            
                            System.out.println("\nID TAKEN");
                            System.out.print("_______________________________\n\n");
                  
                            
                            addid();
                            
                        }
                    }
            
          inputNewCriminal();
          
        
    }
    
    private static void Gender()
            
    {
        
            System.out.print("_______________________________\n\n");
            System.out.println();
            System.out.println("'1' for MALE : '2' for FEMALE ");
            System.out.print("\nCHOOSE GENDER: ");
            choose3 = input.nextInt(); 
          
          
            if(choose3 ==1)
                
            {
                
              gender = "MALE";
              System.out.println("GENDER :" + gender);
              
            }
            
            else if (choose3 ==2)
                
            {
                
              gender = "FEMALE";
              System.out.println("GENDER :" + gender);
              
            }
            
            else if (choose3 != 1 && choose3 != 2)
                
            {
                
              System.out.println("GENDER : INVALID GENDER");
              Gender();
              
            }
    }
    
    private static void Status()
            
    {
            status = false;
            while(!status)
            {
        
            System.out.println("\n\n************************************");
            System.out.println("\nCAPSLOCK\nTYPE 'ACTIVE'");
            System.out.print("\nTYPE HERE: ");
            stat = input.next().toUpperCase();
            if(stat.equals("ACTIVE"))
                
            {   
            
            status = true;
            break;
            
            }
            
            else
                
            {
                
             System.out.println("----------TYPE IT CORRECTLY----------");
             System.out.println("----------  TYPE IT AGAIN  ----------");
             
            }
            
            }       

        }
    private static void Age()
            
    {
        
            status = false;
            while(!status)
                
        {
        
            try
                
            {
                
            System.out.print("_______________________________\n");
                  System.out.print("\nAGE: ");
                  age = input.nextInt();
                  status = true;
            }
            
            catch(Exception ex)
                
            {
                
            String str = input.next();
            System.out.println("\nNUMBERS ONLY !");
            
            }
        }
            
    }
    
    private dets inputNewCriminal()
            
     {
         
            status = true;
            while (status)
                
            {
             
            System.out.print("_______________________________\n");
            System.out.print("\nFIRST NAME: ");
            Fname = input.next().toUpperCase();
          
            System.out.print("_______________________________\n");
            System.out.print("\nMIDDLE NAME: ");
            Mname = input.next().toUpperCase();
          
            System.out.print("_______________________________\n");
            System.out.print("\nLAST NAME: ");
            Lname = input.next().toUpperCase();
         
            Gender();
          
            Age();
          
          
            System.out.print("_______________________________\n");
            System.out.print("\nADDRESS:");
            address = input.next().toUpperCase();
          
            System.out.print("_______________________________\n");
            System.out.print("\nNATIONALITY: ");
            nationality = input.next().toUpperCase();
          
            System.out.print("_______________________________\n");
            System.out.print("\nCASE NUMBER: ");
            caseNumber= input.next().toUpperCase();
            
         status = true;
         while (status)
           
           try
           { 
            do{
              
          
            System.out.print("\n____________________________________\n\n"
                       +   "       |SELECT CRIMINAL OFFENSE|\n\n"
                         + "************************************\n\n "
                         + "'1' for MURDER\n "
                         + "'2' for SEX CRIMES\n "
                         + "'3' for ROBBERY\n "
                         + "'4' for DOMESTIC VIOLENCE\n"
                         + " '5' for HUMAN TRAFFICKING\n"
                         + " '6' for ILLEGAL DRUG TRADE\n"
                         + " '7' for PETTY CRIME\n"
                         + " '8' for ORGANIZED CRIME\n"
                         + " '9' for PROSTITUTION\n"
                         + " '10' for TAX INVASION\n"
                         + " '11' for CYBERBUYLLYING\n"
                         + " '12' for THEFT\n"
                         + " '13' for VANDALISM\n"
                         + " '14' for HOMICIDE\n"
                         + " '15' for EXTORTION\n"
                         + " '16' for BURGLARY\n"
                         + " '17' for CHILD ABUSE\n"
                         + " '18' for CHILD PORNOGRAPHY\n"
                         + " '19' for PERJURY\n"
                         + " '20' for CHILD ABANDONMENT\n"
                         + " '21' for COMPUTER CRIME\n"
                         + " '22' for DEBIT CARD FRAUD\n"
                         + " '23' for MONEY LAUNDERING\n"
                         + " '24' for PUBLIC INTOXICATION\n"
                         + " '25' for PYRAMID SCHEMES\n"
                         + " '26' for ARSON\n"
                         + " '27' for BRIBERY\n"
                         + " '28' for ATTEMPT\n"
                         + " '29' for HARASSMENT\n"
                         + " '30' for HATE CRIMES\n"
                         + " '31' for STALKING\n"
                         + " '32' for TAX EVASION\n"
                         + " '33' for WHITE COLAR CRIMES\n"
                         + " '34' for RACKETEERING\n"
                         + " '35' for SEXUAL ASSAULT\n"
                         + " '36' for INSURANCE FRAUD\n"
                         + " '37' for SHOPLIFTING\n"
                         + " '38' for SOLICITATION\n"
                         + " '39' for SECURITIES FRAUD\n"
                         + " '40' for WIRE FRAUD\n"
                         + " '41' for IDENTIFY THEFT\n"
                         + " '42' for INDECENT EXPOSURE\n"
                         + " '43' for TELEMARKETING FRAUD\n"
                         + " '44' for CRIMINAL CONTEMPT OF COURT\n"
                         + " '45' for DISORDERLY CONDUCT\n"
                         + " '46' for DRUG POSSESSION\n"
                         + " '47' for PROBATION VIOLATION\n"
                         + " '48' for KIDNAPPING\n"
                         + " '49' for MANSLAUGHTER: VOLUNTARY\n"
                         + " '50' for MEDICAL MARIJUANA \n\n"
                 
                         + "************************************\n\n ");
                    
            System.out.print(" 'NUMBER 1-50 ONLY' \n\n");
            System.out.print(" TYPE OF OFFENSE: ");
            choices = input.nextInt();
          
          
            switch(choices)
                
            {
                
              case 1:
                  TypeofOffense = "MURDER";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;
                  
              case 2:
                  TypeofOffense = "SEX CRIMES";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                
              case 3:
                  TypeofOffense = "DRUG TRAFFICKING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                  
               case 4:
                  TypeofOffense = "DOMESTIC VIOLENCE";
                  System.out.println(TypeofOffense);
                  status = false;
                  break; 
                   
               case 5:
                  TypeofOffense = "HUMAN TRAFFICKING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 6:
                  TypeofOffense = "ILLEGAL DRUG TRADE";
                  System.out.println(TypeofOffense);
                  status = false;
                  break; 
                   
               case 7:
                  TypeofOffense = "PETTY CRIME";
                  System.out.println(TypeofOffense);
                  status = false;
                  break; 
                   
               case 8:
                  TypeofOffense = "ORGANIZED CRIME";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 9:
                  TypeofOffense = "PROSTITUTION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 10:
                  TypeofOffense = "TAX INVASION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 11:
                  TypeofOffense = "CYBERBUYLLYING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 12:
                  TypeofOffense = "THEFT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 13:
                  TypeofOffense = "VANDALISM";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 14:
                  TypeofOffense = "HOMICIDE";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 15:
                  TypeofOffense = "EXTORTION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 16:
                  TypeofOffense = "BURGLARY";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 17:
                  TypeofOffense = "CHILD ABUSE";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 18:
                  TypeofOffense = "CHILD PORNOGRAPHY";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 19:
                  TypeofOffense = "PERJURY";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 20:
                  TypeofOffense = "CHILD ABANDONMENT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 21:
                  TypeofOffense = "COMPUTER CRIME";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;  
                   
               case 22:
                  TypeofOffense = "DEBIT CARD FRAUD";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 23:
                  TypeofOffense = "MONEY LAUNDERING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 24:
                  TypeofOffense = "PUBLIC INTOXICATION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;       
                    
               case 25:
                  TypeofOffense = "PYRAMID SCHEMES";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 26:
                  TypeofOffense = "ARSON";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 27:
                  TypeofOffense = "BRIBERY";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 28:
                  TypeofOffense = "ATTEMPT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                   
               case 29:
                  TypeofOffense = "HARASSMENT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                  
               case 30:
                  TypeofOffense = "HATE CRIMES";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;     
                    
               case 31:
                  TypeofOffense = "STALKING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;      
                    
               case 32:
                  TypeofOffense = "WHITE COLAR CRIMES";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 33:
                  TypeofOffense = "TAX EVASION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;   
                   
               case 34:
                  TypeofOffense = "RACKETEERING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;
                   
               case 35:
                  TypeofOffense = "SEXUAL ASSAULT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;   
                   
               case 36:
                  TypeofOffense = "INSURANCE FRAUD";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 37:
                  TypeofOffense = "SHOPLIFTING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 38:
                  TypeofOffense = "SOLICITATION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;     
                   
               case 39:
                  TypeofOffense = "SECURITIES FRAUD";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 40:
                  TypeofOffense = "WIRE FRAUD";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 41:
                  TypeofOffense = "IDENTIFY THEFT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;
                   
               case 42:
                  TypeofOffense = "INDECENT EXPOSURE";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 43:
                  TypeofOffense = "TELEMARKETING FRAUD";
                  System.out.println(TypeofOffense);
                  status = false;
                  break; 
                   
               case 44:
                  TypeofOffense = "CRIMINAL CONTEMPT OF COURT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;     
                   
               case 45:
                  TypeofOffense = "DISORDERLY CONDUCT";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 46:
                  TypeofOffense = "DRUG POSSESSION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 47:
                  TypeofOffense = "PROBATION VIOLATION";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
               case 48:
                  TypeofOffense = "KIDNAPPING";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;   
                   
               case 49:
                  TypeofOffense = "MANSLAUGHTER: VOLUNTARY";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                  
               case 50:
                  TypeofOffense = "MEDICAL MARIJUANA";
                  System.out.println(TypeofOffense);
                  status = false;
                  break;    
                   
                   
               default:
                    System.out.println("\nInvalid Choices!..");
                    status = true;
                    break;
                   
            }
            
          
                 }while(choices >50);
                  
           }
           
            catch (Exception ex) 
                
                    { 
                        
                    String str = input.next();
                    System.out.println("NUMBER ONLY");
                    
                    }
            
         
            try
           { 
                do{
              
                System.out.print("\n____________________________________\n\n"
                       + "       |SELECT JAIL TERM|\n\n"
                       + "************************************\n\n "
                       + "'1'  for 1  YEAR\n "
                       + "'2'  for 2  YEARS\n "
                       + "'3'  for 3  YEARS\n "
                       + "'4'  for 4  YEARS\n"
                       + " '5'  for 5  YEARS\n"
                       + " '6'  for 6  YEARS\n"
                       + " '7'  for 7  YEARS\n"
                       + " '8'  for 8  YEARS\n"
                       + " '9'  for 9  YEARS\n"
                       + " '10' for 10 YEARS\n"
                       + " '12' for 12 YEARS\n"
                       + " '13' for 13 YEARS\n"
                       + " '14' for 14 YEARS\n"
                       + " '15' for 15 YEARS\n"
                       + " '16' for 16 YEARS\n"
                       + " '17' for 17 YEARS\n"
                       + " '18' for 18 YEARS\n"
                       + " '19' for 20 YEARS\n"
                       + " '21' for 21 YEARS\n"
                       + " '22' for 22 YEARS\n"
                       + " '23' for 23 YEARS\n"
                       + " '24' for 24 YEARS\n"
                       + " '25' for 25 YEARS\n"
                       + " '26' for 26 YEARS\n"
                       + " '27' for 27 YEARS\n"
                       + " '28' for 28 YEARS\n"
                       + " '29' for 29 YEARS\n"
                       + " '30' for 30 YEARS\n"
                       + " '31' for 31 YEARS\n"
                       + " '32' for 32 YEARS\n"
                       + " '33' for 33 YEARS\n"
                       + " '34' for 34 YEARS\n"
                       + " '35' for 35 YEARS\n"
                       + " '36' for 36 YEARS\n"
                       + " '37' for 37 YEARS\n"
                       + " '38' for 38 YEARS\n"
                       + " '39' for 39 YEARS\n"
                       + " '40' for 40 YEARS\n"
                       + " '41' for 41 YEARS\n"
                       + " '42' for 42 YEARS\n"
                       + " '43' for 43 YEARS\n"
                       + " '44' for 44 YEARS\n"
                       + " '45' for 45 YEARS\n"
                       + " '46' for 46 YEARS\n"
                       + " '47' for 47 YEARS\n"
                       + " '48' for 48 YEARS\n"
                       + " '49' for 49 YEARS\n"
                       + " '50' for  LIFE TIME IMPRISONMENT\n\n"
                       + "************************************\n\n ");
           
            System.out.print(" 'NUMBER 1-50 ONLY'0 \n\n");
            System.out.print("JAIL TERM: ");
            types = input.nextInt();
          
            switch(types)
                
            {
                
              case 1:
                  jailTerm = "1 YEAR";
                  System.out.println(jailTerm);
                  status = false;
                  break;
                  
              case 2:
                  jailTerm = "2 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                
              case 3:
                  jailTerm = "3 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                  
               case 4:
                  jailTerm = "4 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 5:
                  jailTerm = "5 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 6:
                  jailTerm = "6 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                    
               case 7:
                  jailTerm = "7 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                         
               case 8:
                  jailTerm = "8 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                              
               case 9:
                  jailTerm = "9 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
                                   
               case 10:
                  jailTerm = "10 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;  
           
               case 11:
                  jailTerm = "11 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                       
               case 12:
                  jailTerm = "12 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                           
               case 13:
                  jailTerm = "13 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 14:
                  jailTerm = "14 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                       
               case 15:
                  jailTerm = "15 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 16:
                  jailTerm = "16 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 17:
                  jailTerm = "17 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 18:
                  jailTerm = "18 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 19:
                  jailTerm = "19 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 20:
                  jailTerm = "20 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 21:
                  jailTerm = "21 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 22:
                  jailTerm = "22 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 23:
                  jailTerm = "23 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 24:
                  jailTerm = "24 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 25:
                  jailTerm = "25 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 26:
                  jailTerm = "26 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 27:
                  jailTerm = "27 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                  
               case 28:
                  jailTerm = "28 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 29:
                  jailTerm = "29 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 30:
                  jailTerm = "30 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 31:
                  jailTerm = "31 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 32:
                  jailTerm = "32 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 33:
                  jailTerm = "33 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 34:
                  jailTerm = "34 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 35:
                  jailTerm = "35 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 36:
                  jailTerm = "36 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break;
                   
               case 37:
                  jailTerm = "37 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 38:
                  jailTerm = "39 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 39:
                  jailTerm = "40 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 40:
                  jailTerm = "40 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 41:
                  jailTerm = "41 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 42:
                  jailTerm = "42 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 43:
                  jailTerm = "43 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 44:
                  jailTerm = "44 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 45:
                  jailTerm = "45 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 46:
                  jailTerm = "46 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 47:
                  jailTerm = "48 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                  
               case 48:
                  jailTerm = "49 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 49:
                  jailTerm = "49 YEARS";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               case 50:
                  jailTerm = " LIFE TIME IMPRISONMENT";
                  System.out.println(jailTerm);
                  status = false;
                  break; 
                   
               default:
                    System.out.println("Invalid Choices!..");
                    status = true;
                    break;
                   
            }
          
                }while(types > 50);
           }
                 catch (Exception ex) 
                
                    { 
                        
                    String str = input.next();
                    System.out.println("NUMBER ONLY");
                    
                    }
          
                Status();
                break;
          

                
   }
            
                dets dets = new dets(Id,Fname, Mname, Lname, gender, age,address, nationality,caseNumber,TypeofOffense, jailTerm, stat);
                addNewCriminal(dets);
                UniqueID nuid = new UniqueID(Id);
                uniqueid.add(nuid);
                return dets;
         
     }
     

     
    public static void mainfunct()
            
    {
        
            status = false;
            while (!status)
                
        {
            
            try
                
            {
                
            Crime  main = new Crime  ();
                do
                    
                {
                
                    System.out.print("\n******************************"
                                 +"\n    CHOOSE THE FOLLOWING      "
                                 +"\n******************************"
                                 +"\n1. INPUT NEW CRIMINAL: "
                                 +"\n2: SHOW ALL CRIMINAL LIST: "
                                 +"\n3: SEARCH CRIMINAL BY NAME: "
                                 +"\n4: CHANGE STATUS: "
                                 +"\n5: EXIT: "
                                 +"\n   ENTER HERE: "); 

                        option = input.nextInt();
                         switch(option)
                             
                         {
                             
                              case 1 :
                                 main.addid();
                                 break;


                             case 2 :
                                 main.showallCriminalRecord(Fname, Mname, Lname);
                                 break;

                             case 3 :

                                System.out.print("\n\nNOTE: CAPSLOCK ONLY");
                                System.out.print("\nSEARCH CRIMINAL NAME: ");
                                searchbyName = input.next().toUpperCase();
                                main.searchByName(searchbyName,searchbyName,searchbyName);
                                break;

                             case 4 :

                                System.out.print("\n\nNOTE: CAPSLOCK ONLY");
                                System.out.print("\nSEARCH CRIMINAL NAME: ");
                                searchbyName = input.next().toUpperCase();

                                 main.searchByNameToChangeStatus(searchbyName,searchbyName,searchbyName);
                                 break; 
                                 
                             case 5 :
                                 System.out.println("\nTHANK YOU");
                                 System.exit(0);
                                 
                             default:
                                 System.out.println("\nInvalid Choices!..");
                                 break;
                                 
                         }
                         
                }while(option != 6);
                //System.out.println("THANK YOU");
                //System.exit(0);
                
            }
            
        catch (Exception ex)
            
                {
                    
                    String str = input.next();
                    System.out.println("NUMBER ONLY");
                    
                }
                         
        }
    }
    
    public static void existingRecord()
            
    {
        
    System.out.println("WELCOME TO CRIME RECORD MANAGEMENT SYSTEM");
    
    }
     
 
    public static void main(String [] args)
            
        {
     
     dets criminal1  = new dets (1,"MARK", "MICHAEL","WAHLBERG", "MALE", 51, "UNITED STATES", "AMERICAN", "0000011", "TAX IVASION", "2 YEARS", "ACTIVE");
     dets criminal2  = new dets (2,"TIMOTHY", "ALAN", "DICK", "MALE", 69, "DENVER, COLORADO, UNITED SATATES", "AMERICAN", "0000012", "DRUG TRAFFICKING", "3 YEARS", "ACTIVE");
     dets criminal3  = new dets (3,"WESLEY", "TRENT", "SNIPES", "MALE", 60, "ORLANDO, FLORIDA, UNITED STATES",  "AMERICAN", "0000013", "TAX INVASION", "3 YEARS", "ACTIVE");
     dets criminal4  = new dets (4,"KIDE-GUILE", "SAMOYA", "COMPO",  "MALE", 23, "BUKIDNON", "FILIPINO", "0000014", "PROSTITUTION", "5 YEARS", "ACTIVE");
     dets criminal5  = new dets (5,"JUSTIN-CLYDE-GERARD", "SINGCAHON", "EJIDA", "MALE", 19, "TAGPANGI", "FILIPINO", "0000015", "SEX CRIMES", "6 YEARS", "ACTIVE");
     dets criminal6  = new dets (6,"KENNETH-JAMES", "OBLAD", "PACALDO", "MALE", 19, "CANITOAN", "FILIPINO", "0000016", "RAPE", "7 YEARS", "ACTIVE");
     dets criminal7  = new dets (7,"ANADYL", "MALAQUE", "PAGUTE",  "FEMALE", 19, "CALAANAN", "FILIPINO", "0000017", "ORGANIZED CRIME", "8 YEARS", "ACTIVE");
     dets criminal8  = new dets (8,"MERCY-JOY", "LASTIMOSA", "ARCAYENA", "FEMALE", 20, "ZAYAS", "FILIPINO","0000018" , "HUMAN TRAFFICKING", "8 YEARS", "ACTIVE");
     dets criminal9  = new dets (9,"MARIA-ADORA", "JAQUILMAC", "DUMAOG", "FEMALE",18 , "BULUA", "FILIPINO", "0000019", "ILLEGAL DRUG TRADE", "9 YEARS", "ACTIVE");
     dets criminal10 = new dets (10,"FITZ-GERARD", "DALEON", "LABE",  "MALE",20 , "LUMBIA", "FILIPINO", "0000020", "PETTY CRIME", "10 YEARS", "ACTIVE");
     dets criminal11 = new dets (11,"MIRAH-MEA", "SAL-AGAN", "AGUILAR", "FEMALE",20 , "LUGAIT", "FILIPINO", "0000021", "CYBERBULLYING", "11 YEARS", "ACTIVE");
     dets criminal12 = new dets (12,"CHRISTIAN-KEITH", "SAPON", "ABACAHIN", "MALE", 20 , "BALULANG", "FILIPINO", "0000022", "THEFT", "12 YEARS", "ACTIVE");
     dets criminal13 = new dets (13,"MICHAEL-JEFF", "VLLAMOR", "OMPOC", "MALE", 20 , "DAVAO", "FILIPINO", "0000023", "VANDALISM", "13 YEARS", "ACTIVE");
     dets criminal14 = new dets (14,"ARIAN-ROSE", "NOBLEFRANCA", "BASLAO","FEMALE", 20 , "LUGAIT", "FILIPINO", "0000024", "HOMICIDE", "14 YEARS", "ACTIVE");
     dets criminal15 = new dets (15,"NICOLE", "CALUNOD", "MAHINAY", "FEMALE", 20 , "D", "FILIPINO", "0000025", "VANDALISM", "16 YEARS", "ACTIVE");
     dets criminal16 = new dets (16,"PHILIP-JOHN", "ALFECHE", "ADAJAR", "MALE", 20 , "CALAANAN", "FILIPINO", "0000026", "CHILD PORNOGRAPHY", "17 YEARS", "ACTIVE");
     dets criminal17 = new dets (17,"KERT-ICE", "GRIFFING", "ROQUE",  "MALE", 20 , "CAMIGUIN", "FILIPINO", "0000027", "EXTORTION", "1 YEAR", "ACTIVE");
     dets criminal18 = new dets (18,"MARK-LOUIE", "CABASAG", "BAHIAN", "MALE", 22 , "TALACOGON", "FILIPINO", "0000028", "BURGLARY", "18 YEARS", "ACTIVE");
     dets criminal19 = new dets (19,"JAYLAN-MAR", "VLLAMOR", "OMPOC", "MALE", 19 , "POBLACION", "FILIPINO", "0000029", "CHILD ABUSE", "19 YEARS", "ACTIVE");
     dets criminal20 = new dets (20,"KATHLEEN", "GAMBOA", "PROGELLA", "FEMALE", 20 , "CALANGAHAN", "FILIPINO", "0000030", "PERGURY", "20 YEARS", "ACTIVE");
     dets criminal21 = new dets (21,"LINDEL", "MARIQUIT", "PASINABO", "FEMALE", 20 , "LOWER-TALACOGON", "FILIPINO", "0000031", "CHILD ABANDONMENT", "21 YEARS", "ACTIVE");
     dets criminal22 = new dets (22,"JAMES-BRYAN", "VELEZ", "BALAMBAO", "MALE", 19 , "CALANGAHAN", "FILIPINO", "0000032", "CHILD ABANDONMENT", "22 YEARS", "ACTIVE");
     dets criminal23 = new dets (23,"DANIEL", "PANANGLITAN", "YURONG", "MALE", 19 , "BIGA", "FILIPINO", "0000033", "COMPUTER CRIME", "23 YEARS", "ACTIVE");
     dets criminal24 = new dets (24,"FEBE", "CERENO", "SILADOR", "FEMALE", 19 , "MABINI", "FILIPINO", "0000034", "DEBIT CARD FRAUD", "24 YEARS", "ACTIVE");
     dets criminal25 = new dets (25,"LOREN", "PADING", "BUTON", "FEMALE", 20 , "AYA-AYA", "FILIPINO", "0000035", "MONEY LAUNDERING", "25 YEARS", "ACTIVE");
     dets criminal26 = new dets (26,"KARENROSE", "CONOG", "CALUSCUSAN", "FEMALE", 19 , "CARMEN", "FILIPINO", "0000036", "PYRAMID SCHEMES", "26 YEARS", "ACTIVE");
     dets criminal27 = new dets (27,"CLAUDINE", "LLANES", "TORINO", "FEMALE", 19 , "MACAO", "FILIPINO", "0000037", "ARSON", "27 YEARS", "ACTIVE");
     dets criminal28 = new dets (28,"CHARLES", "SANCHEZ", "ORCIA", "MALE", 19 , "MASILAKON", "FILIPINO", "0000038", "BRIBERY", "28 YEARS", "ACTIVE");
     dets criminal29 = new dets (29,"FRITZIE", "LUCENADA", "BARROS", "FEMALE", 19 , "BONIFACIO", "FILIPINO", "0000039", "ATTEMPT", "29 YEARS", "ACTIVE");
     dets criminal30 = new dets (30,"MARJO", "RABADON", "SORDILLA", "FEMALE", 20 , "JAMPASAN", "FILIPINO", "0000040", "STALKING", "30 YEARS", "ACTIVE");
     dets criminal31 = new dets (31,"KURT", "GRIFFING", "ROQUE", "MALE", 20 , "HUBANGON", "FILIPINO", "0000041", "BRIBERY", "31 YEARS", "ACTIVE");
     dets criminal32 = new dets (32,"KEITH", "ABAO", "MARIMON", "FEMALE", 35 , "MALAMPAYAN", "FILIPINO", "0000042", "WHITE COLAR CRIMES", "32 YEARS", "ACTIVE");
     dets criminal33 = new dets (33,"CHESKHA", "KHO", "FABRE", "FEMALE", 24 , "SANJOQUE", "FILIPINO", "0000043", "RACKETEERING", "33 YEARS", "ACTIVE");
     dets criminal34 = new dets (34,"ALLIAH", "SAA", "GALI", "FEMALE", 28 , "SAGAY", "FILIPINO", "0000044", "SEXUAL ASSAULT", "34 YEARS", "ACTIVE");
     dets criminal35 = new dets (35,"REYROLEX", "SALIGUMBA", "DAGONDON", "MALE", 23 , "PUNTOD", "FILIPINO", "0000045", "INSURANCE FRAUD", "35 YEARS", "ACTIVE");
     dets criminal36 = new dets (36,"REYMART", "BREIJ", "PUTOL", "MALE", 45 , "BINALIWAN", "FILIPINO", "0000046", "SHOPLIFTING", "36 YEARS", "ACTIVE");
     dets criminal37 = new dets (37,"KENT", "GAYLAWAN", "OCULAR", "MALE", 37 , "SANMEGUIL", "FILIPINO", "0000047", "SOLICITATION", "37 YEARS", "ACTIVE");
     dets criminal38 = new dets (38,"EIRIEL", "NAMOCATCAT", "PAISONES", "FEMALE", 26 , "KILON-AC", "FILIPINO", "0000048", "SECURITY FRAUD", "38 YEARS", "ACTIVE");
     dets criminal39 = new dets (39,"KRISTINE", "ABIAN", "LADISLA", "FEMALE", 21 , "JANG", "FILIPINO", "0000049", "WIRE FRAUD", "39 YEARS", "ACTIVE");
     dets criminal40 = new dets (40,"ANALOULYN", "ABAO", "SAJOL", "FEMALE", 23 , "LANGCANGAN", "FILIPINO", "0000050", "IDENTITY THEFT", "40 YEARS", "ACTIVE");
     dets criminal41 = new dets (41,"FAITH", "TABUAN", "LAVICTORIA", "FEMALE", 56 , "TUBOD", "FILIPINO", "0000051", "INDECENT EXPOSURE", "41 YEARS", "ACTIVE");
     dets criminal42 = new dets (42,"VERNAMIE", "ABIAN", "RABOT", "FEMALE", 31 , "KINUGITAN", "FILIPINO", "0000052", "TELEMARKETING FRAUD", "42 YEARS", "ACTIVE");
     dets criminal43 = new dets (43,"FLORDILEZ", "RAJA", "ECONAR", "FEMALE", 22 , "TIMOGA", "FILIPINO", "0000053", "CRIMINAL CONTEMPT OF COURT", "43 YEARS", "ACTIVE");
     dets criminal44 = new dets (44,"ALMAMAE", "TABAMO", "MONTEJO", "FEMALE", 26 , "CATOHUGAN", "FILIPINO", "0000054", "DISORDERLY CONDUCT", "44 YEARS", "ACTIVE");
     dets criminal45 = new dets (45,"LANDY", "DUMOGOSO", "DINGLASA", "MALE", 31 , "TUPSAN", "FILIPINO", "0000055", "DRUG POSSESSION", "45 YEARS", "ACTIVE");
     dets criminal46 = new dets (46,"CRYA", "GRIFFING", "HURLBURT", "FEMALE", 49 , "MAHINOG", "FILIPINO", "0000056", "PROBATION VIOLATIONS", "46 YEARS", "ACTIVE");
     dets criminal47 = new dets (47,"ROBERT", "BABANTO", "LAGUNAY", "MALE", 63 , "OWAKAN", "FILIPINO", "0000057", "KIDNAPPING", "47 YEARS", "ACTIVE");
     dets criminal48 = new dets (48,"MARYGRACE", "LAGUNAY", "PABILLORE", "FEMALE", 35 , "BUGWAK", "FILIPINO", "0000058", "MANSLAUGHTER", "48 YEARS", "ACTIVE");
     dets criminal49 = new dets (49,"MARYJANE", "APARTE", "RAUT", "FEMALE", 18 , "JAMPASAN", "FILIPINO", "0000049", "MEDICAL MARIJUANA", "49 YEARS", "ACTIVE");
     dets criminal50 = new dets (50, "FLORAMAE", "TABAMO", "TABUAN", "FEMALE", 45 , "JAMPASAN", "FILIPINO", "0000050", "MURDER", " LIFE TIME IMPRISONMENT", "ACTIVE");
     

     
     UniqueID uid1 =  new UniqueID (1);
     UniqueID uid2 =  new UniqueID (2);
     UniqueID uid3 =  new UniqueID (3);
     UniqueID uid4 =  new UniqueID (4);
     UniqueID uid5 =  new UniqueID (5);
     UniqueID uid6 =  new UniqueID (6);
     UniqueID uid7 =  new UniqueID (7);
     UniqueID uid8 =  new UniqueID (8);
     UniqueID uid9 =  new UniqueID (9);
     UniqueID uid10 = new UniqueID (10);
     UniqueID uid11 = new UniqueID (11);
     UniqueID uid12 = new UniqueID (12);
     UniqueID uid13 = new UniqueID (13);
     UniqueID uid14 = new UniqueID (14);
     UniqueID uid15 = new UniqueID (15);
     UniqueID uid16 = new UniqueID (16);
     UniqueID uid17 = new UniqueID (17);
     UniqueID uid18 = new UniqueID (18);
     UniqueID uid19 = new UniqueID (19);
     UniqueID uid20 = new UniqueID (20);
     UniqueID uid21 = new UniqueID (21);
     UniqueID uid22 = new UniqueID (22);
     UniqueID uid23 = new UniqueID (23);
     UniqueID uid24 = new UniqueID (24);
     UniqueID uid25 = new UniqueID (25);
     UniqueID uid26 = new UniqueID (26);
     UniqueID uid27 = new UniqueID (27);
     UniqueID uid28 = new UniqueID (28);
     UniqueID uid29 = new UniqueID (29);
     UniqueID uid30 = new UniqueID (30);
     UniqueID uid31 = new UniqueID (31);
     UniqueID uid32 = new UniqueID (32);
     UniqueID uid33 = new UniqueID (33);
     UniqueID uid34 = new UniqueID (34);
     UniqueID uid35 = new UniqueID (35);
     UniqueID uid36 = new UniqueID (36);
     UniqueID uid37 = new UniqueID (37);
     UniqueID uid38 = new UniqueID (38);
     UniqueID uid39 = new UniqueID (39);
     UniqueID uid40 = new UniqueID (40);
     UniqueID uid41 = new UniqueID (41);
     UniqueID uid42 = new UniqueID (42);
     UniqueID uid43 = new UniqueID (43);
     UniqueID uid44 = new UniqueID (44);
     UniqueID uid45 = new UniqueID (45);
     UniqueID uid46 = new UniqueID (46);
     UniqueID uid47 = new UniqueID (47);
     UniqueID uid48 = new UniqueID (48);
     UniqueID uid49 = new UniqueID (49);
     UniqueID uid50 = new UniqueID (50);
     
     
     
     
     criminalList.add(criminal1);
     uniqueid.add(uid1);
     criminalList.add(criminal2);
     uniqueid.add(uid2);
     criminalList.add(criminal3);
     uniqueid.add(uid3);
     criminalList.add(criminal4);
     uniqueid.add(uid4);
     criminalList.add(criminal5);
     uniqueid.add(uid5);
     criminalList.add(criminal6);
     uniqueid.add(uid6);
     criminalList.add(criminal7);
     uniqueid.add(uid7);
     criminalList.add(criminal8);
     uniqueid.add(uid8);
     criminalList.add(criminal9);
     uniqueid.add(uid9);
     criminalList.add(criminal10);
     uniqueid.add(uid10);
     criminalList.add(criminal11);
     uniqueid.add(uid11);
     criminalList.add(criminal12);
     uniqueid.add(uid12);
     criminalList.add(criminal13);
     uniqueid.add(uid13);
     criminalList.add(criminal14);
     uniqueid.add(uid14);
     criminalList.add(criminal15);
     uniqueid.add(uid15);
     criminalList.add(criminal16);
     uniqueid.add(uid16);
     criminalList.add(criminal17);
     uniqueid.add(uid17);
     criminalList.add(criminal18);
     uniqueid.add(uid18);
     criminalList.add(criminal19);
     uniqueid.add(uid19);
     criminalList.add(criminal20);
     uniqueid.add(uid20);
     criminalList.add(criminal21);
     uniqueid.add(uid21);
     criminalList.add(criminal22);
     uniqueid.add(uid22);
     criminalList.add(criminal23);
     uniqueid.add(uid23);
     criminalList.add(criminal24);
     uniqueid.add(uid24);
     criminalList.add(criminal25);
     uniqueid.add(uid25);
     criminalList.add(criminal26);
     uniqueid.add(uid26);
     criminalList.add(criminal27);
     uniqueid.add(uid27);
     criminalList.add(criminal28);
     uniqueid.add(uid28);
     criminalList.add(criminal29);
     uniqueid.add(uid29);
     criminalList.add(criminal30);
     uniqueid.add(uid30);
     criminalList.add(criminal31);
     uniqueid.add(uid31);
     criminalList.add(criminal32);
     uniqueid.add(uid32);
     criminalList.add(criminal33);
     uniqueid.add(uid33);
     criminalList.add(criminal34);
     uniqueid.add(uid34);
     criminalList.add(criminal35);
     uniqueid.add(uid35);
     criminalList.add(criminal36);
     uniqueid.add(uid36);
     criminalList.add(criminal37);
     uniqueid.add(uid37);
     criminalList.add(criminal38);
     uniqueid.add(uid38);
     criminalList.add(criminal39);
     uniqueid.add(uid39);
     criminalList.add(criminal40);
     uniqueid.add(uid40);
     criminalList.add(criminal41);
     uniqueid.add(uid41);
     criminalList.add(criminal42);
     uniqueid.add(uid42);
     criminalList.add(criminal43);
     uniqueid.add(uid43);
     criminalList.add(criminal44);
     uniqueid.add(uid44);
     criminalList.add(criminal45);
     uniqueid.add(uid45);
     criminalList.add(criminal46);
     uniqueid.add(uid46);
     criminalList.add(criminal47);
     uniqueid.add(uid47);
     criminalList.add(criminal48);
     uniqueid.add(uid48);
     criminalList.add(criminal49);
     uniqueid.add(uid49);
     criminalList.add(criminal50);
     uniqueid.add(uid50);

     
        mainfunct();
        
        }

       
    }
    

