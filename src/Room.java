public class Room {
    private String type;
    private int price;
    private int room_id;
    public boolean isEmty=true;
    private Person person;

    public Room(String type, int price,int room_id) {
        this.type = type;
        this.price = price;
        this.room_id=room_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public int getPersonId() {
        return person.getPersonId();
    }

    public void addPerson(Person person){
        this.person=person;
        isEmty=false;
    }
    public void editPerson(Person person){
        this.person=person;
    }
    public void removePerson(){
        this.person=null;
        isEmty=true;
    }

    @Override
    public String toString() {
        if (person==null)return "Room is emty";
        return "Room{" +
                "type='" + type + '\'' +" room id "+room_id+
                ", price=" + price +
                 person.toString() +
                '}';
    }

    public int getTotalMoney(){
        return price*person.getDay();
    }
}
