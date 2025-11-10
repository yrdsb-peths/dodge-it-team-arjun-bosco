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
    public void act()
    {
        // Add your action code here.
        int startingXPos = 50 + Greenfoot.getRandomNumber(500);
        
        setLocation(getX(), getY() + dy);
    }
}
