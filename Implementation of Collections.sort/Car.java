public class Car{
    int launch;
    int price;

    public Car(int launch, int price){
        this.launch = launch;
        this.price = price;
    }
    /*public boolean equals(Object o){
        Car c = (Car)o;
        if((c.launch == this.launch) && (c.price == this.price)){
          return true;
        }
        return false;
    }*/
    public String toString(){
      return this.launch+" "+this.price;
    }
  }
