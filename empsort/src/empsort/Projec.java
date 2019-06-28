package empsort;
import java.util.*;

import empsort.Manager.Managerobj;
public class Projec implements Comparable<Projec>,Managerobj{
	 List<Projec>project=new ArrayList<Projec>();
	 ArrayList<String> pro=new ArrayList<String>();
	 Projec p[]=new Projec[6];
	 Employ employ;
	 String pid;
	 String pname;
	 String mid;
	 String mname;
	int n;
	 public void Employ(Employ ep) {
	        employ = ep;
	    }
	public String getpId() {
        return pid;
    }
    public String getpname() {
        return pname;
    }
	public  Projec(String pid,String pname,String mid,Employ employ) {        
		this.pid=pid;
		this.pname=pname;
		this.mid=mid;
		this.employ=employ;
	}         
	public  Projec(String pid,String pname,String mid) {        
		/*	super(pid,pid,pid,pid);*/
			this.pid=pid;
			this.pname=pname;
			this.mid=mid;
			
		}  
	
	public Projec(String pid) {
		this.pid=pid;
	}
	public int compare(Projec pr1,Projec pr2) {
		return pr1.getpId().compareTo(pr2.getpId());                                     
    }
	
	 public String toString() {
	        return "[pid=" + this.pid + ", pname=" + this.pname  + ",pmanager="+this.mid+"]";
	 }
	 public Employ getEmploy() {
		 return employ;
	 }
	
	   public void setpname(String pname) {
		 this.pname = pname;
		 }
	   public void setpId(String pid) {
		 this.pid = pid;
		 }
	@Override
	public int compareTo(Projec o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getname() {
		return mname;
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setname(String mname) {
		
		// TODO Auto-generated method stub
		this.mname=mname;
	}
	public String getid() {
		return mid;
		// TODO Auto-generated method stub

	}
	public String getid1() {
		return mid;
	}
	public void setid(String mid) {
		
		// TODO Auto-generated method stub
		this.mid=mid;
	}
	}



