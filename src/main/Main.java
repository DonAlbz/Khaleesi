package main;

public class Main {

	public static void main(String[] args) {
		boolean dodoIsGay = true;
		//System.out.println("Preparati Mik.\nL'Inverno sta arrivando.\n Sono pronto!");
		dodoBot(dodoIsGay);
		
		
	}
	
	private static void dodoBot(boolean dodoIsGay) {
		if (dodoIsGay){
			repeat();
		}
		else peace();
		
	}

	private static void peace(){
	//do nothing	
	}
	private static void repeat(){
		String[] paroleFrequenti ={"cazzo", "sbora", "froci di merda", "grosso", "bravo e bello"};
		try{
			while(true){
				System.out.println(paroleFrequenti[(int) (Math.random()*paroleFrequenti.length)]);
				Thread.sleep(500);
				}			
			}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
			
		
	}
}
