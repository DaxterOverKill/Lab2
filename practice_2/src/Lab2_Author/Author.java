package Lab2_Author;

import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public Author(String n, String e){
        name = n;
        email = e;
        gender = 'f';
    }
    public String GetName(String name){
        return name;
    }
    public String GetEmail(String email){
        return email;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public char GetGender(){
        return gender;
    }
    public String toString(){
        return this.name+", name "+this.email+" and "+gender+" gender.";
    }
    public void out(){
        System.out.println(name+"'s email "+email+" and gender "+gender);
    }
}