public class Person {
    private int person_id;
    private String name;
    private String birdday;
    private int day;

    public Person(int person_id, String name, String birdday,int day) {
        this.person_id = person_id;
        this.name = name;
        this.birdday = birdday;
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public int getPersonId() {
        return person_id;
    }
    public void setInformation(int person_id, String name, String birdday,int day){
        this.person_id = person_id;
        this.name = name;
        this.birdday = birdday;
        this.day=day;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", name='" + name + '\'' +
                ", birdday='" + birdday + '\'' +
                '}';
    }
}
