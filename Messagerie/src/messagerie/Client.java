package messagerie;

import java.util.ArrayList;

public class Client {
    // le client à un nom comme attribut

    private String nom;
    private Serveur serveurActif;

    // constructeur client

    public Client(String nom) {
        this.nom = nom;
    }

// Méhode qui recupère le nom du destinataire ainsi que le contenue du message en paramètre
// créer le nouveau message et utilise la méthode stockeMessage de la classe serveur pour stocker le message dans la liste des messages du serveur;

    public void envoyerMessage(String dest, String contenu){
        this.serveurActif.stockeMessage(new Message(this.nom,dest,contenu));
    }

    //Méthode permettant de voir les messages reçus par le client à l'aide de la méthode messageRecusPour de la class serveur.
    //Parcours la liste des messages recus par le client et les affiche.
    public void consulterMessage(){
        ArrayList<Message> mesMessages =  this.serveurActif.messagesRecusPour(this.nom);
        for (int i = 0; i < mesMessages.size(); i++) {
            System.out.println("Message de " + this.nom + " : " +  mesMessages.get(i).getContenu());
        }
    }

    //getter qui retourne le nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    // methode qui permet au client de se connecter au serveur

    public void seConnecter(Serveur serveurActif){
        this.serveurActif = serveurActif;
    }

    // méthode qui affiche le serv
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", serveurActif=" + serveurActif +
                '}';
    }
}
