interface printable{  
void print();  
}  

 class  AbstractImpInterface implements printable{  
public void print(){System.out.println("Interface abstract");}  
  
public static void main(String args[]){  
	AbstractImpInterface obj = new AbstractImpInterface();  
obj.print();  
 }  
} 
