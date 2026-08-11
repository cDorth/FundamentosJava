package listaEVetor.entities;

public class Room {
    private String name;
    private String email;
    private int room;

    public void register(String name,String email,int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String getRoom(){
     return "name: "+ this.name +
            ", email: " + this.email +
             ", room: " + this.room;
    }


}
