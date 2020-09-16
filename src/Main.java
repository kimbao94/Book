import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] bookList = new Book[10];
        bookList[0] = new ProgrammingBook(1,"java",50000,"bao","java","Spring");
        bookList[1] = new ProgrammingBook(2,"php",60000,"bao","java","laravel");
        bookList[2] = new ProgrammingBook(3,"python",70000,"bao","java","Django");
        bookList[3] = new ProgrammingBook(4,"ruby",80000,"bao","java","Ruby on Rails");
        bookList[4] = new ProgrammingBook(5,"javascript",90000,"bao","java","Angular");
        bookList[5] = new FictionBook(6,"C++",55000,"dung","lap trinh");
        bookList[6] = new FictionBook(7,"C",65000,"dung","lap trinh 1");
        bookList[7] = new FictionBook(8,"C#",75000,"dung","lap trinh 2");
        bookList[8] = new FictionBook(9,"Swift",85000,"dung","lap trinh 3");
        bookList[9] = new FictionBook(10,"SQL",95000,"dung","lap trinh 4");

        double sum = 0;
        int count = 0;
        for (int i = 0; i < bookList.length; i++) {
            sum += bookList[i].getPrice();
        }
        System.out.println("Tổng số tiền 10 cuốn sách = " + sum);

        for (Book book : bookList) {
            boolean check = book instanceof ProgrammingBook;
            if (check) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    count++;
                }
            }
        }
        System.out.println("số cuốn sách có language java : " + count);


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên của cuốn sách cần tìm giá");
        String string = scanner.nextLine();
        for (int i = 0; i < bookList.length; i++) {
            if (string.equals(bookList[i].getName())){
                System.out.println("giá của cuốn sách là: " + bookList[i].getPrice());
            }
        }
        //nổi bọt
        for (int i = 0; i < bookList.length; i++) {
            for (int j = i + 1; j < bookList.length - 1; j++) {
                if (bookList[i].getPrice() > bookList[j].getPrice()) {
                    Book temp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = temp;
                }
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getPrice());
        }

        //kiểu chèn
        for (int i = 1; i < bookList.length; i++) {
            Book temp = bookList[i];
            int j = i - 1;
            while (j >= 0 && temp.getPrice() < bookList[j].getPrice()) {
                bookList[j + 1] = bookList[j];
                j--;
            }
            bookList[j + 1] = temp;
        }
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getPrice());
        }


        //kiểu chọn
        for (int i = 0; i < bookList.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < bookList.length; j++) {
                if (bookList[j].getPrice() < bookList[min].getPrice()) {
                    min = j;
                }
            }
            if (min != i) {
                Book temp = bookList[min];
                bookList[min] = bookList[i];
                bookList[i] = temp;
            }
        }
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getPrice());
        }
    }
}