package Project4;

//create an instance of subclasses based on the chosen flavor
public class PizzaMaker {
    public static Pizza createPizza(String flavor){
        //write the code for creating different instances of subtypes of pizza
        if(flavor.equals("Pepperoni")){
            return(new Pepperoni());
        }else if(flavor.equals("Deluxe")){
            return(new Deluxe());
        }else if(flavor.equals("Hawaiian")){
            return(new Hawaiian());
        }else{
            return(null);
        }
    }
}
