import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] monTab1 = {2,8,16,4,7,54,9,20,5,17}; // 1er tableau
        int[] monTab2 = {30,40,50,99,56}; // 2ème tableau
        int[] result = new int[monTab1.length + monTab2.length];
        int pos = 0;
        int min = monTab1[0];
        int max = monTab1[0];
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
       int saisie = 0;// saisie utilisateur


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
            result[pos] = i;
            pos++;
        }
        for (int i: monTab2){
            result[pos] = i;
            pos++;
        }
        System.out.print(Arrays.toString(result) + " ");
        System.out.print("\nLe tableau concatener trié : ");
        Arrays.sort(result);
        System.out.print(Arrays.toString(result) + " ");
        System.out.print("\nEntrer une valeur entière : ");
        saisie(saisie, result);

    /*    while (sc.hasNext()){
            try{
                saisie =  sc.nextInt();
                if(isIn(result, saisie)){
                    System.out.println(saisie + " existe dans le tableau");
                }
                else{
                    System.out.println(saisie + " n'existe pas dans le tableau");
                }
                break;
            } catch (Exception e) {
                System.out.print("Entrer que des entiers : ");
                sc.next();
            }
        }*/
        Arrays.sort(result);
        System.out.print(Arrays.toString(result) + " ");
    }

    public static void saisie(int saisie, int[] t){
        Scanner sc  = new Scanner(in);
        try{
            saisie =  sc.nextInt();
            isIn(t,saisie);
        } catch (Exception e){
            System.out.print("Entrer que des entiers : ");
            saisie(saisie,t);
        }
    }
    public static boolean isIn(int[] result, int saisie){
        for (int i = 0; i < result.length; i++){
            if (saisie == result[i]){
                result[i] = saisie*5;
                System.out.println(saisie + " existe dans le tableau");
                return true;
            }
        }
        System.out.println(saisie + " existe dans le tableau");
        return false;
    }
}