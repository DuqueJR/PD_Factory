public class Logisitca_maritima extends Logistica {

    @Override
    public Medios_transporte crearTransporte(String placa){
        return new Barco(placa);
    }
}
