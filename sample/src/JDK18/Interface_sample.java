package JDK18;

@FunctionalInterface
public interface Interface_sample {
	int add(int a, int b);
public static void main(String[] args) {
	Interface_sample isf= (a,b)-> 
	{
		return a+b;
		
	};
	
	isf.add(3, 1);
}	
}


