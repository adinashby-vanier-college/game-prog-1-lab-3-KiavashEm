// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 459, 74);
        Worm worm =  new  Worm();
        addObject(worm, 353, 41);
        Worm worm2 =  new  Worm();
        addObject(worm2, 490, 192);
        Worm worm3 =  new  Worm();
        addObject(worm3, 468, 305);
        Worm worm4 =  new  Worm();
        addObject(worm4, 344, 281);
        Worm worm5 =  new  Worm();
        addObject(worm5, 388, 416);
        Worm worm6 =  new  Worm();
        addObject(worm6, 244, 174);
        Worm worm7 =  new  Worm();
        addObject(worm7, 163, 58);
        Worm worm8 =  new  Worm();
        addObject(worm8, 5, 553);
        Worm worm9 =  new  Worm();
        addObject(worm9, 435, 516);
        Worm worm10 =  new  Worm();
        addObject(worm10, 124, 350);
        Worm worm11 =  new  Worm();
        addObject(worm11, 286, 279);
        removeObject(worm11);
    }
}
