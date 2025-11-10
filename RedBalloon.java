import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBalloon extends Actor
{
    /**
     * Act - do whatever the RedBalloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int dy = -1;
    int startingXPos = 10 + Greenfoot.getRandomNumber(590);
    public void act()
    {
        // Add your action code here.
        if (getY() < 1)
        {
            startingXPos = 50 + Greenfoot.getRandomNumber(500);
            setLocation(startingXPos, 600);
        }
        
        setLocation(startingXPos, getY() + dy);
        
        
    }
}
