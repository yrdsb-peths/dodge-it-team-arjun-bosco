import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Hero hero = new Hero();
        RedBalloon rb1 = new RedBalloon();
        RedBalloon rb2 = new RedBalloon();
        RedBalloon rb3 = new RedBalloon();
        RedBalloon rb4 = new RedBalloon();
        RedBalloon rb5 = new RedBalloon();
        addObject(hero, 100, 100);
        
        addObject(rb1, 0, 0);
        addObject(rb2, 0, 0);
        addObject(rb3, 0, 0);
        addObject(rb4, 0, 0);
        addObject(rb5, 0, 0);
        
        rb1.sleepFor(10 * (1 + Greenfoot.getRandomNumber(5)));
        rb2.sleepFor(50 * (3 + Greenfoot.getRandomNumber(5)));
        rb3.sleepFor(50 * (5 + Greenfoot.getRandomNumber(5)));
        rb4.sleepFor(50 * (7 + Greenfoot.getRandomNumber(5)));
        rb5.sleepFor(50 * (9 + Greenfoot.getRandomNumber(5)));
    }
}
