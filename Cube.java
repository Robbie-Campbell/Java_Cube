
/**
 * This Class allows us to represent Cube objects in software.
 * For the purpose of this Class, a Cube has features relating to
 * it's width, height and depth.
 * 
 * Author: Robert Stanley
 * Date: 26/02/2020
 * 
 */
public class Cube
{
   // Attributes
   private double width;
   private double height;
   private double depth;
   
   ///////////////////  Constructor Methods //////////////////////
   
   // Constructor method which sets width, height and depth to 1
   public Cube()
     {
         width = 1;
         height = 1;
         depth = 1;
     }
     
   // Constructor method which allows the programmer to pass in
   // width, height and depth values
   public Cube(double widthIn , double heightIn, double depthIn)
     {
         if ( widthIn < 0 )  // Check if widthIn is negative
           {
               width = 1;    // Put a value of 1 into width
           }
         else  // Assign widthIn to width
           {
               width = widthIn;
           }
           
         if ( heightIn < 0 )  // Check if heightIn is negative
           {
               height = 1;    // Put a value of 1 into height
           }
         else  // Assign heightIn to height
           {
               height = heightIn;
           }
           
         if ( depthIn < 0 )  // Check if depthIn is negative
           {
               depth = 1;    // Put a value of 1 into width
           }
         else  // Assign widthIn to width
           {
               depth = depthIn;
           }
         
     }

    /////////////////////  Setter Methods /////////////////////////
    
    // Method to set the width of a Cube object
    public void setWidth(double widthIn )
     {
         if ( widthIn < 0 )  // Check if widthIn is negative
           {
               width = 1;    // Put a value of 1 into width
           }
         else  // Assign widthIn to width
           {
               width = widthIn;
           }
     }
     
    // Method to set the height of a Cube object
    public void setHeight(double  heightIn)
      {
          if ( heightIn < 0 )  // Check if widthIn is negative
           {
               height = 1;    // Put a value of 1 into height
           }
         else  // Assign heightIn to height
           {
               height = heightIn;
           }
      }
      
    // Method to set the depth of a Cube object
    public void setDepth(double depthIn)
      {
          if ( depthIn < 0 )  // Check if widthIn is negative
           {
               depth = 1;    // Put a value of 1 into width
           }
         else  // Assign widthIn to width
           {
               depth = depthIn;
           }
      }
      
    ////////////////  Getter Methods ////////////////////////
    
    // Method to get the width of a Cube object
    public double  getWidth()
      {
          return width;
      }
      
    // Method to get the height of a Cube object
    public double getHeight()
      {
          return height;
      }
    
    // Method to get the depth of a Cube object
    public double getDepth()
      {
          return depth;
      }
    
    ////////////////////////  Custom Methods //////////////////////
    
    // Method to calculate the area of a Cube object
    public double area()
      {
          double result;
          
          result = width * height * depth;
          
          return result;    
      }
     
 }
