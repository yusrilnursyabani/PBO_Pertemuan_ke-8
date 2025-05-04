/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author OMEN
 */
public class Burung extends Anabul {
    public Burung (String nama){
        super(nama);
    }
    
    @Override 
    public void gerak(){
        System.out.println(getNama() + "bergerak dengan cara terbang");
    }
    
    @Override
    public void bersuara(){
        System.out.println(getNama() + "berusara : CIT CIT");
    }
}
