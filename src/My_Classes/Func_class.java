/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Notebook
 */
public class Func_class {

    /**
     *
     * @param width
     * @param height
     * @param imagePath
     * @param label
     */
    public void displayImage(int width,int height, String imagePath,JLabel label)
{

//get the image

ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));

//make the image fit jlabel
Image image= imgIco.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);

//make the image into the jlabel
label.setIcon(new ImageIcon(image));
    
}
}
