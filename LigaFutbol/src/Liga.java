import java.util.Random;
public class Liga {

	public static void main(String[] args) {
	  int RealMadrid;
	  int Valencia;
	  int Barcelona;

	    Random rnd = new Random();
	    RealMadrid = 0+rnd.nextInt(5);
	    Valencia= 0+rnd.nextInt(5);
	    Barcelona= 0+rnd.nextInt(5);
	    
	    System.out.println("LIGA DE FUTBOL PROFESIONAL\n");
	    System.out.println("     Jornada 1");
	    System.out.println(" Real Madrid "+RealMadrid+" Valencia "+Valencia);
	    System.out.println(" Valencia "+Valencia+" Barcelona "+Barcelona);
	    System.out.println(" Barcelona "+Barcelona+" Real Madrid "+RealMadrid);

	    
	    if (RealMadrid > Valencia && Valencia > Barcelona && Barcelona > RealMadrid){
	    	RealMadrid=3;
	    	Valencia=3; 
	    	Barcelona=3;
	       }
	    if (RealMadrid == Valencia && Valencia == Barcelona && Barcelona == RealMadrid){
	    	RealMadrid=1;
	    	Valencia=1;  
	    	Barcelona=1;
	        }
	     if (RealMadrid < Valencia && Valencia < Barcelona && Barcelona < RealMadrid){
	    	RealMadrid=0;
	    	Valencia=0;
	    	Barcelona=0;
	       }
	 

	    
	    System.out.println("-------------------\n    PUNTOS");
	    System.out.println("Real Madrid  "+RealMadrid+"\nValencia     "+Valencia+"\nBarcelona    "+Barcelona);
	 
	    System.out.println("-------------------\n  GANADOR");
	    if (RealMadrid >= 3){
	    	 System.out.println("CAMPEÓN REAL MADRID");	    	
	        }
	    if (Valencia >= 3){
	    	 System.out.println("CAMPEÓN VALENCIA");	    	
	        }
	    if (Barcelona >= 3){
	    	 System.out.println("CAMPEÓN BARCELONA");	    	
	        }

     }
 }

