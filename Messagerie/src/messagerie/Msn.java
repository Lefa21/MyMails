package messagerie;

import java.util.ArrayList;

public class Msn {
    private ArrayList<Client> listeJoueur;
    private ArrayList<Serveur> listserveur;
    private String nomMessagerie;

    public Msn(String nomMessagerie) {
        this.listeJoueur = new ArrayList<>();
        this.listserveur = new ArrayList<>();
        this.nomMessagerie = nomMessagerie;
    }

    public void ajoutClient(Client client) {
        this.listeJoueur.add(client);
    }

    public void ajoutServeur(Serveur serveur) {
        this.listserveur.add(serveur);
    }

    public String afficheListeClient() {
        return listeJoueur.toString();
    }

    public String afficheListeServeur() {
        return listserveur.toString();
    }

    public int nombreDeServeur() {
        return listserveur.size();
    }

    public int nombredeCient() {
        return listeJoueur.size();
    }

    public String afficheclient(String nomClient) {

        for (int indice = 0; indice < this.listeJoueur.size(); indice++) {
            if (this.listeJoueur.get(indice).getNom() == nomClient) {
                return this.listeJoueur.get(indice).toString();
            }
        }
        return "Le client du nom de : " + nomClient + " n'existe pas ";
    }




    public void setNomClient(String ancienNom,String nouveauNom) {
        for (int indice = 0; indice < this.listeJoueur.size(); indice++) {
            if (this.listeJoueur.get(indice).getNom().equals(ancienNom)) {
                this.listeJoueur.get(indice).setNom(nouveauNom);
                System.out.println(listeJoueur.get(indice));

                //return "Votre adresse à bien était changer, votre nouvelle adresse est la suivante : " + this.listeClient.get(indice).getAdresse();
            }
        }
        //return "Désolé mais nous n'avons pas pu effectuer l'opération,votre nom est introuvable dans notre base de donnée";
    }



    public ArrayList<Client> clientExiste(String nomClient) {
        ArrayList<Client> clientExistant = new ArrayList<>();
        for (int indice = 0; indice < this.listeJoueur.size(); indice++) {
            if (this.listeJoueur.get(indice).getNom().equals(nomClient)) {
                clientExistant.add(this.listeJoueur.get(indice));
            }
        }
        return clientExistant;
    }


    public String getNomMessagerie() {
        return nomMessagerie;
    }

    @Override
    public String toString() {
        return "Msn{" +
                "listeJoueur=" + listeJoueur +
                ", listserveur=" + listserveur +
                ", nomMessagerie='" + nomMessagerie + '\'' +
                '}';
    }
}
