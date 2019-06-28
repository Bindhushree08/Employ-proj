package empsort;

import java.util.*;
import java.util.Comparator;

public class Mainclass {
	static List<Employ> employees = new ArrayList<Employ>();
	static List<Projec> project = new ArrayList<Projec>();

	static List<Employ> pro = new ArrayList<Employ>();
	static List<Projec> empl = new ArrayList<Projec>();
	
	static void pushelement(Employ obj) {
		employees.add(obj);
	}

	public static void get(String eid) {
		Scanner in = new Scanner(System.in);
		for (Employ e : employees) {
			if (e.eid.equals(eid)) {
				System.out.println("id already exists");
				System.out.println("enter another id");
				eid = in.next();
			}
		}
	}
	static List<String>assignemp=new  ArrayList<String>();
	static List<String>assignproj=new  ArrayList<String>();
	static void pushelement1(Projec ob) {
		project.add(ob);
	}
	static void pushelement2(Employ ob1) {
		pro.add(ob1);
	}
	static void pushelement3(Projec ob2) {
		empl.add(ob2);
	}


	public static void get1(String pid) {
		Scanner in = new Scanner(System.in);
		for (Projec p : project) {
			if (p.pid.equals(pid)) {
				System.out.println("id already exists");
				System.out.println("enter another id");
				pid = in.next();
			}
		}
	}

  
	public static void update(String pid) {
		Scanner sc = new Scanner(System.in);

		String pname;
		int choice=0;
		for (Projec pi : project)
		{

			if (pi.pid.equals(pid)) 
			{
				pi.setpId(pid);
				while(true)
				{
					System.out.println("1.update name");
			//		System.out.println("3.update designation");
					System.out.println("2.exit");
			        System.out.println("enter your choice ");
			        while (sc.hasNextLine()) 
					 { 
						  
				            if (sc.hasNextInt())
				            {
				                choice = sc.nextInt();
				                break;
				            } 
				            else 
				            { 
								System.out.println("your input is invalid");
								sc.next();
								System.out.println("enter your choice");
				            }
					 }
			       
			        switch(choice) 
			        {
					   case 1:    System.out.println("Enter Project new Name whose id is:" + pid);
	                              pname = sc.next();
	            				  pi.setpname(pname);
	            				  break;
					  case 2:   return;
			         }
				}
				
			} 
				
			}
		System.out.println("Project id doesnot exists");
		System.out.println("enter another project id");
		pid = sc.next();
		update(pid);
		
		}
	

	public static void update1(String eid) {
		Scanner sc = new Scanner(System.in);

		String name;
		String dept;
		String designation;
		int choic=0;
		for (Employ ei : employees) {
			if (ei.eid.equals(eid)) {
				ei.setId(eid);
				while(true){
							System.out.println("1.update name");
							System.out.println("2.update dept");
							System.out.println("3.update designation");
							System.out.println("4.exit");
					        System.out.println("enter your choice ");
					        while (sc.hasNextLine()) 
							 { 
								  
						            if (sc.hasNextInt())
						            {
						                choic = sc.nextInt();
						                break;
						            } 
						            else 
						            { 
										System.out.println("your input is invalid");
										sc.next();
										System.out.println("enter your choice");
						            }
						          //  if(choic != 0) break;
						        } 
					        switch(choic) {
									        case 1:  
									        	     System.out.println("Enter Employee new Name whose id is:" + eid);
							                  	     name = sc.next();
							                  	     ei.setEmpName(name);
							                  	     break;
									        case 2:  System.out.println("Enter Employee new  dept whose id is:" + eid);
											         dept = sc.next();
											         ei.setEmpdept(dept);
											         break;
									        case 3:  System.out.println("Enter Employee new Designation whose id is" + eid);
							                    	 designation = sc.next();
											         ei.setEmpDesignation(designation);
											         break;
									        case 4:return;
					                     }
					    
				               }
		    
				
			} 
				
				
			}
		System.out.println("employee id doesnot exists");
		System.out.println("enter another employee id");
		eid = sc.next();
		update1(eid);
		}
	
