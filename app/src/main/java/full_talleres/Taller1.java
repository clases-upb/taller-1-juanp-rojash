/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta.
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 *
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 *
 * RÉTESE, PÓNGASE A PRUEBA!!!
 *
 */
package full_talleres;
 
public class Taller1 {
   
    public static void main(String[] args) {
        System.out.println(Convertir_km_seg(40));
        System.out.println(Convertir_cm_lt(3500));
        System.out.println(Convertir_us_cops(45623));
        System.out.println(Convertir_cent_far(0));
        System.out.println(Calcular_segs((short)1, (short)1, (short)1, (short)1));
        System.out.println(Calcular_peso_carga((float)47.5, (float) 7.5));
        System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));
        System.out.println(Calcular_combustible(638, 312, 1243, 220));
        System.out.println(Calcular_peso_luna((byte)80));
    }
 
    /*
     2. Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error,
     devuelva el string "Error en la conversion"
    */
   
    public static String Convertir_km_seg(int vel_km_seg){
 
        try{
            final short mtxkm = 1000, segxhr=3600;
            float mt_seg = 0, mt_hor = 0;
            String txt_return="";
 
            mt_seg = vel_km_seg*mtxkm;
            mt_hor = segxhr*mt_seg;
 
            txt_return += mt_seg + " m/s - " + mt_hor + " m/h";
 
            return txt_return;
        }
        catch(Exception e){
            return ("Error en la conversion");
 
        }
 
    }
 
    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
 
    public static float Convertir_cm_lt (double cant_cc){
 
        try {
            final short cmxlt = 1000;
            float tot_litros = (float)(cant_cc/cmxlt);
            return tot_litros;
        }
       
        catch (Exception e) {
            return 0;
        }
 
    }
 
 
   /*4. Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
    public static long Convertir_us_cops(long monto_us){
    try {
        final short trm = 4170;
        long tot_cops = monto_us * trm;
        return tot_cops;
 
    } catch (Exception e) {
            return -1;
    }
   }
 
   
   /*5. Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error,
   retorne 0.
   */
 
    public static float Convertir_cent_far(float temp_grad_cent){
 
        try {
           
            float gra_far = 32 + ( 9 * temp_grad_cent / 5);
            return gra_far;
 
 
        } catch (Exception e) {
            return -1;
        }
 
    }        
 
   
   /*6. Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas,
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero.
   Si hay algún error, devuelva -1.
   */
 
   public static int Calcular_segs(short dd, short hh, short mm, short ss){
        try {
            final int ssxd = 86400, ssxh = 3600, ssxm = 60;
            int total_segs;
           
            if(dd >=0 && hh>=0 && mm >=0 && ss >=0)
                total_segs = dd*ssxd + hh*ssxh + mm * ssxm + ss;
            else
                total_segs = -1;
 
            return total_segs;
 
        } catch (Exception e) {
            return -1;
        }
    }
 
   /*7. Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas
   en un string del tipo: "### kilos - ### toneladas".
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
 
   public static String Calcular_peso_carga(float peso_cargado, float peso_vacio) {
        try {
            String mensaje = "";
            final short kiloxton = 1000;
            float peso_neto_ton = 0, peso_neto_kil = 0;
 
            peso_neto_ton = peso_cargado - peso_vacio;
            peso_neto_kil = peso_neto_ton*kiloxton;
 
            return peso_neto_kil + " kilos - " + peso_neto_ton + " toneladas";
        }
       
        catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }
   }
 
   /*8. Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
 
   public static float Calcular_horasxviaje (String destino, short distancia_km, short velocidad_kmxh){
 
        try {
            float horas_destino = 0;
            horas_destino = distancia_km/velocidad_kmxh;
            return horas_destino;
        }
       
        catch (Exception e) {
            return -1;
        }
 
   }    
   
   /*9. Un avión necesita cargar combustible para cubrir sus rutas programadas en el día.
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero.
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas.
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible,
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
 
   public static float Calcular_combustible(int km_r1, int km_r2, int km_r3, int km_r4){
 
        try {
            final float consumoDespegue = 1.2f, consumoAterrizaje = 0.4f, consumoPorKm = (float)(0.2 / 60.8);
            float consumo_total_comb=0, cons_r1_comb=0, cons_r2_comb=0, cons_r3_comb=0, cons_r4_comb=0;
 
            cons_r1_comb = km_r1*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r2_comb = km_r2*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r3_comb = km_r3*consumoPorKm + consumoDespegue + consumoAterrizaje;
            cons_r4_comb = km_r4*consumoPorKm + consumoDespegue + consumoAterrizaje;
 
            consumo_total_comb = cons_r1_comb+cons_r2_comb+cons_r3_comb+cons_r4_comb;
           
            return consumo_total_comb;
 
        }
        catch (Exception e) {
            return -1;
        }
   }
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   
   public static double Calcular_peso_luna(byte peso_kl){
 
        try {
            final float factor_tierra = 9.81f, factor_luna = 0.165f;
 
            double peso_tierra_new = 0, peso_luna_new = 0;
 
            peso_tierra_new = peso_kl * factor_tierra;
 
            peso_luna_new = peso_tierra_new*factor_luna;
 
            return peso_luna_new;
 
 
        }
       
        catch (Exception e) {
           return 0;
        }
 
   }
   
 
 
   /*11. Diseñe un algoritmo e implemente la función Calcular_saldo que retorne el saldo del dinero que
   debe haber en la taquilla de un banco y reciba la base, el total de recaudos y el total de retiros
   
   saldo_taquilla = base + total recaudos - total_retiros
 
   */
 
   /*12. Diseñe un algoritmo e implemente la función Calcular_tip que calcule y devuelva en un string el valor de
   la propina (10%), el impuesto al consumo (8%) y el valor final que deberá pagar un cliente
   para lo cual recibirá el valor del consumo que hizo.
   El formato del string que retorna debe ser:
   valor comida: $### - valor propina $### - valor impoconsumo $### - total a pagar $###
   */
 
   /*13. Diseñe un algoritmo e implemente la función Obtener_puntos que devuelva los puntos
   alcanzados por un equipo de fútbol (puntuación según lineamientos de Fifa). la función
   recibe como datos de entrada el Número de partidos ganados, el número de partidos perdidos,
   el número de partidos empatados. */
 
 
   /*14. Diseñe un algoritmo e implemente la función Calcular_definitiva que recibe 5 notas (entre 0 y 5) y
   los 5 porcentajes (que deberán sumar 1 y estarán entre 0 y 1)
   para una materia, y devuelve la nota definitiva si todo está bien, pero si algo está mal con los porcentajes
   o con las notas, devolverá -1. Establezca qué puede estar errático con los porcentajes y las notas
   y tengalo en cuenta en el algoritmo*/
   
   /*15. Diseñe un algoritmo e implemente la función Calcular_para_ganar que recibe 5 porcentajes de una materia
   (que deberán sumar 1 y estarán entre 0 y 1) y las 4 primeras notas (entre 0 y 5), y devuelve la nota
   que tendrá que sacar para ganar si el puntaje mínimo es 3. Si algo está mal con los porcentajes o con las
   notas, devolverá -1. Establezca qué puede estar errático con los porcentajes y las notas y tengalo
   en cuenta en el algoritmo*/
 
 
 
   
   /*16. Se requiere un algoritmo para calcular el salario a pagar a un trabajador dados los siguientes datos:
   cantidad de horas normales laboradas, cantidad de horas extras diurnas laboradas,
   cantidad de horas extras nocturnas laboradas, valor de la hora normal.
   El valor de las horas extras diurnas tienen un recargo adicional  del 15% sobre la hora normal.
   El valor de las horas extras nocturnas tienen un recargo adicional  del 35% sobre la hora normal. */
   
   /*17. Diseñe un algoritmo que calcule el área de un triángulo rectángulo, dados su base y altura.
    área = 1/2*base*altura
   */
 
   /*18. Diseñe un algoritmo que calcule el perímetro de un cuadrado.
    *
    Per = long lado * 4
   */
   /*19. Diseñe un algoritmo que calcule el volumen de un cilindro.
    * vol=pi*rad_base2*altura
   */
   
   /*20. Diseñe un algoritmo que calcule el área del círculo. Considere PI con precisión de 7 decimales.
   El radio se pide por teclado.
    A = pi*radio2
   */
 
}
