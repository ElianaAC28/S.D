package co.edu.unicauca.cliente.servicios;

import co.edu.unicauca.servidor.controladores.ControladorGestorIndicadorInt;
import co.edu.unicauca.cliente.utilidades.UtilidadesConsola;
import co.edu.unicauca.cliente.utilidades.UtilidadesRegistroC;
import co.edu.unicauca.servidor.DTO.IndicadorDTO;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClienteDeObjetos {

    private static ControladorGestorIndicadorInt objRemoto;
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";

        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero();
        System.out.println("probando");
        objRemoto = (ControladorGestorIndicadorInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry, numPuertoRMIRegistry, "objIndicador");
        
        if (objRemoto != null) {
            int opc;
            do {
                System.out.println("****** REGISTRO DE INDICADORES CLINICOS ******");
                System.out.println("1. Registrar indicadores");
                System.out.println("2. Salir");
                opc = UtilidadesConsola.leerEntero();
                switch (opc) {
                    case 1:
                        leerIndicadores();
                        break;
                    case 2:
                        System.out.println("¡Hasta pronto!");
                        break;
                }
            } while (opc != 2);
        } else {
            System.out.println("No se pudo obtener el objeto remoto");
        }

    }

    public static void leerIndicadores() {
        try {
            System.out.println("Digite el numero de habitacion");
            int numHab = UtilidadesConsola.leerEntero();
            System.out.println("Digite el valor de la frecuencia cardiaca");
            float freCardi = entrada.nextFloat();
            System.out.println("Digite el valor de la tensión arterial sistolica");
            float tensionSis = entrada.nextFloat();
            System.out.println("Digite el valor de la tensión arterial diastolica");
            float tensionDias = entrada.nextFloat();
            System.out.println("Digite el valor de la frecuencia respiratoria");
            float frecuRes = entrada.nextFloat();
            System.out.println("Digite el valor de la temperatura");
            float temperatura = entrada.nextFloat();
            System.out.println("Digite el valor de la saturacion de oxigeno");
            float satOxigeno = entrada.nextFloat();

            IndicadorDTO objIndicador = new IndicadorDTO(numHab, freCardi, tensionSis, tensionDias, frecuRes, temperatura, satOxigeno);
            boolean enviado = objRemoto.enviarIndicadores(objIndicador);
            
            if (Boolean.TRUE.equals(enviado)) {
                System.out.println("Los indicadores se han enviado correctamente");
            } else {
                System.out.println("!ERROR! No fue posible enviar los indicadores");
            }
        } catch (RemoteException e) {
            System.out.println("Error al registrar los indicadores "+e.getMessage());
        }
    }
}
