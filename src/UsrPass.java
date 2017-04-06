import java.io.IOException;
import java.util.Scanner;
//merge ft bine cu chestia aia. mam chinuit 2 ore sa inteleg ce o facut. ce chestie ? !nimerit ?da ....!nimerit = true ; why y no usse true ?ca tre sa le schimb pe toate dupaia uite
    //1. metoda care verifica compatbilitatea user-parola; 2 - metoda care ruleaza notepad
//ar trebui dupaia sa schimb return true cu false si return false cu true etc no okay :-??
    public class UsrPass {
        //db
        String[] user = {"Mihai","Dorel"};
        String[] parola = {"password1","password2"};

        public static void main(String[] args) {
            UsrPass method = new UsrPass();
            method.framework();
        }


        public void framework() {
            boolean nimerit = false;
            while (!nimerit) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Username: ");
                String u = scanner.nextLine();
                System.out.print("Enter Password: ");
                String p = scanner.nextLine();
                nimerit = checkUsrPass(u, p);
                if (nimerit) {
                    launch();
                    break;
                } else {
                    System.out.println("\n Username or password is incorrect. Try again. \n");
                }

            }
        }

        public boolean checkUsrPass(String a, String b) {
            boolean ok = false;
            int lungime = user.length;
            for (int i = 0; i < lungime; i++) {
                if (user[i].equals(a) && parola[i].equals(b)) {
                    ok = true;
                    break;
                }
            }
            return ok;
        }


        public static void launch() {
            try {
                ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
                pb.start();
            } catch (IOException e) {
            }
        }
    }


