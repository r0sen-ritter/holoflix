
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Notebook
 */
public class Genre {
    

    private int id ;

private String name ;

public Genre(){};

    /**
     *
     * @param _id
     * @param _name
     */
    public Genre (int _id, String _name)
{
      
 this.id= _id;
this.name= _name;
    
}
    public int getId(){
return id;}
public String getName(){
return name;
}
public void setId(int _id){
this.id= _id;
}
public void setName(String _name){
this.name= _name;
}
public void addGenre(String _name) 
{
    String insertQuery = "INSERT INTO 'movie genres'('name')VALUES (?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _name);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre",1);
            }
             else{
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre",2);
            }
            }
         catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        public void editGenre(int _id,String _name) 
{
    String editQuery = ")";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, _name);
            if(ps.executeUpdate()!=0){
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre",1);
            }
             else{
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre",2);
            }
            }
         catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}

    public void removeGenre(int id, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Genre> genreList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void removeGenre(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class result {

        public result() {
        }
    }

}