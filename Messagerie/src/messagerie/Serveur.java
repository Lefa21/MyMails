package messagerie;

import java.util.ArrayList;

public class Serveur {

    // déclare deux attribut correspondant au nom du serveur et à la liste de message que le serveur stock
    private String nomServeur;
    private ArrayList<Message> listMessage;

    //constructeur du serveur qui récupère le nom du serveur et créer une liste pour stocker les messages envoyer par les clients
    public Serveur(String nomServeur){
        this.nomServeur = nomServeur;
        this.listMessage = new ArrayList<>();
    }

    //méthode appelée par la class client qui permet de stocker le message envoyer

    public void stockeMessage(Message message){
        this.listMessage.add(message);
    }

    // méthode qui renvoie l'ensembel des messages reçus par un client
    // la liste renvoyer par la méthode est récuperer par la classe consulterMessage de client et permet d'afficher l'ensemble des messages reçus.

    public ArrayList<Message> messagesRecusPour(String dest){
    ArrayList<Message> messageRecus = new ArrayList<>();
        for (int i = 0; i < listMessage.size(); i++) {
            if(listMessage.get(i).getDest().equals(dest)){
                messageRecus.add(listMessage.get(i));
            }
        }
        return messageRecus;
    }

    public ArrayList<Message> getListMessage() {
        return listMessage;
    }

    //getter qui récupére le nom du serv
    public String getNomServeur() {
        return nomServeur;
    }

    @Override
    public String toString() {
        return "Serveur{" +
                "nomServeur='" + nomServeur + '\'' +
                '}';
    }
}
