import java.util.ArrayList;

public class Problem10 {
    public static void main(String [] args){
        ArrayList<Train> trainsArrayList = new ArrayList<>();
        Train train1 = new Train("Astana", 18, "21:30", 95);
        Train train2 = new Train("Karaganda", 25, "17:42", 56);
        Train train3 = new Train("Taldykorgan", 2, "15:55", 78);
        Train train4 = new Train("Taraz", 65, "9:45", 78);
        Train train5 = new Train("Kolsay", 4, "6:20", 78);

        trainsArrayList.add(train1);
        trainsArrayList.add(train2);
        trainsArrayList.add(train3);
        trainsArrayList.add(train4);
        trainsArrayList.add(train5);
        for (Train s : trainsArrayList){
            if (s.destination.equals("Taldykorgan")){
                System.out.println(s);
            }
        }

        for (Train s : trainsArrayList){
            if (s.destination.equals("Taldykorgan")){
                if (s.quantityOfPlaces == 78){
                    System.out.println(s);
                }
            }
        }
        getByTime(trainsArrayList,15);
    }
    public static void getByTime(ArrayList<Train> trainArrayList, int hour) {
        Train res = null;
        for (Train s : trainArrayList) {
            String qyrquHour = s.getSchedule().substring(3,5);
            int qyrqylganSan = Integer.parseInt(qyrquHour);
            if(qyrqylganSan>=hour){
                res = s;
                System.out.println(res);
            }
        }
    }
}

class Train{
    String destination;
    int number;
    String schedule;
    int quantityOfPlaces;

    public Train(String destination, int number, String schedule, int quantityOfPlaces){
        this.destination = destination;
        this.number = number;
        this.schedule = schedule;
        this.quantityOfPlaces = quantityOfPlaces;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", schedule='" + schedule + '\'' +
                ", quantityOfPlaces=" + quantityOfPlaces +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getQuantityOfPlaces() {
        return quantityOfPlaces;
    }

    public void setQuantityOfPlaces(int quantityOfPlaces) {
        this.quantityOfPlaces = quantityOfPlaces;
    }
}