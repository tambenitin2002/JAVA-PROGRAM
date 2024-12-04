class Book
 {
   int bookId;
   String bookName;
   double bookPrice;
   String authorName;
  Book(int bookId, String bookName,double bookPrice ,String authorName)
      {
          this.bookId=bookId;
          this.bookName=bookName;
          this.bookPrice=bookPrice;
          this.authorName=authorName;
      }

public void displayBook()
   {
    System.out.println(" Book ID                       :  "+bookId);
    System.out.println(" Book Name               :  "+bookName);
    System.out.println(" Book Price                   :  "+bookPrice);
    System.out.println(" Book Author Name   :  "+authorName);
  }
  
}

class MainApp3{
  public static void main(String[]args)
      {
           Book b1=new Book(101,"abc",200.76,"xyz");
           b1.displayBook();
      }
}