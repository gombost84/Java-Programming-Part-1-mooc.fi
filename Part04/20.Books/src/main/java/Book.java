
public class Book {
    private String title;
    private String pages;
    private String year;
    
    public Book(String name, String number, String date) {
        this.title = name;
        this.pages = number;
        this.year = date;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
}
