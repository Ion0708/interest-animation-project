import org.code.theater.*;
import org.code.media.*;

public class SceneTwo extends Scene {

  /** Instance Variables */
  private String[][] Interests = {
    { "download.jpeg", "flag.png", "download-(1).jpeg" }, //general things I like
    { "download.png", "Golden_State_Warriors_logo.svg.png", "images.png" }, //sports teams I like
    { "Nihari-2c750c0.jpg", "download-(2).jpeg", "download-(3).jpeg" }}; //foods and drinks I like

  
  /** Constructor */
  public SceneTwo() {

  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
clear("white");
    drawText("These are things I Like!", 100, 50);
    pause(3.0);
    clear("White");
    String[][] myInterests = {{"Volleyball", "My Country", "Working Out"},{"The Rams", "The Warriors", "The Dodgers"},{"Nihari", "Nashville Hot Chicken", "Ramen"}};
  for(int r= 0; r < Interests.length;r++){
      for(int c=0;c < Interests[0].length;c++){
      ImageFilter img = new ImageFilter(Interests[r][c]);
    if(r==0){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.makeNegative();
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myInterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
    }
            if(r==1){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.applySepia();
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myInterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
    }
        if(r==2){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.colorize();
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myInterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
    }

        
      }
      }
  }

    
    /**
   * Returns the number of pictures present
   in the array.
   */
  public int getNumPictures(){
int count = 0;
   for(int r= 0; r < Interests.length;r++){
      for(int c=0;c < Interests[0].length;c++){
        count++;
  
          }
          }
  return count;
  }
  /**
   * Allows you to change the 
   image in the array to your liking. Must be an 
   actual image added in Manage Assets 
   */
    public void setImageInArray(int r, int c, String[][] array, String imageName){
  array[r][c]= imageName;
    
    
  }
    
    
        
  
}