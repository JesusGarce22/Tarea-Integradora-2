package model;

public class CenterVeterinary{
	//Constantn
	private static final int TOTAL=7;
	private static final int TOTALMASCOT=120;
	//Atributes
	private int numMascot;
	private int numVeterinary;
	private double horary;
	
	//Relation
	private Veterinary[] empley;
	private Mascot[] pacient;
	
	//Metohd
	/**
	 *@author jesus garces
	 *CenterVeterinary. <br>
	 *@version 3.0
	 *This is the constructor method of the CenterVeterinary class
	 *<b>pre:</b> have declared the class attributes and relationships <br>
	 *<b>post:</b> attributes and relationships will have been initialized <br>
	 *@param numm variable to assign to the number of pets. numm != null.
	 *@param numv variable to assign to the number of veterinary. numv != null.
	*/
	public CenterVeterinary(int numm, int numv){
		numMascot=numm;
		numv=numv;
		horary=6.30;
		
	    empley=new Veterinary[TOTAL];
		pacient=new Mascot[TOTALMASCOT];
	}
	/**
	 *@author jesus garces
	 *getNumMascot. <br>
	 *@version 1.0
	 *This method allows you to query the value of the numMascot attribute 
	 *<b>pre:</b> have correctly declared the attribute <br>
	 *<b>post:</b> the value of the attribute could be consulted numMascot <br>
	 *@return to return the value of the attribute numMascot. return != null. 
	*/
	public int getNumMascot(){
		return numMascot;
	}
	/**
	 *@author jesus garces
	 *getNumVeterinary. <br>
	 *@version 1.0
	 *This method allows you to query the value of the numVeterinary attribute 
	 *<b>pre:</b> have correctly declared the attribute <br>
	 *<b>post:</b> the value of the attribute could be consulted numVeterinary <br>
	 *@return to return the value of the attribute numVeterinary. return != null. 
	*/
	public int getNumVeterinary(){
		return numVeterinary;
	}
	/**
	 *@author jesus garces
	 *getHorary. <br>
	 *@version 1.0
	 *This method allows you to query the value of the horary attribute 
	 *<b>pre:</b> have correctly declared the attribute <br>
	 *<b>post:</b> the value of the attribute could be consulted horary <br>
	 *@return to return the value of the attribute horary. return != null. 
	*/
	public double getHorary(){
		return horary;
	}
	/**
	 *@author jesus garces
	 *setHorary. <br>
	 *@version 1.0
	 *This method allows modifying the value of the attribute horary
	 *<b>pre:</b> have correctly declared the attribute <br>
	 *<b>post:</b> the value of the consul attribute could be modified <br>
	 *@param newhorary variable to store the modified value of the attribute consul. newhorary != null.
	*/
	public void setHorary(double newhorary){
		horary=newhorary;
	}
	/**
	 *@author jesus garces
	 *searchIdve. <br>
	 *@version 1.0
	 *This method is used to search for a veterinarian to which the id belongs
	 *<b>pre:</b> enter thr id of the veterinary <br>
	 *<b>post:</b> the vet whose id was entered returns <br>
	 *@param idv attribute with which to search for the vet that belongs to him. idv != null.
	 *@return o return the vet to which the id belongs. return != null.
	*/
	
