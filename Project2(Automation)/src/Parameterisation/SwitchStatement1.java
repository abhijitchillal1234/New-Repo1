package Parameterisation;

public class SwitchStatement1 {

	public static void main(String[] args) {

		
		//Syntax:::
		
/*		Switch(Expression){
			
			case value1:
				//Code to be executed
				 break;
				
			case value2:
				//Code to be executed
				 break;

				
			case value3:
				//case to be executed
				 break;

				
			default:
				//code to be executed if all the cases are not matched
				 
				 
		}         */                                                                    
		
		
		int Number = 20;
		
		switch(Number) {
		
		case 10:
			System.out.println("Number matched 10");
			break;
			
		case 20:
			System.out.println("Number matched 20");
			break;
			
		case 30:
			System.out.println("Number matched 30");
			break;
			
		default:
			System.out.println("Not matched");
		    
		}
		
		System.out.println();
		
		
		int Number1 = 100;
		
		switch(Number1) {
		
		case 10:
			System.out.println("Number is matched 10");
			break;
			
		case 30:
			System.out.println("Number is matched 30");
			break;
			
		case 50:
			System.out.println("Number is matched 50");
			break;
			
		case 70:
			System.out.println("Number is matched 70");
			break;
			
		case 100:
			System.out.println("Number is matched 100");
			break;
			
		default:
			System.out.println("Number is not matched");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
