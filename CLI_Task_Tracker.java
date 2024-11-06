public class CLI_Task_Tracker {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println(
                "Welcome to my Task Tracker app!\n" +
                "You may get started by using the following commands:\n" + 
                "[add, update, delete, mark-in-progress, mark-done, list]\n\n" + 

                "Command usage examples:\n" + 
                "'java CLI_Task_Tracker add \"Task 1\" \"Description 1\"'\n" +
                "'java CLI_Task_Tracker update 1 \"Task 1\" \"Description 1\"'\n" +
                "'java CLI_Task_Tracker delete 1'\n" +
                "'java CLI_Task_Tracker mark-in-progress 1'\n" +
                "'java CLI_Task_Tracker mark-done 1'\n" +
                "'java CLI_Task_Tracker list'\n" +
                "'java CLI_Task_Tracker list done'\n" +
                "'java CLI_Task_Tracker list in-progress'\n"
            );

            System.exit(0);
        }

        String ActiveCommand = args[0]; // Grabs the first argument as the command / action

        switch (ActiveCommand) {
            case "add": AddTask(args[1], args[2]);;
            case "update": UpdateTask(Integer.valueOf(args[1]), args[2], args[3]);
            case "delete": DeleteTask(Integer.valueOf(args[1]));
            case "mark-in-progress": MarkTaskDone(Integer.valueOf(args[1]));
            case "mark-done": MarkTaskDone(Integer.valueOf(args[1]));
            case "list": ListTasks(args[1]);
            default: System.out.println("Invalid command. Please try again."); break;
        }
    }

    static void AddTask(String TaskName, String TaskDescription) {

    }

    static void UpdateTask(int TaskID, String TaskName, String TaskDescription) {

    }

    static void DeleteTask(int TaskID) {

    }

    static void MarkTaskInProgress(int TaskID) {

    }

    static void MarkTaskDone(int TaskID) {

    }

    static void ListTasks(String SearchType) {
        if(SearchType.isEmpty()) {
            // List all tasks

            System.exit(0);
        }

        switch (SearchType) {
            case "done":
            {
                break;
            }
            case "in-progress":
            {
                break;
            }
            default: System.out.println("Invalid search type. Please try again."); break;
        }

        System.exit(0);
    }
}