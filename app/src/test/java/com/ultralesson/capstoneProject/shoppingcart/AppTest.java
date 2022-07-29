package com.ultralesson.capstoneProject.shoppingcart;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    @Test(groups={"wallet"})
    public void testAddMoney(){
        //arrange
        Wallet wallet=new Wallet("Akhil");
        ShoppingCart shoppingCart=new ShoppingCart();
        Person person=new Person("Akhil",wallet,shoppingCart);
        //act
        person.getWallet().addMoney(500);
        double balance=person.getWallet().getMoney();
        //assert
        Assert.assertEquals(balance,500);
    }

    @Test(groups={"wallet"})
    public void testDeductMoney(){
        //arrange
        Wallet wallet=new Wallet("Akhil");
        ShoppingCart shoppingCart=new ShoppingCart();
        Person person=new Person("Akhil",wallet,shoppingCart);
        //act
        person.getWallet().addMoney(500);
        person.getWallet().deductMoney(123);
        double balance=person.getWallet().getMoney();
        //assert
        Assert.assertEquals(balance,377);
    }

    @Test(groups={"shopping cart"})
    public void testGetItemPrice(){
        //arrange
        Item apple=new Item("apple",2);
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addItem(apple);
        //act
        double price=shoppingCart.getItemPrice(apple);
        //assert
        Assert.assertEquals(price,200);
    }

    @Test(groups={"shopping cart"})
    public void testAddItem(){
        //arrange
        Item apple=new Item("apple",2);
        Item mango=new Item("mango",3);
        ShoppingCart shoppingCart=new ShoppingCart();
        //act
        shoppingCart.addItem(apple);
        shoppingCart.addItem(mango);
        ArrayList<Item> items=shoppingCart.getItems();
        //assert
        Assert.assertEquals(items,new ArrayList<>(List.of(new Item[]{apple,mango})));
    }

    @Test(groups={"shopping cart"})
    public void testAddItemForAddingSameItem(){
        //arrange
        Item apple=new Item("apple",2);
        ShoppingCart shoppingCart=new ShoppingCart();
        //act
        shoppingCart.addItem(apple);
        shoppingCart.addItem(apple);
        ArrayList<Item> items=shoppingCart.getItems();
        //assert
        Assert.assertEquals(items,new ArrayList<>(List.of(new Item[]{apple})));
        Assert.assertEquals(items.get(0).getQuantity(),4);
    }

    @Test(groups={"person"})
    public void testPayBill(){
        //arrange
        Item apple=new Item("apple",2);
        Wallet wallet=new Wallet("Akhil");
        ShoppingCart shoppingCart=new ShoppingCart();
        Person person=new Person("Akhil",wallet,shoppingCart);
        person.addItem(apple);
        person.getWallet().addMoney(500);
        //act
        person.payBill();
        double balance=person.getWallet().getMoney();
        //assert
        Assert.assertEquals(balance,310);
    }
}