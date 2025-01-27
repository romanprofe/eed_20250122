

import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero");

        int num1 = sc.nextInt();

        System.out.print("Escribe oto numero ");

        int num2 = sc.nextInt();

        int numPares = 0;

        for(int i = num1 ; i <= num2 ; i++){


            if(i%2==0){
                numPares++;
            }


        }
        
        System.out.print ("La cantidad de numeros pares es " + numPares);


    }
}