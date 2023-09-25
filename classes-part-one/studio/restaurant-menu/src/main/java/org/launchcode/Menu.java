package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(LocalDate d, ArrayList<MenuItem> item){
    this.Date = d;
    this.items = item;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addMenuItem(MenuItem item){
        items.add(item);
    }
    public void removeMenuItem(MenuItem item){
        items.remove(item);
    }

    public void printMenuItem(MenuItem item){
        System.out.println(item);
    }

    public void printMenu(Menu menu){
        for (menuItem item: items){
            System.out.println(item);
        }
    }
}
