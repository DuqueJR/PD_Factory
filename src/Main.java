//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logistica zona_transporteUno = new LogisticaTerrestre();
        zona_transporteUno.planEntrega("Medellin","ABC123");

        Logistica zona_transportedos = new Logisitca_maritima();
        zona_transportedos.planEntrega("Miami","ZZZ000");

        zona_transporteUno.planEntrega("MAMA","AAA");


    }
}