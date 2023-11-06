package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;indexDebut;indexFin;texteRemplacement");
            return;
        }
        int indexStart = Integer.parseInt(parameters[1]);
        int indexEnd = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(indexStart,indexEnd,texte);
        super.executer();
    }
}
