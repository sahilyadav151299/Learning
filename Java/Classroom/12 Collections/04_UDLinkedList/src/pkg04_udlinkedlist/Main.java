
package pkg04_udlinkedlist;

import java.util.LinkedList;

class WebSeries
{
    String name;
    double rating;
    String duration;
    String type;
    String language;

    public WebSeries(String name, double rating, String duration, String type, String language) 
    {
        this.name = name;
        this.rating = rating;
        this.duration = duration;
        this.type = type;
        this.language = language;
    } 
    
    public void showDetails()
    {
        System.out.println("Name     : " +name);
        System.out.println("Rating   : " +rating);
        System.out.println("Duration : " +duration);
        System.out.println("Type     : " +type);
        System.out.println("Language : " +language);
        System.out.println();
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedList<WebSeries> imdb = new LinkedList<>();
        
        WebSeries w1 = new WebSeries("Dark", 8.5, "26 hours", "Sci-Fic", "English");
        WebSeries w2 = new WebSeries("Money Heist", 10, "48 Hours", "Entertainment", "English/Spainsh");
        WebSeries w3 = new WebSeries("Asur", 10, "10.5 hours", "Crime Mystrey Thriller", "Hindi");
        
        imdb.add(w1);
        imdb.add(w2);
        imdb.add(w3);
        
        for(int i=0; i<imdb.size(); i++)
        {
            imdb.get(i).showDetails();
        }
    }  
}