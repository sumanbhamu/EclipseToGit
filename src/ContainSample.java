

    import java.util.*;  

   class ContainSample{  

    public static void main(String args[]){  

//usinggeneric

    ArrayList<Integer> al=new ArrayList<Integer>();  
    ArrayList<String> al1=new ArrayList<String>();  
    System.out.println("enter 5 values age and name");
Scanner sc=new Scanner(System.in);


for(int i=0;i<5;i++){
al.add(sc.nextInt());
}
for(int j=0;j<5;j++){
	al1.add(sc.next());
}

Iterator it=al.iterator();
Iterator itr=al1.iterator();
while(it.hasNext()){
	System.out.println(it.next()+"   "+itr.next());//age and name

}
  
 }  

 }  

   






/*
public class ContainSample {

	public static void main(String[] args) {
	String s[]={"suman hw r u","i lov u"}; int c=0;
	for(String d:s){
		if(d.contains("hw")){
			c++;
			System.out.println(d);
		}
		
	}
	
	
	}

}
*/