import java.lang.management.PlatformManagedObject;
import java.until.Scanner;

public class Main {
    

    Scanner scanner = new Scanner(System.in);

    System.out.println("digite o quantos quilometros por litro o seu veiculo faz: ");
    float eficiencia = scanner.nextLine();

//req01
    System.out.println("digite o numero da placa do veiculo: ");
    String placa = scanner.nextLine();
//req02  
    System.out.println("digite o valor do litro do combustivel: ");
    float valorcombustivel = scanner.nextLine();
//req03    
    System.out.println("digite o numero de quilometros rodados a 60k/h: ");
    float velocidadesessenta = scanner.nextLine();
//req04    
    System.out.println("digite o numero de quilometros rodados a 80k/h: ");
    float velocidadeoitenta = scanner.nextLine();
//req05    
    System.out.println("digite o numero de quilometros rodados a 100k/h: ");
    float velocidadecem = scanner.nextLine();
//req06    
    System.out.println("digite o numero de quilometros rodados a 120k/h: ");
    float velocidadecentovinte = scanner.nextLine();
//req07    
    System.out.println("digite o numero de quilometros rodados a 140k/h: ");
    float velocidadecentoquarenta = scanner.nextLine();

    scanner.close();

//req08
float eficienciasessenta = velocidadesessenta/eficiencia;
float eficienciaoitenta = velocidadeoitenta/eficiencia;
float eficienciacem = velocidadecem/eficiencia;
float eficienciacentovinte = velocidadecentovinte/eficiencia;
float eficienciacentoquarenta = velocidadecentoquarenta/eficiencia;

//req09
float consumototal = eficienciasessenta + eficienciaoitenta + eficienciacem + eficienciacentovinte + eficienciacentoquarenta;


//req10
float velocidademedia = velocidadesessenta*60 + velocidadeoitenta*80 + velocidadecem*100 + velocidadecentovinte*120 + velocidadecentoquarenta*140 / 500;

//req11
float custoviagem = consumototal*valorcombustivel;

//req12
System.out.println("Placa do veículo: " + placa);

//req13
System.out.println("Valor total: R$" + custoviagem);

//req14
System.out.println("Velocidade média ponderada: " + velocidademedia + "KM/H");

//req15
System.out.println("Consumo total:  " + consumototal);


}
