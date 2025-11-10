import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Hero hero = new Hero();
        RedBalloon rb = new RedBalloon();
        
        addObject(hero, 100, 100);
        addObject(rb, 0, 0);
        
    }
}
