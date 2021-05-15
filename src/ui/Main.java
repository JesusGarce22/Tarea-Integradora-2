//Tarea integradora #2
package ui;

import java.util.Scanner;
import model.CenterVeterinary;

public class Main {
	//object
	public static Scanner sn=new Scanner(System.in);
	public static CenterVeterinary cv=new CenterVeterinary(120,7);
	
	public static void main(String[]args){
		//Main menu
		int i=0;
		while (i==0){
			
			int opcion=menu();
			
			switch(opcion){
			
				case 1:
				  registerVeterinary();
				break;
			
				case 2: 
				  registerMascot();
				break;
			
				case 3:
				  addConsultation();
				break;
			
				case 4: 
				  removeMascot();
				break;
				
				case 5:  
				 deleteConsultation();
				break;
				
				case 6:  
				 mascotAtended();
				break;
				
				case 7:
				 deleteVeterinary();
				break;
				
				case 8:  
				 int op=closeCenter();
				 int a=0;
				 
				  	switch(op){
			            case 1:
			             showVeterinary();
			            break;
	                    case 2: 
			             showPriority();
		              	break;
	                	case 3:
			             showPorcen();
		                break;
		                case 4:
			             deleteMascot();
			            break;
			            case 5: a=1;
			             System.out.println("He has exited the program.");
			            break;
		            }
				break;
				
				case 9:  i=1;
				 System.out.println("He has exited the program.");
				break;
			}
		}
	}
	/**
	 *@author jesus garces
	 *menu.<br>
	 *@version 2.0
	 *This method shows the main menu where the user will choose the option to execute
	 *<b>pre:</b> star the program <br>
	 *<b>post:</b> displays the main menu on the screen <br>
	 @return para retornar la opcion a ejecutar en el programa. return != null.
	*/
	public static int menu() {
		int choose=0;
		int b=0;
		
		System.out.println("      \n                MAIN MENU                             ");
		System.out.println("\n please choose an option: \n");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1: register a veterinary ");
		System.out.println("2: register a mascot");
		System.out.println("3: star a consultation");
		System.out.println("4: remove a mascot");
		System.out.println("5: finich a consultation");
		System.out.println("6: see the number of mascot that have not been attended");
		System.out.println("7: delete a veterinary");
		System.out.println("8: menu close center");
		System.out.println("9: out of the program ");
		System.out.println("--------------------------------------------------------------");
		
		while (b==0){
			
			choose=sn.nextInt();
			sn.nextLine();
		
			if (choose>10){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				b=1;
		}
		
		return choose;
	}
	/**
	 *@author jesus garces
	 *registerVeterinary.<br>
	 *@version 1.0
	 *This method is used to record the data of a veterinarian
	 *<b>pre:</b> the veterinary object must have been created in its corresponding class <br>
	 *<b>post:</b> a veterinarian will have registered <br>
	*/
	public static void registerVeterinary(){
		
		System.out.println("\n Enter the name of the veterinary \n");
		String namev=sn.nextLine();
		
		System.out.println("\n Enter the lastname of the veterinary \n");
		String lastn=sn.nextLine();
		
		System.out.println("\n Enter the id of the veterinary \n");
		String idv=sn.nextLine();
		
		System.out.println("\n Enter the record of the veterinary \n");
		String rec=sn.nextLine();
		
		String message=cv.addVeterinary(namev,lastn,idv,rec);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *registerMascot. <br>
	 *@version 1.0
	 *This method is used to record the data of a pet
	 *<b>pre:</b> have created the pet object in the corresponding class <br>
	 *<b>post:</b> a pet has been registered <br>
	*/
	public static void registerMascot(){
		
		System.out.println("\n Enter the specie of the mascot \n");
		String specie=sn.nextLine();
		
		System.out.println("\n Enter the name of the mascot \n");
		String namem=sn.nextLine();
		
		System.out.println("\n Enter the age of the mascot \n");
		int age=sn.nextInt();
		sn.nextLine();
		
		System.out.println("\n Enter the race of the mascot \n");
		String race=sn.nextLine();
		
		System.out.println("\n Enter the sympthom of the mascot \n");
		String sympthom=sn.nextLine();
		
		System.out.println("\n Enter the priority of the mascot. Enter 1 for PRIORITY1, 2 for PRIORITY2, 3 for PRIORITY3, 4 for PRIORITY4, 5 for PRIORITY5 \n");
		int p=sn.nextInt();
		sn.nextLine();

		System.out.println("\n Enter the id of the Owner \n");
		String ido=sn.nextLine();
		
		System.out.println("\n Enter the name of the Owner \n");
		String nameo=sn.nextLine();
		
		System.out.println("\n Enter the phone of the Owner \n");
		int phone=sn.nextInt();
		sn.nextLine();
		
		System.out.println("\n Enter the direction of the Owner \n");
		String direction=sn.nextLine();
		
		String message=cv.addMascot(specie,namem,age,race,sympthom,ido,nameo,phone,direction,p);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *addConsultation.<br> 
	 *@version 1.0
	 *This method is used to start a query
	 *<b>pre:</b> that the vet is not in consultation, that there is a pet to attend <br>
	 *<b>post:</b> a consultation has been started <br>
	*/
	public static void addConsultation(){
		String read="";
		String message="";
		
		System.out.println("Enter the CC of the veterinary");
		read=sn.nextLine();
		
		message=cv.addConsultation(read);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteConsultation. <br>
	 *@version 1.0
	 *This method is used to end a query
	 *<b>pre:</b> have started a consultation <br>
	 *<b>post:</b> a consultation will have been completed <br>
	*/
	public static void deleteConsultation(){
		String c="";
		String message="";
		
		System.out.println("\n Enter the CC of the veterinary \n");
		c=sn.nextLine();
		
		System.out.println("\n Enter the name of the mascot \n");
		String namee=sn.nextLine();
		
		System.out.println("Do you authorize the departure of your pet? Enter 1 for 'YES', 2 for 'Transfer to hospitalization'");
		int auto=sn.nextInt();
		
		message=cv.deleteConsultation(c,namee,auto);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *removeMascot. <br>
	 *@version 1.0
	 *This method is used to remove a pet from the veterinary center
	 *<b>pre:</b> which pet is pending to be attended. <br>
	 *<b>post:</b> a pet will have been withdrawn from the veterinary center <br>
	*/
	public static void removeMascot(){
		String readd="";
		String message="";
		
		System.out.println("Enter the name of the mascot");
		readd=sn.nextLine();
		
		message=cv.removeMascot(readd);
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *mascotAtended. <br>
	 *@version 1.0
	 *This method is used to know how many pets registered in the center, which have the status of waiting to be cared for
	 *<b>pre:</b> have at least one pet registered with the veterinary center, and who has the status of waiting to be cared for <br>
	 *<b>post:</b> The number of pets registered in the center is shown on the screen, which have the status of waiting to be attended <br>
	*/
	public static void mascotAtended(){
		int message=0;
		
		message=cv.mascotAtended();
		System.out.println("the number of pets that have not been laid is: "+message);
	}
	/**
	 *@author jesus garces
	 *closeCenter. <br>
	 *@version 1.0
	 *This method shows on the screen the closing menu of the veterinary center
	 *<b>pre:</b> choose option 8 in the main menu <br>
	 *<b>post:</b> the closing menu of the veterinary center is displayed on the screen <br>
	 *@return to return a number. return != null.
	*/
	public static int closeCenter(){
		int choose=0;
		int b=0;
		//menu close center veterinary
		System.out.println("\n please choose an option: \n");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1: Show the name of the veterinarian with the highest number of consultations");
		System.out.println("2: see Number of pets cared for by priority");
		System.out.println("3: Percentage of pets that left the center without being cared for");
		System.out.println("4: Remove all cared pets");
		System.out.println("5: exit the menu");
		System.out.println("----------------------------------------------------------------------");
		
		while (b==0){
			
			choose=sn.nextInt();
			sn.nextLine();
		
			if (choose>5){
				System.out.println("The option entered is not valid, try again ");
			}
			else  
				b=1;
		}
		
		return choose;
	}
	/**
	 *@author jesus garces
	 *showVeterinary. <br>
	 *@version 1.0
	 *This method shows on the screen the name of the veterinarian who had the highest number of consultations.
	 *<b>pre:</b> that the vet has had at least one consultation <br>
	 *<b>post:</b> The name of the veterinarian with the highest number of consultations is displayed on the screen <br>
	*/
	public static void showVeterinary(){
		String message="";
		
		message=cv.maxVeterinary();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showPriority. <br>
	 *@version 1.0
	 *This method shows on screen the number of pets attended by priority
	 *<b>pre:</b> have registered at least one pet, and that it has been in consultation <br>
	 *<b>post:</b> shows on screen the number of pets cared for by priority <br>
	*/
	public static void showPriority(){
		String message="";
		
		message=cv.countPriority();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *showPorcen. <br>
	 *@version 1.0
	 *This method shows the Percentage of pets that left the center without being cared for
	 *<b>pre:</b> have registered at least one pet <br>
	 *<b>post:</b> shows the Percentage of pets that left the center without being cared for <br>
	*/
	public static void showPorcen(){
		String message="";
		cv.setHorary(10.30);
		
		message=cv.calculatePorcen();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteMascot. <br>
	 *@version 1.0
	 *This method is used to remove all cared pets
	 *<b>pre:</b> have registered a pet, and that it has been consulted <br>
	 *<b>post:</b> all cared pets will have been removed <br>
	*/
	public static void deleteMascot(){
		String message="";
		
		message=cv.deleteAllmascot();
		System.out.println(message);
	}
	/**
	 *@author jesus garces
	 *deleteVeterinary. <br>
	 *@version 1.0
	 *This method serves to eliminate a veterinarian
	 *<b>pre:</b> that there are no pets registered at the veterinary center <br>
	 *<b>post:</b> a vet will have been removed <br>
	*/
	public static void deleteVeterinary(){
		String message="";
		
		System.out.println("Enter the ID of the veterinarian you want to delete");
		String cc=sn.nextLine();
		
		message=cv.deleteVeterinary(cc);
		System.out.println(message);
	}
}