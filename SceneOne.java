import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /** Instance Variables */
  private String[][] Disinterests = {
 { "download-(4).jpeg", "download-(5).jpeg", "download-(6).jpeg" }, //General things i dont like
    { "download-(1).png", "download-(2).png", "download-(3).png" }, //sports teams
    { "download-(7).jpeg", "download-(8).jpeg", "download-(9).jpeg" }}; //foods and drinks
  /** Constructor */
  public SceneOne() {

  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
  clear("white");
    drawText("These are things I Don't Like!", 100, 50);
    pause(3.0);
    clear("White");
    String[][] myDisinterests = {{"Dance parties", "Sunday School", "Homework"},{"The 49ers", "The Celtics", "The Chiefs"},{"Soda", "Coffee", "Boiled Eggs"}};
  for(int r= 0; r < Disinterests.length;r++){
      for(int c=0;c < Disinterests[0].length;c++){
      ImageFilter img = new ImageFilter(Disinterests[r][c]);
    if(r==0){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.adjustContrast(3);
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myDisinterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
    }
            if(r==1){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.zeroRed();
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myDisinterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
    }
        if(r==2){
      drawImage(img, 0, 0, 400, 400, 0);
    pause(2.0);
        img.mirrorVertical();
    drawImage(img, 0, 0, 400, 400, 0);
        drawText(myDisinterests[r][c], 100, 50);
        
          pause(2.0);
        clear("white");
          drawText("THANKS", 100, 50);
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
   for(int r= 0; r < Disinterests.length;r++){
      for(int c=0;c < Disinterests[0].length;c++){
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