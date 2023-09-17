package fourtHomework;

import java.util.Scanner;

public class InheritanceFour {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(" ");
        try {
            if (info[1].equals("Elf") && info[0].equals("Create")) {
                Elf elf = new Elf(info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]));
                System.out.println("Elf " + elf.username + " [" + elf.level + " level] is online" );
                while(true){
                    String move = scanner.nextLine();
                    if(move.equals("Action")) System.out.println(elf.action());
                    else if(move.equals("End")) {
                        System.out.print(("Elf " + elf.username + " [" + elf.level + " level] is offline" ));
                        break;
                    }

                }
            }
            else if (info[1].equals("Wizard") && info[0].equals("Create")) {
                Wizard wizard = new Wizard(info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]),Integer.parseInt(info[5]));
                System.out.println("Wizard " + wizard.username + " [" + wizard.level + " level] is online" );
                while(true){
                    String move = scanner.nextLine();
                    if(move.equals("Action")) System.out.println(wizard.action());
                    else if(move.equals("End")) {
                        System.out.print(("Wizard " + wizard.username + " [" + wizard.level + " level] is offline" ));
                        break;
                    }

                }
            }
            else if (info[1].equals("Knight") && info[0].equals("Create")) {
                Knight knight = new Knight(info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]),Integer.parseInt(info[5]));
                System.out.println("Knight " + knight.username + " [" + knight.level + " level] is online" );
                while(true){
                    String move = scanner.nextLine();
                    if(move.equals("Action")) System.out.println(knight.action());
                    else if(move.equals("End")) {
                        System.out.print(("Knight " + knight.username + " [" + knight.level + " level] is offline" ));
                        break;
                    }

                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }

}