	  public static void removeEmployee(String eid){
	 	    Iterator<Employ> it = pro.iterator();
	 	    while(it.hasNext()){
	 	        Employ pro = it.next();
	 	        if(pro.getId().equals(eid)){
	 	            it.remove();
	 	            break;
	 	        }
	 	    }
	    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String eid = null;
		String name = null;
		String dept = null;
		String designation = null;
		String pid = null;
		String pname = null;
		int count = 0;
		int n = 0;
		while (true) {
			System.out.println("1.Add Employee");
			System.out.println("2.Add project");
			System.out.println("3.Edit Employee");
			System.out.println("4.Edit Project");
			System.out.println("5.Assign project to employee");
			System.out.println("6.show employee");
			System.out.println("7.show project");
			System.out.println("8.show employees for particular project");
			System.out.println("9.show projects for particular employee");
			System.out.println("10.delete employee for project");
			System.out.println("11.Exit");
			int ch = 0;
			System.out.println("enter your choice");
			 while (sc.hasNextLine() && ch == 0) 
			 { 
				  
		            if (sc.hasNextInt())
		            {
		                ch = sc.nextInt();
		                break;
		            } 
		            else 
		            { 
						System.out.println("your input is invalid");
						sc.next();
						System.out.println("enter your choice");
		            }
		            if(ch != 0) break;
		        } 
				switch (ch) {
				case 1:
					
					System.out.println("how many employees information to be stored");
                    
					 while (sc.hasNextLine()) 
					 { 
						  
				            if (sc.hasNextInt())
				            {
				                count = sc.nextInt();
				                break;
				            } 
				            else 
				            { 
								System.out.println("your input is invalid");
								sc.next();
								System.out.println("how many employees information to be stored");
								
				            }
				        
				        } 
					
					for (int i = 1; i <= count; i++) {
						System.out.println("enter eid");
						eid = sc.next();
						get(eid);
						System.out.println("enter ename");
						name = sc.next();
						System.out.println("enter dept");
						dept = sc.next();
						System.out.println("enter designation");
						designation = sc.next();

						Employ eobj = new Employ(eid, name, dept, designation);
						pushelement(eobj);
					}
					break;

				case 2:int flag=0;
					Employ eobj = new Employ(eid, name, dept, designation);
					System.out.println("enter the no of projects");
					 while (sc.hasNextLine()) 
					 { 
						  
				            if (sc.hasNextInt())
				            {
				                n = sc.nextInt();
				                break;
				            } 
				            else 
				            { 
								System.out.println("Your input is invalid");
								sc.next();
								System.out.println("enter the no of projects");
				            }
				          
				        } 
				
					for (int i = 0; i < n; i++) 
					{
						System.out.println("enter project id ");
						pid = sc.next();
						get1(pid);
						System.out.println("Enter project name");
						pname = sc.next();
						System.out.println("Enter manager to project");
						String mid = sc.next(); 
						for (Employ ei : employees)
						{ 
							if(ei.getId().equals(mid))
							{
				    				Projec pobj = new Projec(pid, pname, mid, eobj);
				    	     		pushelement1(pobj);
//				    	     		Employ eobj1=new Employ(mid);
//				    	     		pushelement(eobj1);
				    	     		 flag=1;
									break;
									
						     }
							if(flag==1)break;	
						}
							if(flag==0)
						System.out.println("employee doesnot exists");

					}
					
					break;
				case 3:
					
					System.out.println("Enter Employee Id whose record you want to update: ");
					eid = sc.next();
					update1(eid);
					break;
				case 4:
					System.out.println("Enter Project Id whose record you want to update: ");
					pid = sc.next();
					update(pid);
					break;
				case 5:  int flag1=0;
				         int count1=0;
					         System.out.println("enter project id");
					            pid=sc.next();
					            for(Projec pi: project) 
					            { 
							        if (pi.pid.equals(pid)) 
							        {
									    System.out.println("Enter the employee id to which project should be assigned");
							             eid=sc.next(); 
							             for (Employ ei : employees) 
							           {
							                    if(ei.eid.equals(eid)) 
							                    { 
								                	ei.name=pi.getEmploy().getEmpName();
								                	ei.dept=pi.getEmploy().getEmpdept();
								                	ei.designation=pi.getEmploy().getEmpDesignation();
								                	Employ eobj1 = new Employ(eid,ei.name,ei.dept,ei.designation); 
								                	pushelement2(eobj1);
								                	String temp=pid;
								                	assignemp.add(temp);
								                	Projec pobj1=new Projec(pid,pi.pname,pi.mid);
													pushelement3(pobj1);
													assignproj.add(pi.mid);
								                	System.out.println("project " +pi.pid+ " is assigned to employee  " +ei.eid);
	                                                System.out.println("employee details are");
	                                                System.out.println("Ename:"+ ((Projec) pi).getEmploy().getEmpName());
								 				    System.out.println("Edept:"+((Projec) pi).getEmploy().getEmpdept());
								 				    System.out.println("Edesignation:" +((Projec)pi).getEmploy().getEmpDesignation()); 
								 				    flag1=1;
								 				   
								 				     break;	    
							 				   }
							                    
							                    if(flag1==1)break;
									             
					                      }
							                if(flag1==0)
							                System.out.println("eid doesnot exists");
							                 count1=1;
					                       	break;    
				                	    
							        }  
							        if(count1==1)break;
	                           }
					            if(count1==0)
					                System.out.println("pid doesnot exists");
					          
								break;	
				case 6:
					System.out.println("Employee details");
					Collections.sort(employees, new eidsorter());
					StringBuilder builder = new StringBuilder();
					for (Employ details : employees) {
					   builder.append(details + "\n");
					}

					System.out.println(builder.toString());
					break;

				case 7:
					System.out.println("\n Project details");
					Collections.sort(project, new pidsorter());
					StringBuilder builders = new StringBuilder();
					for (Projec details : project) {
					   builders.append(details + "\n");
					}

					System.out.println(builders.toString());
					
					break;
				case 8:int c=0;
						System.out.println("enter pid ");
						pid=sc.next();
						for(Projec pi:project) {
							if(pi.pid.equals(pid)) {
							System.out.println("manager: " +pi.getid1());
							c=1;
							break;
							}
							if(c==1)break;
						}
						if(c==0)
							System.out.println("pid doesnot exists");
						for(Projec pi:empl)
						{	if(pi.pid.contentEquals(pid))
							{
						for(Employ ei:pro) {
							System.out.println(pro);
							break;
							}
							//System.out.println("project " +pi.pid+ " is assigned to employee  " +pi.getEmploy().getId());
							c=1;
								break;
						    }
						     if(c==1)break;
						     System.out.println("pid doesnot exists");
						}
						
					    break;
				case 9:int d=0;
					   System.out.println("Enter eid");
			            eid=sc.next();
			            for(Projec pi:project) {
			            	if(pi.mid.equals(eid)) {
			            		System.out.println("project assigned to manager:"+pi.getpId());
			            		d=1;
			            		break;
			            	}
			            	if(d==1)break;
			            	
			            }
			           if(d==0)
			        	   System.out.println("eid doesnot exists");
                        for(Employ p2:pro) 
			        	{
                        	if(p2.eid.contentEquals(eid))
                        	{
                        		 System.out.println(empl);
                        		 d=1;
        					     break;
                        	}
					  if(d==1)  break;
					  System.out.println("eid doesnot exists");
				       }
                       
				         break;
	case 10:    int a=0;
	            int e=0;
				           for(Projec pi:empl)
				           {
					            if(pi.pid.equals(pid)) 
					            {
					        	    System.out.println("enter employee id to be deleted");
					        	      eid=sc.next();
					        	    for(Employ ei:pro)
					        	    {
					        	    	if (ei.eid.equals(eid)) 
					        	    	{
						        	        pro.remove(ei);
						                  	System.out.println(pro);
						                  	a=1;
						                  	break;
					        	    	}
					        	    	if(a==1)break;
					        	    }
					        	    if(a==0)
					        	    System.out.println("eid doesnot exists");
			        	    		e=1;
			        	    		break;
					            }
					            if(e==1)break;
				           }
				           if(e==0)
				           System.out.println("pid doesnot exists");
				           break;
				        	
				case 11:
					System.exit(0);
				
			}
		

	}
}
}