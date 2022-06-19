package main.java.absctration;

import java.util.ArrayList;
import java.util.List;

public class UserDetail {
    public String name;
    public String stream;
    public String collegeName;
    public String type;
    public int age;

    List<UserDetail> userDetailsList = new ArrayList<>();

    public void addNewUser(UserDetail userDetail){
        userDetailsList.add(userDetail);
    }

    public void getAllUser(){
        for(int i=0; i<userDetailsList.size();i++){
            System.out.println(userDetailsList.get(i).name + ": "+userDetailsList.get(i).stream);
        }
    }

    public void modifyStream(int index, String newStream){
        userDetailsList.get(index).stream = newStream;
    }
}
