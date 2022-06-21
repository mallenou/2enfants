/**
 * Illustration du Paradoxe des 2 enfants.
 * @author Michel Allenou
 */
import java.util.Random;

/**
 * Objet qui effectue le tirage des 2 enfants
 */
public class Tirage {

    /**
     * Création d'un nouveau Tirage
     */
    public Tirage(){
        //Initialisation moteur aleatoire
        Random random = new Random();
        
        //Tirage au hasard du premier enfant
        enfant1Garcon = random.nextBoolean();
        
        //Tirage au hasard du second enfant
        enfant2Garcon = random.nextBoolean();
        
        //Tirage au hasard du premier enfant né un mardi
        enfant1NeMardi = random.nextInt(6) == 1;
        
        //Tirage au hasard second enfant né un mardi
        enfant2NeMardi = random.nextInt(6) == 1;

        //Tirage au hasard du premier enfant né dans le finistère
        enfant1Ne29 = random.nextInt(99) == 29;

        //Tirage au hasard du second enfant né dans le finistère
        enfant2Ne29 = random.nextInt(99) == 29;

    }

    /**
     * Retourne le genre du premier enfant
     * @return vrai si le tirage du premier enfant est un garçon
     */
    public boolean enfant1Garcon(){
        return enfant1Garcon;
    }

    /**
     * Retourne le genre du second enfant
     * @return vrai si le tirage du second enfant est un garçon
     */
    public boolean enfant2Garcon(){
        return enfant2Garcon;
    }

    /**
     * Retourne le genre dans le tirage
     * @return vrai si le tirage contient au moins un garçon
     */
    public boolean auMoinsUnGarcon(){
        return (enfant1Garcon || enfant2Garcon);
    }

    /**
     * Retourne le genre et le jour de naissance dans le tirage
     * @return vrai si le tirage contient au moins un garçon né un mardi
     */
    public boolean auMoinsUnGarconNeMardi(){
        return (enfant1Garcon && enfant1NeMardi) || (enfant2Garcon && enfant2NeMardi);
    }

    /**
     * Retourne le genre et le jour de naissance du premier enfant
     * @return vrai si le tirage du premier enfant est un garçon né en mardi
     */
    public boolean enfant1GarconNeMardi(){
        return (enfant1Garcon && enfant1NeMardi);
    }

    /**
     * Retourne le genre et le lieu de naissance dans le tirage
     * @return vrai si le tirage contient au moins un garçon né dans le finistère
     */
    public boolean auMoinsUnGarconNe29(){
        return (enfant1Garcon && enfant1Ne29) || (enfant2Garcon && enfant2Ne29);
    }

    /**
     * Retourne le genre et le lieu de naissance du premier enfant
     * @return vrai si le tirage du premier enfant est un garçon né dans le finistère
     */
    public boolean enfant1EstUnGarconNe29(){
        return (enfant1Garcon && enfant1Ne29);
    }

    //Atributs qui stockent les informations de Tirage
    private boolean enfant1Garcon; //Enfant 1 est garcon
    private boolean enfant2Garcon; //Enfant 2 est garcon
    private boolean enfant1NeMardi; //Enfant 1 né mardi
    private boolean enfant2NeMardi; //Enfant 2 né mardi
    private boolean enfant1Ne29; //Enfant 1 né finistère
    private boolean enfant2Ne29; //Enfant 2 né finistère
}
