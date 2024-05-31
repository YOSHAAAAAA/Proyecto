import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("**************************************");
        System.out.println("      MENU DE OPCIONES UNIDAD III     ");
        System.out.println("**************************************");
        System.out.println("* 1) Calcular Edad para INE           ");                
        System.out.println("* 2) Hermano Mayor                    ");
        System.out.println("* 3) Incentivos de Unidades Producidas"); 
        System.out.println("* 4) Determinar mayor de 3 Números    ");
        System.out.println("* 5) Tipo de Triángulo                ");
        System.out.println("* 6) Convertir Arábigo a Romano       ");
        System.out.println("* 7) Convertir Caracter a Vocal       ");
        System.out.println("* 8) Menor, Igual o Mayor de 3        ");
        System.out.println("* 9) Determinar Tipo de Calificación  ");
        System.out.println("*10) Seleccionar Tipo Tarifa          ");
        System.out.println("*11) Determinación de Bono            ");
        System.out.println("*12) Formas de If anidado             ");
        System.out.println("*13) Operador Ternario ?:             ");     
        System.out.println("*14) Demo For                         ");
        System.out.println("*15) Suma los M primeros búmero pares ");
        System.out.println("*16) Tabla Mutiplicar con argumentos  ");
        System.out.println("*17) Demo ciclo while                 ");
        System.out.println(" 18) Calculo de Calorias              ");
        System.out.println(" 19) Promedio Calificaciones          ");
        System.out.println("*20) Calcular ecuacion                ");
        System.out.println("*21) Leer valor de x e imprimir y     ");
        System.out.println("**************************************");
        System.out.print("Seleccion Opcion:");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
             Ine objIne = new Ine();
             objIne.determinarSiIne();
             break;
            case 2:
             DifEdades Dedad = new DifEdades();
             Dedad.difEdades();
             break;
            case 3:
            Incentivo incentivo = new Incentivo();
            incentivo.incentivo();
             break;
            case 4:
             Mayor3 objeto = new Mayor3();
             objeto.mayor();
             break;
            case 5:
             Triangulo triangulo = new Triangulo();
             triangulo.triangulo();
             break;
            case 6:
            Romano objRomano = new Romano();
            objRomano.romano();
             break;
            case 7:
             Vocal vocal = new Vocal();
             vocal.vocal();
             break;
            case 8:
             Menorde3 objMenorde3 = new Menorde3();
             objMenorde3.menorde3();
             break;
            case 9:
             Calificacion objCalificacion = new Calificacion();
             objCalificacion.calificacion();
             break;
            case 10:
             Peaje obPeaje = new Peaje();
             obPeaje.peaje();
             break;
            case 11:
             Bono objBono = new Bono();
             objBono.bono();
             break;
            case 12:
              DemoIfAnidado objDemoIfAnidado = new DemoIfAnidado();
              objDemoIfAnidado.demoIfAnidado();
              break;
            case 13:
              DemoOpTernario objOpTer = new DemoOpTernario();
              objOpTer.demoOpTernario();
              break;
            case 14:
             DemoFor objDemoFor = new DemoFor();
             objDemoFor.demofor();
             break;
            case 15:
             SumaPares objSumaPares = new SumaPares();
             objSumaPares.sumaPares();
             break;
            case 16:
             Multiplicar objMult = new Multiplicar();
             System.out.println("Proporciona número para generar tabla:");
             int n = entrada.nextInt();
             objMult.multiplicar(n);
             break;
            case 17:
              DemoWhile objdw = new DemoWhile();
              objdw.demoWhile();
              break;
            case 18:
              Calorias objCal= new Calorias();
              objCal.calorias();
              break;
            case 19:
              Promedio objProm = new Promedio();
              objProm.promedio();
              break;
            case 20:
              Ecuacion objEcu = new Ecuacion();
              objEcu.ecuacion();
              break;
            case 21:
              LeerX objLeerX = new LeerX();
              objLeerX.leerX();
              break;
              
              
            default:
              System.out.println("Opción inválida");
        }
        entrada.close();
    }

}