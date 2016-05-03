package com.example.owner.tsp;

import java.util.LinkedList;
/**
 * Created by Owner on 5/3/2016.
 */
public class Map {

        private LinkedList<City> theCities;
        private LinkedList<Edges> theEdges;

        public Map()
        {
            this.theCities = new LinkedList<City>();
            this.theEdges = new LinkedList<Edges>();
        }

        public void addCity(String cityName)
        {
            City city1 = new City(cityName);
            this.theCities.add(city1);
        }
    public LinkedList<City> getTheCities()
    {
        return theCities;
    }

    public LinkedList<Edges> getTheEdges()
    {
        return theEdges;
    }

    public void display()
    {
        System.out.println("cities: ");
        for(City city : this.theCities)
        {
            System.out.println(city.getCityName());
        }
        System.out.println("edge lengths: ");
        for(Edges edge : this.theEdges)
        {
            System.out.println("City 1: " + edge.getCity1().getCityName());
            System.out.println("Is: " + edge.getDistance());
            System.out.println("From City 2: " + edge.getCity2().getCityName());
        }
    }
}
