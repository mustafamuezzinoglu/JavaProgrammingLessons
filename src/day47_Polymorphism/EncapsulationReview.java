package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        setBookTitle(bookTitle); // instead of this.bookTitle = bookTitle to use set advantage is able to check the condition

        this.publishDate = publishDate; // our data is final we can give it within the constructor before setting the final
    }

    public String getBookTitle() { //getters no need the parameter because just use it only read and also getters is return method
        if(bookTitle == null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) { // its void because we need to set no return  and has a parameter its need new data to set it
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }

}
