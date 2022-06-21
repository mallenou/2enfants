/**
 * Illustration du Paradoxe des 2 enfants.
 * @author Michel Allenou
 */

/**
 * Classe qui effectue les statistiques sur les 4 cas.
 */
 public class Stats {

    //Nombre de tirages à effectuer dans la simulation
    private static int NB_ITERATIONS = 10000000;

    /**
     * Première méthode: on connait le premier enfant (garcon).
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method1(){
        int enfants1Garcon = 0;
        int enfants2Garcon = 0;

        for (int i = 0; i <  NB_ITERATIONS ; i++) {
            Tirage tirage = new Tirage();
            //C'est un garçon !
            if (tirage.enfant1Garcon()) {
                enfants1Garcon++;
                //Probabilité d'avoir un autre garçon
                if(tirage.enfant2Garcon()){
                    enfants2Garcon++;
                }
            }
        }

        return (100 * enfants2Garcon) / enfants1Garcon;
    }

    /**
     * Seconde méthode: On connait le premier enfant (garcon né un mardi).
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method2(){
        int enfants1GarconNeMardi = 0;
        int enfants2Garcon = 0;
        
        for (int i = 0; i <  NB_ITERATIONS ; i++) {
            Tirage tirage = new Tirage();
            //C'est un garçon né un mardi !
            if (tirage.enfant1GarconNeMardi()) {
                enfants1GarconNeMardi++;
                //Probabilité que l'autre soir un garçon
                if(tirage.enfant2Garcon()){
                    enfants2Garcon++;
                }
            }
        }

        return (100 * enfants2Garcon) / enfants1GarconNeMardi;
    }

    /**
     * Troisième méthode: On connait le premier enfant (garcon né dans le finistère).
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method3(){
        int enfants1GarconNe29 = 0;
        int enfants2Garcon = 0;

        for (int i = 0; i <  NB_ITERATIONS ; i++) {
            Tirage tirage = new Tirage();
            //C'est un garçon né dans le finistère
            if (tirage.enfant1EstUnGarconNe29()) {
                enfants1GarconNe29++;
                //Probabilité que le second soit un garçon
                if(tirage.enfant2Garcon()){
                    enfants2Garcon++;
                }
            }
        }

        return (100 * enfants2Garcon) / enfants1GarconNe29;
    }

    /**
     * Quatrième méthode: on sait qu'on moins un enfant est un garçon.
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method4() {
        int auMoins1Garcon = 0;
        int autresEstGarcon = 0;

        for (int i = 0; i < NB_ITERATIONS; i++) {
            Tirage tirage = new Tirage();
            //Il y a au moins un garçon !
            if (tirage.auMoinsUnGarcon()) {
                auMoins1Garcon++;
                //Probabilité que l'autre soit un garçon (donc les 2 sont garçons)
                if (tirage.enfant1Garcon() && tirage.enfant2Garcon()) {
                    autresEstGarcon++;
                }
            }
        }
        return (100 * autresEstGarcon) / auMoins1Garcon;
    }

    /**
     * Cinquième méthode: on sait qu'on moins un enfant est un garçon né un mardi.
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method5() {
        int auMoinsUnGarconNeMardi = 0;
        int autresEstGarcon = 0;

        for (int i = 0; i < NB_ITERATIONS; i++) {
            Tirage tirage = new Tirage();
            //Au moins un garçon né un mardi
            if (tirage.auMoinsUnGarconNeMardi()) {
                auMoinsUnGarconNeMardi++;
                //Probabilité que l'autre soit un garçon (donc les 2 sont garçons)
                if (tirage.enfant1Garcon() && tirage.enfant2Garcon()) {
                    autresEstGarcon++;
                }
            }
        }
        return (100 * autresEstGarcon) / auMoinsUnGarconNeMardi;
    }

    /**
     * Sixième méthode: on sait qu'on moins un enfant est un garçon né dans le finistère.
     * Retourne la probabilité que le second enfant est aussi un garçon.
     */
    public static float method6() {
        int auMoinsUnGarconNe29 = 0;
        int autresEstGarcon = 0;

        for (int i = 0; i < NB_ITERATIONS; i++) {
            Tirage tirage = new Tirage();
            //Au moins un garçon est né dans le finistère
            if (tirage.auMoinsUnGarconNe29()) {
                auMoinsUnGarconNe29++;
                //Probabilité que l'autre soit un garçon (donc les 2 sont garçons)
                if (tirage.enfant1Garcon() && tirage.enfant2Garcon()) {
                    autresEstGarcon++;
                }
            }
        }
        return (100 * autresEstGarcon) / auMoinsUnGarconNe29;
    }

    /**
     * Routine principale (Main) qui exécute et affiche les résutats des cas
     * @param ignored pas de paramètre (ignoré)
     */
    public static void main(String[] ignored) {
        System.out.println("Method1 = " + Stats.method1() + "%");
        System.out.println("Method2 = " + Stats.method2() + "%");
        System.out.println("Method3 = " + Stats.method3() + "%");
        System.out.println("Method4 = " + Stats.method4() + "%");
        System.out.println("Method5 = " + Stats.method5() + "%");
        System.out.println("Method6 = " + Stats.method6() + "%");
    }
}
