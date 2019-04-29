import java.util.ArrayList;
import java.util.List;

interface Command {
    void execute();
}

class Debug implements Command {
    public void execute() {
        System.out.println("Debug the program");
    }
}

class Edit implements Command {
    public void execute() {
        System.out.println("Edit code");
    }
}

class Save implements Command {
    public void execute() {
        System.out.println("Save changes");
    }
}

class Delete implements Command {
    public void execute() {
        System.out.println("Delete");
    }
}

class ExploreSolution implements Command {
    public void execute() {
        System.out.println("Explore solution");
    }
}

class CommandDemo {

    public static List makeDefaultCommands() {
        List<Command> queue = new ArrayList<>();
        queue.add(new Edit());
        queue.add(new ExploreSolution());
        queue.add(new Debug());
        queue.add(new Save());
        return queue;
    }

    public static void ExecuteCommands(List list) {
        for (Object command : list) {
            ((Command)command).execute();
        }
    }
    public static void main(String[] args) {
        List commands = makeDefaultCommands();
        ExecuteCommands(commands);
    }
}