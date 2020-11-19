package Charpter_2;

public class Fligtht {

    int passengers;
    int seats;

    Fligtht() {
        seats = 150;
        passengers = 0;
    }

    void addPassengers(){
        if (passengers < seats)
            passengers += 1;
    }
}
