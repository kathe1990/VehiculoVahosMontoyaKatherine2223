
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoVahosMontoyaKatherine2223 miVehiculoVahosMontoyaKatherine2223;
        int stockActual;
        
        miVehiculoVahosMontoyaKatherine2223 = new VehiculoVahosMontoyaKatherine2223("Seat",18000,100);
        operativaVehiculosVahosMontoyaKatherine2223(miVehiculoVahosMontoyaKatherine2223, 50); 
        stockActual = miVehiculoVahosMontoyaKatherine2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosVahosMontoyaKatherine2223(VehiculoVahosMontoyaKatherine2223 miVehiculoVahosMontoyaKatherine2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVahosMontoyaKatherine2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVahosMontoyaKatherine2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
