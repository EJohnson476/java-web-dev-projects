package org.launchcode;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.HashMap;

//import java.util.Scanner;
public class MenuItem {

    private Double price;
    private String description;
    private String category;
    boolean isNew;
    Date itemDate = new Date();
    int year = itemDate.getYear() + 1900;
    int month = itemDate.getMonth() + 1;
    int day = itemDate.getDate();
    public String itemTime()
    {
        return(month + "/" + day + "/" + year);
    }
    public MenuItem(boolean isNew,Double price, String description, String category)
    {
        this.isNew = isNew;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void setPrice(Double aPrice)
    {
        price = aPrice;
    }

    public void setDescription(String aDescription)
    {
        description = aDescription;
    }

   public void setCategory (String aCategory)
   {
       category = aCategory;
   }

    public Double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description;
    }

   public String getCategory()
    {
        return category;
    }




}

