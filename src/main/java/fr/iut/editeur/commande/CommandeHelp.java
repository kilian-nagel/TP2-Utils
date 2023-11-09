package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class CommandeHelp extends CommandeDocument{
    public CommandeHelp(Document document, String parameters[]){
        super(document,parameters);
    };
    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : help");
            return;
        }

        ArrayList<Commande> commandes = new ArrayList<>(Arrays.asList(
                new CommandeClear(document,parameters),
                new CommandeAjouter(document,parameters),
                new CommandeClear(document,parameters),
                new CommandeHelp(document,parameters),
                new CommandeMajusucule(document,parameters),
                new CommandeRemplacer(document,parameters)
        ));
        for(Commande cmd:commandes){
            System.out.println(cmd.getDescriptionCommande());
        }
        super.executer();
    }
    @Override
    public String getDescriptionCommande() {
        return "format attendu : help";
    }
}
