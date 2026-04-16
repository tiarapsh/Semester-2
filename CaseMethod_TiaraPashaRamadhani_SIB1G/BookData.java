package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class BookData {
    Book [] listBook; 
    int idx;
    
    public void add(Book book) {
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] == null) {
                listBook[i] = book;
                break;
            }
        }
    }
    public void print(){
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] != null) {
                listBook[i].printBook();
            }
        }
    }
}
