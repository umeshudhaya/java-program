import java.util.Random;
import java.util.Scanner;

class Pizza{
    private int price;
    private boolean veg;
    private  int addToppings=80;
    private  int addCheese=95;
    private  int Takeaway=35;

    private boolean AddedToppingPrice=false;
    private boolean AddedCheesePrice=false;
    private boolean parcelTakeawayPrice=false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (veg==true){
            this.price=300;
            System.out.println("veg pizza :"+this.price);


        }
        else {
            this.price=400;
            System.out.println("Non-veg pizza :"+this.price);

        }
    }

    public void AddCheese() {

        this.price +=addCheese;
        AddedCheesePrice=true;
    }
    public void AddToppings(){

        this.price +=addToppings;
        AddedToppingPrice=true;

    }
    public void  Takeaway(){
        this.price +=Takeaway;
        parcelTakeawayPrice=true;
    }
    public void getbill(){

        String bill="";
        System.out.println("pizza  :"+price);
    if (AddedCheesePrice){
        bill+="AddedCheese:"+addCheese+"\n";

    }  if (AddedToppingPrice) {
        bill+="AddedToppings:"+addToppings+"\n";


    } if (parcelTakeawayPrice) {
        bill+="parcelTakeAway:"+Takeaway+"\n";
    }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }


    public  void line(){
        System.out.println("_____________________________________________________");
    }

}
class Largepizza extends Pizza{
    public Largepizza(boolean veg) {
        super(veg);
    }

    @Override
    public void AddCheese() {
        super.AddCheese();
    }

    @Override
    public void AddToppings() {
        super.AddToppings();
    }

    @Override
    public void Takeaway() {
        super.Takeaway();
    }
}

class  Main{
    public static void main(String[] argS) {
        Pizza basepizza = new Pizza(true);
        basepizza.AddToppings();
        basepizza.Takeaway();
        basepizza.AddCheese();
        basepizza.getbill();
        basepizza.line();

        Largepizza largepizza=new Largepizza(false);
        largepizza.AddCheese();
        largepizza.Takeaway();
        largepizza.AddToppings();
        largepizza.getbill();

    }

}