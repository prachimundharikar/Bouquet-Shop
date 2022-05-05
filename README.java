# Bouquet-Shop
abstract class Bouquet{
    String des=" ";
    abstract double Cost();
    abstract String getDes();
}

class RoseBouquet extends Bouquet{
    RoseBouquet(){
        des="Rose bouquet";
    }
    String getDes(){
        return des;
    }
    public double Cost(){
        return 69;
    }
}
class OrchidBouquet extends Bouquet{
    OrchidBouquet(){
        des="Orchid bouquet";
    }
    String getDes(){
        return des;
    }
    public double Cost(){
        return 169;
    }
}
class SunflowerBouquet extends Bouquet{
    SunflowerBouquet(){
        des="Sunflower bouquet";
    }
    String getDes(){
        return des;
    }
    public double Cost(){
        return 269;
    }
}

abstract class DecoratingStuff extends Bouquet{
    public abstract String getDes();
    
}

class Wrappings extends DecoratingStuff{
    Bouquet boo;
    Wrappings(Bouquet boo){
        this.boo=boo;
    }

    public String getDes(){
        return(boo.getDes()+ " With Wrappings");
    }

    public double Cost(){
        double BouquetCost=boo.Cost();
        return (BouquetCost + 100);
    }
}
class Ribbons extends DecoratingStuff{
    Bouquet boo;
    Ribbons(Bouquet boo){
        this.boo=boo;
    }

    public String getDes(){
        return(boo.getDes()+ " With Ribbons");
    }

    public double Cost(){
        double BouquetCost=boo.Cost();
        return (BouquetCost + 200);
    }
}
class Glitter extends DecoratingStuff{
    Bouquet boo;
    Glitter(Bouquet boo){
        this.boo=boo;
    }

    public String getDes(){
        return(boo.getDes()+ " With Glitter");
    }

    public double Cost(){
        double BouquetCost=boo.Cost();
        return (BouquetCost + 300);
    }
}

class FloristShop{
    public static void main(String[] args) {
        Bouquet rBouquet=new RoseBouquet();
        DecoratingStuff wrappings=new Wrappings(rBouquet);
        Bouquet oBouquet=new OrchidBouquet();
        DecoratingStuff ribbons=new Ribbons(oBouquet);
        Bouquet sBouquet=new SunflowerBouquet();
        DecoratingStuff glitter=new Glitter(sBouquet);
        System.out.println("---------------------------------------");
        System.out.println("Your order is:- " + wrappings.getDes());
        System.out.println("Total Cost is:- " + wrappings.Cost());
        System.out.println("---------------------------------------");
        System.out.println("Your order is:- " + ribbons.getDes());
        System.out.println("Total Cost is:- " + ribbons.Cost());
        System.out.println("---------------------------------------");
        System.out.println("Your order is:- " + glitter.getDes());
        System.out.println("Total Cost is:- " + glitter.Cost());
        System.out.println("---------------------------------------");
    }
}
