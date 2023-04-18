package messagerie;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private Msn messagerie;

    public Menu(Msn messagerie) {
        this.messagerie = messagerie;
    }

    public String nomClient(){
        System.out.println("Veuillez entrez le nom joueur que vous voulez ajouter : ");
        String client = scanner.nextLine();

        return  client;
    }

    public String nouveauNomClient(){
        System.out.println("Veuillez entrez le nouveau nom du joueur que vous voulez ajouter : ");
        String client = scanner.nextLine();

        return  client;
    }

    public String nomServ(){
        System.out.println("Veuillez entrez le nom du serveur que vous voulez ajouter : ");
        String serveur = scanner.nextLine();

        return  serveur;

    }

    public  Serveur creeServeur(){
        Serveur nouveauServeur = new Serveur(nomServ());
        return nouveauServeur;
    }

    public Client creeClient(){
        Client nouveauCLient = new Client(nomClient());
        return nouveauCLient;
    }



    public void operations(){
        int choixConvertie;
        String choixMenu;

        do {
            do {
                System.out.println();
                System.out.println("Bienvuenue sur ta messagerie cher ami gamer !!!" + '\n');
                System.out.println("Vous trouverez ici tout les outils nécaissaires afin de faire des opérations sur la banque\n");
                System.out.println("1. Créer un nouveau compte");
                System.out.println("2 Modifier mon nom");
                System.out.println("3. Créer un serveur");
                System.out.println("4. afficher tout les joueurs");
                System.out.println("5. Afficher la liste des serveurs");
                System.out.println("6. Affichcher le nombre de joueurs actifs");
                System.out.println("7. Afficher le nombre de serveurs actifs");
                System.out.println("8. Afficher un serveur");
                System.out.println("9.Afficher le nom d'un joueur");
                System.out.println("saisir le nombre correspondant à votre choix d'opérations : " + "\n");
                choixMenu = scanner.nextLine();
                System.out.println("\n");
            } while (choixMenu.length() != 1);
            choixConvertie = (choixMenu.charAt(0) - 48);
        } while (choixConvertie != 0 && choixConvertie != 2 && choixConvertie != 3 && choixConvertie != 4 && choixConvertie != 5 && choixConvertie != 6 && choixConvertie != 7 && choixConvertie != 8 && choixConvertie != 9 && choixConvertie != 1);

        switch (choixConvertie) {
            case 1:
                this.messagerie.ajoutClient(creeClient());
                System.out.println("Le joueur à été créer avec succés");
                operations();
                break;

            case 2:
                this.messagerie.setNomClient(nomClient(),nouveauNomClient());
                System.out.println("Le nom du joueur à bien été modifié");
                operations();
                break;

            case 3:
                this.messagerie.ajoutServeur(creeServeur());
                System.out.println("Le serveur à bien était créer !!!");

            case 4:
                System.out.println(this.messagerie.afficheListeClient());;
                operations();
                break;


            case 5:
                System.out.println(this.messagerie.afficheListeServeur());;
                operations();
                break;

            case 6:
                System.out.println(this.messagerie.afficheListeClient());;
                operations();
                break;

            case 7:

                System.out.println("Le nombre de serveurs actifs au sein de la messagerie : " + this.messagerie.getNomMessagerie() +  + this.messagerie.nombreDeServeur());
                operations();
                break;

            case 8:
                System.out.println("Le nombre de joueur actifs au sein de la messagerie est de " + this.messagerie.getNomMessagerie() + this.messagerie.nombredeCient());
                operations();

                break;

            case 9:

                System.out.println(this.messagerie.afficheclient(nomClient()));;
                operations();

                break;


        }
    }
}
