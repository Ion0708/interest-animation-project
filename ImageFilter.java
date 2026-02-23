import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String filename){
    super(filename);
  }

  public void zeroRed(){
  Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      current.setRed(0);
    }
  }
  
}
  public void zeroBlue(){
  Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      current.setBlue(0);
    }
  }
  
}
public void zeroGreen(){
  Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      current.setGreen(0);
    }
  }
  
}
public void keepColor(String color){
    Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      if(color != "green"){
        current.setGreen(0);
      }
      if(color != "blue"){
        current.setBlue(0);
      }
      if(color != "red"){
        current.setRed(0);
      }
    }
  }
}
  public void makeNegative() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, then traverse the 2D array of pixels. Set
     * the red, green, and blue color values of each Pixel object to the result of
     * 255 minus the current values.
     * -----------------------------------------------------------------------------
     */
    Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      int red = current.getRed();
      int blue = current.getBlue();
      int green = current.getGreen();
      current.setGreen(255-green);
            current.setBlue(255-blue);
      current.setRed(255-red);



    
  }
  
}
  }

    public void brightenColors(int amount) {
          Pixel[][] pixels = getImagePixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

                currentPixel.setRed(currentPixel.getRed() - amount);
        currentPixel.setGreen(currentPixel.getGreen() - amount);
        currentPixel.setBlue(currentPixel.getBlue() - amount);
      }
    }
  }


    public void adjustContrast(int multiplier) {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, and traverse the 2D array of Pixel objects.
     * Multiply the red, green, and blue values of each Pixel by the multiplier,
     * and set the color values to the result.
     * -----------------------------------------------------------------------------
     */
    Pixel[][] pixels = getImagePixels();
  for(int row = 0; row<pixels.length; row++){
    for(int col = 0; col<pixels[0].length; col++){
      Pixel current = pixels[row][col];
      int red = current.getRed();
      int blue = current.getBlue();
      int green = current.getGreen();
      current.setGreen(green*multiplier);
            current.setBlue(blue*multiplier);
      current.setRed(red*multiplier);
              if (red > 255) {
          red = 255;
        }
        if (green > 255) {
          green = 255;
        }
        if (blue > 255) {
          blue = 255;
        }
        
        // force RBG values to not be below 0
        if (red < 0) {
          red = 0;
        }
        if (green < 0) {
          green = 0;
        }
        if (blue < 0) {
          blue = 0;
        }




    
  }
  
}
  }
    public void applySepia() {
    Pixel[][] pixels = getImagePixels();
  
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int red = currentPixel.getRed();
        int green = currentPixel.getGreen();
        int blue = currentPixel.getBlue();

        // use the formula from instructions to calc new RGB values
        int newRed = (int)(0.393 * red + 0.769 * green + 0.189 * blue);
        int newGreen = (int)(0.349 * red + 0.686 * green + 0.168 * blue);
        int newBlue = (int)(0.272 * red + 0.534 * green + 0.131 * blue);

        // force RBG values to not exceed 255
        if (newRed > 255) {
          newRed = 255;
        }
        if (newGreen > 255) {
          newGreen = 255;
        }
        if (newBlue > 255) {
          newBlue = 255;
        }
        
        // force RBG values to not be below 0
        if (newRed < 0) {
          newRed = 0;
        }
        if (newGreen < 0) {
          newGreen = 0;
        }
        if (newBlue < 0) {
          newBlue = 0;
        }

        // update RGB values
        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
    
  }


 
  public void colorize() {
    Pixel[][] pixels = getImagePixels();

  for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length; col++) {

      Pixel currentPixel = pixels[row][col];

      int red = currentPixel.getRed();
      int green = currentPixel.getGreen();
      int blue = currentPixel.getBlue();

      int avg = (red + green + blue) / 3;

      currentPixel.setRed(avg);
      currentPixel.setGreen(avg);
      currentPixel.setBlue(avg);
      if (avg < 85) {
        currentPixel.setRed(255);
        currentPixel.setGreen(0);
        currentPixel.setBlue(0);

      } else if (avg < 170) {
        currentPixel.setRed(0);
        currentPixel.setGreen(255);
        currentPixel.setBlue(0);

      } else {
        currentPixel.setRed(0);
        currentPixel.setGreen(0);
        currentPixel.setBlue(255);
      }
    }
  }
}



   public void mirrorVertical() {
    Pixel[][] pixels = getImagePixels();

  for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length / 2; col++) {

      Pixel leftPixel = pixels[row][col];
      Pixel rightPixel = pixels[row][pixels[0].length - 1 - col];

      leftPixel.setColor(rightPixel.getColor());
    }
  }
  
}
}