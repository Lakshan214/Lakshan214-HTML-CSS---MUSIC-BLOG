public class student {
  int myid;
  String myname;

  public student(int i, String n) {
    myid = i;
    myname = n;
  }
  
 public void disply();
 {  
   student idname=new student(25,Kamal kumar);
   System.out.println("My id is : "+idname.myid ) ;
   System.out.println("My name is : "+idname.myname );   
 }
 
 public static void main(String[] args) {
    disply();
	
 }	