/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Alexei Cichon
 * @version 2024.01.27
 */
public class Picture
{
    private Square background;
    private Square window;
    private Fishtail fishtail1;
    private Circle pond;
    private Circlefish fish;
    private Pondfish2 fish2;
    private FishTail2 tail2;
    private Pondfish3 fish3;
    private FishTail3 tail3;
    private CircleSun sun;
    private Person stick;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        window = new Square();
        fishtail1 = new Fishtail();  
        pond = new Circle();
        fish = new Circlefish ();
        fish2 = new Pondfish2 ();
        tail2 = new FishTail2 ();
        fish3 = new Pondfish3 ();
        tail3 = new FishTail3 ();
        sun = new CircleSun ();
        stick = new Person ();

        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-120);
            background.moveVertical(20);
            background.changeSize(500);
            background.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeInvisible();
    
            pond.changeColor("blue");
            pond.moveHorizontal(100);
            pond.moveVertical(-40);
            pond.changeSize(200);
            pond.makeVisible();
            drawn = true;
            
            fishtail1.changeSize(22, 20);
            fishtail1.moveHorizontal(140);
            fishtail1.moveVertical(-9);
            fishtail1.makeVisible();
            
            fish.changeColor("yellow");
            fish.moveHorizontal(195);
            fish.moveVertical(0);
            fish.changeSize(20);
            fish.makeVisible();
            drawn = true;
            
            fish2.changeColor("yellow");
            fish2.moveHorizontal(160);
            fish2.moveVertical(20);
            fish2.changeSize(20);
            fish2.makeVisible();
            drawn = true;
            
            tail2.changeSize(22, 20);
            tail2.moveHorizontal(80);
            tail2.moveVertical(6);
            tail2.makeVisible();
            
            fish3.changeColor("yellow");
            fish3.moveHorizontal(220);
            fish3.moveVertical(60);
            fish3.changeSize(20);
            fish3.makeVisible();
            drawn = true;
    
            tail3.changeSize(22, 20);
            tail3.moveHorizontal(165);
            tail3.moveVertical(50);
            tail3.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(240);
            sun.moveVertical(-120);
            sun.changeSize(75);
            sun.makeVisible();
            
            stick.makeVisible();
            
            
             
          
            drawn = true;
    
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        window.changeColor("white");
        pond.changeColor("black");
        fish.changeColor("white");
        fishtail1.changeColor("white");
        fish2.changeColor("white");
        tail2.changeColor("white");
        fish3.changeColor("white");
        tail3.changeColor("white");
        sun.changeColor("white");
        stick.changeColor("white");
        
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("green");
        window.changeColor("black");
        pond.changeColor("yellow");
        fish.changeColor("red");
        fishtail1.changeColor("red");
        fish2.changeColor("red");
        tail2.changeColor("red");
        fish3.changeColor("red");
        tail3.changeColor("red");
        sun.changeColor("blue");
        stick.changeColor("red");
    }
}
