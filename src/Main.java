public class Main {
    public static void main(String[] args) {
        System.out.println("Professional Outfit:");
        GarmentFactory professionalFactory = new ProfessionalFactory();
        Outfit professionalOutfit = new Outfit(professionalFactory);
        professionalOutfit.showOutfit();

        System.out.println("Casual Outfit:");
        GarmentFactory casualFactory = new CasualFactory();
        Outfit casualOutfit = new Outfit(casualFactory);
        casualOutfit.showOutfit();

        System.out.println("Party Outfit:");
        GarmentFactory partyFactory = new PartyFactory();
        Outfit partyOutfit = new Outfit(partyFactory);
        partyOutfit.showOutfit();
    }
}
