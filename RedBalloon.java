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
    int dy = -1 * (1 + Greenfoot.getRandomNumber(2));
    int startingXPos = 10 + Greenfoot.getRandomNumber(591);
    
    public void act()
    {
        // Add your action code here.
        if (getY() < 1)
        {
            dy = -1 * (1 + Greenfoot.getRandomNumber(2));
            
            startingXPos = 10 + Greenfoot.getRandomNumber(591);
            setLocation(startingXPos, 600);
            if (isTouching(RedBalloon.class))
            {
                startingXPos = 10 + Greenfoot.getRandomNumber(591);
                setLocation(startingXPos, 600);
            }
        }
        
        setLocation(startingXPos, getY() + dy);
        
        if (isTouching(Hero.class))
        {
            Hero.stopConfirmation++;
        }
        
        if (Hero.stopConfirmation == 2)
        {   
            Explode boom = new Explode();
            getWorld().addObject(boom, getX(), getY());
            getWorld().removeObject(this);
        }
        
        
        
        
        
    }
}
