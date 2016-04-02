package programasForadaSala;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        byte opcaoMenu = Byte.MAX_VALUE, volume = 0, canal = 0;
        boolean tvLigada = false;
        
        do{
            System.out.println("--- Menu ---");
            if(tvLigada == false)
                System.out.println("1 - Ligar TV");
            else{
                System.out.println("1 - Desligar TV");
                System.out.println("2 - Aumentar volume");
                System.out.println("3 - Diminuir volume");
                System.out.println("4 - Mudar canal");
            }
            System.out.println("0 - Sair do programa");
            System.out.print("Digite a opção: ");
            opcaoMenu = s.nextByte();
            
            switch(opcaoMenu){
                case 1:
                    if(tvLigada == false){
                        System.out.println("TV ligada\n\n\n\n\n\n");
                        tvLigada = true;
                    }else{
                        tvLigada = false;
                        System.out.println("TV desligada\n\n\n\n\n\n");
                    }
                    break;
                case 2:
                    do{
                        System.out.print("Informe o volume (0 até 10): ");
                        volume = s.nextByte();
                    }while(volume < 0 && volume > 10);
                    break;
                case 3:
                    do{
                        System.out.print("Informe o volume (0 até 10): ");
                        volume = s.nextByte();
                    }while(volume < 0 && volume > 10);
                    break;
                case 4:
                    System.out.print("Informe o canal: ");
                    canal = s.nextByte();
                    break;
            }
            if(opcaoMenu != 0)
            System.out.println("\n\n\nVolume atual: " +volume+ " - canal atual: " +canal+"\n\n");
        }while(opcaoMenu != 0);
}
}
