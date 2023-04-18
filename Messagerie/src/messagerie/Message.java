package messagerie;

public class Message {
    private String exp;
    private String dest;
    private String contenu;

    // constructeur du message qui prend en params l'expéditeur etcc

    public Message(String exp,String dest,String contenu) {
        this.dest = dest;
        this.exp = exp;
        this.contenu = contenu;
    }

    public String getDest() {
        return dest;
    }

    public String getContenu() {
        return contenu;
    }
}
