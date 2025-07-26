public class TaskCLIApp {
    public static void main(String[] args){

        if(args.length < 1){
            System.out.println("Usage: TaskCLIApp <command> [arguments]");
            return;
        }
        String command = args[0];

        switch(command){
            default -> {
                System.out.println("Unknown command: " + command);
                break;
            }
        }
    }
}
