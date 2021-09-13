import java.util.*;
class bank
{
  private String accno,acc_name;
  private double bal;
  Scanner s=new Scanner(System.in);

  
  public void createaccount()
     {
     System.out.println("Enter your name");
	  String name=s.nextLine();
	  this.acc_name=name;
	  System.out.println("Enter your Account No");
	  String acno=s.nextLine();
	  this.accno=acno;
	  System.out.println("Enter your Account amnt");
	   this.bal=s.nextDouble();
	  }
	  
	  public void showall()
	  {
		  
	  System.out.println(" Account Holder name:"+ acc_name);
	  System.out.println("  Account number"+accno);
	  System.out.println("  Account balance"+bal);
	
	  }
	  public void withdraw()
	  {
		  System.out.println(" enter amount");
	Double damt=s.nextDouble();
		  if(bal>=damt)
		  {
			  bal= bal-damt;
			  System.out.println(damt+"withdraw succesfully ..Your remaining Balance"+bal);
		  }
		  else
		  {
			  System.out.println("  Account balance insufficient");
		  }
	  }
	    public void deposit()
	  {
		  System.out.println(" enter amount");
	Double dmt=s.nextDouble();
		  
			  bal= bal+dmt;
			  System.out.println(dmt+"deposit succesfully ..Your remaining Balance"+bal);
		  
	  }
		 public boolean search(String acc)
		  {
			  
				  if(accno.equals(acc))
				  {
					  return true;
					 
				  }
				  return false;
			  }
}
 class bankdata 
 { 
  public static void main ( String[] args)
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of bank account you want...");
	int n= sc.nextInt();
	bank b[] = new bank[n];
	for( int i=0;i<n;i++)
	{
	  b[i]= new bank();
	  b[i].createaccount();
	}
	int ch;
	do
	{
		 System.out.println(" 1.Show All Account 2.Deposit 3.withdraw 4.Balace 5.Exit ");
		 ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			          for( int i=0;i<b.length;i++)
					  {
						  b[i].showall();
					  } 
					  break;
			case 2:
			      
	                System.out.println(" enter  Account number");
	                String an=sc.next();
					boolean bo=false;
	              for( int i=0;i<b.length;i++)
			        {
	                   bo=b[i].search(an);
	                  if(bo)
					  {
						  b[i].deposit();
						  break;
					  }
			        }
			        if(!bo)
			          {
						  System.out.println(" Invalid  Account number");
					  }
					  break;
	        case 3: 
			       
	                System.out.println(" enter  Account number");
	                String ann=sc.next();
					boolean bl=false;
	              for( int i=0;i<b.length;i++)
			        {
	                   bl=b[i].search(ann);
	                  if(bl)
					  {
						  b[i].withdraw();
						  break;
					  }
			        }
			        if(!bl)
			          {
						  System.out.println(" Invalid  Account number");
					  }
					  break;
	        case 4: 
			       
	                System.out.println(" enter  Account number");
	                String anc=sc.next();
					boolean bll=false;
	              for( int i=0;i<b.length;i++)
			        {
	                   bll=b[i].search(anc);
	                  if(bll)
					  {
						  b[i].showall();
						  break;
					  }
			        }
			        if(!bll)
			          {
						  System.out.println(" Invalid  Account number");
					  }
			case 5:
			        // exit(0);
					 break;
					 
		}
		}while(ch!=5);
}
	
}
