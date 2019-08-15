package arraylist.mobile;

import java.util.ArrayList;

public class mobilePhone {
    private String myNumber;
    private ArrayList<Contacts> C;

    public mobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.C = new ArrayList<>();
    }

    public boolean addNewContect(Contacts contacts){
        if(findContact(contacts.getName())>=0){
            System.out.println("Exist");
            return false;
        }
        C.add(contacts);
        return true;
    }
    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int position = findContact(oldContact);
        if(position <0){
            System.out.println("record not find.");
            return true;
        }
        C.set(position,newContact);
        System.out.println("Modify this "+ oldContact.getName() +" to "+newContact.getName());
        return true;
    }



    private int findContact(Contacts contacts){
        return C.indexOf(contacts);
    }

    private int findContact(String cName){
        for (int i = 0; i <C.size() ; i++) {
            Contacts contacts = this.C.get(i);
            if(contacts.getName().equals(cName)){
                return i;
            }
        }
        return -1;
    }


    private String queryContact(Contacts contacts){
        if(findContact(contacts.getName())>=0){

        }
        return null;
    }


}
