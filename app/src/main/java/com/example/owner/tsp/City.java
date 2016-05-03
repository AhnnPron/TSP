package com.example.owner.tsp;

import java.util.LinkedList;
/**
 * Created by Owner on 5/3/2016.
 */
public class City
{
        private String cityName;
        private LinkedList<Edges> theEdges;

        public City(String cityName)
        {
            this.cityName = cityName;
            this.theEdges = new LinkedList<Edges>();
        }

        public String getCityName()
        {
            return cityName;
        }
}
