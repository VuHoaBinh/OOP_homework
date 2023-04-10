package bai8;

import java.util.ArrayList;
import java.util.Collections;

public class Management {

	private ArrayList<person> peopleList;
    int numberOfPeople;

    public Management(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.peopleList = new ArrayList<person>(numberOfPeople);
    }

    public void addPerson(person person) {
        peopleList.add(person);
    }

    public void removePerson(String name) {
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getName().equals(name)) {
                peopleList.remove(i);
                return;
            }
        }
    }

    public void sortByName() {
        Collections.sort(peopleList,Collections.reverseOrder());
    }

    public void displayPeople() {
        System.out.printf("%-20s %-20s %-20s\n", "Name", "Address", "Details");
        for (person person : peopleList) {
            System.out.println(person);
        }
    }

}
