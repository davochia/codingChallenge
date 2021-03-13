import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Button button = new Button("Submit");

    public static void main(String[] args) {
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String text) {
//                System.out.println(text + " was clicked");
//            }
//        }
//        button.setOnClickListener(new ClickListener());

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String text) {
                System.out.println(text + " was clicked");
            }
        });
        listen();
    }
    public static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    button.onClick();
            }
        }
    }
}
