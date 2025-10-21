public class Camion implements Medios_transporte {
    private String placa;

    public Camion (String placa){
        this.placa = placa;
    }

    @Override
    public void entregar(String destino){
        System.out.println("El Camion esta entregando en" + destino);
        System.out.println("Placa del camion: " + placa);
    }
}
