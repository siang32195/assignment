/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilewspart;



public class Name {
    
    private String id;
    private String name;

    public Name(String id, String name) {
        this.id = id;
        this.name = name;
    }

 
    public String toString(){
        return "Staff ID: "+ id+
                "\nStaff Name: "+name;
    }
   
            
    
}
