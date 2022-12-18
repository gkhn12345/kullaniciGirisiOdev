import java.util.Scanner;

public class kullaniciGirisiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        int password, newPassword;
        System.out.println("Enter your Id : ");
        userName = input.nextLine();
        System.out.println("Enter your Password : ");
        password = input.nextInt();

        if ((userName.equals("patika")) && (password == 1234)) {
            System.out.println("You are Logged in");
        } else if (password != 1234) {
            System.out.println("Incorrect password.Do you want to reset password ?\n1-Yes\n2-No");
            newPassword = input.nextInt();
            if (newPassword == 2) {
                System.out.println("Please Try Again");
            }
            if (newPassword == 1) {
                System.out.println("New Password");
                newPassword = input.nextInt();
                System.out.println("Your password has been successfully reset.");
                if (newPassword == 1234) {
                    System.out.println("Your new password cannot be the same as your old password");

                }

            }
        }


    }
}
