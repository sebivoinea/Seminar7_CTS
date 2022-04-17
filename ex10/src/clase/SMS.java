package clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin sms si suma este " + suma);
    }
}