	public Veterinary searchIdve(String idv){
		Veterinary find=null;
		
		for(int i=0;i<TOTAL;i++){
			if(empley[i]!= null && empley[i].getId().equalsIgnoreCase(idv)){
			  find=empley[i];
			}
		}
		return find;
	}
    /**
	 *@author jesus garces
	 *searchNamem. <br>
	 *@version 1.0
	 *This method is used to search for a pet to which the name belongs
	 *<b>pre:</b> enter the name of the mascot <br>
	 *<b>post:</b> returns the mascot whose name was entered <br>
	 *@param name attribute with which to search for the mascot that belongs to it. name != null.
	 *@return to return the mascot to which the name. return != null.
	*/
	public Mascot searchNamem(String name){
		Mascot find=null;
		
		for(int i=0;i<TOTAL;i++){
		    if(pacient[i]!=null && pacient[i].getName().equalsIgnoreCase(name)){
		      find=pacient[i];
			}
		}
		
		return find;
	}
	/**
	 *@author jesus garces
	 *addVeterinary. <br>
	 *@version 4.0
	 *This method is used to record the data of a veterinarian
	 *<b>pre:</b> the veterinary object must have been created in its corresponding class <br>
	 *<b>post:</b> a veterinarian will have registered, show a message informing <br>
	 *@param nav attribute to store the vet's name . nav != null.
	 *@param lastn attribute to store the vet's last name. lastn != null.
	 *@param idv attribute to store the vet's id. idv != null.
	 *@param rec attribute to store the vet's record. rec != null.
	 *@return to return a message informing. return != null.
	*/
	public String addVeterinary(String nav,String lastn,String idv,String rec){
		String message="";
		boolean cycle=true;
		
		Veterinary sameIdv=searchIdve(idv);
		if(sameIdv!=null){
			message="ERROR. The id of the veterinary exist";
		}
		else {
		
		    for(int i=0;i<TOTAL && cycle; i++){
			    if (empley[i]==null){
				  empley[i]= new Veterinary(nav,lastn,idv,rec);
				  cycle=false;
				  message="the veterinary was created";
			    }
		    }
		}
		if(cycle==true){
			message="ERROR. i do not know can create more veterinary";
		}
		
		return message;
	}
	/**
	 *@author jesus garces
	 *addMascot. <br>
	 *@version 3.0
	 *This method is used to record the data of a pet
	 *<b>pre:</b> have created the pet object in the corresponding class <br>
	 *<b>post:</b> a pet has been registered <br>
	 *@param spe to store the pet species. spe != null.
	 *@param nam to store the pet name. nam != null.
	 *@param ag to store the pet ag. ag != null.
	 *@param ra to store the pet's ra. ra != null.
	 *@param sym to store the pet's sym. sym != null.
	 *@param ido to store the pet owner id. ido != null.
	 *@param nao to store the pet owner name. nao != null.
	 *@param ph to store the pet owner's phone. ph != null.
	 *@param dir to store the pet owner's address. dir != null.
	 *@param p to prioritize the pet. p != null.
	 *@return to return a message informing. return != null.
	*/
	public String addMascot(String spe,String nam,int ag,String ra,String sym,String ido,String nao,int ph,String dir,int p){
		String message="";
		boolean cycle=true;
		for(int i=0;i<TOTALMASCOT && cycle; i++){
			if (pacient[i]==null){
				pacient[i]= new Mascot(spe,nam,ag,ra,sym,ido,nao,ph,dir);
				cycle=false;
				message="the mascot was created";
		
		       switch(p){
			        case 1:
			         pacient[i].setPriority(Priority.PRIORITY1);
			        break;
		     	    case 2:
			         pacient[i].setPriority(Priority.PRIORITY2);
			        break;
			        case 3:
			         pacient[i].setPriority(Priority.PRIORITY3);
		    	    break;
			        case 4:
			         pacient[i].setPriority(Priority.PRIORITY4);
			        break;
			        case 5:
			         pacient[i].setPriority(Priority.PRIORITY5);
			        break;
		        }
			}
		}
		if(cycle==true){
			message="ERROR. i do not know can create more mascot ";
		}
		return message;
	}
	/**
	 *@author jesus garces
	 *nextMascot. <br>
	 *@version 1.0
	 *This method allows you to know which is the next pet by priority that should enter the query
	 *<b>pre:</b> that the vet is not in consultation, that there is a pet to attend <br>
	 *<b>post:</b> a consultation has been started <br>
	 *@return to return the next pet to enter the query. return != null.
	*/
	public Mascot nextMascot(){
		Mascot find=null;
		boolean cycle=true;
		
		for(int i=0;i<TOTALMASCOT && cycle; i++){
			if(pacient[i]!=null && pacient[i].getStatu()==Status.WAIT){
				if(pacient[i].getPriority()==Priority.PRIORITY1){
					find=pacient[i];
					cycle=false;
				}
				else if(pacient[i].getPriority()==Priority.PRIORITY2){
					find=pacient[i];
					cycle=false;
				}
				else if(pacient[i].getPriority()==Priority.PRIORITY3){
					find=pacient[i];
					cycle=false;
				}
				else if(pacient[i].getPriority()==Priority.PRIORITY4){
					find=pacient[i];
					cycle=false;
				}
				else if(pacient[i].getPriority()==Priority.PRIORITY5){
					find=pacient[i];
					cycle=false;
				}
			}
		}
		return find;
	}
	/**
	 *@author jesus garces
	 *addConsultation. <br>
	 *@version 3.0
	 *This method is used to start a query
	 *<b>pre:</b> that the vet is not in consultation, that there is a pet to attend <br>
	 *<b>post:</b> a consultation has been started <br>
	 *@param read variable containing the id of the vet entered that is needed to start the query. read != null.
	 *@return to return a message informing. return != null.
	*/
	public String addConsultation(String read){
		String message="";
		Veterinary sameIdv=searchIdve(read);
        
		if(sameIdv==null){
		     message="ERROR, here is no vet id";
			}
		else{
				if(sameIdv.getIsAvailable()==false){
					message="ERROR. The vet is not available";
				} 
				else{
					Mascot next=nextMascot();
					
					if(next==null){
						message="ERROR. There are no pets pending to be cared for ";
					}
					else{
						sameIdv.setIsAvailable(false);
						sameIdv.setConsultation(next);
						sameIdv.setCount(sameIdv.getCount()+1);
						next.setStatu(Status.INCONSULTATION);
						next.setVeterinaryCons(sameIdv);
						message="the query started successfully";
					}
				}
		    }	
		
		return message;
	}
	/**
	 *@author jesus garces
	 *deleteConsultation. <br>
	 *@version 3.0
	 *This method is used to end a query
	 *<b>pre:</b> have started a consultation <br>
	 *<b>post:</b> a consultation will have been completed <br>
	 *@param c variable containing the id of the vet entered that is needed to end a query. c != null.
	 *@param namee variable that contains the name of the pet that is needed to verify if it is in query. namee != null.
	 *@param auto variable that contains a number to know if the pet owner authorizes the exit. auto != null.
	 *@return to return a message informing. return != null.
	*/
    public String deleteConsultation(String c,String namee,int auto){
		String message="";
		Veterinary saameid=searchIdve(c);
		
		if(saameid==null){
			message="ERROR, here is no vet id";
		}
		else{
			Mascot sameName=searchNamem(namee);
			
			if(sameName.getStatu()==Status.INCONSULTATION){
				if(auto==1){
					sameName.setStatu(Status.AUTORIZEDEXIT);
					sameName.setConsul(true);
					saameid.setIsAvailable(true);
					message="the consultation is finished";
				}
				else{
					sameName.setStatu(Status.TRANFER);
					saameid.setIsAvailable(true);
					message="the pet's departure is authorized, the consultation is finished";
				}
			}
		}
		return message;
	}
	/**
	 *@author jesus garces
	 *removeMascot. <br>
	 *@version 1.0
	 *This method is used to remove a pet from the veterinary center
	 *<b>pre:</b> which pet is pending to be attended. <br>
	 *<b>post:</b> a pet will have been withdrawn from the veterinary center <br>
	 *@param readd variable to store the name of the pet to be removed from the veterinary center. readd != null.
	 *@return to return a message informing. return != null.
	*/
	public String removeMascot(String readd){
		String message="";
		Mascot lilin=searchNamem(readd);
		
		if(lilin==null){
			message="ERROR. there are no pets with that name";
		}
		else{
			if(lilin.getStatu()==Status.WAIT){
				message="the mascot "+lilin.getName()+" has been successfully withdrawn";
				lilin=null;
			}
		}
		return message;
	}
	/**
	 *@author jesus garces
	 *mascotAtended. <br>
	 *@version 1.0
	 *This method is used to know how many pets registered in the center, which have the status of waiting to be cared for
	 *<b>pre:</b> have at least one pet registered with the veterinary center, and who has the status of waiting to be cared for <br>
	 *<b>post:</b> The number of pets registered in the center is shown on the screen, which have the status of waiting to be attended <br>
	 *@return to return the number of pets that have not been cared for. return != null.
	*/
	public int mascotAtended(){
		int num=0;
        for(int i=0;i<TOTALMASCOT;i++){
			if(pacient[i]!=null && pacient[i].getStatu()==Status.WAIT){
		      num++;
			}
		}
		return num;
	}
	/**
	 *@author jesus garces
	 *countVetrrinary. <br>
	 *@version 1.0
	 *This method shows on the screen the name of the veterinarian who had the highest number of consultations.
	 *<b>pre:</b> that the vet has had at least one consultation <br>
	 *<b>post:</b> The name of the veterinarian with the highest number of consultations is displayed on the screen <br>
	 *@return to return the vet with more consultations . return != null.
	*/
	public Veterinary countVetrrinary(){
		Veterinary num=null;
		
		
		for(int i=0;i<TOTAL;i++){
			if(empley[i]!=null){
			    if(empley[i].getCount()>0){
		          num=empley[i];
			    }
		    }
		}

		return num;
	}
	/**
	 *@author jesus garces
	 *maxVeterinary. <br>
	 *@version 1.0
	 *This method shows on the screen the name of the veterinarian who had the highest number of consultations.
	 *<b>pre:</b> that the vet has had at least one consultation <br>
	 *<b>post:</b> The name of the veterinarian with the highest number of consultations is displayed on the screen <br>
	 *@return to return a message with the name of the veterinarian with more inquiries. return != null.
	*/
	public String maxVeterinary(){
		Veterinary mc=countVetrrinary();
		
		String message="the veterinarian with the highest number of consultations was: "+mc.getName();
		
		return message;
	}
	/**
	 *@author jesus garces
	 *countPriority. <br>
	 *@version 1.0
	 *This method shows on screen the number of pets attended by priority
	 *<b>pre:</b> have registered at least one pet, and that it has been in consultation <br>
	 *<b>post:</b> shows on screen the number of pets cared for by priority <br>
	 *@return to return a message with the number of pets attended by priority. return != null.
	*/
	public String countPriority(){
		int total1=0;
		int total2=0;
		int total3=0;
		int total4=0;
		int total5=0;
		String message="";
		boolean cycle=true;
		
		for(int i=0;i<TOTALMASCOT && cycle; i++){
			if(pacient[i]!=null && pacient[i].getConsul()==true){
				if(pacient[i].getPriority()==Priority.PRIORITY1){
					total1++;
				}
				if(pacient[i].getPriority()==Priority.PRIORITY2){
					total2++;
				}
				if(pacient[i].getPriority()==Priority.PRIORITY3){
					total3++;
				}
				if(pacient[i].getPriority()==Priority.PRIORITY4){
					total4++;
				}
				if(pacient[i].getPriority()==Priority.PRIORITY5){
					total5++;
				}
			}
		}
		message="the number of pets cared for with priority 1 was: "+total1+ "\n";
		message+="the number of pets cared for with priority 2 was: "+total2+ "\n";
		message+="the number of pets cared for with priority 3 was: "+total3+ "\n";
		message+="the number of pets cared for with priority 4 was: "+total4+ "\n";
		message+="the number of pets cared for with priority 5 was: "+total5+ "\n";
		
		return message;
	}
	/**
	 *@author jesus garces
	 *calculatePorcen. <br>
	 *@version 1.0
	 *This method shows the Percentage of pets that left the center without being cared for
	 *<b>pre:</b> have registered at least one pet <br>
	 *<b>post:</b> shows the Percentage of pets that left the center without being cared for <br>
	 *@return to return a message that shows the Percentage of pets that left the center unattended . return != null.
	*/
	public String calculatePorcen(){
		int notatended=0;
		double porcen=0;
		String message="";
		
		for(int i=0;i<TOTALMASCOT;i++){
			if(pacient[i]!=null && pacient[i].getStatu()==Status.WAIT){
				pacient[i].setStatu(Status.UNATTENDEDEXIT);
				notatended++;
			}
		}
		
		porcen=(notatended*100)/TOTALMASCOT;
		
		message+="the percentage of pets that left unattended is: "+porcen+"%.";
		
		return message;
	}
	/**
	 *@author jesus garces
	 *deleteAllmascot. <br>
	 *@version 1.0
	 *This method is used to remove all cared pets
	 *<b>pre:</b> have registered a pet, and that it has been consulted <br>
	 *<b>post:</b> all cared pets will have been removed <br>
	 *@return to return a message informing. return != null.
	*/
	public String deleteAllmascot(){
		String message="";
		
		for(int i=0;i<TOTALMASCOT;i++){
			if(pacient[i]!=null){
				if(pacient[i].getConsul()==true){
				   pacient[i]=null;
			    }
			}
		}
		
		message="Cared pets have been successfully removed";
		
		return message;
	}
	/**
	 *@author jesus garces
	 *deleteVeterinary. <br>
	 *@version 1.0
	 *This method serves to eliminate a veterinarian
	 *<b>pre:</b> that there are no pets registered at the veterinary center <br>
	 *<b>post:</b> a vet will have been removed <br>
	 *@param cc variable containing the id of the veterinarian to be deleted. cc != null.
	 *@return to return a message informing. return != null.
	*/
	public String deleteVeterinary(String cc){
		String message="";
		
		Veterinary dv=searchIdve(cc);
		
		if(dv==null){
			message="ERROR, there is no vet card ";
		}
		else{
			for(int i=0;i<TOTALMASCOT;i++){
				if(pacient[i]!=null){
					message="The vet cannot be removed because there are pets currently registered with the vet center";
				}
				else{
					message="The veterinary was successfully retired";
					dv=null;
				}
			}
		}
		
		return message;
	}
}