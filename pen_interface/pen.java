/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pen_interface;

/**
 *
 * @author hilbe
 */
interface genericpen
{
    void writing();
    void drawing();
          
}
public class pen implements genericpen {

    @Override
    public void writing() {
        System.out.println("pen used for writig");
    }

    @Override
    public void drawing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
