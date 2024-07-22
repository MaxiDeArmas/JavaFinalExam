/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam;

/**
 *
 * @author pdearmas15
 */
public class MyConsole extends Console {
    
    private String number;
    private String evenOdd;
    
    public MyConsole(String number){
        this.number = number;
    }
    
    public String getInt(){
        return number;
    }
    
    public void setInt(String number){
        this.number = number;
    }
    
    @Override
    public String toString() {
        
        return "\nThe number " + number + " is ";
    }
}
