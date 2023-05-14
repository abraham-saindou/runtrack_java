package jour01.job08;

public class Facture {
    public static void main(String[] args){
        String prix = "49.99", quantite = "3";
        float fprix = Float.parseFloat(prix), fquantite = Integer.parseInt(quantite);
        float tva = 0.2f; // TVA 20%
        float totalHT = fprix * fquantite;
        float totaTVA = totalHT * tva;
        float tarifTTC = totalHT + totaTVA;

        System.out.println("Le montant total est de " +totalHT);
        System.out.println("Le montant de la tva est de " +totaTVA);
        System.out.println("Le montant ttc est de " +tarifTTC);

    }
}
