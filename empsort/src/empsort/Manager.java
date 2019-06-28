package empsort;

public class Manager {
		  void make(Managerobj manager) {
		    manager.setname(manager.getname() + 2);
		  }
		  String mid;
		  String mname;
public interface Managerobj {
    String getname();
    void setname(String mname);
    String getid1();
    void setid(String mid);
}
	
public String getid1() {
	return mid;
}
public void setid(String mid) {
	
	// TODO Auto-generated method stub
	this.mid=mid;
}
}
