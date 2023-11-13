package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /*
     * Ajoute du texte dans le document
     * @param start index de départ
     * @param end fin de départ
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /*
     * Mettre le texte compris entre le départ et la fin en majuscules
     * @param start index de départ
     * @param end index de fin
     */
    public void majuscules(int start, int end) {
        this.remplacer(start,end,texte.substring(start, end).toUpperCase());
    }

    /*
     * Description de la méthode
     * @param var1 description du premier paramètre
     * @param var2 description du second paramètre
     * @return Description de la valeur retournée
     */
    public void effacer(int start,int end){
        this.remplacer(start,end,"");
    }

    /*
     * Efface le texte
     */
    public void clear(){
        this.remplacer(0,texte.length(),"");
    }

    public void inserer(int start,String insertion){
         this.remplacer(start, insertion.length(), insertion);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
