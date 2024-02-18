package example;

import example.platform.Group;
import example.observers.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Group group = new Group("MyFriendsGroup");
        User user;
        String input = scanner.nextLine();

        while (!"exit".equals(input)) {
            switch (input) {
                case "add":
                    System.out.print("Enter a user name: ");
                    String name = scanner.nextLine();
                    user = new User(name);
                    user.subscribe(group); //user subscribe to MyFriendsGroup
                    break;
                case "post":
                    System.out.print("Enter a new Post: ");
                    group.publishPost(scanner.nextLine()); //this post will be notified to all users in the group
                    break;
                case "remove":
                    name = scanner.nextLine();
                    user = group.getObserverByName(name);
                    user.unSubscribe(group); // the user has been unsubscribed from MyFriendsGroup
                    break;
            }
            input = scanner.nextLine();
        }
    }
}