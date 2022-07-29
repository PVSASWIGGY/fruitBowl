/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ultralesson.capstoneProject.fruitbowl;

import com.ultralesson.capstoneProject.fruitbowl.App;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class AppTest {

    @Test(groups={"bowl"})
    public void getFruitsFromNewBowl(){
        //arrange
        Bowl bowl=new Bowl();
        //act
        ArrayList<Fruit> fruits=bowl.getFruits();
        //assert
        Assert.assertEquals(fruits,new ArrayList<Fruit>());
    }
    @Test(groups = {"bowl"})
    public void testAddFruitToBowl(){
        //arrange
        Color red=new Color.Builder()
                .setRed(255)
                .createColor();
        Taste sweet=new Taste.Builder("sweet")
                .setDegree(0)
                .createTaste();
        Fruit apple=new Fruit.Builder("name")
                .setColor(red)
                .setTaste(sweet)
                .createFruit();
        Bowl bowl=new Bowl();
        //act
        bowl.addFruits(apple);
        ArrayList<Fruit> fruits=bowl.getFruits();
        //assert
        Assert.assertEquals(fruits, new ArrayList(List.of(new Fruit[]{apple})));
    }

    @Test(groups={"basket"})
    public void addFruitToBasket(){
        //arrange
        int layerNo=2;
        Basket basket=new Basket(3);
        Color red=new Color.Builder()
                .setRed(255)
                .createColor();
        Taste sweet=new Taste.Builder("sweet")
                .setDegree(0)
                .createTaste();
        Fruit apple=new Fruit.Builder("name")
                .setColor(red)
                .setTaste(sweet)
                .createFruit();
        //act
        basket.addFruit(layerNo,apple);
        ArrayList<Fruit> fruits=basket
                .getLayers()
                .get(layerNo)
                .getFruits();
        //assert
        Assert.assertEquals(fruits,new ArrayList<>(List.of(new Fruit[]{apple})));
    }
}
