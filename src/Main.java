import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        int monTab1 [] = {2,8,16,4,7,54,9,20,5,17};
        int monTab2 [] = {30,40,50,99,56};
        int res [] = new int[monTab1.length + monTab2.length];
        int pos = 0;
        int min = monTab1[0];
        int max = monTab1[0];
        Scanner sc  = new Scanner(in);
        //BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        int s;
        boolean b = true;

        System.out.print("1er Tableau avant triage : ");
        System.out.print(Arrays.toString(monTab1));
        System.out.print("\n1er Tableau après triage : ");
        Arrays.sort(monTab1);
        System.out.print(Arrays.toString(monTab1));

        for (int i : monTab1){
            if(i>max) max = i;
            if (i<min) min = i;
        }
        System.out.println("\nLe plus petit indice du 1er tableau est : " + Arrays.binarySearch(monTab1, min));
        System.out.println("Le plus grand indice du 1er tableau est : " + Arrays.binarySearch(monTab1, max)); //monTab1.length-1
        System.out.println("Le plus petit element du 1er tableau est : " + min);
        System.out.println("Le plus grand element du 1er tableau est : " + max);
        System.out.print("Le deuxième tableau est : ");
        System.out.println(Arrays.toString(monTab2));
        System.out.print("Le tableau concatener : ");

        for (int i: monTab1){
            res[pos] = i;
            pos++;
        }
        for (int i: monTab2){
            res[pos] = i;
            pos++;
        }
        System.out.print(Arrays.toString(res) + " ");
        System.out.print("\nLe tableau concatener trié : ");
        Arrays.sort(res);
        System.out.print(Arrays.toString(res) + " ");
        System.out.print("\nEntrer une valeur entière : ");

        while (b){
            try{
                s =  sc.nextInt();
                for (int i = 0; i< res.length; i++){
                    if (s == res[i]){
                        System.out.println(s + " existe dans le tableau");
                        res[i] = s*5;
                        break;
                    }
                    else if(i == res.length -1) System.out.println(s + " n'existe pas dans le tableau");
                }
                b = false;
            } catch (Exception e) {
                System.out.print("Entrer que des entiers : ");
                sc.next();
            }
        }
        System.out.print(Arrays.toString(res) + " ");
    }
}