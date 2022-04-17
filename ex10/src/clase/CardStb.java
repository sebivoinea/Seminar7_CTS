package clase;

public class CardStb implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata cu cardul stb si suma este " + suma);
    }
}
