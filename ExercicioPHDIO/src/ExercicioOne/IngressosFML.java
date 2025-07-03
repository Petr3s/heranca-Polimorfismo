package ExercicioOne;

public class IngressosFML extends Cinema{
protected static int Ing ;
 public IngressosFML(){
	 
 }
 public IngressosFML(int Ing ) {
	 IngressosFML.Ing = Ing;
 }
 /**
 * @return the ing
 */
 protected static int getIng() {
	return Ing;
 }
 /**
 * @param ing the ing to set
 */
 protected static void setIng(int ing) {
	try {
		if (ing == 3) {
		Ing = (int)	(ing * 0.95);
			
		} else {
			Ing = ing;
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
 }
 
 
 
 
 
 
}
