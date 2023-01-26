package ListBox;

public class IntroductionOfListBox {
	
//List Box Is handle by using Object of Select Class--------------------<<<<<<<<<<<<<<<<<<
	           
	      //Step 1-----Store the listbox in referance variable
	                  //Ex. WebElement day = driver.findElement(By.xpath())-----------------------------(WebElement is Return type of findElement)
	
	
	     //Step 2----Create the object of Select class & that Select class accept only webelement argument
	                //Ex.  Select S = new Select(WebElement)--------------------------------------------------(WebElement argument is day)
	
        //Step 3----Use methods from select class to select options
	               //Ex.   a)S.selectByVisibleText("stringvalue")
	               //      b)S.selectByIndex(intvalue)
	               //      c)S.selectByValue("Stringvalue")
	
	        //Droback of object of select class-----------------We require to create different objects for day, month, year

	          //To overcome this we can create method 
	
//List box handle by merthod-----------------<<<<<<<<<<<<<<<<<<
	    
	      //Step 1---------Create the method with 2 input parameter (Webelement , String)
	
	      //Step 2---------Create the String value & split it
	
	     //Step 3----------Call the method in main method

	 //Droback is everytime we have to create new refernce variable for String 
	      
	     //to overcome thie we can create Array & store multiple values in single variable

//List box handle by array----------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	//Droback of array is-------------------Size of array is fixed so that new entry is not allowed
	
	    //to overcome this we can create use collection
	

//List box handle by collection-----------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
                  //1)To get size----------------------------
	                           //WebElement Day = driver.finElement(By.xpath(""));
	                                //List<WebElement> D1 = Day.getOptions();
	                                      // System.out.println(D1.size());  
	
                //2)To read all the elements-----------------
	                           /* for(int a=0;a<D1.size();a++){
	         
                                         String S = D1.get(a).gettext();
	                                     System.out.println(S);
                                                    }                        */
	
               //3)To click on specific element--------------	
	                               /* for(int a=0;a<D1.size();a++){
    
                                              String S = D1.get(a).gettext();
                                              System.out.println(S);
                        
                                             if(S.equals("20")){
                                                    D1.get(a).click();
                                                }
                                           
                                        }                        */
                                                       

                
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
