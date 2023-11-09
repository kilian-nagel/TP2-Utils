package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajusucule extends CommandeDocument {

    public CommandeMajusucule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer(){
        if(parameters.length < 2) {
            System.err.println("Format attendu : majuscules;indexDebut;indexFin");
            return;
        }
        int indexStart = Integer.parseInt(parameters[1]);
        int indexEnd = Integer.parseInt(parameters[2]);

        this.document.majuscules(indexStart,indexEnd);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Format attendu : majuscules;indexDebut;indexFin";
    }
}
