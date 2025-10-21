public class LogisticaTerrestre extends Logistica{

    @Override
    public Medios_transporte crearTransporte(String placa){
        return new Camion(placa);
    }
}
