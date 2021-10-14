import java.util.Scanner;

// introducing if else statement

public class JavaBasic2{
    public static void main(String[] args){
        System.out.println("\ninput nilai dari 0 - 100");
        Scanner scanner = new Scanner(System.in);
        int nilai = scanner.nextInt();
        String predikat = "";

        if (nilai >= 81 && nilai <= 100){
            predikat = "A";
            }
        else if (nilai >= 61) { 
            predikat = "B";
            }
        else if (nilai >= 41) { 
            predikat = "C";
            }
        else if (nilai >= 21) { 
            predikat = "D";
            }
        else if(nilai >= 0 && nilai <= 20){
            predikat = "E";
        }
        System.out.println("Nilai = " + nilai);
        System.out.println("Predikat = " + predikat);
    }
}