package question2;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

    /** le point d'entrée de cette application, 
     * dont le commentaire est à compléter
     *
     *  @param args ...
     */
    public static void main(String[] args){
        try{
            int fahrenheit = 0; //initialiser Fahrenheit valeur
            float celsius = 0; //initialiser celsius valeur

            if(args != null && args.length > 0) // vérifier la valeur respect le condition (pas null et il a des valeurs)
            {
                for(int i=0; i < args.length; i++) // parcours args
                {
                    fahrenheit = Integer.parseInt(args[i]); // convert valeur to integer
                    celsius = fahrenheitEnCelsius(fahrenheit); // appel de la fonction fahrenheitEnCelsius(int f)
                    System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // affiche le résultat obtenue                                                           // format
                } 																	// imposés
            }

        }catch(NumberFormatException nfe){
            System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
        }

    }

    /**
     * 
     * @param f la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float convCelcius= (float)(5f/9f)*(f-32);// 5f et 9f pour obtient float resultat ou on utilise (float)
        float res = (float) ((int)(convCelcius*10)) / 10f;

        return res; // à compléter en remplaçant ce return 0.F par la fonction
        // de conversion
    }
}
