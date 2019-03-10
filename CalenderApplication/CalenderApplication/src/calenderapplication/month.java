/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calenderapplication;

/**
 *
 * @author Subodh Joshi
 */
public class month {

	leap l2=new leap();
		int Month(int m,int y)
		{
			int e;
			e=l2.Leap(y);
			if(m==1)
			 return(0);
			if(m==2)
		     return(31);
		    if(e==0)
		       {
		       	  if(m==3)
		       	    return(59);
		       	  if(m==4)
		       	    return(90);
		       	  if(m==5)
		       	    return(120);
		       	  if(m==6)
		       	    return(151);
		       	  if(m==7)
		       	    return(181);
		       	  if(m==8)
		       	    return(212);
		       	  if(m==9)
		       	    return(243);
		       	  if(m==10)
		       	    return(273);
		       	  if(m==11)
		       	    return(304);
		       	  if(m==12)
		       	    return(334);
			   }
			if(e==1)
			  {
			  	if(m==3)
		       	    return(60);
		       	  if(m==4)
		       	    return(91);
		       	  if(m==5)
		       	    return(121);
		       	  if(m==6)
		       	    return(152);
		       	  if(m==7)
		       	    return(182);
		       	  if(m==8)
		       	    return(213);
		       	  if(m==9)
		       	    return(244);
		       	  if(m==10)
		       	    return(274);
		       	  if(m==11)
		       	    return(305);
		       	  if(m==12)
		       	    return(335);
			  }
			return 0 ;
			
			
			 
		}	}




