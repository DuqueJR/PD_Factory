public class Barco implements Medios_transporte{

    private String placa;

    public Barco (String placa){
        this.placa = placa;
    }

    @Override
    public void entregar(String destino){
        System.out.println("El barco esta entregando por el mar en" + destino);
        System.out.println("Placa del barco " + placa);
    }
}


