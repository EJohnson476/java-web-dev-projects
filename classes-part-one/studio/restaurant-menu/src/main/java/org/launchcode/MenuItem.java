package org.launchcode;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

//import java.util.Scanner;
public class MenuItem {

    private Double price;
    private String description;
    private String category;

    public MenuItem(Double price, String description, String category)
    {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    void setPrice(Double aPrice)
    {
        price = aPrice;
    }

    void setDescription(String aDescription)
    {
        description = aDescription;
    }

   void setCategory (String aCategory)
   {
       category = aCategory;
   }

    Double getPrice()
    {
        return price;
    }

    String getDescription()
    {
        return description;
    }

    String getCategory()
    {
        return category;
    }




}

