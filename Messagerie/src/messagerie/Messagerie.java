package messagerie;

import java.util.ArrayList;

public class Messagerie {
    public static void main(String[] args) {
        Client client1,client2,client3,client4,client5;

        client1 = new Client("Lucas");
        client2 = new Client("Adrien");
        client3 = new Client("Fadal");
        client4 = new Client("Fael");
        client5 = new Client("Zen");

        Serveur serv1,serv2;

        serv1 = new Serveur("Gta rp");
        serv2 = new Serveur("cs go");


        client1.seConnecter(serv1);
        System.out.println( client1.getNom() + " vient de crash sur le serveur " + serv1.getNomServeur());

        client2.seConnecter(serv1);
        System.out.println( client2.getNom() + " vient de sauter sur le serveur " + serv1.getNomServeur() + "\n");

        //partie incorrecter

        client1.envoyerMessage("Adrien","Salut Adrien bienvenue sur le serveur " + serv1.getNomServeur());
        //client2.consulterMessage();
        client2.envoyerMessage("Lucas","Yo Adrien très bien et toi ?");
        client1.consulterMessage();

        client3.seConnecter(serv2);
        client4.seConnecter(serv2);
        client5.seConnecter(serv2);

        Msn minecraft;
        minecraft = new Msn("Minecraft");

        minecraft.ajoutServeur(serv1);
        minecraft.ajoutServeur(serv2);

        minecraft.ajoutClient(client1);
        minecraft.ajoutClient(client2);
        minecraft.ajoutClient(client3);
        minecraft.ajoutClient(client4);
        minecraft.ajoutClient(client5);


        Menu messagerie;

        messagerie = new Menu(minecraft);

        messagerie.operations();


    }

}
