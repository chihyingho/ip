package ui;

import taskmanager.TaskManager;

import java.util.Scanner;

public class Ui {

    public static final String LINE = "____________________________________________________________";
    public static final String LOGO = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";
    public static final String GREETING_MESSAGE = LOGO + "Hello, I'm Duke!\nWhat can I do for you?";
    public static final String EXIT_MESSAGE = "Bye. Hope to see you again soon!";
    public static final String ADDED_TASK_MESSAGE = "Got it. I've added this task:";
    public static final String DELETED_TASK_MESSAGE = "Noted. I've removed this task:";
    public static final String EMPTY_TASK_LIST_MESSAGE = "Your task list is currently empty. Please enter a task first!";
    public static final String DISPLAY_TASKS_MESSAGE = "Here are the task(s) in your list:";
    public static final String EMPTY_TODO_DESCRIPTION_MESSAGE = "☹ OOPS!!! The description of a Todo task cannot be empty. Please enter a description!";
    public static final String EMPTY_EVENT_DESCRIPTION_MESSAGE = "☹ OOPS!!! The description of an Event task cannot be empty. Please enter a description!";
    public static final String EMPTY_DEADLINE_DESCRIPTION_MESSAGE = "☹ OOPS!!! The description of a Deadline task cannot be empty. Please enter a description!";
    public static final String EMPTY_DEADLINE_MESSAGE = "☹ OOPS!!! You have not entered a deadline for your task. Please specify a deadline!";
    public static final String EMPTY_DURATION_MESSAGE = "☹ OOPS!!! You have not entered a duration for your task. Please specify a duration!";
    public static final String MISSING_FILE_DIRECTORY_MESSAGE = "☹ OOPS!!! The file directory of the task list is missing. I will create a new empty task list for you.";
    public static final String MISSING_FILE_MESSAGE = "☹ OOPS!!! The task list file is missing. I will create a new empty task list for you.";
    public static final String TASK_NUMBER_OUT_OF_RANGE_MESSAGE = "☹ OOPS!!! The task number that you have entered is out of range. Please enter a different task number!";
    public static final String MISSING_TASK_NUMBER_MESSAGE = "☹ OOPS!!! You haven't entered a task number. Please enter a task number!";
    public static final String INVALID_TASK_NUMBER_MESSAGE = "☹ OOPS!!! You haven't entered a valid task number. Please enter a valid task number!";
    public static final String MARK_TASK_MESSAGE = "Nice! I've marked this task as done:";
    public static final String UNMARK_TASK_MESSAGE = "Nice! I've marked this task as done:";
    public static final String WRONG_INPUT_MESSAGE = "☹ OOPS!!! I'm sorry, but I don't know what that means :-( Please enter something else!";
    public static final String EMPTY_INPUT_MESSAGE = "☹ OOPS!!! You didn't enter anything. Please key in something!";
    public static final String EMPTY_SEARCH_DESCRIPTION_MESSAGE = "☹ OOPS!!! You didn't enter any search phrases. Please key in something!";
    public static final String SEARCH_RESULTS_MESSAGE = "Here are your search results:";
    public static final String INVALID_DATE_TIME_MESSAGE = "☹ OOPS!!! I can't recognise the date and time you've keyed in." +
        " Please key in a valid date and time and ensure that it is in this format: dd/mm/yyyy hhmm.";
    public static final String CORRUPT_FILE_MESSAGE = "☹ OOPS!!! Your task file is corrupted! Let me erase it for you.";

    public static void showLine() {
        System.out.println(LINE);
    }

    public static void showSearchResultsCount(int count) {
        System.out.println("There were " + count + " tasks that matched your search.");
    }

    public void showGreetingMessage() {
        showLine();
        System.out.println(GREETING_MESSAGE);
        showLine();
    }

    public static void showExitMessage() {
        System.out.println(EXIT_MESSAGE);
        showLine();
    }

    public String readCommand() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().trim().toLowerCase();
        return userInput;
    }

    public static void showTaskCount(TaskManager taskManager) {
        System.out.println("Now you have " + taskManager.getTaskCount() + " task(s) in the list.");
    }

}
