public class Outfit {
    private final Top top;
    private final Pants pants;
    private final Shoes shoes;

    public Outfit(GarmentFactory factory) {
        this.top = factory.createTop();
        this.pants = factory.createPants();
        this.shoes = factory.createShoes();
    }

    public void showOutfit() {
        System.out.println(top.getDescription());
        System.out.println(pants.getDescription());
        System.out.println(shoes.getDescription());
        System.out.println("---------------------------");
    }
}
