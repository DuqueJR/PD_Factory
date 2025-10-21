public abstract class Logistica {

    public abstract Medios_transporte crearTransporte(String Placa);

    public void planEntrega(String destino,String Placa){
        Medios_transporte transporte = crearTransporte(Placa);
        transporte.entregar(destino);
    }
}
