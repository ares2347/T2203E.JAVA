package hw_ss5;

import java.util.ArrayList;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
//constructor
    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }
//setters and getters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

//methods
    @Override
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publish date:" + getPublishDate());
        System.out.println("Author" + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average rate: " + getAverageRate());
    }

    ArrayList<Integer> RateList = new ArrayList<Integer>(3);

    public void Calculate (){
        float total = 0;
        for (Integer i: RateList){
           total += i;
        }
       this.AverageRate = total/(RateList.toArray().length);
    }
}
