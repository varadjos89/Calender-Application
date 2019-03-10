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
public class leap {


		int Leap(int y)
		{
			int flag=-1;
			if(y%4==0)
			   {
			   	   if(y%100==0)
			   	      {
			   	      	if(y%400==0)
			   	      	   flag=1;
						 else
						  flag=0;
				      }
				    else
				    flag=1;
			   }
			else
			 flag=0;
			   return(flag);
		}	}
