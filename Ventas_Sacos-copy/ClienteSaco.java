
import java.util.Scanner;

public class ClienteSaco
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numclientes;
        ClientePOO[] Clientela = new ClientePOO [50];
        
        String Id, Descripcion, Talla;
        double product1, product2, product3;
        double Total = 0;
        System.out.println("Digite cuantos compradores son: ");
        numclientes = sc.nextInt();
        for(int i = 0; i < numclientes;i++){
            System.out.println("Digite la identificacion del comprador: ");
            Id = sc.next();
            System.out.println("Digite la descripcion del producto: ");
            Descripcion = sc.next();
            System.out.println("Digite la talla del producto: ");
            Talla = sc.next();
            System.out.println("Digite el precio del primer producto: ");
            product1 = sc.nextDouble();
            System.out.println("Digite el precio del segundo producto: ");
            product2 = sc.nextDouble();
            System.out.println("Digite el precio del tercer producto: ");
            product3 = sc.nextDouble();
            
            ClientePOO unCliente = new ClientePOO();
            unCliente.Id = Id;
            unCliente.descripcion = Descripcion;
            unCliente.Talla = Talla;
            unCliente.productuno = product1;
            unCliente.productdos = product2;
            unCliente.producttres = product3;
        }
        for (int i = 0; i < numclientes; i++){
            double sum = Clientela[i].productuno + Clientela[i].productdos + Clientela[i].producttres;
            Total = sum;
        }
        System.out.println("El valor de la compra es: "+ Total);
    }
}
