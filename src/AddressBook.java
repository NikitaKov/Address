/**
 * Created by student on 08.04.2015.
 */
public class AddressBook {
    private Address [] book=new Address [100];
    private int count=0;

    public void add(Address a) {
        book [count]=a;
        count++;
    }

    public void print (){
        for (int i=0; i<count; i++) {
            System.out.println(book[i]);
        }
    }
}
