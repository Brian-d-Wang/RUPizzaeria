package Project4;

public enum Topping {
    
    Pepperoni, Chicken, Beef, Ham, Pineapple, BlackOlives, Cheese, Sausage, GreenPepper, Onion, Mushroom;
    
    public String toString(Topping topping){
        if(Pepperoni.equals(topping))
            return "Pepperoni";
        else if(Chicken.equals(topping))
            return "Chicken";
        else if(Beef.equals(topping))
            return "Beef";
        else if(Pineapple.equals(topping))
            return "Pineapple";
        else if(Ham.equals(topping))
            return "Ham";
        else if(BlackOlives.equals(topping))
            return "Black Olives";
        else if(Cheese.equals(topping))
            return "Cheese";
        else if(Sausage.equals(topping))
            return "Sausage";
        else if(GreenPepper.equals(topping))
            return "Green Pepper";
        else if(Onion.equals(topping))
            return "Onion";
        else
            return "Mushroom";
        
    }
    }
