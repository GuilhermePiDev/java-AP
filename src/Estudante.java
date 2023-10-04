public class Estudante {
    private static String nome;
    private static String email;

    private static int room;

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    Estudante(String nome, String email , int room){
        this.nome=nome;
        this.email=email;
        this.room = room;
    }
}
