public class CarDetails {
    public static void main(String[] args) {
        Car carref = new Car();
        carref.Model="xc";
        carref.Name="audi";
        carref.Price=1200000.00;
        System.out.println("Model of the car ----->" + '\n'+carref.Model + "Name of the car ---->"+'\n'+ carref.Name);
    }
}
