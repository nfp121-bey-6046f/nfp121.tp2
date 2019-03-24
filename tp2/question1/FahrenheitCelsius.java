package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre Ahmad Mouhamad (6046 f))
 * @version (1.0)
 */
public class FahrenheitCelsius {

    /**
     * @param args liste des valeru en degré fehrenheit pour converter en clsius
     * 
     * Affiche la liste de valeur en degré celsius et leur initial valeur en fehrenhite
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
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
