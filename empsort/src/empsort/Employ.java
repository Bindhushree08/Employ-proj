package empsort;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import empsort.Manager.Managerobj;

import java.util.Collections;
import java.util.List;
public class Employ implements Comparable<Employ> ,Managerobj  {
	 List<Employ> employees=new ArrayList<Employ>();
	              String eid;
	           	 String name;
	           	 String dept;
		         String designation;
		        int count;
		        Employ e[]=new Employ[7];
				
				 
		         public String getId() {
				        return eid;
				    }
				 
				   public String getEmpName() {
				        return name;
				    }
				   public String getEmpdept() {
				        return dept;
				    }
				   public String getEmpDesignation() {
				        return designation;
				    }
		public Employ(String eid,String name,String dept,String designation) {
			this.eid=eid;
			this.name=name;
			this.dept=dept;
			this.designation=designation;
			
		}
		public void Employ1(String mid) {
			this.mid=mid;
		}
		public Employ(String eid) {
			this.eid=eid;
		}


		 public String toString() {
		        return "[id=" + this.eid + ", name=" + this.name + ", dept=" + this.dept + ", designation=" +
		                this.designation + "]";
		 }
		
		 public void setEmpName(String ename) {
			 this.name = ename;
			 }

			 public void setEmpdept(String dept) {
			 this.dept = dept;
			 }

			 public void setEmpDesignation(String designation) {
			 this.designation=designation;
			 }
			   public void setId(String eid) {
				   this.eid = eid;
				   }
			 
		@Override
		public int compareTo(Employ o) {
			// TODO Auto-generated method stub
			return 0;
		}
		String mname = null;
		String mid=null;
		@Override
		public String getname() {
			
			return mname;
			// TODO Auto-generated method stub
			
		}

		
		public void setname(String name) {
			// TODO Auto-generated method stub
			
		}

	public String getid1() {
		this.mid=mid;
		return mid;
	}
		public String getid() {
			// TODO Auto-generated method stub
			return mid;
		}

		@Override
		public void setid(String mid) {
			// TODO Auto-generated method stub
			this.mid=mid;
		}
		    
	            	
	             

	            	 }


